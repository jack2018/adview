package ye.fang.tool;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.media.ThumbnailUtils;
import android.util.Log;

/**
 * 淇濆瓨涓哄崟鑹蹭綅鍥撅紝鍗充娇榛戠櫧浣嶅浘
 */
public class BmpUtil {


    /**
     * 淇濆瓨涓哄崟鑹瞓mp鏍煎紡鐨勫畬鏁村瓧鑺傛暟
     **/
    public static byte[] changeToMonochromeBitmap(Bitmap bmp) {
        int[] binarys = gray2Binary(bmp);
        byte[] data = compressMonoBitmap(bmp, binarys);
        byte[] header = addBMPImageHeader(data.length + 62);
        byte[] infos = addBMPImageInfosHeader(bmp.getWidth(), bmp.getHeight());
        byte[] buffer = new byte[62 + data.length];
        System.arraycopy(header, 0, buffer, 0, header.length);
        System.arraycopy(infos, 0, buffer, 14, infos.length);
        System.arraycopy(data, 0, buffer, 62, data.length);
        return buffer;
    }

    /**
     * 淇濆瓨涓哄崟鑹瞓mp鏁版嵁锛屼笉鍖呭惈澶达紝姝ｅ悜澶?
     **/
    public static byte[] changeSingleBytes(Bitmap bmp) {
        int[] binarys = gray2Binary(bmp);

        byte[] data = compressMonoBitmap_ps(bmp, binarys);
        Log.i("data  ",data.length+"");
        return data;
    }

    /**
     * 灏嗗僵鑹插浘杞崲涓虹伆闃跺浘锛屽苟浜屽?煎寲澶勭悊
     *
     * @param bmp 浣嶅浘
     * @return 杩斿洖鐏伴樁鍥句簩鍊煎寲鍚庣殑棰滆壊int[]
     */
    private static int[] gray2Binary(Bitmap bmp) {
        int width = bmp.getWidth();   // 鑾峰彇浣嶅浘鐨勫
        int height = bmp.getHeight(); // 鑾峰彇浣嶅浘鐨勯珮
        int[] pixels = new int[width * height];  // 閫氳繃浣嶅浘鐨勫ぇ灏忓垱寤哄儚绱犵偣鏁扮粍,
        bmp.getPixels(pixels, 0, width, 0, 0, width, height);   // int 0 浠ｈ〃0XFFFFFFFF,鍗虫槸1.0瀹屽叏涓嶉?忔槑锛?0.0f瀹屽叏閫忔槑銆傞粦鑹插畬鍏ㄩ?忔槑銆?
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                int grey = pixels[width * i + j];  // 绗嚑琛岋紝绗嚑涓?
                // 鍒嗙涓夊師鑹?
                int alpha = ((grey & 0xFF000000) >> 24); // 閫忔槑搴?
                int red = ((grey & 0x00FF0000) >> 16);   // 绾㈣壊
                int green = ((grey & 0x0000FF00) >> 8);  // 缁胯壊
                int blue = (grey & 0x000000FF);          // 钃濊壊

                /******
                 *
                 *      // 鍒嗙涓夊師鑹?
                 int alpha = ((grey & 0xFF000000) >> 24); // 閫忔槑搴?
                 int red = ((grey & 0x00FF0000) >> 16);   // 绾㈣壊
                 int green = ((grey & 0x0000FF00) >> 8);  // 缁胯壊
                 int blue = (grey & 0x000000FF);          // 钃濊壊
                 * ****/

                if (alpha == 0) {  // 閫忔槑搴︿负0锛屽垯璇存槑娌℃湁棰滆壊锛岄偅鍙樻洿涓虹櫧鑹?
                    pixels[width * i + j] = 0;           // 鐧借壊鏄?0
                    continue;
                }

                //Log.i("red", red+"  "+(width * i + j));
                //Log.i("green", green+"  "+(width * i + j));
                //Log.i("blue", blue+"  "+(width * i + j));
                //grey = (int) (red * 0.3 + green * 0.59 + blue * 0.11);
                grey = (int) (red * 0.3 + green  + blue * 0.11);//鎵弿鎸哄ソ锛?
                grey = grey <20?1:0;  // 鐏板害灏忎簬200灏辫浆鍖栦负榛戣壊锛屼笉鐒跺氨涓虹櫧鑹层??200涓哄彲璋冩暣鍙傛暟銆?// 浜屽?煎寲
                pixels[width * i + j] = grey;
            }
        }

        return pixels;
    }



    /**
     * 鍘嬬缉涓哄畬鏁村崟鑹瞓mp鏁扮粍锛屽苟鍙嶅悜
     *
     * @param bmp     鍘嬬缉闇?瑕佺敤鍒颁綅鍥剧殑瀹藉害锛岄珮搴︺??
     * @param binarys 浜屽?煎寲鏁版嵁
     * @return
     */
    private static byte[] compressMonoBitmap(Bitmap bmp, int[] binarys) {
        int width = bmp.getWidth();   // 鑾峰彇浣嶅浘鐨勫
        int height = bmp.getHeight(); // 鑾峰彇浣嶅浘鐨勯珮
        // 琛岃ˉ浣嶇殑鍏紡涓? widthBytes = (width*biBitCount+31)/32*4
        // 闇?瑕佽浆鍖栦负鍗曡壊锛屾墍浠iBitCount=1锛?
        // 纭畾涓?琛屽嚑涓瓧鑺?
        int widthBytes = (width + 31) / 32 * 4;

        byte[] newss = new byte[widthBytes * height];
        for (int i = height; i > 0; i--) {
            for (int j = 0; j < width; j++) {
                if (binarys[width * (i - 1) + j] > 0)
                    newss[(height - i) * widthBytes + j / 8] |= (byte) (1 << (7 - j % 8));
            }
        }
        return newss;
        // 鏂规硶浜?:
        /*  // 纭畾闇?瑕佷竴琛岃琛ヨ冻鐨勪綅鏁?
        int wei = widthBytes * 8 - width;
        int[] newbs = new int[widthBytes * 8 * height];  // 鎬诲瓧鑺傛暟
        // 鐧借壊鏄鎻掑叆0锛屽苟瀹屾垚缈昏浆;  bmp淇濆瓨鏍煎紡鏄粠涓嬪埌涓婏紝浠庡乏鍒板彸
        for (int i = 0; i < height; i++) {
            System.arraycopy(binarys, i * width, newbs, (height - i - 1) * (width + wei), width);
        }
        // 鍘嬬缉
        byte[] data = new byte[newbs.length / 8];
        for (int i = 0; i < newbs.length; i++) {
            if (newbs[i] > 0) {
                data[i / 8] |= (1 << (7 - i % 8));
            }
        }
        return data;*/
    }

    /**
     * 鍘嬬缉涓哄畬鏁村崟鑹瞓mp鏁扮粍锛屽苟姝ｅ悜
     *
     * @param bmp     鍘嬬缉闇?瑕佺敤鍒颁綅鍥剧殑瀹藉害锛岄珮搴︺??
     * @param binarys 浜屽?煎寲鏁版嵁
     * @return
     */
    private static byte[] compressMonoBitmap_ps(Bitmap bmp, int[] binarys) {
        int width = bmp.getWidth();   // 鑾峰彇浣嶅浘鐨勫
        int height = bmp.getHeight(); // 鑾峰彇浣嶅浘鐨勯珮
        // 琛岃ˉ浣嶇殑鍏紡涓? widthBytes = (width*biBitCount+31)/32*4
        // 闇?瑕佽浆鍖栦负鍗曡壊锛屾墍浠iBitCount=1锛?
        // 纭畾涓?琛屽嚑涓瓧鑺?
        int widthBytes = (width + 31) / 32 * 4;

        byte[] newss = new byte[widthBytes * height];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (binarys[width * i + j] > 0)  // 绗嚑琛岀鍑犱釜瀛楄妭
                    newss[i * widthBytes + j / 8] |= (byte) (1 << (7 - j % 8));  // 鏂板帇缂╃殑绗嚑琛岀鍑犱釜
            }
        }
        return newss;



        /*******
         *







         // 鏂规硶浜?:
         // 纭畾闇?瑕佷竴琛岃琛ヨ冻鐨勪綅鏁?

         *         int wei = widthBytes * 8 - width;
         int[] newbs = new int[widthBytes * 8 * height];  // 鎬诲瓧鑺傛暟
         // 鐧借壊鏄鎻掑叆0锛屽苟瀹屾垚缈昏浆;  bmp淇濆瓨鏍煎紡鏄粠涓嬪埌涓婏紝浠庡乏鍒板彸
         for (int i = 0; i < height; i++) {
         System.arraycopy(binarys, i * width, newbs, (height - i - 1) * (width + wei), width);
         }
         // 鍘嬬缉
         byte[] data = new byte[newbs.length / 8];
         for (int i = 0; i < newbs.length; i++) {
         if (newbs[i] > 0) {
         data[i / 8] |= (1 << (7 - i % 8));
         }
         }
         return data;
         * ****/

    }











    /**
     * 灏嗗僵鑹插浘杞崲涓虹函榛戠櫧浜岃壊
     *
     * @param
     * @return 杩斿洖杞崲濂界殑浣嶅浘
     */
    public static Bitmap convertToBlackWhite(Bitmap bmp) {
        int width = bmp.getWidth(); // 鑾峰彇浣嶅浘鐨勫
        int height = bmp.getHeight(); // 鑾峰彇浣嶅浘鐨勯珮
        int[] pixels = new int[width * height]; // 閫氳繃浣嶅浘鐨勫ぇ灏忓垱寤哄儚绱犵偣鏁扮粍

        bmp.getPixels(pixels, 0, width, 0, 0, width, height);
        int alpha = 0xFF << 24;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                int grey = pixels[width * i + j];

                // 鍒嗙涓夊師鑹?
                int red = ((grey & 0x00FF0000) >> 16);
                int green = ((grey & 0x0000FF00) >> 8);
                int blue = (grey & 0x000000FF);

                // 杞寲鎴愮伆搴﹀儚绱?
                grey = (int) (red * 0.3 + green * 0.59 + blue * 0.11);
                grey = alpha | (grey << 16) | (grey << 8) | grey;
                pixels[width * i + j] = grey;
            }
        }

        // 鏂板缓鍥剧墖
        Bitmap newBmp = Bitmap.createBitmap(width, height, Config.ARGB_4444);
        // 璁剧疆鍥剧墖鏁版嵁
        newBmp.setPixels(pixels, 0, width, 0, 0, width, height);

        //璁剧疆瀹介珮
        /// Bitmap resizeBmp = ThumbnailUtils.extractThumbnail(newBmp, 384, 210);
        return newBmp;
    }




    /**
     * BMP鏂囦欢澶?
     *
     * @param size 鏁翠釜鏂囦欢鐨勫ぇ灏忥紝鍖呮嫭鏂囦欢澶达紝淇℃伅澶达紝鍜屼綅鍥惧唴瀹?
     * @return
     */
    private static byte[] addBMPImageHeader(int size) {
        byte[] buffer = new byte[14];
        //magic number 'BM'
        buffer[0] = 0x42;
        buffer[1] = 0x4D;
        //璁板綍澶у皬
        buffer[2] = (byte) (size);
        buffer[3] = (byte) (size >> 8);
        buffer[4] = (byte) (size >> 16);
        buffer[5] = (byte) (size >> 24);
        buffer[6] = 0x00;
        buffer[7] = 0x00;
        buffer[8] = 0x00;
        buffer[9] = 0x00;
        buffer[10] = 0x3E;
        buffer[11] = 0x00;
        buffer[12] = 0x00;
        buffer[13] = 0x00;
        return buffer;
    }


    /**
     * BMP鏂囦欢淇℃伅澶?
     *
     * @param w 瀹斤紝鍗曚綅鍍忕礌
     * @param h 楂橈紝鍗曚綅鍍忕礌
     * @return
     */
    private static byte[] addBMPImageInfosHeader(int w, int h) {
        byte[] buffer = new byte[48];
        //杩欎釜鏄浐瀹氱殑 BMP 淇℃伅澶磋40涓瓧鑺?
        buffer[0] = 0x28;
        buffer[1] = 0x00;
        buffer[2] = 0x00;
        buffer[3] = 0x00;
        //瀹藉害 鍦颁綅鏀惧湪搴忓彿鍓嶇殑浣嶇疆 楂樹綅鏀惧湪搴忓彿鍚庣殑浣嶇疆
        buffer[4] = (byte) (w);
        buffer[5] = (byte) (w >> 8);
        buffer[6] = (byte) (w >> 16);
        buffer[7] = (byte) (w >> 24);
        //闀垮害 鍚屼笂
        buffer[8] = (byte) (h);
        buffer[9] = (byte) (h >> 8);
        buffer[10] = (byte) (h >> 16);
        buffer[11] = (byte) (h >> 24);
        //鎬绘槸琚缃负1
        buffer[12] = 0x01;
        buffer[13] = 0x00;
        //姣旂壒鏁? 鍍忕礌 32浣嶄繚瀛樹竴涓瘮鐗? 杩欎釜涓嶅悓鐨勬柟寮?(ARGB 32浣? RGB24浣嶄笉鍚岀殑!!!!)
        //榛戠櫧鍥剧疆1
        buffer[14] = 0x01;
        buffer[15] = 0x00;
        //0-涓嶅帇缂? 1-8bit浣嶅浘
        //2-4bit浣嶅浘 3-16/32浣嶅浘
        //4 jpeg 5 png
        //璁剧疆涓轰笉鍘嬬缉
        buffer[16] = 0x00;
        buffer[17] = 0x00;
        buffer[18] = 0x00;
        buffer[19] = 0x00;
        //璇存槑鍥惧儚澶у皬
        buffer[20] = 0x00;
        buffer[21] = 0x00;
        buffer[22] = 0x00;
        buffer[23] = 0x00;
        //姘村钩鍒嗚鲸鐜?
        buffer[24] = 0x00;
        buffer[25] = 0x00;
        buffer[26] = 0x00;
        buffer[27] = 0x00;
        //鍨傜洿鍒嗚鲸鐜?
        buffer[28] = 0x00;
        buffer[29] = 0x00;
        buffer[30] = 0x00;
        buffer[31] = 0x00;
        //0 浣跨敤鎵?鏈夌殑璋冭壊鏉块」
        buffer[32] = 0x00;
        buffer[33] = 0x00;
        buffer[34] = 0x00;
        buffer[35] = 0x00;
        //寮?棰滆壊绱㈠紩
        buffer[36] = 0x00;
        buffer[37] = 0x00;
        buffer[38] = 0x00;
        buffer[39] = 0x00;
        // 鍔犱笂棰滆壊琛?
        // 00 00 00 00 ff ff ff 00 閭ｄ箞 0浠ｈ〃榛?,1浠ｈ〃鐧?
        // 鑻ヤ负
        // ff ff ff 00 00 00 00 00 閭ｄ箞 1浠ｈ〃榛?,0浠ｈ〃鐧?  --- 閫夋嫨杩欎釜
        buffer[40] = (byte) 0xFF;
        buffer[41] = (byte) 0xFF;
        buffer[42] = (byte) 0xFF;
        buffer[43] = (byte) 0x00;

        buffer[44] = (byte) 0x00;
        buffer[45] = (byte) 0x00;
        buffer[46] = (byte) 0x00;
        buffer[47] = (byte) 0xFF;
        return buffer;
    }
}

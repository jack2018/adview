package ye.fang.tool;




import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ImageView;


public class ImageToString {

    public static byte[] sendPhoto1(Bitmap bitmap) {
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, stream);// (0 - 100)压缩文件
        byte[] bt = stream.toByteArray();
        String s=bytesToHexString(bt);

        byte[]bb=new byte[s.length()];

        Log.i("bb",bb.length+"");
        for(int i=0;i<s.length();i++)
        {
            //Log.i("plu"+""+i+"",s.charAt(i)+"");
            Log.i("bb[i]"+""+i+"",bb[i]+"");
            bb[i]=(byte)0xff;
//如果我吧图片�?16进制转成字符串，然后按上面的方法不是可以搞到 byte 和byte【�?�吗�?
        }


        return bb;
    }













    /**
     * 二进制转字符�?
     * @param b
     * @return
     */
    public static byte[] byte2hex3(byte[] b)
    {
        byte [] bb= new byte[b.length];
        String stmp = "";
        for (int n = 0; n < b.length; n++) {
            stmp = Integer.toHexString(b[n] & 0XFF);

            if (stmp.length() == 1) {
//bb[n]=(byte) Integer.parseInt("(byte)0x"+"0" + stmp);
//bb[n] = Integer.valueOf("0x0"+stmp, 16).byteValue();

//bb[n] = Integer.valueOf("0"+stmp, 16).byteValue();

///bb[n] = (byte) Integer.parseInt("0x0"+stmp, 16);

//BigInteger bi= new BigInteger("0"+stmp);

//Log.i("Integer.valueOf(0+stmp, 16).byteValue()", Integer.valueOf("0"+stmp, 16).byteValue()+"");
            } else {
                //bb[n] = Integer.valueOf(stmp, 16).byteValue();
                //Log.i("Integer.valueOf(stmp, 16).byteValue()", Integer.valueOf(stmp, 16).byteValue()+"")

                //bb[n] =Integer.valueOf(stmp, 16).byteValue();

                //BigInteger bi= new BigInteger(stmp);


            }

        }
        return bb;
    }







    public  String printHexString(byte b){
        String hex = Integer.toHexString(b & 0xFF);
        if (hex.length() == 1) {
            hex = '0' + hex;
        }
        return hex.toUpperCase();
    }



    public  String printHexString( byte[] b) {
        String strHex = "";
        for (int i = 0; i < b.length; i++) {
            String hex = Integer.toHexString(b[i] & 0xFF);
            if (hex.length() == 1) {
                hex = '0' + hex;
            }
            System.out.print(hex.toUpperCase() + " ");
            strHex+=hex.toUpperCase() + " ";
        }
        System.out.println("");
        return strHex;
    }






    public static String byte2HexString(byte[] bytes) {
        String hex= "";
        if (bytes != null) {
            for (Byte b : bytes) {
                hex += String.format("%02X", b.intValue() & 0xFF);

                // Log.i(tag, msg);
            }
        }
        return hex;
    }



    /**
     * Convert char to byte
     * @param c char
     * @return byte
     */
    private static byte charToByte(char c) {
        return (byte) "0123456789ABCDEF".indexOf(c);
    }









    /***
     * Convert byte[] to hex string.这里我们可以将byte转换成int，然后利用Integer.toHexString(int)来转换成16进制字符串�??
     * @param src byte[] data
     * @return hex string
     */
    public static String bytesToHexString(byte[] src){
        StringBuilder stringBuilder = new StringBuilder("");
        if (src == null || src.length <= 0) {
            return null;
        }
        for (int i = 0; i < src.length; i++) {
            int v = src[i] & 0xFF;
            String hv = Integer.toHexString(v);
            if (hv.length() < 2) {
                stringBuilder.append(0);
            }
            stringBuilder.append(hv);
        }
        return stringBuilder.toString();
    }
    /**
     * Convert hex string to byte[]
     * @param hexString the hex string
     * @return byte[]
     */
    public static byte[] hexStringToBytes(String hexString) {
        if (hexString == null || hexString.equals("")) {
            return null;
        }
        hexString = hexString.toUpperCase();
        int length = hexString.length() / 2;
        char[] hexChars = hexString.toCharArray();
        byte[] d = new byte[length];
        for (int i = 0; i < length; i++) {
            int pos = i * 2;
            d[i] = (byte) (charToByte(hexChars[pos]) << 4 | charToByte(hexChars[pos + 1]));

            Log.i("d[i] "+i+"  ", d[i]+"");
        }
        return d;
    }





    public static String  shiliuString(String s){
        String unite[]=s.split(" ");
        String ss="";
        for (int i = 0; i < unite.length;i++) {
            Log.i(""+i+"", unite[i]);
            ss+="(byte)0x"+unite[i]+",";
            //Log.i("444444444444", ss);
        }
        return ss;
    }




    /**
     * bytes转换成十六进制字符串
     * @return String 每个Byte值之间空格分�?
     */
    public static String byte2HexStr(byte[] b)
    {
        String stmp="";
        StringBuilder sb = new StringBuilder("");
        for (int n=0;n<b.length;n++)
        {
            stmp = Integer.toHexString(b[n] & 0xFF);

            sb.append((stmp.length()==1)? "0"+stmp : stmp);
            sb.append(" ");
        }
        return sb.toString().toUpperCase().trim();
    }

    /**
     * 字符串转换成十六进制字符�?
     * @return String 每个Byte之间空格分隔，如: [61 6C 6B]
     */
    public static String str2HexStr(String str)
    {

        char[] chars = "0123456789ABCDEF".toCharArray();
        StringBuilder sb = new StringBuilder("");
        byte[] bs = str.getBytes();
        int bit;

        for (int i = 0; i < bs.length; i++)
        {
            bit = (bs[i] & 0x0f0) >> 4;
            sb.append(chars[bit]);
            bit = bs[i] & 0x0f;
            sb.append(chars[bit]);
            sb.append(' ');
        }
        return sb.toString().trim();
    }



    /**
     * 二进制转字符�?
     * @param b
     * @return
     */
    public static String byte2hex1(byte[] b)
    {
        StringBuffer sb = new StringBuffer();
        String stmp = "";
        for (int n = 0; n < b.length; n++) {
            stmp = Integer.toHexString(b[n] & 0XFF);
            sb.append("(byte)0x");
            if (stmp.length() == 1) {

                sb.append("0" + stmp+',');
            } else {
                sb.append(stmp+',');
            }

//Log.i("sb.toString()  ", sb.toString());
        }


        return sb.toString();
    }






    /**
     * 将图片转换成十六进制字符�?
     * @param photo
     * @return
     */
    public static String sendPhoto(Bitmap bitmap) {
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, stream);// (0 - 100)压缩文件
        byte[] bt = stream.toByteArray();
        String photoStr = byte2hex1(bt);
        return photoStr;
    }

    /**
     * 将指定字符串src，以每两个字符分割转换为16进制形式
     * 如："2B44EFD9" --> byte[]{0x2B, 0x44, 0xEF, 0xD9}
     * @param src String
     * @return byte[]
     **/
    public static byte[] HexString2Bytes(String src)  {
        byte[] ret = new byte[8];
        byte[] tmp = src.getBytes();
        for(int i=0; i<8; i++)  {
            ret[i] = uniteBytes(tmp[i*2], tmp[i*2+1]);
        }
        return ret;
    }



    /**
     * 将两个ASCII字符合成�?个字节；
     * 如："EF"--> 0xEF
     * @param src0 byte
     * @param src1 byte
     * @return byte
     **/
    public static byte uniteBytes(byte src0, byte src1)  {
        byte _b0 = Byte.decode("0x" + new String(new byte[]{src0})).byteValue();
        _b0 = (byte)(_b0 << 4);
        byte _b1 = Byte.decode("0x" + new String(new byte[]{src1})).byteValue();
        byte ret = (byte)(_b0 ^ _b1);
        return ret;
    }

    /**
     *
     * @param data1
     * @param data2
     * @return data1 �? data2拼接的结�?
     */
    public static byte[] addBytes(byte[] data1, byte[] data2) {
        byte[] data3 = new byte[data1.length + data2.length];
        System.arraycopy(data1, 0, data3, 0, data1.length);
        System.arraycopy(data2, 0, data3, data1.length, data2.length);
        return data3;

    }





    /**
     * 将十六进制串转化为byte数组
     *
     *


     public static final byte[] hex2byte(String hex) throws IllegalArgumentException {
     if (hex.length() % 2 != 0) {
     throw new IllegalArgumentException();
     }
     char[] arr = hex.toCharArray();
     byte[] b = new byte[hex.length() / 2];
     for (int i = 0, j = 0, l = hex.length(); i < l; i++, j++) {
     String swap = "" + arr[i++] + arr[i];
     int byteint = Integer.parseInt(swap, 16) & 0xFF;
     b[j] = new Integer(byteint).byteValue();
     }
     return b;
     }
     *  */




    public static byte[] hex2byte(String hex) {
        String digital = "0123456789ABCDEF";
        char[] hex2char = hex.toCharArray();
        byte[] bytes = new byte[hex.length() / 2];
        int temp;
        for (int i = 0; i < bytes.length; i++) {
            temp = digital.indexOf(hex2char[2 * i]) * 16;
            temp += digital.indexOf(hex2char[2 * i + 1]);
            bytes[i] = (byte) (temp & 0xff);
        }
        return bytes;
    }














}
package ye.fang.tool;

public class sixteentotwo {
    private static String hexStr =  "0123456789ABCDEF";
    private static String[] binaryArray =
            {"0000","0001","0010","0011",
                    "0100","0101","0110","0111",
                    "1000","1001","1010","1011",
                    "1100","1101","1110","1111"};




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
     * 鏁扮粍杞垚鍗佸叚杩涘埗瀛楃涓�?
     * @return HexString
     */
    public static String toHexString1(byte[] b){
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < b.length; ++i){
            buffer.append(toHexString1(b[i]));
        }
        return buffer.toString();
    }



    public static String toHexString1(byte b){
        String s = Integer.toHexString(b & 0xFF);
        if (s.length() == 1){
            return "0" + s;
        }else{
            return s;
        }
    }


    /**
     *
     * @return 鏉烆剚宕叉稉杞扮癌鏉╂稑鍩楃�涙顑佹稉锟�
     */
    public static String bytes2BinaryStr(byte[] bArray){

        String outStr = "";
        int pos = 0;
        for(byte b:bArray){
            //妤傛ê娲撴担锟�?
            pos = (b&0xF0)>>4;
            outStr+=binaryArray[pos];
            //娴ｅ骸娲撴担锟�
            pos=b&0x0F;
            outStr+=binaryArray[pos];
        }
        return outStr;

    }
    /**
     *
     * @param bytes
     * @return 鐏忓棔绨╂潻娑樺煑鏉烆剚宕叉稉鍝勫磩閸忣�?绻橀崚璺虹摟缁楋箒绶崙锟�
     */
    public static String BinaryToHexString(byte[] bytes){

        String result = "";
        String hex = "";
        for(int i=0;i<bytes.length;i++){
            //鐎涙濡锟�4娴ｏ�?
            hex = String.valueOf(hexStr.charAt((bytes[i]&0xF0)>>4));
            //鐎涙濡担锟�4娴ｏ�?
            hex += String.valueOf(hexStr.charAt(bytes[i]&0x0F));
            result +=hex+" ";
        }
        return result;
    }
    /**
     *
     * @param hexString
     * @return 鐏忓棗宕勯崗顓＄箻閸掓儼娴嗛幑顫礋鐎涙濡弫鎵�?
     */
    public static byte[] HexStringToBinary(String hexString){
        //hexString閻ㄥ嫰鏆辨惔锕�顕�2閸欐牗鏆ｉ敍灞肩稊娑撶ytes閻ㄥ嫰鏆辨惔锟�
        int len = hexString.length()/2;
        byte[] bytes = new byte[len];
        byte high = 0;//鐎涙濡妯烘磽娴ｏ拷
        byte low = 0;//鐎涙濡担搴℃磽娴ｏ拷

        for(int i=0;i<len;i++){
            //閸欏磭些閸ユ稐缍呭妤�鍩屾妯圭秴
            high = (byte)((hexStr.indexOf(hexString.charAt(2*i)))<<4);
            low = (byte)hexStr.indexOf(hexString.charAt(2*i+1));
            bytes[i] = (byte) (high|low);//妤傛ê�?存担宥呬粵閹存牞绻嶇粻锟�?
        }
        return bytes;
    }
}



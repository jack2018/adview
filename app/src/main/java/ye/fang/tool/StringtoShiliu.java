package ye.fang.tool;

import android.util.Log;

public class StringtoShiliu {


	public static String toHex(String str) {
		String hexString="0123456789ABCDEF";
		byte[] bytes=str.getBytes();
		StringBuilder hex=new StringBuilder(bytes.length * 2);
		for(int i=0;i<bytes.length;i++) {
			hex.append(hexString.charAt((bytes[i] & 0xf0) >> 4));  // 作用�? n / 16
			hex.append(hexString.charAt((bytes[i] & 0x0f) >> 0));  // 作用�? n
			hex.append(' ');  //中间用空格隔�?
		}
		return hex.toString();
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

			Log.i("ret[i]"+i+"   ", ret[i]+"");
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


	/*String转byte数组*/
	public static byte[] Stringtobytes(String s) {
		byte[] present = {};
		if (Integer.parseInt(s) >= 16) {
			present = hexString2Bytes(Integer.toHexString(Integer.parseInt(s)));
		}else if(Integer.parseInt(s) == 0){
			present = new byte[]{0x00};
		}else if(Integer.parseInt(s) == 1){
			present = new byte[]{0x01};
		}else if(Integer.parseInt(s) == 2){
			present = new byte[]{0x02};
		}else if(Integer.parseInt(s) == 3){
			present = new byte[]{0x03};
		}else if(Integer.parseInt(s) == 4){
			present = new byte[]{0x04};
		}else if(Integer.parseInt(s) == 5){
			present = new byte[]{0x05};
		}else if(Integer.parseInt(s) == 6){
			present = new byte[]{0x06};
		}else if(Integer.parseInt(s) == 7){
			present = new byte[]{0x07};
		}else if(Integer.parseInt(s) == 8){
			present = new byte[]{0x08};
		}else if(Integer.parseInt(s) == 9){
			present = new byte[]{0x09};
		}else if(Integer.parseInt(s) == 10){
			present = new byte[]{0x0a};
		}else if(Integer.parseInt(s) == 11){
			present = new byte[]{0x0b};
		}else if(Integer.parseInt(s) == 12){
			present = new byte[]{0x0c};
		}else if(Integer.parseInt(s) == 13){
			present = new byte[]{0x0d};
		}else if(Integer.parseInt(s) == 14){
			present = new byte[]{0x0e};
		}else if(Integer.parseInt(s) == 15){
			present = new byte[]{0x0f};
		}

		return present;
	}
	/*
	 * 16进制字符串转字节数组
	 */
	public static byte[] hexString2Bytes(String hex) {

		if ((hex == null) || (hex.equals(""))){
			return null;
		}
		else if (hex.length()%2 != 0){
			return null;
		}
		else{
			hex = hex.toUpperCase();
			int len = hex.length()/2;
			byte[] b = new byte[len];
			char[] hc = hex.toCharArray();
			for (int i=0; i<len; i++){
				int p=2*i;
				b[i] = (byte) (charToByte(hc[p]) << 4 | charToByte(hc[p+1]));
			}
			return b;
		}

	}/*
	 * 字符转换为字�?
	 */
	private static byte charToByte(char c) {
		return (byte) "0123456789ABCDEF".indexOf(c);
	}
}

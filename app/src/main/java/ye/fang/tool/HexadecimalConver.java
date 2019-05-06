package ye.fang.tool;


import java.io.ByteArrayOutputStream;

import android.util.Log;

/**
 * 杩涘埗涔嬮棿鐨勮浆鎹?
 * @author jwzhangjie
 *
 */
public class HexadecimalConver {

	private static String hexString="0123456789ABCDEF";
	public static String toStringHex(String s){
		byte[] baKeyword = new byte[s.length()/2];
		for(int i = 0; i < baKeyword.length; i++){
			try{
				baKeyword[i] = (byte)(0xff & Integer.parseInt(s.substring(i*2, i*2+2),16));
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		try{
			s = new String(baKeyword, "GB2312");
		}catch (Exception e1){
			e1.printStackTrace();
		}
		return s;
	}

	/**
	 * 灏嗗瓧绗︿覆缂栫爜鎴?16杩涘埗鏁板瓧,閫傜敤浜庢墍鏈夊瓧绗︼紙鍖呮嫭涓枃锛?
	 */
	public static String encode(String str){
		//鏍规嵁榛樿缂栫爜鑾峰彇瀛楄妭鏁扮粍
		byte[] bytes=str.getBytes();
		StringBuilder sb=new StringBuilder(bytes.length*2);
		//灏嗗瓧鑺傛暟缁勪腑姣忎釜瀛楄妭鎷嗚В鎴?2浣?16杩涘埗鏁存暟
		for(int i=0;i<bytes.length;i++){
			sb.append(hexString.charAt((bytes[i]&0xf0)>>4));
			sb.append(hexString.charAt((bytes[i]&0x0f)>>0));
		}
		return sb.toString();
	}


	/**
	 * 灏嗘寚瀹氬瓧绗︿覆src锛屼互姣忎袱涓瓧绗﹀垎鍓茶浆鎹负16杩涘埗褰㈠紡
	 * 濡傦細"2B44EFD9" --> byte[]{0x2B, 0x44, 0xEF, 0xD9}
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
	 * 灏嗕袱涓狝SCII瀛楃鍚堟垚涓?涓瓧鑺傦紱
	 * 濡傦細"EF"--> 0xEF
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
	 * 灏?16杩涘埗鏁板瓧瑙ｇ爜鎴愬瓧绗︿覆,閫傜敤浜庢墍鏈夊瓧绗︼紙鍖呮嫭涓枃锛?
	 */
	public static String decode(String bytes)
	{
		ByteArrayOutputStream baos=new ByteArrayOutputStream(bytes.length()/2);
		//灏嗘瘡2浣?16杩涘埗鏁存暟缁勮鎴愪竴涓瓧鑺?
		for(int i=0;i<bytes.length();i+=2)
			baos.write((hexString.indexOf(bytes.charAt(i))<<4 |hexString.indexOf(bytes.charAt(i+1))));
		String bb = "";
		try {
			bb = new String(baos.toByteArray(), "GB2312");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bb;
	}
}

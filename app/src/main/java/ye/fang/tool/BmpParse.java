package ye.fang.tool;

import android.graphics.Bitmap;
import android.util.Log;
public class BmpParse {

	/**将bitmap转换成bmp格式图片
	  * @param bitmap 要转换的bitmap

	  */
	 public static byte[]  FormatBMP(Bitmap bitmap)
	 {
		 
	
	   int w = bitmap.getWidth(), h = bitmap.getHeight();
	   int[] pixels=new int[w*h];
	   bitmap.getPixels(pixels, 0, w, 0, 0, w, h);//取得BITMAP的所有像素点
	   byte[] rgb = addBMP_RGB_888(pixels,w,h);

	return rgb;
	 }
	 
	 // BMP文件�?
	 private static byte[] addBMPImageHeader(int size) {
	  byte[] buffer = new byte[14];
	  buffer[0] = 0x42;
	  buffer[1] = 0x4D;
	  buffer[2] = (byte) (size >> 0);
	  buffer[3] = (byte) (size >> 8);
	  buffer[4] = (byte) (size >> 16);
	  buffer[5] = (byte) (size >> 24);
	  buffer[6] = 0x00;
	  buffer[7] = 0x00;
	  buffer[8] = 0x00;
	  buffer[9] = 0x00;
	//  buffer[10] = 0x36;
	  buffer[10] = 0x3E;
	  buffer[11] = 0x00;
	  buffer[12] = 0x00;
	  buffer[13] = 0x00;
	  return buffer;
	 }


	 // BMP文件信息�?
	 private static byte[] addBMPImageInfosHeader(int w, int h, int size) {
	  
	  Log.i("_DETEST_", "size="+size);
	  byte[] buffer = new byte[40];
	  buffer[0] = 0x28;
	  buffer[1] = 0x00;
	  buffer[2] = 0x00;
	  buffer[3] = 0x00;
	  
	  buffer[4] = (byte) (w >> 0);
	  buffer[5] = (byte) (w >> 8);
	  buffer[6] = (byte) (w >> 16);
	  buffer[7] = (byte) (w >> 24);
	  
	  buffer[8] = (byte) (h >> 0);
	  buffer[9] = (byte) (h >> 8);
	  buffer[10] = (byte) (h >> 16);
	  buffer[11] = (byte) (h >> 24);
	  
	  buffer[12] = 0x01;
	  buffer[13] = 0x00;
	  
	  buffer[14] = 0x01;
	  buffer[15] = 0x00;
	  
	  buffer[16] = 0x00;
	  buffer[17] = 0x00;
	  buffer[18] = 0x00;
	  buffer[19] = 0x00;
	  
	  buffer[20] = (byte) (size >> 0);
	  buffer[21] = (byte) (size >> 8);
	  buffer[22] = (byte) (size >> 16);
	  buffer[23] = (byte) (size >> 24);
	  
	//  buffer[24] = (byte) 0xE0;
	//  buffer[25] = 0x01;
	  buffer[24] = (byte) 0xC3;
	  buffer[25] = 0x0E;
	  buffer[26] = 0x00;
	  buffer[27] = 0x00;
	  
	//  buffer[28] = 0x02;
	//  buffer[29] = 0x03;
	  buffer[28] = (byte) 0xC3;
	  buffer[29] = 0x0E;
	  buffer[30] = 0x00;
	  buffer[31] = 0x00;
	  
	  buffer[32] = 0x00;
	  buffer[33] = 0x00;
	  buffer[34] = 0x00;
	  buffer[35] = 0x00;
	  
	  buffer[36] = 0x00;
	  buffer[37] = 0x00;
	  buffer[38] = 0x00;
	  buffer[39] = 0x00;
	  return buffer;
	 }
	 
	 private static byte[] addBMPImageColorTable() {
	  byte[] buffer = new byte[8];
	  buffer[0] = (byte) 0xFF;
	  buffer[1] = (byte) 0xFF;
	  buffer[2] = (byte) 0xFF;
	  buffer[3] = 0x00;
	  
	  buffer[4] = 0x00;
	  buffer[5] = 0x00;
	  buffer[6] = 0x00;
	  buffer[7] = 0x00;
	  return buffer;
	 }

	
	 
	 
	 
	 private static byte[] addBMP_RGB_888(int[] b, int w, int h) {
		  int len = w*h;
		  int bufflen = 0;
		  byte[] tmp = new byte[3];
		  int index = 0,bitindex = 1;

		  if (w*h % 8 != 0)//�?8字节变成1个字�?,不足�?0
		  {
		   bufflen = w*h/ 8 + 1;
		  }
		  else
		  {
		   bufflen = w*h/ 8;
		  }
		  if (bufflen % 4 != 0)//BMP图像数据大小，必须是4的�?�数，图像数据大小不�?4的�?�数时用0填充补足
		  {
		   bufflen = bufflen + bufflen%4;
		  }
		  
		  byte[] buffer = new byte[bufflen];
		  
		  for (int i = len - 1; i >= w; i -= w) {
		   // DIB文件格式�?后一行为第一行，每行按从左到右顺�?
		   int end = i, start = i - w + 1;
		   for (int j = start; j <= end; j++) {
		    
		    tmp[0] = (byte) (b[j] >> 0);
		    tmp[1] = (byte) (b[j] >> 8);
		    tmp[2] = (byte) (b[j] >> 16);
		    
		    String hex = ""; 
		    for (int g = 0; g < tmp.length; g++) {
		     String temp = Integer.toHexString(tmp[g] & 0xFF);
		     if (temp.length() == 1) {
		      temp = "0" + temp;
		     }
		     hex = hex + temp;
		    }
		    
		    if (bitindex > 8)
		    {
		     index += 1;
		     bitindex = 1;
		    }
		    
		    if (!hex.equals("ffffff"))
		    {
		     buffer[index] = (byte) (buffer[index] | (0x01 << 8-bitindex));
		    }
		    bitindex++;
		   }
		  }
		  
		  return buffer;
		 }


	 

}

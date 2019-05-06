package ye.fang.tool;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Double_Number {
	
	

	
public static  String  data_twozero(String dd){
	String  ddd = "0.00";
	//Log.i("Double.parseDouble(dd)  -----------  ",Double.parseDouble(dd)+"");
	BigDecimal bg = new BigDecimal(Double.parseDouble(dd));
    double f1 = bg.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
    ddd=f1+"";

    

if(getNumberDecimalDigits(f1)==1|getNumberDecimalDigits(f1)==0){
ddd=f1+"0";
}
///else
//ddd=f1+"";
return ddd ;
}
	

	
	
public static  String  data_twozero(String tms202,String dd){
	String  ddd = "0.00";

	BigDecimal bg = new BigDecimal(Double.parseDouble(dd));
    double f1 = bg.setScale(Integer.parseInt(tms202), BigDecimal.ROUND_HALF_UP).doubleValue();
    ddd=f1+"";
    


if(Integer.parseInt(tms202)==2){
if(getNumberDecimalDigits(f1)==1|getNumberDecimalDigits(f1)==0){
		ddd=f1+"0";
}
else
        ddd=f1+"";
}

if(Integer.parseInt(tms202)==3){
if(getNumberDecimalDigits(f1)==1|getNumberDecimalDigits(f1)==0){
ddd=f1+"0";
}
//if(getNumberDecimalDigits(f1)==1|getNumberDecimalDigits(f1)==0){
//ddd=f1+"00";
//}

if(getNumberDecimalDigits(f1)==2){
ddd=f1+"0";
}
if(getNumberDecimalDigits(f1)==3){
ddd=f1+"";
}

}

return ddd ;
    
    
}






public static  String  data_pizhong(String tms202,String dd){
	String  ddd = "0.00";
	
	BigDecimal bg = new BigDecimal(Double.parseDouble(dd));
    double f1 = bg.setScale(Integer.parseInt(tms202), BigDecimal.ROUND_HALF_UP).doubleValue();
    
if(Integer.parseInt(tms202)==1){

    
    ddd=f1+"";	
}
	
	

if(Integer.parseInt(tms202)==2){
 ddd=f1+"";		
    
    if(getNumberDecimalDigits(f1)==1|getNumberDecimalDigits(f1)==0){
      //Log.i(getNumberDecimalDigits(f1)+"  ", f1+"");
      ddd=f1+"0";
    
}
    
}
if(Integer.parseInt(tms202)==3){
//	Log.i("getNumberDecimalDigits(f1)-???????  ",getNumberDecimalDigits(f1)+"    "+f1);
	
if(getNumberDecimalDigits(f1)==1|getNumberDecimalDigits(f1)==0){
ddd=f1+"00";
}
if(getNumberDecimalDigits(f1)==2){
//	Log.i("getNumberDecimalDigits(f1)-222222222222222  ",getNumberDecimalDigits(f1)+"    "+f1);
	
		ddd=f1+"0";
		}
		if(getNumberDecimalDigits(f1)==3){
		ddd=f1+"";
		}

}

 
return ddd ;   


}




public static  String  data_prize(String tms202,String dd){
	String  ddd = "0.00";
	
	BigDecimal bg = new BigDecimal(Double.parseDouble(dd));
    double f1 = bg.setScale(Integer.parseInt(tms202), BigDecimal.ROUND_HALF_UP).doubleValue();
    
if(Integer.parseInt(tms202)==1){

    
    ddd=f1+"";	
}
	
	

if(Integer.parseInt(tms202)==2){
 ddd=f1+"";		
    
    if(getNumberDecimalDigits(f1)==1|getNumberDecimalDigits(f1)==0){
      //Log.i(getNumberDecimalDigits(f1)+"  ", f1+"");
      ddd=f1+"0";
    
}
    
}
if(Integer.parseInt(tms202)==3){
	//Log.i("data_prize        getNumberDecimalDigits(f1)-???????  ",getNumberDecimalDigits(f1)+"    "+f1);
	
if(getNumberDecimalDigits(f1)==1|getNumberDecimalDigits(f1)==0){
ddd=f1+"00";
}
if(getNumberDecimalDigits(f1)==2){
	//Log.i("data_prize      getNumberDecimalDigits(f1)-222222222222222  ",getNumberDecimalDigits(f1)+"    "+f1);
	
		ddd=f1+"0";
		}
		if(getNumberDecimalDigits(f1)==3){
		ddd=f1+"";
		}
}

return ddd ;   
}



public static  String  data_weight2(String tms202,String dd){
	String  ddd = "0.00";
if(Integer.parseInt(tms202)==1){
	BigDecimal bg = new BigDecimal(Double.parseDouble(dd));
    double f1 = bg.setScale(Integer.parseInt(tms202), BigDecimal.ROUND_HALF_UP).doubleValue();
    
    
    ddd=f1+"";	
}
	
	

if(Integer.parseInt(tms202)==2){
	BigDecimal bg = new BigDecimal(Double.parseDouble(dd));
    double f1 = bg.setScale(Integer.parseInt(tms202), BigDecimal.ROUND_HALF_UP).doubleValue();
    
    
    ddd=f1+"";		
    
 if(getNumberDecimalDigits(f1)==1|getNumberDecimalDigits(f1)==0){
      //Log.i(getNumberDecimalDigits(f1)+"  ", f1+"");
      ddd=f1+"0";
    
}
    
}
if(Integer.parseInt(tms202)==3){
	ddd=dd;
	
	 //  Log.i("tms[200]  ", tms202);
	  // Log.i("ddddddddddddddddddddddddd ",dd+"");
	
}

return ddd ;   
}




public static  String  total_data(String tms203,String tms100,String dd){
String  ddd = "0.00";
BigDecimal bg = new BigDecimal(Double.parseDouble(dd));
double f1 = bg.setScale(Integer.parseInt(tms203), BigDecimal.ROUND_HALF_UP).doubleValue();
ddd=f1+"";


if(Integer.parseInt(tms203)==2){
if(getNumberDecimalDigits(f1)==1|getNumberDecimalDigits(f1)==0){
		ddd=f1+"0";
}
else
        ddd=f1+"";


if(tms100.equals("1")){
	ddd=data_twozero("1", ddd);
	ddd+="0";
}

if(tms100.equals("2")){
	ddd=data_twozero("0", ddd);
	ddd+="0";
}


}

if(Integer.parseInt(tms203)==3){

if(getNumberDecimalDigits(f1)==1|getNumberDecimalDigits(f1)==0){
ddd=f1+"0";
}


if(getNumberDecimalDigits(f1)==1|getNumberDecimalDigits(f1)==0){
ddd=f1+"00";
}

if(getNumberDecimalDigits(f1)==2){
ddd=f1+"0";
}
if(getNumberDecimalDigits(f1)==3){
ddd=f1+"";
}


if(tms100.equals("1")){
	ddd=data_twozero("2", ddd);
	

	ddd+="0";
//	Log.i("保留三位小数 末一位四舍五�?      "+tms100, ddd+"");
	
}

if(tms100.equals("2")){
	ddd=data_twozero("1", ddd);
	ddd+="00";
	
	//Log.i("保留三位小数 �?2位四舍五�?      "+tms100, ddd+"");
}

}

return ddd ;
}






public static int getNumberDecimalDigits(double number) {
    String moneyStr = String.valueOf(number);
    String[] num = moneyStr.split("\\.");
    if (num.length == 2) {
        for (;;){
            if (num[1].endsWith("0")) {
                num[1] = num[1].substring(0, num[1].length() - 1);
            }else {
                break;
            }
        }
        return num[1].length();
    }else {
        return 0;
    }
}



public static byte[]  GetFivebyte(String total,String tms){
	
	byte[]bb=new byte[5];
	
	List<String> digitList = new ArrayList<String>();
	Pattern p = Pattern.compile("[^0-9]");
	Matcher m = p.matcher(total);
	String result = m.replaceAll("");
	for (int i1 = 0; i1 < result.length(); i1++) {
	digitList.add(result.substring(i1, i1+1));

	}
	System.out.println("................."+digitList);
	String s="";
	
	
	
		
	
	
	if(tms.equals("1")){

		digitList.add("0");
		if(digitList.size()<6){
			for(int i1=0;i1<5-digitList.size();i1++){
				s+="0";
			}
			
			for(int i1=0;i1<digitList.size();i1++){
				s+=digitList.get(i1);
			}
			//Log.i("s      " , s);
			for(int i1=0;i1<s.length();i1++){
			
			   bb[i1]=(byte)s.charAt(i1);
		}
		}


		if(digitList.size()>5){
			for(int i1=digitList.size()-5;i1<digitList.size();i1++){
			s+=digitList.get(i1);
			}
			//Log.i("s      " , s);
			for(int i1=0;i1<s.length();i1++){
			 bb[i1]=(byte)s.charAt(i1);
			}
		}

	}

	
	
	
	if(tms.equals("2")){


		if(digitList.size()<6){
			for(int i1=0;i1<5-digitList.size();i1++){
				s+="0";
			}
			
			for(int i1=0;i1<digitList.size();i1++){
				s+=digitList.get(i1);
			}
			//Log.i("s      " , s);
			for(int i1=0;i1<s.length();i1++){
			
			   bb[i1]=(byte)s.charAt(i1);
		}
		}


		if(digitList.size()>5){
			for(int i1=digitList.size()-5;i1<digitList.size();i1++){
			s+=digitList.get(i1);
			}
			//Log.i("s      " , s);
			for(int i1=0;i1<s.length();i1++){
			 bb[i1]=(byte)s.charAt(i1);
			}
		}

	}

	
	
	
	
	if(tms.equals("3")){
		digitList.remove(digitList.size()-1);

		if(digitList.size()<6){
			for(int i1=0;i1<5-digitList.size();i1++){
				s+="0";
			}
			
			for(int i1=0;i1<digitList.size();i1++){
				s+=digitList.get(i1);
			}
			///Log.i("s      " , s);
			for(int i1=0;i1<s.length();i1++){
			
			   bb[i1]=(byte)s.charAt(i1);
		}
		}


		if(digitList.size()>5){
			for(int i1=digitList.size()-5;i1<digitList.size();i1++){
			s+=digitList.get(i1);
			}
			///Log.i("s      " , s);
			for(int i1=0;i1<s.length();i1++){
			 bb[i1]=(byte)s.charAt(i1);
			}
		}

	}

	
return bb;
}







public static byte[]  Get_Five_weight_byte(String total){	
//int i=  Double_Number.getNumberDecimalDigits(Double.parseDouble(total));
byte[]bb=new byte[5];


int a=(int) (Double.parseDouble(total)*1000);

String s=a+"";


//Log.i("s      " , s);

//Log.i("s.length()      " , s.length()+"");
String ss="";
//1045
if(s.length()<5){
	for(int i1=0;i1<5-s.length();i1++){
		ss+="0";
	}
	//Log.i("ssss      " , ss);
	for(int i1=0;i1<s.length();i1++){
		ss+=s.charAt(i1)+"";
	}
	//Log.i("ssassssssss     " , ss);
	for(int i1=0;i1<ss.length();i1++){
	
	  bb[i1]=(byte)ss.charAt(i1);
}
}

 if(s.length()>4){
	for(int i1=s.length()-5;i1<s.length();i1++){
	ss+=s.charAt(i1)+"";
	}
	//Log.i("ss      " , ss);
	for(int i1=0;i1<ss.length();i1++){
	 bb[i1]=(byte)ss.charAt(i1);
	}
}




return bb;
}







public static String  Get_Five_weight_String(String total){
int a=(int) (Double.parseDouble(total)*100);
String s=a+"";


//Log.i("s.length()      " , s.length()+"");
String ss="";
//1045
if(s.length()<5){
	for(int i1=0;i1<5-s.length();i1++){
		ss+="0";
	}
	for(int i1=0;i1<s.length();i1++){
		ss+=s.charAt(i1)+"";
	}
	//Log.i("ssassssssssssssssssssssssss      " , ss);
	
}
return ss;
}



public static String plu_code_num(String s){
	String plu="";
	if(s.length()<5){
        for(int i=0;i<5-s.length();i++){ 
        	plu+="0";
        }
        plu+=s;
	}
	else
		plu=s;
	return plu;
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

 }
 /*
  * 字符转换为字�?
  */
 private static byte charToByte(char c) {
     return (byte) "0123456789ABCDEF".indexOf(c);
 }
 

 
 /*******
  * int 四舍五入
  * **/
 public  static int swint(int n){
		
		int   r; 
		r   =   n%10; 
		n-=r; 

		if(r >= 5) 
		{ 
		   n+=10; 
		}
		return n;
		
	}

 
 public static int[] newint(  int oldArr[]){
     int zero=0; // 统计0的个�?
     for(int i=0;i<oldArr.length;i++){
         if(oldArr[i]==0){
             zero++;
         }
     }
     int newArr[]=new int[oldArr.length-zero]; // 定义新的数组 长度�? 原来旧的数组的长度减�?0的个�?
     int j=0; // 新数组的索引
     for(int i=0;i<oldArr.length;i++){ // 遍历原来旧的数组
         if(oldArr[i]!=0){ // 假如不等�?0
             newArr[j]=oldArr[i]; // 赋�?�给新的数组
             j++;
         }
     }
      
     System.out.print("新数组：");
     for(int n:newArr){
         System.out.print(n+" ");
     }
	return newArr;
 }
 
 
 //去除数组空元�?
 public static String[] removeArrayEmptyTextBackNewArray(String[] strArray) {
     List<String> strList= Arrays.asList(strArray);
     List<String> strListNew=new ArrayList<String>();
     for (int i = 0; i <strList.size(); i++) {
         if (strList.get(i)!=null&&!strList.get(i).equals("")&&IsChineseOrNot.isChinese(strList.get(i))){
             strListNew.add(strList.get(i));
         }
     }
     String[] strNewArray = strListNew.toArray(new String[strListNew.size()]);
     System.out.println("..double_number数组."+Arrays.toString(strNewArray));	
     System.out.println("..长度."+strNewArray.length);	
     return   strNewArray;
 }


 

 
 
 public  static String[] minint(String[] a){
	 int b=a.length;
	 String t;
	 for(int i=0;i<b;i++){
	 for(int j=i;j<b;j++){
	 if(Integer.parseInt(a[i])>Integer.parseInt(a[j])){
	 t=a[i];
	 a[i]=a[j];
	 a[j]=t;
	 }
	 }
	 }
	 for(int i=0;i<b;i++){
	 System.out.println(a[i]);
	 }
	return a;
 }
 
 
 
 public static int getMax(int[] arr) {
     int max = Integer.MIN_VALUE;
     
     for(int i = 0; i < arr.length; i++) {
         if(arr[i] > max)
             max = arr[i];
     }
     
     return max;
 }
 
 public static int getMin(int[] arr) {
     int min = Integer.MAX_VALUE;
     
     for(int i = 0; i < arr.length; i++) {
         if(arr[i] < min)
             min = arr[i];
     }
     
     return min;
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
  * int转byte数组
  * @param bytes
  * @return
  */
 public static byte[]IntToByte(int num){
 	byte[]bytes=new byte[4];
 	bytes[0]=(byte) ((num>>24)&0xff);
 	bytes[1]=(byte) ((num>>16)&0xff);
 	bytes[2]=(byte) ((num>>8)&0xff);
 	bytes[3]=(byte) (num&0xff);
 	return bytes;
 }
 
 
 
 
	public static void copyint() {
		String [] arry = {"1","1","1","1","1","2","2","2","2","2","3","3","3","3",};
		Map<String,Integer> map = new HashMap<String, Integer>();
		for(int i =0 ;i<arry.length;i++){
			if(null!= map.get(arry[i])){
				map.put(arry[i], map.get(arry[i-1])+1); //value+1
			}else{
				map.put(arry[i],1);
			}
		}
		
		Iterator it = map.entrySet().iterator();  
		while(it.hasNext()){
			Entry entry = (Entry) it.next();
			String  key  =  entry.getKey().toString();      
			int  value  =  Integer.parseInt(entry.getValue().toString());
			System.out.println("key is :"+key+"---value :"+value);
		} 
	}
	
	
	
	
	
	
	
	/*** * 功能://统计数组中重复元素的个数* @param array* void*/
	public static void array(String[] array){
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < array.length; i++) 
		{Integer integer = map.get(array[i]);
		map.put(array[i], integer == null?1:integer+1);
		}
		Set<Entry<String, Integer>> set = map.entrySet();
		for (Entry<String, Integer> entry : set) 
		{System.out.println(entry.getKey() + "---" + entry.getValue());}
		}



	//冒泡排序�?
public static int[] quickSort(int[] arr)
	{
	int i,j,temp;
	int[] array=arr;
	//n个元素的数组进行n-1轮排�?
	for(i=0;i<array.length-1;i++)
	{

for(j=0;j<array.length-i-1;j++)
{
 if(array[j]>array[j+1])
{

     temp=array[j];
	array[j]=array[j+1];
	array[j+1]=temp;
	}
}
	}
	//打印出排序后的数�?
	System.out.println(Arrays.toString(array));
	return array;
	}


}


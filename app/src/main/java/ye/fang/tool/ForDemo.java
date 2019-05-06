package ye.fang.tool;

public class ForDemo {

    public static String  jym(String str) {
        String str1 ;
        int sum = 0;
        for(int i =1;i<12;i+=2){
            sum+=(str.charAt(i)-'0');
        }
        int sum2 =0;
        for(int i = 0;i<12;i+=2){
            sum2 += (str.charAt(i)-'0');
        }

        int count =sum*3+sum2;
        System.out.println("           "+count);
        int a=10-count%10;
        str1=str.substring(0,12)+a;
        System.out.println("这个是校验码�?:................. "+str1);
        return str1;

    }

}
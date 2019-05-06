package ye.fang.tool;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;
import android.os.Handler;
import android.os.Message;
import android.widget.TextView;


public class Times {
	TextView v;
	public  Times(TextView vv){
		v=vv;
	   new TimeThread().start();
	}
	 
    private static final int msgKey1 = 1;
    public class TimeThread extends Thread {
        @Override
        public void run () {
            do {
                try {
                    Thread.sleep(100);
                    Message msg = new Message();
                    msg.what = msgKey1;
                    mHandler.sendMessage(msg);
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } while(true);
        }
    }
    
    private Handler mHandler = new Handler() {
        @Override
        public void handleMessage (Message msg) {
            super.handleMessage(msg);
            switch (msg.what) {
                case msgKey1:
                	 v.setText(getTime());
                    break;
                default:
                    break;
            }
        }
    };
    //获得当前年月日时分秒星期
    public String getTime(){
       final Calendar c = Calendar.getInstance();
       c.setTimeZone(TimeZone.getTimeZone("GMT+8:00"));

    
       String mWay = String.valueOf(c.get(Calendar.DAY_OF_WEEK));
         
       if("1".equals(mWay)){
           mWay ="天";
       }else if("2".equals(mWay)){
           mWay ="一";
       }else if("3".equals(mWay)){
           mWay ="二";
       }else if("4".equals(mWay)){
           mWay ="三";
       }else if("5".equals(mWay)){
           mWay ="四";
       }else if("6".equals(mWay)){
           mWay ="五";
       }else if("7".equals(mWay)){
           mWay ="六";
       }
        
        /*********
         * 
         * 
      String mYear = String.valueOf(c.get(Calendar.YEAR)); // 获取当前年份
       String mMonth = String.valueOf(c.get(Calendar.MONTH) + 1);// 获取当前月份
       String mDay = String.valueOf(c.get(Calendar.DAY_OF_MONTH));// 获取当前月份的日期号码
       String mHour = String.valueOf(c.get(Calendar.HOUR_OF_DAY));//时
       String mMinute = String.valueOf(c.get(Calendar.MINUTE));//分
       String mSecond = String.valueOf(c.get(Calendar.SECOND));//秒
         *  
        *     str = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS")).format(c.getTime());
       System.out.println(str);

       
       
       return mYear + "年" + mMonth + "月" + mDay+"日"+"  "+"星期"+mWay+"  "+mHour+":"+mMinute+":"+mSecond;
       
        * **/
       
       String s=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(c.getTime());
   
       
       return ("星期"+mWay+"  "+s);
   }

      
       

}

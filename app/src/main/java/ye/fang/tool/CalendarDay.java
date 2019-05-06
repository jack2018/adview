package ye.fang.tool;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by 18650 on 2019/1/19.
 */

public class CalendarDay {
    public static Date getDate(int day){
        Date date=new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH, day);
        date = calendar.getTime();
        return date;
    }
    public static ArrayList<String> getDays (int day){
        ArrayList<String> strings = new ArrayList<>();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar = Calendar.getInstance();
        Date date=new Date();
        calendar.setTime(date);
        for (int i = 0; i < day; i++) {
            calendar.add(Calendar.DAY_OF_MONTH, -i);
            date = calendar.getTime();
            strings.add(simpleDateFormat.format(date));
            date=new Date();
            calendar.setTime(date);
        }
        return strings;
    }
}

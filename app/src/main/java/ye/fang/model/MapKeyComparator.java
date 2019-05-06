package ye.fang.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

public class MapKeyComparator implements Comparator<String> {
    @Override
    public int compare(String s, String t1) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date pa1= sdf.parse(s);
            Date pa2= sdf.parse(t1);
            if(pa1.getTime()>pa2.getTime()){
                return 1;
            }
            if(pa1.getTime()<pa2.getTime()){
                return -1;
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return 0;
    }
}

package ye.fang.tool;

import android.support.annotation.NonNull;

import java.util.Comparator;
import java.util.EnumSet;
import java.util.Map;

import ye.fang.model.DayReportSum;

/**
 * Created by 18650 on 2019/1/20.
 */

public class MapValueComparator implements Comparator<Map.Entry<String, Double>> {
    @Override
    public int compare(Map.Entry<String, Double> o1, Map.Entry<String, Double> o2) {
        return o2.getValue().compareTo(o1.getValue());
    }
}

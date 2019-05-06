package ye.fang.model;

import android.support.annotation.NonNull;

import java.util.Comparator;

public class RankAll implements Comparable<RankAll> {
    String name;
    double value;

    public RankAll(String name, double value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public int compareTo( RankAll rankAll) {
        if(rankAll.value>this.value)
            return -1;
        if(rankAll.value<this.value)
            return 1;
        return 0;
    }
}

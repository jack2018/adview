// Generated code from Butter Knife. Do not modify!
package ye.fang;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.HorizontalBarChart;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.charts.PieChart;
import java.lang.IllegalStateException;
import java.lang.Override;
import ye.fang.ad.R;
import ye.fang.wigth.AutoScrollRecyclerView;

public class MainStartActivity_ViewBinding<T extends MainStartActivity> implements Unbinder {
  protected T target;

  @UiThread
  public MainStartActivity_ViewBinding(T target, View source) {
    this.target = target;

    target.tvBigTitle = Utils.findRequiredViewAsType(source, R.id.tv_big_title, "field 'tvBigTitle'", TextView.class);
    target.chartView2 = Utils.findRequiredViewAsType(source, R.id.chartView2, "field 'chartView2'", BarChart.class);
    target.chatview3 = Utils.findRequiredViewAsType(source, R.id.chatview3, "field 'chatview3'", LineChart.class);
    target.chatview4 = Utils.findRequiredViewAsType(source, R.id.chatview4, "field 'chatview4'", HorizontalBarChart.class);
    target.relCommitdate = Utils.findRequiredViewAsType(source, R.id.rel_commitdate, "field 'relCommitdate'", AutoScrollRecyclerView.class);
    target.relCheckData = Utils.findRequiredViewAsType(source, R.id.rel_check_data, "field 'relCheckData'", AutoScrollRecyclerView.class);
    target.relHistoryCheckData = Utils.findRequiredViewAsType(source, R.id.rel_history_check_data, "field 'relHistoryCheckData'", AutoScrollRecyclerView.class);
    target.relPriceDate = Utils.findRequiredViewAsType(source, R.id.rel_price_date, "field 'relPriceDate'", AutoScrollRecyclerView.class);
    target.tvTime = Utils.findRequiredViewAsType(source, R.id.tv_time, "field 'tvTime'", TextView.class);
    target.reDataTotal = Utils.findRequiredViewAsType(source, R.id.re_data_total, "field 'reDataTotal'", RecyclerView.class);
    target.chartTotleDatle = Utils.findRequiredViewAsType(source, R.id.chart_totle_datle, "field 'chartTotleDatle'", PieChart.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.tvBigTitle = null;
    target.chartView2 = null;
    target.chatview3 = null;
    target.chatview4 = null;
    target.relCommitdate = null;
    target.relCheckData = null;
    target.relHistoryCheckData = null;
    target.relPriceDate = null;
    target.tvTime = null;
    target.reDataTotal = null;
    target.chartTotleDatle = null;

    this.target = null;
  }
}

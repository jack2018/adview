// Generated code from Butter Knife. Do not modify!
package ye.fang;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import ye.fang.ad.R;
import ye.fang.wigth.ShineTextView;

public class MainStartActivity2_ViewBinding<T extends MainStartActivity2> implements Unbinder {
  protected T target;

  @UiThread
  public MainStartActivity2_ViewBinding(T target, View source) {
    this.target = target;

    target.tctt = Utils.findRequiredViewAsType(source, R.id.tctt, "field 'tctt'", ShineTextView.class);
    target.relPriceDate = Utils.findRequiredViewAsType(source, R.id.rel_price_date, "field 'relPriceDate'", RecyclerView.class);
    target.relCheckDay = Utils.findRequiredViewAsType(source, R.id.rel_check_day, "field 'relCheckDay'", RecyclerView.class);
    target.relCheckHistory = Utils.findRequiredViewAsType(source, R.id.rel_check_history, "field 'relCheckHistory'", RecyclerView.class);
    target.relStartService = Utils.findRequiredViewAsType(source, R.id.rel_start_service, "field 'relStartService'", RecyclerView.class);
    target.relTimeTran = Utils.findRequiredViewAsType(source, R.id.rel_time_tran, "field 'relTimeTran'", RecyclerView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.tctt = null;
    target.relPriceDate = null;
    target.relCheckDay = null;
    target.relCheckHistory = null;
    target.relStartService = null;
    target.relTimeTran = null;

    this.target = null;
  }
}

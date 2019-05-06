package ye.fang.adapter;

import android.animation.Animator;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.chad.library.adapter.base.animation.AlphaInAnimation;
import com.chad.library.adapter.base.animation.BaseAnimation;

import ye.fang.ad.R;
import ye.fang.model.DayCheck;
import ye.fang.model.DayGoodPrice;

/**
 * Created by 18650 on 2019/1/20.
 */

public class DayPriceAdapter2 extends BaseQuickAdapter<DayGoodPrice,BaseViewHolder> {
    public DayPriceAdapter2() {
        super(R.layout.item_day_price2);
    }
    private int mLastPosition = -1;
    private int mPosition = 0;
    private Interpolator mInterpolator = new LinearInterpolator();
    private int mDuration = 2000;
    private BaseAnimation mSelectAnimation = new AlphaInAnimation();
    private boolean mOpenAnimationEnable = true;
    @Override
    protected void convert(BaseViewHolder baseViewHolder, DayGoodPrice s) {
        baseViewHolder.setText(R.id.tv_check_name,s.getName());
        baseViewHolder.setText(R.id.tv_check_price,"￥"+s.getPrice());
        baseViewHolder.setTextColor(R.id.tv_check_price,Color.parseColor("#ffff0000"));
//        baseViewHolder.setText(R.id.tv_good_name,s.getProductName());
//        BigDecimal bigDecimal = new BigDecimal(s.getPrice());
//        BigDecimal bigDecima2 = new BigDecimal(s.getQty());
//        BigDecimal bigDecima3 = bigDecimal.multiply(bigDecima2);
//        baseViewHolder.setText(R.id.tv_good_price,"￥"+bigDecimal.setScale(2,BigDecimal.ROUND_HALF_UP));
//        baseViewHolder.setText(R.id.tv_good_amount,""+bigDecima2.setScale(2,BigDecimal.ROUND_HALF_UP));
//        baseViewHolder.setText(R.id.tv_good_money,"￥"+bigDecima3.setScale(2,BigDecimal.ROUND_HALF_UP));
    }
}

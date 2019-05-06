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

public class DayPriceAdapter extends BaseAutoScrollAdapter<DayGoodPrice,BaseViewHolder> {
    public DayPriceAdapter() {
        super(R.layout.item_day_price);
    }

    @Override
    protected void convert(BaseViewHolder baseViewHolder, DayGoodPrice s) {
        baseViewHolder.setText(R.id.tv_check_name,s.getName());
        String unit ="";
        switch (s.getUnitID()){
            case 1:
                unit="weight";
                break;
            case 2:
                    unit="件";
                    break;
            case 3:
                unit="kg";
                break;
            case 4:
                unit="g";
                break;
            case 5:
                unit="ton";
                break;
            case 6:
                unit="lb";
                break;
            case 7:
                unit="斤";
                break;
            case 8:
                unit="100g";
                break;
            case 20:
                unit="只";
                break;
            case 21:
                unit="盒";
                break;
            case 22:
                unit="包";
                break;
            case 23:
                unit="箱";
                break;
            case 24:
                unit="片";
                break;
            case 25:
                unit="份";
                break;
            case 26:
                unit="叠";
                break;
            case 27:
                unit="块";
                break;
            case 28:
                unit="套";
                break;
            case 29:
                unit="组";
                break;
            case 30:
                unit="个";
                break;
            case 31:
                unit="条";
                break;
            case 32:
                unit="瓶";
                break;
                default:
                    unit="";
                    break;
        }
        baseViewHolder.setText(R.id.tv_check_price,"￥"+s.getPrice()+"/"+unit);
        baseViewHolder.setTextColor(R.id.tv_check_price,Color.parseColor("#ff7CFC00"));
            addAnimation(baseViewHolder);
    }
}

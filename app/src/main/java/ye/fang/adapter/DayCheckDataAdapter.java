package ye.fang.adapter;

import android.graphics.Color;
import android.text.TextUtils;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.math.BigDecimal;

import ye.fang.ad.R;
import ye.fang.model.DayCheck;
import ye.fang.model.DayReport;

/**
 * Created by 18650 on 2019/1/20.
 */

public class DayCheckDataAdapter extends BaseQuickAdapter<DayCheck,BaseViewHolder> {
    public DayCheckDataAdapter() {
        super(R.layout.item_day_check);
    }

    @Override
    protected void convert(BaseViewHolder baseViewHolder, DayCheck s) {
baseViewHolder.setText(R.id.tv_check_no,s.getMName()+"");
        baseViewHolder.setText(R.id.tv_check_name,s.getCName());
        baseViewHolder.setText(R.id.tv_check_price,s.getProject()+"");
        baseViewHolder.setText(R.id.tv_check_result,"");
        baseViewHolder.setText(R.id.tv_check_result,s.getResult());
        if(!TextUtils.isEmpty(s.getResult())){
            if(s.getResult().contains("不")||s.getResult().contains("未")||s.getResult().contains("没")){
                baseViewHolder.setTextColor(R.id.tv_check_result, Color.parseColor("#ffff0000"));
            }else {
                baseViewHolder.setTextColor(R.id.tv_check_result, Color.parseColor("#ff00ff00"));
            }
        }
//        addAnimation(baseViewHolder);

//        baseViewHolder.setText(R.id.tv_good_name,s.getProductName());
//        BigDecimal bigDecimal = new BigDecimal(s.getPrice());
//        BigDecimal bigDecima2 = new BigDecimal(s.getQty());
//        BigDecimal bigDecima3 = bigDecimal.multiply(bigDecima2);
//        baseViewHolder.setText(R.id.tv_good_price,"￥"+bigDecimal.setScale(2,BigDecimal.ROUND_HALF_UP));
//        baseViewHolder.setText(R.id.tv_good_amount,""+bigDecima2.setScale(2,BigDecimal.ROUND_HALF_UP));
//        baseViewHolder.setText(R.id.tv_good_money,"￥"+bigDecima3.setScale(2,BigDecimal.ROUND_HALF_UP));
    }

}

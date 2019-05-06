package ye.fang.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.math.BigDecimal;

import ye.fang.ad.R;
import ye.fang.model.DayReport;

/**
 * Created by 18650 on 2019/1/20.
 */

public class CommiteDataAdapter extends BaseQuickAdapter<DayReport,BaseViewHolder> {
    public CommiteDataAdapter() {
        super(R.layout.item_commit_data);
    }

    @Override
    protected void convert(BaseViewHolder baseViewHolder, DayReport s) {
        baseViewHolder.setText(R.id.tv_good_name,s.getProductName());
        BigDecimal bigDecimal = new BigDecimal(s.getRealPrice());
        BigDecimal bigDecima2 = new BigDecimal(s.getQty());
        BigDecimal bigDecima3 = bigDecimal.multiply(bigDecima2);
        String unite = s.getUnitId().equals("3")?"/kg":"/个";
        baseViewHolder.setText(R.id.tv_good_price,"￥"+bigDecimal.setScale(2,BigDecimal.ROUND_HALF_UP));
        baseViewHolder.setText(R.id.tv_good_amount,""+bigDecima2.setScale(3,BigDecimal.ROUND_HALF_UP)+unite);
        baseViewHolder.setText(R.id.tv_good_money,"￥"+s.getAmount());
//        baseViewHolder.setText(R.id.tv_good_money,"￥"+bigDecima3.setScale(2,BigDecimal.ROUND_HALF_UP));
//        addAnimation(baseViewHolder);
    }

}

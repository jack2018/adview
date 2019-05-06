package ye.fang.adapter;

import android.graphics.Color;
import android.text.TextUtils;

import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

import ye.fang.ad.R;
import ye.fang.model.DayCheck;

/**
 * Created by 18650 on 2019/1/20.
 * 历史检测不合格
 */

public class DayCheckDataAdapter3 extends BaseAutoScrollMAdapter<DayCheck,BaseViewHolder> {
    public DayCheckDataAdapter3(List<DayCheck> data) {
        super(data);
//        super(R.layout.item_day_check);
    addItemType(0,R.layout.item_day_check);
        addItemType(1,R.layout.item_day_single_text_view);
    }

    @Override
    protected void convert(BaseViewHolder baseViewHolder, DayCheck s) {
 int type =   s.getItemType();
 switch (type){
     case 0:
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
         if(s.getResult().contains("未发现")){
             baseViewHolder.setTextColor(R.id.tv_check_result, Color.parseColor("#ff00ff00"));
         }
         break;
     case 1:
         baseViewHolder.setText(R.id.tv_check_no,s.getCheckDate());
         break;

 }
}

}

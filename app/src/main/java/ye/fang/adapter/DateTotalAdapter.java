package ye.fang.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import ye.fang.ad.R;
import ye.fang.model.DataTotalModel;

public class DateTotalAdapter extends BaseQuickAdapter<DataTotalModel,BaseViewHolder> {

    public DateTotalAdapter() {
        super(R.layout.item_total_data);
    }

    @Override
    protected void convert(BaseViewHolder baseViewHolder, DataTotalModel dataTotalModel) {
        baseViewHolder.setImageResource(R.id.img_data,dataTotalModel.getImgid());
        baseViewHolder.setText(R.id.tv_name,dataTotalModel.getTypeup());
        baseViewHolder.setText(R.id.tv_value,dataTotalModel.getNamedown());
    }
}

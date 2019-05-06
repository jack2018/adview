package ye.fang.adapter;

import java.util.List;



import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import ye.fang.ad.R;


public class DetailAdapter extends BaseAdapter {

    private List<Detail> stuList;
    private LayoutInflater inflater;
    public DetailAdapter() {}

    public DetailAdapter(List<Detail> stuList,Context context) {
        this.stuList = stuList;
        this.inflater=LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return stuList==null?0:stuList.size();
    }

    @Override
    public Detail getItem(int position) {
        return stuList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    ViewHolder vh ;
    public View getView(int position, View convertView, ViewGroup parent) {
        //加载布局为一个视图
        View view=inflater.inflate(R.layout.detail_item,null);
        vh = new ViewHolder();
        Detail student=getItem(position);
        //在view视图中查找id为image_photo的控件







        vh.name = (TextView) view.findViewById(R.id.name);
        vh.name.setText(student.getName());

        vh.quanlity = (TextView) view.findViewById(R.id.quanlity);
        vh.quanlity.setText(student.getQuanlity());


        vh.prize = (TextView) view.findViewById(R.id.prize);
        vh.prize.setText(student.getPrize());


        vh.money = (TextView) view.findViewById(R.id.money);
        vh.prize.setText(student.getMoney());





        return view;
    }

    public class ViewHolder {
        private TextView name,quanlity,prize,money;
    }
}
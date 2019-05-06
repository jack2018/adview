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


public class ListAdapter extends BaseAdapter {

    private List<Goods> stuList;
    private LayoutInflater inflater;
    public ListAdapter() {}

    public ListAdapter(List<Goods> stuList,Context context) {
        this.stuList = stuList;
        this.inflater=LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return stuList==null?0:stuList.size();
    }

    @Override
    public Goods getItem(int position) {
        return stuList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    ViewHolder vh ;
    public View getView(int position, View convertView, ViewGroup parent) {
        //加载布局为一个视图
        View view=inflater.inflate(R.layout.layoutlistview,null);
        vh = new ViewHolder();
        Goods student=getItem(position);
        //在view视图中查找id为image_photo的控件






        vh.num = (TextView) view.findViewById(R.id.num);
        vh.num.setText(student.getNum());

        vh.name = (TextView) view.findViewById(R.id.name);
        vh.name.setText(student.getName());

        vh.goods = (TextView) view.findViewById(R.id.goods);
        vh.goods.setText(student.getGoods());


        vh.result = (TextView) view.findViewById(R.id.result);
        vh.result.setText(student.getResult());







        return view;
    }

    public class ViewHolder {
        private TextView num,name,goods,result;
    }
}
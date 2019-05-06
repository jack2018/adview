package ye.fang.tool;

import android.os.Handler;
import android.os.Message;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.chad.library.adapter.base.BaseQuickAdapter;

import java.util.ArrayList;

public class RecycleScrollTools {
   private static RecycleScrollTools recycleScrollTools ;
   private ArrayList<RecyclerView> recyclerViews = new ArrayList<>();
   private int durtime=10000;
    private RecycleScrollTools() {

    }
    public static RecycleScrollTools getInstance(){
        RecycleScrollTools recycleScrollTools = new RecycleScrollTools();
        return    recycleScrollTools;
    };
    Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            for (int i = 0; i < recyclerViews.size(); i++) {
             RecyclerView recyclerView = recyclerViews.get(i);
            BaseQuickAdapter baseQuickAdapter = (BaseQuickAdapter) recyclerView.getAdapter();
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            int position = linearLayoutManager.findLastVisibleItemPosition();
            int size = baseQuickAdapter.getData().size();
            if(position+1==size){

            }else {
                for (int b = 0; i < 10; i++) {
                    baseQuickAdapter.getData().add(baseQuickAdapter.getData().get(0));
                    baseQuickAdapter.getData().remove(0);
                }
                baseQuickAdapter.notifyDataSetChanged();
                sendEmptyMessageDelayed(10,durtime);
            }
            }
        }
    };

    public void addRecycleView(RecyclerView recyclerView){
        recyclerViews.add(recyclerView);
//        handler.removeMessages(10);
        ReSetHandle();
    }
    private void ReSetHandle(){
        handler.sendEmptyMessageDelayed(10,durtime);
    }
}

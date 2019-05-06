package ye.fang.wigth;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import ye.fang.adapter.CommiteDataAdapter;
import ye.fang.adapter.DayCheckDataAdapter;
import ye.fang.adapter.DayPriceAdapter;

public class AutoScrollRecyclerView extends RecyclerView {
    public AutoScrollRecyclerView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }
    Disposable mAutoTask;
    UpdateRecycle updateIns;
    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        return true;
    }
    public void setUpdateIns(UpdateRecycle updateIns){
        this.updateIns=updateIns;
    }
    public void start() {
        if (mAutoTask != null && !mAutoTask.isDisposed()) {
            mAutoTask.isDisposed();
        }
         mAutoTask = Observable.interval(1000, 300, TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer<Long>() {
            @Override
            public void accept(Long aLong) throws Exception {
                smoothScrollBy(0, 20);
              View view = AutoScrollRecyclerView.this.getChildAt(0);
              if(view!=null){
                RecyclerView.LayoutParams layoutParams = (LayoutParams) AutoScrollRecyclerView.this.getChildAt(0).getLayoutParams();
                if(layoutParams!=null){
                int currentPosition = layoutParams.getViewAdapterPosition();
                if(currentPosition==900){
                    if(getAdapter() instanceof DayCheckDataAdapter){
                        updateIns.updateAll(0);
                    }
                    if(getAdapter() instanceof CommiteDataAdapter){
                        updateIns.updateAll(1);
                    }
                    if(getAdapter() instanceof DayPriceAdapter){
                        updateIns.updateAll(2);
                    }
                    if(getAdapter() instanceof DayPriceAdapter){
                        updateIns.updateAll(3);
                    }
               }
                }
            }
            }
        });
    }

    public void stop() {
        if (mAutoTask != null && !mAutoTask.isDisposed()) {
            mAutoTask.isDisposed();
            mAutoTask = null;
        }
    }

}

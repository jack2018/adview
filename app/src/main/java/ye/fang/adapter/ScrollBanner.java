package ye.fang.adapter;

import java.util.List;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import ye.fang.ad.R;

@TargetApi(Build.VERSION_CODES.HONEYCOMB)
@SuppressLint("NewApi")
public class ScrollBanner extends LinearLayout {
    private TextView mBannerTV1;

    private Handler handler;
    private boolean isShow=false;
    private int startY1, endY1, startY2, endY2;
    private Runnable runnable;
    private List<String> list;
    private int position = 0;
    private int offsetY = 100;
    public ScrollBanner(Context context) {
        this(context, null);
    }

    @SuppressLint("NewApi")
	public ScrollBanner(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
	@SuppressLint("NewApi")
	public ScrollBanner(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        View view = LayoutInflater.from(context).inflate(R.layout.quanlity_change, this);
        mBannerTV1 = (TextView) view.findViewById(R.id.tv_banner1);
     
        handler = new Handler();
        runnable = new Runnable() {
            @TargetApi(Build.VERSION_CODES.HONEYCOMB)
			@SuppressLint("NewApi")
			@Override
            public void run() {
                isShow = !isShow;
                if (position == list.size()-1) {
                    position = 0;
                }
                if (isShow) {
                    mBannerTV1.setText(list.get(position++));
               
                } else {
                  
                    mBannerTV1.setText(list.get(position));
                }
                startY1 = isShow ? 0 : offsetY;
                endY1 = isShow ? -offsetY : 0;
                ObjectAnimator.ofFloat(mBannerTV1, "translationY", startY1, endY1).setDuration(300).start();
                startY2 = isShow ? offsetY : 0;
                endY2 = isShow ? 0 : -offsetY;
           
                handler.postDelayed(runnable, 3000);
            }
        };
    }
    public List<String> getList() {
        return list;
    }
    public void setList(List<String> list) {
        this.list = list;
    }
    public void startScroll() {
        handler.post(runnable);
    }
    public void stopScroll() {
        handler.removeCallbacks(runnable);
    }
}

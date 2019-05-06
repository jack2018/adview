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

import java.util.List;

import ye.fang.ad.R;
import ye.fang.model.DayCheck;

/**
 * Created by 18650 on 2019/1/20.
 */

public abstract class BaseAutoScrollAdapter<T, K extends BaseViewHolder> extends BaseQuickAdapter<T, K> {
    public BaseAutoScrollAdapter(int layoutResId, @Nullable List data) {
        super(layoutResId, data);
    }

    public BaseAutoScrollAdapter(@Nullable List data) {
        super(data);
    }

    public BaseAutoScrollAdapter(int layoutResId) {
        super(layoutResId);
    }
    private int mLastPosition = -1;
    private int mPosition = 0;
    private Interpolator mInterpolator = new LinearInterpolator();
    private int mDuration = 4000;
    private BaseAnimation mSelectAnimation = new AlphaInAnimation();
    protected boolean mOpenAnimationEnable = true;
  /*  public BaseAutoScrollAdapter() {
        super(R.layout.item_day_price);
    }
    @Override
    protected void convert(BaseViewHolder baseViewHolder, DayCheck s) {
        baseViewHolder.setText(R.id.tv_check_name,s.getName());
        baseViewHolder.setText(R.id.tv_check_price,"￥"+s.getPrice());
        baseViewHolder.setTextColor(R.id.tv_check_price,Color.parseColor("#ffff0000"));
//        baseViewHolder.setText(R.id.tv_good_name,s.getProductName());
//        BigDecimal bigDecimal = new BigDecimal(s.getPrice());
//        BigDecimal bigDecima2 = new BigDecimal(s.getQty());
//        BigDecimal bigDecima3 = bigDecimal.multiply(bigDecima2);
//        baseViewHolder.setText(R.id.tv_good_price,"￥"+bigDecimal.setScale(2,BigDecimal.ROUND_HALF_UP));
//        baseViewHolder.setText(R.id.tv_good_amount,""+bigDecima2.setScale(2,BigDecimal.ROUND_HALF_UP));
//        baseViewHolder.setText(R.id.tv_good_money,"￥"+bigDecima3.setScale(2,BigDecimal.ROUND_HALF_UP));
        if(mOpenAnimationEnable) {
            addAnimation(baseViewHolder);
        }
    }*/

    /**
     * 添加动画
     * @param holder
     */
    public void addAnimation(RecyclerView.ViewHolder holder) {

        if (mOpenAnimationEnable) {
            if (holder.getLayoutPosition() > mLastPosition) {
                BaseAnimation animation = null;
                if (mSelectAnimation != null) {
                    animation = mSelectAnimation;
                }
                for (Animator anim : animation.getAnimators(holder.itemView)) {
                    startAnim(anim);

                }
                mLastPosition = holder.getLayoutPosition();
            }
        }
    }

    /**
     * 开启动画
     * @param animator
     */
    private void startAnim(Animator animator) {
        animator.setDuration(mDuration).start();
        animator.setInterpolator(mInterpolator);
    }

    /**
     * 设置动画效果
     * @param animation
     */
    public void setAnimation(BaseAnimation animation){
        this.mOpenAnimationEnable = true;
        this.mSelectAnimation = animation;}

    @Override
    public int getItemCount() {
        return 1000;
    }

    @Nullable
    @Override
    public T getItem(int position) {
        int newPosition = position % getData().size();
        return (T) getData().get(newPosition);
    }

    @Override
    public int getItemViewType(int position) {
        int count = getHeaderLayoutCount() +getData().size();
        //刚开始进入包含该类的activity时,count为0。就会出现0%0的情况，这会抛出异常，所以我们要在下面做一下判断
        if (count <= 0) {
            count = 1;
        }
        int newPosition = position % count;
        return super.getItemViewType(newPosition);
    }
}

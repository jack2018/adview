package ye.fang.record;


import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import ye.fang.ad.MainActivity;

public class ChartView extends View{

    private Paint paint;

    private Paint paintPoint;//点
    private Paint paintText;

    private int mXPoint = 0;//原点的X轴坐标

    private String[] mYLabel = null;//Y轴上的刻度
    private String[] mData = null;//需要展示的数据


    public void setInfo(String[] mXLable, String[] mYLable,String[] AllData) {

        mYLabel = mYLable;//纵坐标
        mData = AllData;//数据

    }

    public ChartView(Context context) {
        super(context);
    }
    public ChartView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public ChartView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initPaint();
    }

    private void initPaint() {
        paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(2);//设置线宽
        paint.setAntiAlias(true);//去锯齿
        paint.setTextSize(12);


        //文字
        paintText = new Paint();
        paintText.setStyle(Paint.Style.STROKE);
        paintText.setAntiAlias(true);//去锯齿
        paintText.setColor(Color.WHITE);
        paintText.setTextSize(12);

        //点
        paintPoint = new Paint();
        paintPoint.setStyle(Paint.Style.STROKE);
        paintPoint.setAntiAlias(true);//去锯齿
        paintPoint.setStyle(Paint.Style.FILL);//实心
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        //设置虚线
        //drawAboutYs(canvas);
        //设置Y轴
        // canvas.drawLine(mXPoint, mYPoint, mXPoint, mYPoint-mYLength, paint);
        //设置Y轴上的刻度显示（如果没有for循环，将只会是一个Y轴的直线）

        paint.setColor(Color.WHITE);
        for(int i = 0;i<15;i++){
            for(int i1 = 0;i1<MainActivity.shuzi.length;i1++){
                //画折线
                if(i1<14){
                    canvas.drawLine(mXPoint+(i1)*getWidth()/15,getHeight()*YCoord(mData[i1]), mXPoint+(i1+1)*getWidth()/15, getHeight()*YCoord(mData[i1+1]), paint);

                }

                //画转折点上方的数据值
                canvas.drawText(6000-Integer.parseInt(mData[i1])+"",mXPoint+i1*getWidth()/15+20,getHeight()*YCoord(mData[i1]),paintText);

                /*****
                 *
                 *         if(YCoord(mData[i1])>1/3){
                 paintPoint.setColor(Color.parseColor("#FF0000"));
                 }     if(YCoord(mData[i1])>1/3&YCoord(mData[i1])==1/3&YCoord(mData[i1])<2/3){
                 paintPoint.setColor(Color.parseColor("#FBAD5F"));
                 }      if(YCoord(mData[i1])>2/3&YCoord(mData[i1])==2/3&YCoord(mData[i1])<1&YCoord(mData[i1])==1){
                 paintPoint.setColor(Color.parseColor("#C8E1A8"));
                 }

                 * **/    paintPoint.setColor(Color.parseColor("#FF0000"));
                //设置圆点为实心的
                //paint.setStyle(Paint.Style.FILL);
                //画两线之间的转折点
                canvas.drawCircle(mXPoint+i1*getWidth()/15,getHeight()*YCoord(mData[i1]), 6, paintPoint);


            }
        }

    }






    private float YCoord(String y0)  //计算绘制时的Y坐标，无数据时返回-999
    {

        return Float.parseFloat(y0)/Integer.parseInt(mYLabel[mYLabel.length-1]);


    }



}
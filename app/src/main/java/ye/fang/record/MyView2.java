package ye.fang.record;
import java.math.BigDecimal;
import java.util.Arrays;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;





public class MyView2 extends View
{

	//Bar_Today m=new Bar_Today();

	public Paint paint;
	float x;
	float y;
	static int  click;

	Context context;
	int [] split=new int[20];
	int k=-1;
	public static String [] fen;
	public static int [] sum;
	String [] a;
	private int[] color ;
	private boolean have;

	public MyView2(Context context, AttributeSet set)
	{
		super(context, set);
		this.context=context;

		a=new String[20];
		fen=new String[20];
		for(int j=0;j<fen.length;j++){
			fen[j]="wait";
		}

		sum=new int[fen.length];
		for(int j=0;j<fen.length;j++){
			sum[j]=40;
		}

	}



	// 重写该方法，进行绘图
	@SuppressLint("DrawAllocation")
	@SuppressWarnings("static-access")
	protected void onDraw(Canvas canvas)
	{
		super.onDraw(canvas);

		// 把整张画布绘制成白色
		paint= new Paint();
		paint.setColor(Color.rgb(248,248,255));

		canvas.drawRect(0, 0, getWidth(), getHeight(), paint);

		paint.setColor(Color.rgb(0,0,0));
		paint.setTextSize(30);


		for(int j=0;j<fen.length;j++){

			canvas.drawText(fen[j], 30, 60+60*j, paint);
			canvas.drawText(sum[j]+"",120+10*sum[j], 60+60*j, paint);

		}

		Color c= new Color();
		color = new int[]{ c.BLACK, c.argb(100, 100, 200, 150)
		};

		for(int j=0;j<fen.length;j++){
			paint.setColor(color[1]);
			//android 画方块前两个参数是先确定左上点，后面两个数是确定右下点
			canvas.drawRect(100,30+j*60,100+10*sum[j],70+j*60-40, paint);
			//画转折点上方的数据值
			paint.setTextSize(20);
			canvas.drawText("香蕉",100+10*sum[j],100,paint);


		}

	}







	// 触笔事件
	public boolean onTouchEvent(MotionEvent event) {
		x= event.getX();
		y = event.getY();
		if(x-100>0){
			click=(int) ((y-30)/60);
			System.out.println("click     "+click);
		}
		invalidate();
		return super.onTouchEvent(event);
	}







	/*******判断一个点是否在矩形当中********/
	public  boolean point_rect(int ax, int ay, int aw,
							   int ah,float bx, float by){
		if(ax<bx&bx<(ax+aw)&ay<by&by<(bx+by))
			return true;
		else

			return false;}


	/**********************碰撞检测（矩形检测）**************************/
	public  boolean isIntersectingRect(int ax, int ay, int aw,
									   int ah, int bx, int by, int bw, int bh) {
		if (by + bh < ay || // is the bottom of b above the top of a?
				by > ay + ah || // is the top of b below bottom of a?
				bx + bw < ax || // is the right of b to the left of a?
				bx > ax + aw) // is the left of b to the right of a?
			return false;
		else
			return true;
	}



	// 按键按下事件
	public boolean onKeyDown(int keyCode, KeyEvent event)
	{
		return true;
	}


	// 按键弹起事件
	public boolean onKeyUp(int keyCode, KeyEvent event)
	{
		return false;
	}


	public boolean onKeyMultiple(int keyCode, int repeatCount, KeyEvent event)
	{
		return true;
	}



	String temps[];

	//冒泡排序法
	public String [] Same(String[] arr,String ss[])
	{
		String[] array=arr;
		temps=new String[array.length+1];
		for(int k1=0;k1<temps.length;k1++)
		{temps[k1]="wait";
		}

		int i,j1,k;
		String temp;

		//n个元素的数组进行n-1轮排序
		for(i=0;i<array.length-1;i++){
			//因为每一轮循环将确定一个数组元素的位置,
			//所以每一轮的比较次数将会递减
			for(j1=0;j1<array.length-i-1;j1++)
			{

				for(k=0;k<ss.length-i;k++)
				{

					//System.out.println("...ss[k]..........."+ss[k]);
					if(array[j1].equals(ss[k])){

						//如果第j个元素比它后面的相邻的元素大的话就交换
						temp=array[j1];
						array[j1]=array[j1+1];
						array[j1+1]=temp;
					}
				}
			}
		}
		for(int k1=0;k1<temps.length-1;k1++)
		{
			temps[k1]=array[k1];
		}



		//打印出排序后的数组
		System.out.println("...myview....."+Arrays.toString(temps));

		return array;
	}


	//对数组元素中的相同元素只保留一个
	public String[] dsArrary(String[] str){
		StringBuffer sb = new StringBuffer(); //用来保存不同的数据

		if(str.length==0){
			sb.append("nothing"+";"); //添加第一个元素
		}
		else{


			sb.append(str[0]+";"); //添加第一个元素
			for(int i = 1;i < str.length;i++){
				boolean flag = false; //用来标记是否有相同的，开始为false表示没有
				for(int j = i-1; 0 <= j;j--){
					if(str[i].equals(str[j])){
						flag = true; //找到相同的
					}
				}
				//没相同的
				if(!flag)sb.append(str[i]+";");
			}
		}


		//返回新的数组
		return sb.substring(0, sb.length()-1).split(";");
	}


	//四舍五入的算法
	protected float SiShe(float s){
		BigDecimal   b1   =   new   BigDecimal(s);
		float   f1   =   (float) b1.setScale(4,   BigDecimal.ROUND_HALF_UP).doubleValue();
		return f1;

	}

}

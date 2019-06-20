package recoginze.sdl.com.configapp;

import android.app.Activity;
//import android.os.Build;

//import android.annotation.SuppressLint;
//import android.annotation.TargetApi;
//import android.app.Activity;
//import android.bluetooth.BluetoothAdapter;
//import android.bluetooth.BluetoothDevice;
//import android.bluetooth.BluetoothServerSocket;
//import android.bluetooth.BluetoothSocket;
//import android.content.BroadcastReceiver;
//import android.content.ContentValues;
//import android.content.Context;
//import android.content.Intent;
//import android.content.IntentFilter;
//import android.content.SharedPreferences;
//import android.content.pm.PackageManager;
//import android.database.Cursor;
//import android.database.sqlite.SQLiteDatabase;
//import android.graphics.Bitmap;
//import android.graphics.BitmapFactory;
//import android.graphics.drawable.BitmapDrawable;
//import android.graphics.drawable.Drawable;
//import android.net.ConnectivityManager;
//import android.os.AsyncTask;
//import android.os.Build;
//import android.os.Bundle;
//import android.os.Environment;
//import android.os.Handler;
//import android.os.Message;
//import android.support.v4.view.PagerAdapter;
//import android.support.v4.view.ViewPager;
//import android.support.v4.view.ViewPager.OnPageChangeListener;
//import android.util.DisplayMetrics;
//import android.util.Log;
//import android.view.KeyEvent;
//import android.view.View;
//import android.view.ViewGroup;
//import android.view.View.OnClickListener;
//import android.widget.AbsListView;
//import android.widget.AdapterView;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.ImageView;
//import android.widget.LinearLayout;
//import android.widget.ListView;
//import android.widget.ProgressBar;
//import android.widget.RatingBar;
//import android.widget.RelativeLayout;
//import android.widget.TextView;
//import android.widget.Toast;
//import network.NetUtils;
//import ye.fang.adapter.Goods;
//import ye.fang.adapter.ListAdapter;
//import ye.fang.adapter.ListviewAdapter;
//import ye.fang.aotoload.LoadingService;
//import ye.fang.aotoload.Utils;
//import ye.fang.aotoload.VersionInfoBean;
//import ye.fang.bt.IntToButeArray;
//import ye.fang.bt.Byte_Tool;
//import ye.fang.db.CreateFiles;
//import ye.fang.db.DBHelper;
//import ye.fang.db.Local_data;
//import ye.fang.db.ORPHelper;
//import ye.fang.db.Order_seach;
//import ye.fang.dl.Copy_Print;
//import ye.fang.dl.Other_button;
//import ye.fang.http.GetPostUtil;
//import ye.fang.http.HttpDemo;
//import ye.fang.manage.massage.DWL_ORP;
//import ye.fang.manage.massage.DWL_PLU;
//import ye.fang.manage.massage.DWL_REP;
//import ye.fang.manage.massage.DWL_SAL;
//import ye.fang.manage.massage.DWL_SCP;
//import ye.fang.manage.massage.DWL_TIM;
//import ye.fang.manage.massage.DWL_TMS;
//import ye.fang.manage.massage.DWL_TMT;
//import ye.fang.manage.massage.DwlCls;
//import ye.fang.manage.massage.Upl_inf;
//import ye.fang.manage.massage.VIP;
//import ye.fang.thread.Blue_state;
//import ye.fang.thread.Good_click_thread;
//import ye.fang.tool.Android_Msg;
//import ye.fang.tool.BmpUtil;
//import ye.fang.tool.Double_Number;
//import ye.fang.tool.String_Tool;
//import ye.fang.tool.Times;
//import ye.fang.tool.ToastUtils;
//import ye.fang.tool.Unit_mn;
//import ye.fang.tool.ZXingUtils;
//import ye.fang.view.RingProgressBar;
//import java.io.File;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.OutputStream;
//import java.net.HttpURLConnection;
//import java.net.InetAddress;
//import java.net.Socket;
//import java.net.URL;
//import java.text.SimpleDateFormat;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Calendar;
//import java.util.HashMap;
//import java.util.Iterator;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Map;
//import java.util.Set;
//import java.util.TimeZone;
//import java.util.Timer;
//import java.util.TimerTask;
//import java.util.UUID;
//import java.util.concurrent.Executors;
//import java.util.concurrent.ScheduledExecutorService;
//import java.util.concurrent.TimeUnit;
//import org.json.JSONArray;
//import org.json.JSONObject;
//import com.example.xiaoye.myapplication.Socket_Tool;
//import com.example.xiaoye.myapplication.YiChan;
//import com.zhy.view.NetimageView;
//import com.zhy.view.XCRoundImageView;
/*
10-18 16:07:15.493: I/?????????????(21843):-----??????????
I/System.out(21843):????????????-----1920
10-18 16:07:15.548: I/System.out(21843): ???????????? -----1080
10-18 16:07:15.548: I/System.out(21843): ??????------1.5
                                                                                                       ??????DPI--240
static ??????¦Å?????????????????????????????????????????????????¦²????????????????????????????????0???????
*/
//@SuppressLint("NewApi")
//@TargetApi(Build.VERSION_CODES.FROYO)
public class Main extends Activity {}
// /**       implements OnClickListener{
//LinearLayout hide_ll,mid_ll,money_ll;//
//private static final String NAME = "BT_DEMO";
//private static final UUID BT_UUID = UUID.fromString("00001101-0000-1000-8000-00805F9B34FB");
//private ListenerThread listenerThread;
//TextView zhongliang,prize_tv,total_tv,goods,u_id,quanlity,unit_text,prize_unit,wending,list_total;//
//Button back,blue_tooth,erweima;
//ListAdapter la;//??????
//LinearLayout message,scro_fl;
//ListView blue_tooth_list;
////ImageView stabilization;
//LinearLayout blue_area;
//protected final int H_WX=9;
//protected final int H_ZFB=10;
//protected final int H_YL=11;
//protected final int H_CITY_CARD=12;
//protected final int CHOUJIAN=13;
//protected final int CASH=22;
//public  final int ZHIFU = 23;
//String money="0.00";
//Upl_inf ui;
//static DWL_PLU dp;
//static DWL_TMS dt;
//DwlCls dc;
//static DWL_TMT dtmt;
//DWL_SCP ds;
//DWL_SAL dsal;
//DWL_ORP dorp;
//
//VIP vip;
//DWL_TIM dti;
//TextView MarketName_tv,MarketID_tv,handphone,undertakeing;//
//RingProgressBar rb;
//ProgressBar pb;//pb1
//int scroll_size=0;
//public  int GOOD_MASSEGE_LENGTH=40;
//String physics_card;
//EditText etu_id;
//String temp[]={"","","","",};
//public static List<Map<String, Object>> listItems =new ArrayList<Map<String, Object>>();
//ListviewAdapter mListviewAdapter;
//LinearLayout frame_ll,prize_ll;
//Copy_Print cp;
//TextView shop_num;
//ImageView no_net,net_state,blue_close;//   wifi_state
//RatingBar service_rate,quanlity_rate;
//ListView lview;
//
//static ImageView  qcode;
//Blue_state bs;
//Other_button ob;
//DWL_REP drep;
//NetimageView licence;
//XCRoundImageView roundImageView;
//static ImageView iv_discuss;
//static DBHelper dbHelper;
//static String MC="";
//@SuppressWarnings("deprecation")
//protected void onCreate(Bundle savedInstanceState) {
//super.onCreate(savedInstanceState);
//setContentView(R.layout.main2);
//System.out.println("BluetoothManager.isBluetoothEnabled()  "+BluetoothManager.isBluetoothEnabled());
//if(!BluetoothManager.isBluetoothEnabled()){
//	BluetoothManager.turnOnBluetooth();
//	open_blue_thread();
//	System.out.println("??????");
//}
//CreateFiles.CreateText();
////???????
//images = new ArrayList<ImageView>();
//dot_ll=(LinearLayout)findViewById(R.id.dot_ll);
//title = (TextView) findViewById(R.id.title);
////title.setText(titles[0]);
//mViewPager = (ViewPager) findViewById(R.id.vp);
//Scroll_viewpager();
//
//
//      Android_Msg am=new Android_Msg(this,this);
//      MC=am.Uuid();
//      nr=new NR();//?????????????????
//      mFilter.addAction(ConnectivityManager.CONNECTIVITY_ACTION);
//      registerReceiver(nr, mFilter);
//
//   myReceive = new MyReceive();//?????¡ã·ÚAPK
//   IntentFilter filter = new IntentFilter();
//   filter.addAction("android.intent.action.loading_over");
//   filter.addAction("android.intent.action.loading");
//   registerReceiver(myReceive,filter);
//
//	  ob=new Other_button(this);
//      sbyte=new Byte_Tool(this);
//
//      DisplayMetrics dm = getResources().getDisplayMetrics();
//      width = dm.widthPixels;
//      height = dm.heightPixels;
//      open_blue_thread();
//
//
//      TextView time = (TextView)findViewById(R.id.time);
//      Times  tm=new Times(time);
//     // MarketName_tv.setText("fdsa");
//      MarketName_tv= (TextView)findViewById(R.id.MarketName_tv);
//      handphone= (TextView)findViewById(R.id.handphone);
//
//     //int a=Integer.parseInt(sss);
//      MarketID_tv= (TextView)findViewById(R.id.MarketID_tv);
//      /*******
//       * ?????????????????????????§¹???????????????????????????????????????????
//       * ????????????????????? wrap_content??????????????????
//       * */
//      licence= (NetimageView)findViewById(R.id.licence);
//       View_Height_Set(licence,(int) (height/2));
//
//
//
//      roundImageView= (XCRoundImageView)findViewById(R.id.roundImageView);
//      pb=(ProgressBar)findViewById(R.id.pb);
//      //pb1=(ProgressBar)findViewById(R.id.pb1);
//      no_net= (ImageView)findViewById(R.id.no_net);
//      net_state= (ImageView)findViewById(R.id.net_state);
//      //wifi_state= (ImageView)findViewById(R.id.wifi_state);
//
//	    ewm_ll= (LinearLayout)findViewById(R.id.ewm_ll);
//	    ewm_ll.setVisibility(View.GONE);
//		money_ll= (LinearLayout)findViewById(R.id.money_ll);
//     zhongliang= (TextView)findViewById(R.id.zhongliang);
//     quanlity= (TextView)findViewById(R.id.quanlity);
//     unit_text= (TextView)findViewById(R.id.unit_text);
//     prize_unit= (TextView)findViewById(R.id.prize_unit);
//
//     prize_tv= (TextView)findViewById(R.id.prize);
//     total_tv= (TextView)findViewById(R.id.total);
//     goods= (TextView)findViewById(R.id.goods);
//     goods_list=(ListView)findViewById(R.id.goods_list);
//     View_Height_Set(goods_list,(int) (height*GOOD_LIST_HEIGHT));
//     qcode=(ImageView)findViewById(R.id.qcode);
//     pay_state=(TextView)findViewById(R.id.pay_state);
//
//     merber_ll = (LinearLayout) findViewById(R.id.merber_ll);
//     View_Height_Set(merber_ll,0);
//     scro_fl = (LinearLayout) findViewById(R.id.scro_fl);
//
//     String filePath = Environment.getExternalStorageDirectory().getAbsolutePath() +"/"+"Test"+"/"+"head.png";
//    // System.out.println("?????¡¤??:"+filePath);
//	 Bitmap bit =BitmapFactory.decodeFile(filePath) ;
//     if(bit!=null){
//    	 roundImageView.setImageBitmap(bit);
//     }
//
//	   filePath = Environment.getExternalStorageDirectory().getAbsolutePath() +"/"+"Test"+"/"+"license.png";
//   bit =BitmapFactory.decodeFile(filePath) ;
//   Drawable drawable = new BitmapDrawable(bit);
//   if(bit!=null){
//   licence.setBackgroundDrawable(drawable);
//   }
//
//     tv_m_name=(TextView)findViewById(R.id.tv_m_name);
//     tv_m_balance=(TextView)findViewById(R.id.tv_m_balance);
//     tv_m_jifen=(TextView)findViewById(R.id.tv_m_jifen);
//
//     list_total=(TextView)findViewById(R.id.list_total);
//     list_total.setText("???? "+"0.00"+"?");
//     back=(Button)findViewById(R.id.back);
//     back.setOnClickListener(this);
//
//     erweima=(Button)findViewById(R.id.erweima);
//     erweima.setOnClickListener(this);
//
//     blue_tooth=(Button)findViewById(R.id.blue_tooth);
//     blue_tooth.setOnClickListener(this);
//
//     lview = (ListView) findViewById(R.id.lview);
//     iv_discuss = (ImageView) findViewById(R.id.iv_discuss);
//     Bitmap bitmap = ZXingUtils.createQRImage(MC,1000,1000);
//     iv_discuss.setImageBitmap(bitmap);
//
//     //noseeBanner();
//     message=(LinearLayout)findViewById(R.id.message);
//
//     message.setVisibility(View.VISIBLE);
//     blue_tooth_list=(ListView)findViewById(R.id.blue_tooth_list);
//     //mid_ll = (LinearLayout)findViewById(R.id.mid_ll);
//
//     undertakeing = (TextView) findViewById(R.id.undertakeing);
//     hide_ll = (LinearLayout)findViewById(R.id.hide_ll);
//
//     View_Height_Set(undertakeing,(int) (height/3));
//
//
//     text_state = (TextView) findViewById(R.id.text_state);
//
//     blue_area=(LinearLayout)findViewById(R.id.blue_area);
//     blue_area.setVisibility(View.GONE);
//
//
//     frame_ll = (LinearLayout) findViewById(R.id.frame_ll);
//     prize_ll = (LinearLayout) findViewById(R.id.prize_ll);
//     prize_ll.setVisibility(View.GONE);
//     blue_close = (ImageView) findViewById(R.id.blue_close);
//     blue_close = (ImageView) findViewById(R.id.blue_close);
//
//
//
//    /// merber_ll=(LinearLayout)findViewById(R.id.merber_ll);
//
//     service_rate = (RatingBar) findViewById(R.id.service_rate);
//     quanlity_rate = (RatingBar) findViewById(R.id.quanlity_rate);
//    // stabilization=(ImageView)findViewById(R.id.stabilization);
//
//     wending=(TextView)findViewById(R.id.wending);
//
//    // meber_name.setVisibility(View.GONE);
//    // meber_balance.setVisibility(View.GONE);
//    // meber_jifen.setVisibility(View.GONE);
//        wd=new Weight_Demo();
//        ds=new DWL_SCP(this);
//	      db = SQLiteDatabase.openOrCreateDatabase(this.getFilesDir().toString() + "/my.db3" , null);
//
//		  dbHelper = new DBHelper(this);
//		  ContentValues values = new ContentValues();
//		  values.put("_id", 1);
//		  values.put("num",0);
//		  dbHelper.insert(values);	 //????insert?????????
//
////	      odHelper = new ORPHelper(this);
////		  ContentValues values1 = new ContentValues();
////		  values1.put("_id", 2);
////		  values1.put("num","1");
////		  odHelper.insert(values1);
//
//		  ContentValues values2 = new ContentValues();
//		  values2.put("_id", 2);
//		  values2.put("num", 0);
//		  dbHelper.insert(values2);	 //????insert?????????
//
//	 	   ContentValues vl1 = new ContentValues();
//	 	   vl1.put("num", 2);
//	 	   String where1 = "_id" + " = ?";
//	 	   String[] whereValue1 = {"1"};
//	 	  // long row=  db.update(TABLENAME, values, where, whereValue);//?????????????????
//	      // dbHelper.update(vl1, where1, whereValue1);
//	 	   if(bhh==null){
//	            bhh=new bhHandle();//???????
//	        }
//	   Start_Scroll(10);//??????????????
//    if(schh==null){
//	   schh=new scHandle();
//    }
////    if(adhd==null){
////    adhd=new adHandle();//????????§Ý??????
////    }
////
////    adth=new adThread();//??????????
////	  adth.start();
//
//    dp=new DWL_PLU(this);
//   // dp.do_Data();
//    dt=new DWL_TMS(this);
//    dt.Search_Data();
//    dc=new DwlCls(this);
//
//    dtmt=new DWL_TMT(this);
//    dsal=new DWL_SAL(this);
//    dorp=new DWL_ORP(this);
//    vip=new VIP (this);
//    drep=new DWL_REP(this);
//    dti=new DWL_TIM (this);
////    for(int a1=0;a1<insert.length;a1++)
////    {
////    insert[a1]=0x00;
////    }
//   //  Search_Data();
//     MarketName_tv.setText(dtmt.Search_Data(1));
//     handphone.setText(dtmt.Search_Data(9));
//     MarketID_tv.setText(dtmt.Search_Data(23));
//     card_long[0]=0l;
//     card_long[1]=0l;
//stuList=new ArrayList<Goods>();
//la =new ListAdapter(stuList,Main.this);
//goods_list.setAdapter(la);
//
////???????
// ui=new Upl_inf(this);
// cp=new Copy_Print(this,this);
// shop_num = (TextView)findViewById(R.id.shop_num);
// hide_ll = (LinearLayout)findViewById(R.id.hide_ll);
// hide_ll.setOnClickListener(this);
//
//	shop_num.setText(search_shop_num());
//   // qch=new qcHandle();
//
//	 no_net.setVisibility(View.GONE);
//	 yc=new YiChan(this);
//	 yc.do_Data();
//
//	 //yo=new Yc_Orp(this);
//	 //yo.do_Data();
//	 bs=new Blue_state();
//
//
//
//	 d_dp=new String [40];
//	 d_dw=new String [40];
//	 d_prize=new String [40];
//	 d_dt=new String [40];
//	 d_dn=new String [40];
//	 d_du=new String [40];
//	 d_djf=new double [40];
//
//	 d_rate1365=new String [40];
//	 d_ys1365=new String [40];
//	 cargo_num=new String [40];
//	 pichi=new String [40];
//
//	  for(int a1=0;a1<40;a1++){
//	 	 d_dp[a1]="0";
//	 	 d_prize[a1]=Double_Number.NetString(0.00);
//	 	 d_dt[a1]=Double_Number.NetString(0.00);
//	 	 d_dn[a1]="??PLU";
//	 	 d_djf[a1]=0.00;
//	 	 d_ys1365[a1]="0.00";
//	 	 d_rate1365[a1]="0.00";
//	 	 d_dw[a1]=Double_Number.NetString(0.00);
//	 	 d_du[a1]="1";
//	 	 cargo_num[a1]="0";
//	 	 pichi[a1]="00000000";
//	  }
//
//
//	  fp1365=new String[40];
//	  fw1365=new String[40];
//	  f_prize1365=new String[40];
//	  ft1365=new String [40];
//	  fn1365=new String [40];
//	  fu1365=new String [40];
//	  fjf1365=new double [40];
//	  fys1365=new String [40];
//	  frate1365=new String [40];
//	  cargo_num=new String [40];
//	  pichi=new String [40];
//	  for(int a1=0;a1<40;a1++){
//	 	    fp1365[a1]="0";
//	 		f_prize1365[a1]=Double_Number.NetString(0.00);
//	 		ft1365[a1]=Double_Number.NetString(0.00);
//	 		fn1365[a1]="??PLU";
//	 		fjf1365[a1]=0.00;
//	 	fys1365[a1]="0.00";
//	 	frate1365[a1]="0.00";
//	 	fw1365[a1]=Double_Number.NetString(0.00);
//	 	fu1365[a1]="1";
//	 	cargo_num[a1]="0";
//	 	pichi[a1]="00000000";
//	  }
//
//	st=new Socket_Tool(this);
//}
//
//
//
//
//public class TimeTaskScroll extends TimerTask {
//    private ListView listView;
//    public TimeTaskScroll(Context context, ListView listView) {
//    this.listView = listView;
//    }
//
//    private Handler handler = new Handler() {
//    public void handleMessage(Message msg) {
//    //???????
//    listView.smoothScrollBy(5, 0);
//    }
//    };
//    public void run() {
//        Message msg = handler.obtainMessage();
//        handler.sendMessage(msg);
//    }
//    }
//double width;
//private static VersionInfoBean versionInfoBean;
//private boolean isLoading;
//private MyReceive myReceive;
//public static String  vs="1.3";
///*
// ???????????·Ú?????·Ú???
// */
//private void getVersionInfoFromServer(){
////???????????????
////FTP://www.abcd-123.com/apk/vesion_update.apk
//vs=HttpDemo.getResultFromNetByGet("http://upfile.abcd-123.com/apk/version.txt");
//versionInfoBean = new VersionInfoBean(vs,"http://upfile.abcd-123.com/apk/henan_bl.apk","??????",getExternalCacheDir()+"");//??????????????·Ú??
//    SharedPreferences sharedPreferences = getSharedPreferences("data",MODE_PRIVATE);
//    sharedPreferences.edit().putString("url",versionInfoBean.getDownloadUrl()).commit();
//    sharedPreferences.edit().putString("path",versionInfoBean.getPath()).commit();//getExternalCacheDir???????¡¤?? ????app???????? §Ø??app?? ????????????????
//    //???·Ú???
//    try {
//	    System.out.println("????·Ú"+versionInfoBean.getVersionName());
//	    System.out.println("????·Ú"+Utils.getVersionName(Main.this));
//        int result = Utils.compareVersion(Utils.getVersionName(this),versionInfoBean.getVersionName());
//        if(result==-1){//???????¡ã·Ú
//            //showDialog();
//            downloadNewVersionFromServer();
//        }else{
//          Toast.makeText(Main.this,"????????¡ã·Ú",Toast.LENGTH_SHORT).show();
//        //  ScalesTask stl= new ScalesTask("http://api.abcd-123.com/api/Scales");
//        //  stl.execute(100);
////    		undertakingTask ut= new undertakingTask("http://api.abcd-123.com/api/CenterInstitution");
////    		ut.execute(100);
//    }
//    } catch (PackageManager.NameNotFoundException e) {
//    e.printStackTrace();
//    }
//}
//
///**
// * ??????????????
// */
//private void downloadNewVersionFromServer(){
//if(new File(versionInfoBean.getPath()).exists()){
//new File(versionInfoBean.getPath()).delete();
//}
//    Toast.makeText(Main.this,"???????...",Toast.LENGTH_SHORT).show();
//    LoadingService.startUploadImg(this);
//}
//
///**
// * ??????????? ??????????
// */
//public class MyReceive extends BroadcastReceiver {
//    @Override
//    public void onReceive(Context context, Intent intent) {
//        String action = intent.getAction();
//       if("android.intent.action.loading_over".equals(action)){
//            isLoading = false;
//        }else if("android.intent.action.loading".equals(action)){
//            isLoading = true;
//
//        }
//    }
//}
//protected void onDestroy() {
//unregisterReceiver(nr);
//super.onDestroy();
//}
//
//
//IntentFilter mFilter = new IntentFilter();
//private  ORPHelper odHelper;
//Weight_Demo wd;
//
//
////Yc_Orp yo;
//
//public Enter_Thread Enter_ht=null;
//
//public void open_blue_thread(){
//
//if(Enter_hh==null){
//Enter_hh=new Enter_Handle();
//}
//
//if(Enter_ht==null){
//Enter_ht=new Enter_Thread();
//Enter_ht.start();
//}
//}
//
//Good_click_thread gct;
//
//LinearLayout merber_ll;
//TextView tv_m_name,tv_m_balance,tv_m_jifen;
//
//
//
////public static  ArrayList<ArrayList<String>>  ds2=new ArrayList<ArrayList<String>>();
////public static ArrayList<String>  ds1=new ArrayList<String>();
//public static  LinkedList<LinkedList<String>>  ds2=new LinkedList<LinkedList<String>>();
//public static LinkedList<String>  ds1=new LinkedList<String>();
//
//public static Byte_Tool sbyte;
//private ArrayList<View> dots;
//private TextView title;
//private ViewPager mViewPager;
//private class ViewPagerAdapter extends PagerAdapter {
//
//    @Override
//    public int getCount() {
//        // TODO Auto-generated method stub
//        return images.size();
//    }
//
//    //???????????
//    public boolean isViewFromObject(View arg0, Object arg1) {
//
//        return arg0 == arg1;
//    }
//
//    @Override
//    public void destroyItem(ViewGroup view, int position, Object object) {
//
//        view.removeView(images.get(position));
//
//    }
//
//    @Override
//    public Object instantiateItem(ViewGroup view, int position) {
//  view.addView(images.get(position));
//    return images.get(position);
//    }
//}
//private ViewPagerAdapter scro_adapter;
//
//private int oldPosition = 0;//???????¦Å??¦Ë??
//private int currentItem; //??????
//private ScheduledExecutorService scheduledExecutorService;
//
//View[] tv;
//LinearLayout dot_ll;
//
//private ArrayList<ImageView> images;
//static YiChan yc;
//boolean yichi=true;
//
//
//public void Scroll_viewpager(){
//	picture_name=Local_data.getImagePathFromSD("/Test/ads/",6);
//	//??????
//	//titles = new String[]{"??",    "??",    "??",    "??",    "??"};
//	RelativeLayout.LayoutParams lll = new RelativeLayout.LayoutParams(15,15);//LayoutParams.WRAP_CONTENT
//	lll.setMargins(60,0,0,0);
//
//	for(int i =0; i < picture_name.length; i++){
//	    ImageView imageView = new ImageView(this);
//	   /// imageView.setBackgroundResource(imageIds[i]);
//	      String filePath = Environment.getExternalStorageDirectory().getAbsolutePath() +"/"+"Test"+"/ads/"+picture_name[i]+".png";
//	      System.out.println("filePath:   "+filePath);
//		   Bitmap bit = BmpUtil.changeBitmapSize(BitmapFactory.decodeFile(filePath));
//		   if(bit!=null){
//		   imageView.setImageBitmap(bit);//??????
//		    images.add(imageView);
//		   }
//	       }
//	dots = new ArrayList<View>();
//	tv=new View[picture_name.length];
//	for(int i =0; i < tv.length; i++){
//	    tv[i] =new View(this);
//	    tv[i].setLayoutParams(lll);
//	    tv[i].setBackground(getResources().getDrawable(R.drawable.page_indicator_focused));
//	      dots.add(tv[i]);
//	      dot_ll.addView( tv[i]);
//	}
//
//
//	scro_adapter = new ViewPagerAdapter();
//	mViewPager.setAdapter(scro_adapter);
//	mViewPager.setOnPageChangeListener(new OnPageChangeListener() {
//	    public void onPageSelected(int position) {
//	        dots.get(oldPosition).setBackgroundResource(R.drawable.page_indicator_focused);
//	        dots.get(position).setBackgroundResource(R.drawable.page_indicator_unfocused);
//	        oldPosition = position;
//	        currentItem = position;
//	    }
//
//	    @Override
//	    public void onPageScrolled(int arg0, float arg1, int arg2) {
//
//	    }
//
//	    @Override
//	    public void onPageScrollStateChanged(int arg0) {
//
//	    }
//	});
//
//}
//
//@Override
//protected void onStart() {
//    // TODO Auto-generated method stub
//    super.onStart();
//
//    scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
//
//    //???2?????§Ý??????
//    scheduledExecutorService.scheduleWithFixedDelay(new ViewPagerTask(), 2, 2, TimeUnit.SECONDS);
//}
//
////?§Ý???
//private class ViewPagerTask implements Runnable {
//
//    @Override
//    public void run() {
//        // TODO Auto-generated method stub
//        currentItem = (currentItem +1) % picture_name.length;
//        //???????
////        handler.sendEmptyMessage(0);
//        handler_scro.obtainMessage().sendToTarget();
//    }
//
//}
//
//private Handler handler_scro = new Handler(){
//
//    @Override
//    public void handleMessage(Message msg) {
//        // TODO Auto-generated method stub
//        //?????????
//        mViewPager.setCurrentItem(currentItem);
//    }
//
//};
//
//@Override
//protected void onStop() {
//    // TODO Auto-generated method stub
//    super.onStop();
//}
//
//public void View_Height_Set(View v,int a){
//    LinearLayout.LayoutParams params1= (LinearLayout.LayoutParams)v.getLayoutParams();//?????????????????
//    params1.height=a;
//    v.setLayoutParams(params1);
//}
//
//
////
////public void meber_LL(int a){
////	   LinearLayout.LayoutParams params2= (LinearLayout.LayoutParams)merber_ll.getLayoutParams();//?????????????????
////     params2.height=a;
////     merber_ll.setLayoutParams(params2);
////}
////public void good_list_LL(int a){
////LinearLayout.LayoutParams params1= (LinearLayout.LayoutParams)goods_list.getLayoutParams();//?????????????????
////params1.height=a;//???????????????? /20*12
////goods_list.setLayoutParams(params1);
////	}
//
//public boolean isConnected;
//public NR nr;
//public class NR extends BroadcastReceiver {
//public void onReceive(Context context, Intent intent) {
//String action = intent.getAction();
////m=new Main();
//if (ConnectivityManager.CONNECTIVITY_ACTION.equals(action)) {
//isConnected= NetUtils.isNetworkConnected(context);
//System.out.println("isConnected  ????????" + isConnected);
//Message handMsg4 = new Message();
//handMsg4.obj = isConnected+"";
//handMsg4.what = 31;
//mHandler.sendMessage(handMsg4);
//System.out.println("wifi????" + NetUtils.isWifiConnect(context));
//System.out.println("???????????" + NetUtils.isMobileConnected(context));
//System.out.println("?????????????" + NetUtils.getConnectedType(context));
//NetUtils.checkWifiState(context);
//
//if (isConnected) {
////net_state.setVisibility(View.GONE);
//net_state.setBackground(context.getResources().getDrawable(R.drawable.net_open));
//if(isLoading){
//   Toast.makeText(Main.this,"????????...",Toast.LENGTH_SHORT).show();
//   }else{
//   getVersionInfoFromServer();
//   }
//
//   sk_handler= new MyHandler();
//   new Thread(new Runnable() {
//   public void run() {
//   try {
//   try {
//	            //120.79.194.139???????IP
//               InetAddress sina=InetAddress.getByName("www.abcd-123.com");
//              // socket = new Socket(sina, 9527);
//   			   socket = new Socket("120.79.194.139", 9527);
//	   			} catch (IOException e) {
//	   				// TODO Auto-generated catch block
//	   			e.printStackTrace();
//	   			}    //47.92.213.54
//	               InputStream inputStream = socket.getInputStream();
//	               byte[] buffer = new byte[1024];
//	               int len;
//	               while ((len = inputStream.read(buffer)) != -1) {
//	              String data = new String(buffer, "GBK");
//	              System.out.println("socket ???????? data:  "+data);
//	              String data1 = new String(buffer, 0, len);
//	             // System.out.println("data1:  "+data1);
//               Message message = Message.obtain();
//               message.what = 1;
//               message.obj = data;
//               sk_handler.sendMessage(message);
//	               }
//
//	           } catch (IOException e) {
//	               e.printStackTrace();
//	           }
//		       }
//		    }).start();
//
//
//
//		    Message handMsg3 = new Message();
//		    handMsg3.obj =isConnected;
//		    handMsg3.what=16;
//		    drep.hd.sendMessage(handMsg3);
//
//
//        	Toast.makeText(context, "get net", Toast.LENGTH_LONG).show();
//            ScalesTask stl= new ScalesTask("http://api.abcd-123.com/api/Scales");
//    		stl.execute(100);
//    		gct=new Good_click_thread();//15????????????
//    		gct.Click_bl();
//        	        } else {
////        	        	    Message handMsg2 = new Message();
////   	        		    handMsg2.obj =isConnected;
////   					    handMsg2.what=17;
////   					    order_handler.sendMessage(handMsg2);
//
//        	        	Message handMsg3 = new Message();
//        	  		    handMsg3.obj =isConnected;
//        	  		    handMsg3.what=17;
//        	  		    drep.hd.sendMessage(handMsg3);
//
//        	            net_state.setBackground(context.getResources().getDrawable(R.drawable.net_close));
//        	        	Toast.makeText(context, "close net", Toast.LENGTH_LONG).show();
//        	           }
//
//						if(NetUtils.isWifiConnect(context)){
//						net_state.setBackground(context.getResources().getDrawable(R.drawable.wifi));
//						//wifi_state.setBackground(context.getResources().getDrawable(R.drawable.wifi));
//						} else {
//	//wifi_state.setBackground(context.getResources().getDrawable(R.drawable.wifi_close));
//	                    }
//        }
//          }
//        	 }
//
//
//
//public String search_shop_num(){
//	  Cursor cs = dbHelper.query();
//	  String 	num = null;
//	  while (cs.moveToNext()){
//	  	int _id = cs.getInt(cs.getColumnIndex("_id"));
//	  	if(_id==2){
//	  		num= cs.getString(cs.getColumnIndex("num"));
//	      Log.i("???????num----",num);
//	      shop_num.setText(num);
//	  	}
//	  	}
//  return num;
//}
//
//MyHandler sk_handler;
//ArrayList<byte[]>  av=new ArrayList<byte[]>();
//public static int plu_index=0;
//static String meber_card;
//
//String g_msg="";
//
//    private class MyHandler extends Handler {
//    public void handleMessage(Message msg) {
//        super.handleMessage(msg);
//        if (msg.what == 1) {
//            String message=  msg.obj.toString();
//            if(ui.Inf(message)){
//                //ui.action(message);
//             //final String ss= "DWL\tINF\t\r\nINF\t???????????\t6???\t6\tADS-30E CC006 V1.25(??????)D\t1\t6\t00350031-34364713-32373838\t\r\nEND\tINF\t\r\n";
//                final String ss ="DWL\tINF\t\r\nINF\t"+dtmt.Search_Data(0)+"\t"+dtmt.Search_Data(1)+"\t"+dt.Search_Data(40)+"\tADS-30?????(?????)\t1\t6\t"+MC+"\t"+search_shop_num()+"\t\r\nEND\tINF\t\r\n";
//                System.out.println("inf?????    "+ss);
//                new Thread(new Runnable() {
//                public void run() {
//                        try {
//                        	 outputStream = socket.getOutputStream();
//                           // SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss");    //??????????
//                            outputStream.write(ss.getBytes("gb2312"));
//                            outputStream.flush();
//                          }catch (IOException e) {
//                           e.printStackTrace();
//                          }
//                       }
//                }).start();
//            }
//
//          if(message.contains("DWL\tREP")){
//          System.out.println("DWL\tREP  --------------------- ");
//          }
//                if(socket_wait_bluetooth){
//                if(DWL_PLU.Inf(message)){
//                    dp.action(message);
//                    av.add(Byte_Tool.goods(Integer.parseInt(dp.s[4]),Integer.parseInt(dp.s[5]),dp.s[6],dp.s[7],Double_Number.Nettodouble(dp.s[8]),dp.s[18]));
//                    connectThread.sendbyte(sbyte.good_massege(av));
//                  	g_msg=message;
//                  	av.clear();
//                 }
//
//
//	    if(DWL_TMS.Inf(message)){
//		dt.action(message);
//		sentmassege(message,"TMS");
//	    }
//
//	    if(DwlCls.Inf(message)){
//		dc.action(message);
//		sentmassege(message,"CLS");
//	    }
//
//
//
//	    if(DWL_TIM.Inf(message)){
//	    	dti.action(message);
//		//sentmassege(message,"TMS");
//	    }
//	    //dti.sent_message(MC);
//		if(DWL_TMT.Inf(message)){
//		dtmt.action(message);
//		connectThread.sendbyte(Byte_Tool.Paper_Text01(dtmt.s[5],Integer.parseInt(dtmt.s[4])));//????????????????????¡¤??????
//		System.out.println("dtmt.s[4]  "+dtmt.s[4]+"      dtmt.s[5]     "+dtmt.s[5]);
//		g_tms=message;
//          }
//
//			if(DWL_SCP.Inf(message)){
//			ds.action(message);
//			sentmassege(message,"SCP");
//			}
//
//        		if(VIP.Inf(message)){
//        	   vip.action(message);
//        	   connectThread.sendbyte(Byte_Tool.Merber(meber_card, vip.s[9], Double_Number.Nettodouble(vip.s[10]),(int)Double_Number.Nettodouble(vip.s[7])));
//
//               tv_m_name.setText(vip.s[9]);
//               tv_m_balance.setText(Double_Number.Nettodouble(vip.s[10])+"?");
//               tv_m_jifen.setText(Double_Number.Nettodouble(vip.s[7])+"????");
//
//               View_Height_Set(merber_ll,(int) (height*0.14));
//
//        	       LinearLayout.LayoutParams params1= (LinearLayout.LayoutParams)goods_list.getLayoutParams();//?????????????????
//        	       params1.height=(int) (height*0.48);//???????????????? /20*12
//        	       goods_list.setLayoutParams(params1);
//
////        		System.out.println("vip.s[9]  "+vip.s[9]);
////        		System.out.println("Double_Number.Nettodouble(vip.s[10])  "+Double_Number.Nettodouble(vip.s[10]));
////        		System.out.println("(int)Double_Number.Nettodouble(vip.s[7]))  "+Double_Number.Nettodouble(vip.s[7]));
//        		}
//
//
//
//        		if(DWL_SAL.Inf(message)){
//        			dsal.action(message);
//        			String ydm=message.substring(8, 16);
//        			System.out.println(" DWL   sal    ydm: "+ydm);
//
//        			//DWL	SAL	20
//        			//END	SAL	20	3qYVvu
//        			  final String ss="DWL\tSAL\t20\t\r\nEND\tSAL\t20\t"+ydm+"\t\r\n";
//        				        //final String ss="DWL\tplu\t{xxx???}\t\r\nEND\tPLU\t{xxx???}\t{B3MNJj}\t\r\n";
//        			        	//System.out.println("???????????????????????"+ss);
//        			        	//DWL\Tplu\ttxxx???\t\r\nEND\tPLU\t{txxx???}\t{ServerTaskID}\t\r\n
//        			        	//final String ss ="DWL\tINF\t\r\nINF\t????????????\txxx???\t6\tADS-30E CC006 V1.25(??????)D\t1\t6\t"+"003B0021-34375109-37333635"+"\t\r\nEND\tINF\t\r\n";
//        			            new Thread(new Runnable() {
//        			            public void run() {
//        			                    try {
//        			                        OutputStream outputStream = socket.getOutputStream();
//        			                        //SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss");//??????????
//        			                        outputStream.write(ss.getBytes("gb2312"));
//        			                        outputStream.flush();
//        			                      } catch (IOException e) {
//        			                        e.printStackTrace();
//        			                      }
//        			                }
//        			            }).start();
//        		    }
//        		if(DWL_ORP.Inf(message)){
//        		dorp.action(message);
//        		  }
//
//
//      if(DWL_REP.Inf(message)){
//	  drep.action(message);
//	  }
//  }
//
//  }
//  }
//  }
//
//
//    String g_tms="";
//    public void sentmassege(String message,String kind){
//	String ydm=message.substring(8, 16);
//	System.out.println(kind+"   ?????:    "+ydm);
//		final String ss="DWL\t"+kind+"\txxx???\t\r\nEND\t"+kind+"\txxx???\t"+ydm+"\t\r\n";
//		System.out.println("ss   "+ss);
//	     //final String ss="DWL\tplu\t{xxx???}\t\r\nEND\tPLU\t{xxx???}\t{B3MNJj}\t\r\n";
//    	//System.out.println("???????????????????????"+ss);
//    	//DWL\Tplu\ttxxx???\t\r\nEND\tPLU\t{txxx???}\t{ServerTaskID}\t\r\n
//    	//final String ss ="DWL\tINF\t\r\nINF\t????????????\txxx???\t6\tADS-30E CC006 V1.25(??????)D\t1\t6\t"+"003B0021-34375109-37333635"+"\t\r\nEND\tINF\t\r\n";
//        new Thread(new Runnable() {
//        public void run() {
//                try {
//                    OutputStream outputStream = socket.getOutputStream();
//                    //SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss");//??????????
//                    outputStream.write(ss.getBytes("gb2312"));
//                    outputStream.flush();
//                  } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }).start();
//    }
//
//
//    public void sentmassege_plu(String message,String kind){
//	String ydm=message.substring(8, 16);
//	System.out.println("   ?????:    "+ydm);
//	final String ss="DWL\t"+kind+"\txxx???\t\r\nEND\t"+kind+"\txxx???\t"+ydm+"\t\r\n";
//        new Thread(new Runnable() {
//        public void run() {
//                try {
//                    OutputStream outputStream = socket.getOutputStream();
//                    //SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss");//??????????
//                    outputStream.write(ss.getBytes("gb2312"));
//                    outputStream.flush();
//                  } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }).start();
//    }
//
//
//    public void sent_TIM(){
//    	final String ss="UPL\tTIM"+"\t\r\n"+"20190313130415\t"+MC+"\t\r\n"+"UPL\tEND"+"\t\r\n";
//        new Thread(new Runnable() {
//        public void run() {
//                try {
//                    OutputStream outputStream = socket.getOutputStream();
//                    //SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss");//??????????
//                    outputStream.write(ss.getBytes("gb2312"));
//                    outputStream.flush();
//                  } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }).start();
//    }
//
//
//
//
//
//
//private PLU_Thread PLU_ht=null;
//public static final int PLU_WHAT=1;
//public static final int PLU_WHAT1=2;
//private PLU_Handle PLU_hh=null;
//public int PLU_num=5;
//class PLU_Thread extends Thread{
//    public void run() {
//        super.run();
//        while (!Thread.interrupted()){
//            while (PLU_num>=0){
//                Message message= PLU_hh.obtainMessage(PLU_WHAT,PLU_num+"");
//                PLU_hh.sendMessage(message);
//
//                try {
//                    Thread.sleep(50);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                PLU_num--;
//                }
//            //?????????????????
//            if(PLU_num<0){
//            	//good_insert=false;
//                Message handMsg1 = new Message();
//				handMsg1.obj = "";
//				handMsg1.what = 4;
//				PLU_hh.sendMessage(handMsg1);
//				PLU_ht.interrupt();//????§Ø?
//				PLU_ht=null;
//				PLU_num=5;
//            }
//        }
//      }
//    }
//
//
//
////String plu_massege="";
//class PLU_Handle extends Handler{
//
//    public void handleMessage(Message msg) {
//        super.handleMessage(msg);
//            switch (msg.what){
//                case PLU_WHAT:
//
//                break;
//                case 4:
//                	///search_BlueTooth();
//                 break;
//                case PLU_WHAT1:
//                 break;
//            }
//      }
//}
//
//String ss[]={"00010506070801","00020506090801","00030106020701"};
//int a=1;
//
//public void onClick(View v) {
//if(v==back){
//Log.i("??","????????");
////weiyima=sbyte.gotWYM(wym_bl,0);
//Reback_order(1,Double_Number.NetString(Double.parseDouble(f_total)),fp1365,fw1365,f_prize1365,ft1365,fn1365,fu1365,0+"",0+"",0+"",
//Double_Number.NetString(Double.parseDouble(f_total)),"0,2",fjf1365,fys1365,frate1365,"0","0",cargo_num,pichi);
////dp.Search_Data();
////byte b1[]={(byte)Integer.parseInt("40")};
////System.out.println("??????????"+Shiliu_Detail.toHexString1(b1)+"  b1 ?????"+b1.length);
////System.out.println("state:"+state);
//yc.Search_Data();
//}
//if(v==erweima){
//	//System.out.println("??????erweima");
//ob.dialogShow2("??????????????????");
//}
//
//
//	if(v==hide_ll){
//	cp.dialogShow2();
//	}
//
//	if(v==blue_tooth){
//		 no_net.setVisibility(View.GONE);
//		//if(!connect_state){
//		blue_area.setVisibility(View.VISIBLE);
//	    licence.setVisibility(View.GONE);
//	    bTAdatper = BluetoothAdapter.getDefaultAdapter();
//        adapter = new BlueToothDeviceAdapter(getApplicationContext(), R.layout.bluetooth_device_list_item);
//        ///initReceiver();
//        bTAdatper.startDiscovery();
//
//        listenerThread = new ListenerThread();
//        listenerThread.start();
//
//        getBoundedDevices();
//        blue_tooth_list.setAdapter(adapter);
//        blue_tooth_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                if (bTAdatper.isDiscovering()) {
//                  //  bTAdatper.cancelDiscovery();
//                }
//                BluetoothDevice device = (BluetoothDevice) adapter.getItem(position);
//                //?????õô
//                connectDevice(device);
//
//            }
//        });
//	}
//	}
//
//
//
//
//
//
//
//
//public static BM_thread bmt=null;
//public static int num2=2;
//public static final int WHAT=1;
//private static bhHandle bhh=null;
//public static class BM_thread extends Thread{
//    @Override
//    public void run() {
//        super.run();
//        while (!Thread.interrupted()){
//            while (num2>=0){
//                Message message= bhh.obtainMessage(WHAT,num2+"");
//                bhh.sendMessage(message);
//               // System.out.println("???num?????: "+num);
//                try {
//                    Thread.sleep(250);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                num2--;
//              }
//            //?????????????????
//            if(num2<0){
//                Message handMsg1 = new Message();
//				handMsg1.obj = "";
//				handMsg1.what = 4;
//				bhh.sendMessage(handMsg1);
//				bmt.interrupt();//????§Ø?
//				bmt=null;
//                num2=2;
//            }
//          }
//        }
//      }
//
///***
// * ???????
// ***/
//class bhHandle extends Handler{
//    @Override
//    public void handleMessage(Message msg) {
//        super.handleMessage(msg);
//            switch (msg.what){
//                    case WHAT:
//                    //tv_time.setText(msg.obj.toString());
//                    break;
//                    case 4:
//                 	System.out.println("handle?????0.5??weiyima   "+weiyima);
//                 	Message handMsg2 = new Message();
//                 	handMsg2.what=11;//????????????
//                 	order_handler.sendMessage(handMsg2);
//                	connectThread.sendbyte(Byte_Tool.print_code(weiyima));
//                    break;
//            }
//      }
//}
//
//
//
//public  static int scnum=10;
//private scThread scbht=null;
//public static final int scWHAT=1;
//public static final int scWHAT1=2;
//private scHandle schh=null;
//class scThread extends Thread{
//    public void run() {
//        super.run();
//        while (!Thread.interrupted()){
//            while (scnum>=0){
//                Message message= schh.obtainMessage(scWHAT,scnum+"");
//                schh.sendMessage(message);
//               System.out.println("?????scnum:   "+scnum);
//                try {
//                Thread.sleep(2000);//2000
//                } catch (InterruptedException e) {
//                e.printStackTrace();
//                }
//                scnum--;
//                }
//            //?????????????????
//            if(scnum<0){
//
//                Message handMsg1 = new Message();
//				handMsg1.obj = "";
//				handMsg1.what = 4;
//				schh.sendMessage(handMsg1);
//				scbht.interrupt();//????§Ø?
//				scbht=null;
//				scnum=10;
//            }
//          }
//        }
//      }
//
//
//class scHandle extends Handler{
//    @Override
//    public void handleMessage(Message msg) {
//        super.handleMessage(msg);
//            switch (msg.what){
//                case scWHAT:
//                    //tv_time.setText(msg.obj.toString());
//                no_scroll();
//                break;
//                case 4:
//                	lview.setVisibility(View.VISIBLE);
//                	frame_ll.setVisibility(View.GONE);
//                    prize_ll .setVisibility(View.VISIBLE);
//                    scro_fl.setVisibility(View.VISIBLE);
//     				goods_list.setVisibility(View.GONE);
//     			    message.setVisibility(View.GONE);
//     			    ewm_ll.setVisibility(View.GONE);
//     		        qcode.setVisibility(View.GONE);
//     		       pay_state.setVisibility(View.GONE);
//     			   merber_ll.setVisibility(View.GONE);
//
//     			    money_ll.setVisibility(View.GONE);
//                    break;
//                case scWHAT1:
//                    //tv_time.setText(msg.obj.toString());
//                no_scroll();
//                break;
//          }
//      }
//  }
//
//
//
//public void no_scroll(){
//	    Log.i("????????", "");
//	    lview.setVisibility(View.GONE);
//	    frame_ll.setVisibility(View.VISIBLE);
//        prize_ll .setVisibility(View.GONE);
//        scro_fl.setVisibility(View.GONE);
//		goods_list.setVisibility(View.VISIBLE);
//		merber_ll.setVisibility(View.VISIBLE);
//	    message.setVisibility(View.VISIBLE);
//	    ewm_ll.setVisibility(View.VISIBLE);
//	    money_ll.setVisibility(View.VISIBLE);
//}
//
//
///*****
//??????????????
//****/
//public void  Start_Scroll(int a){
//	     scnum=a;
//	     if(scbht==null){
//	  	 scbht=new scThread();
//	  	 scbht.start();
//	  	 }
//         }
//
//
//
//public static final int Enter_WHAT=1;
//public static final int Enter_WHAT1=2;
//private Enter_Handle Enter_hh=null;
//public int Enter_num=10;
//public class Enter_Thread extends Thread{
//    public void run() {
//        super.run();
//        while (!Thread.interrupted()){
//            while (Enter_num>=0){
//                Message message= Enter_hh.obtainMessage(Enter_WHAT,Enter_num+"");
//                Enter_hh.sendMessage(message);
//                System.out.println("?????????Enter_hhnum:   "+Enter_num);
//                try {
//                    Thread.sleep(300);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                Enter_num--;
//                }
//            //?????????????????
//            if(Enter_num<0){
//
//                Message handMsg1 = new Message();
//				handMsg1.obj = "";
//				handMsg1.what = 4;
//				Enter_hh.sendMessage(handMsg1);
//				Enter_ht.interrupt();//????§Ø?
//				Enter_ht=null;
//				Enter_num=10;
//            }
//        }
//        }
//    }
//
//
//
//
//class Enter_Handle extends Handler{
//    @Override
//    public void handleMessage(Message msg) {
//        super.handleMessage(msg);
//            switch (msg.what){
//                case Enter_WHAT:
//
//                break;
//                case 4:
//                	search_BlueTooth();
//                    break;
//                case Enter_WHAT1:
//                 break;
//            }
//      }
//}
//
//
//
//
//BlueToothDeviceAdapter adapter;
//BluetoothDevice device;
//private BluetoothAdapter bTAdatper;
//public void  search_BlueTooth(){
//	bTAdatper = BluetoothAdapter.getDefaultAdapter();
//	if(bTAdatper.isEnabled()){//????????????
//	 try{
//			 adapter = new BlueToothDeviceAdapter(getApplicationContext(), R.layout.bluetooth_device_list_item);
//
//			  //initReceiver();
//			  //registerBoradcastReceiver();
//			  	adapter.clear();
//			    if (bTAdatper.isDiscovering()) {
//			    bTAdatper.cancelDiscovery();
//				 }
//
//			   // openBlueTooth();
//			    //?????????????õô
//			    Set<BluetoothDevice> pairedDevices = bTAdatper.getBondedDevices();
//			    //?????????õô?§Ò???
//			    if (pairedDevices.size() > 0) {
//			        for (BluetoothDevice device : pairedDevices) {
//			            adapter.add(device);
//			    }
//			    }
//	      bTAdatper.startDiscovery();
//		  device  = (BluetoothDevice) adapter.getItem(0);
//		  connectDevice(device);
//
////		  listenerThread = new ListenerThread();
//	//   listenerThread.start();
//		}
//		catch(Exception e){
//
//			        ToastUtils.showToast(this, "???????????¨²?");
//	    	        adapter = new BlueToothDeviceAdapter(getApplicationContext(), R.layout.bluetooth_device_list_item);
//	    		    bTAdatper = BluetoothAdapter.getDefaultAdapter();
//	    		    //initReceiver();
//	    		    //registerBoradcastReceiver();
//	    		  	  adapter.clear();
//	    		      if(bTAdatper.isDiscovering()) {
//	    			  bTAdatper.cancelDiscovery();
//	    			    }
//	    		   // openBlueTooth();
//	    		    //?????????????õô
//	    		    Set<BluetoothDevice> pairedDevices = bTAdatper.getBondedDevices();
//	    		    //?????????õô?§Ò???
//	    		    if (pairedDevices.size() > 0) {
//	    		    for (BluetoothDevice device : pairedDevices) {
//	    		    adapter.add(device);
//	    		    }
//	    		    }
//
//	  bTAdatper.startDiscovery();
//	  //if(device!=null){
//	  device  = (BluetoothDevice) adapter.getItem(0);
//	  connectDevice(device);
//		}
//		socket_wait_bluetooth=true;
//	    }
//	else
//		  Toast.makeText(this,"???????????????????????????????????",Toast.LENGTH_SHORT).show();
//	    }
//
//boolean socket_wait_bluetooth=false;//socket ???????????
//
//
//
//
//
//
//public  void judge_unit(int moshi,String aa,boolean show){
//if(moshi==1){
//    prize_unit.setText("???? (?/"+" "+aa+" "+')');
//    if(aa.equals("kg")){
//    unit_text.setText("???? "+'('+" "+aa+" "+')');
//    }
//    else
//   unit_text.setText("???? "+'('+" "+aa+" "+')');
//}
//}
//
//String good_group="";
//boolean dayin=false;
//String weight="0";
//String prize="0.00";
//
//String s="";
//boolean print_bl=false;
//
//public static String pay_style;
//public boolean connect_state=false;
//
//
//public void message_demo(String s,int a){
// 	Message handMsg5 = new Message();
//	handMsg5.obj =s;
//	handMsg5.what = a;
//	mHandler.sendMessage(handMsg5);
//}
//private TextView text_state;
//boolean bt_boolean=true;
//BluetoothSocket socket1;
///**
// * ?????????õô
// */
//private void connectDevice(BluetoothDevice device) {
//if(!connect_state){
////bs.Click_bl();
//  text_state.setText("connecting");
//
//        }
//    try {
//        //????Socket
//    	socket1= device.createRfcommSocketToServiceRecord(BT_UUID);
//        //???????????
//        connectThread = new ConnectThread(socket1, bt_boolean);
//        connectThread.start();
//    } catch (IOException e) {
//        e.printStackTrace();
//    }
//}
//public static  ConnectThread connectThread;
//
///*
//   ???????
// */
//public class ConnectThread extends Thread {
//private boolean activeConnect;
//InputStream inputStream;
//OutputStream outputStream;
//private final int BUFFER_SIZE = 1024;
//String moren ="";
//String[] fr=new String[3];
//int rf_length=-1;
//final int weight_thengh=0;
//public BluetoothSocket bl_socket;
//public static final String base="11a4";
//public static final String accumulate="032ab4";
//public static final String no_merber="032ab5";
//public static final String merber="033ab8";
//
//private ConnectThread(BluetoothSocket socket, boolean connect) {
//this.bl_socket = socket;
//this.activeConnect = connect;
//}
//public void run() {
//try {
////???????????? ????????????
//if(activeConnect) {
//bl_socket.connect();
//}
//    text_state.post(new Runnable() {
//    public void run(){
//    text_state.setText("connect_success");
//    blue_close.setVisibility(View.GONE);
//    connect_state=true;
//    System.out.println("connect_state   : "+connect_state);
//    //bs.Click_bl();
//            }});
//inputStream=bl_socket.getInputStream();
//outputStream=bl_socket.getOutputStream();
//byte[] buffer = new byte[BUFFER_SIZE];
//int bytes;
//final int group_index=10;
//while (bt_boolean) {
////???????
//bytes = inputStream.read(buffer);
//if (bytes > 0) {
//   final byte[] data = new byte[bytes];
//   System.arraycopy(buffer, 0, data, 0, bytes);
//   try{
//  s+=Byte_Tool.toHexString1(data);
//  //System.out.println("sixteentotwo.toHexString1(data) "+sixteentotwo.toHexString1(data));
//  if(s.length()>1690){
//   s="";
//   }
//  if((s.length()>45&s.contains("16ab"))){
//  s="ff";
//  }
//System.out.println("???????s "+s+"?????"+s.length());
//if(s.contains("05c601")){//?????????????  ff05c6013df
//sentmassege(g_tms,"TMT");
//s="";
//}
//if(s.contains("04b348")){
//	s="";
//	System.out.println("????????  "+g_msg);
//	sentmassege_plu(g_msg,"PLU");
// }
// else {
//			    	//???????PLU????????
//			    	//good_insert=false;
//				    //?????????????????????
//		 if(s.length()==34&s.contains(base)&!s.contains(accumulate)&!s.contains("0262b5")&!s.contains("2408")&!s.equals("04b348")&!s.equals("0146b8")){
//		 int aa=s.indexOf(base);
//				    //System.out.println("??????  "+s.substring(aa+12+weight_thengh,aa+18+weight_thengh));
//		       moren=s;
//		        if(Byte_Tool.jiaoyan(moren)){
//		        message_demo(Integer.valueOf(moren.substring(aa+4+weight_thengh, aa+6+weight_thengh),16)+"",8);
//				int unit=Integer.valueOf(moren.substring(aa+6+weight_thengh, aa+8+weight_thengh),16);
//				System.out.println("??????¦Ë"+unit);
//
//				message_demo(Integer.valueOf(moren.substring(aa+6+weight_thengh, aa+8+weight_thengh),16)+"",25);
//
//
//			    weight=moren.substring(aa+12+weight_thengh, aa+18+weight_thengh);
//			    weight=Integer.valueOf(weight, 16)+"";
//				//weight=Integer.parseInt( weight.substring(0, 2), 16)*65536+Integer.valueOf(weight.substring(2, 4), 16)*256+Integer.valueOf(weight.substring(4, 6), 16)+"";
//				weight=Double_Number.data_prize("3", Double.parseDouble(weight)/1000+"");
//				System.out.println("weight  "+weight);
//
//				//???????????handle
//				message_demo(weight,1);
//
//				//???
//				message_demo(moren.substring(aa+8+weight_thengh, aa+10+weight_thengh),28);
//
//
//
//				if(Double.parseDouble(weight)>0){
//					Start_Scroll(10000);
//				}
//				if(Double.parseDouble(weight)==0){
//					Start_Scroll(10);
//				}
//
//
//				prize=moren.substring(aa+18+weight_thengh, aa+24+weight_thengh);
//				prize=Integer.valueOf(prize, 16)+"";
//				Log.i(" ????prize 0    ",prize);
//				prize=Double_Number.data_twozero("2", Double.parseDouble(prize)/100+"");
//				Log.i(" ????prize    ",prize);
//				message_demo(prize,2);
//
//
//
//				total=moren.substring(aa+24+weight_thengh, aa+30+weight_thengh);
//				total=Integer.valueOf(total, 16)+"";
//				Log.i("??? total 0    ",total);
//				total=Double_Number.data_twozero("2", Double.parseDouble(total)/100+"");
//				Log.i("??? total    ",total);
//				message_demo(total,3);
//
//		   }
//				    s="";
//				    moren="";
//		  }
//
//		 if((s.length()>33&s.contains(base))){
//		 s="";
//		 }
//
//if(s.length()==1620&s.contains(accumulate)){//1620
//			//?????????????   0136b4
//if(Byte_Tool.jiaoyan(s)){ //§µ?????
////qcnum=60;
//print_bl=false;
//ds2.clear();stuList.clear();
//int aa=s.indexOf(accumulate);
//good_group=s;
// System.out.println("???????accumulate,????????  "+good_group.substring(aa+6,aa+8));
////if(Integer.parseInt(good_group.substring(group_index+6,group_index+8),16)<41){
////Message message= schh.obtainMessage(scWHAT1,String.valueOf("1000"));
////schh.sendMessage(message);
//good_group=s;
// //int a=good_group.indexOf("012283");
//money=Integer.valueOf(good_group.substring(group_index,group_index+6), 16)+"";
//money=Double.parseDouble(money+"")/100+"";
//Message handMsg5 = new Message();
//handMsg5.obj =money;
//handMsg5.what = 5;
//mHandler.sendMessage(handMsg5);
//int size=0;
//size=Integer.parseInt(good_group.substring(group_index+6,group_index+8),16);
//Log.i("d183:indexOf???????????  ", size+"");
//for(int i=0;i<size;i++){
//ds1=new LinkedList<String>();
//ds1.add(Integer.valueOf(good_group.substring(group_index+8+GOOD_MASSEGE_LENGTH*i,group_index+14+GOOD_MASSEGE_LENGTH*i),16)+"");
//System.out.println(i+"  ??? :    "+good_group.substring(group_index+8+GOOD_MASSEGE_LENGTH*i,group_index+10+GOOD_MASSEGE_LENGTH*i));
//String w=good_group.substring(group_index+20+GOOD_MASSEGE_LENGTH*i,group_index+26+GOOD_MASSEGE_LENGTH*i);
//w=Integer.valueOf(w, 16)+"";
//w=Double_Number.data_twozero("3", Double.parseDouble(w)/1000+"");
//ds1.add(w);
//
//System.out.println(i+"  weight :    "+w);
//prize=good_group.substring(group_index+26+GOOD_MASSEGE_LENGTH*i,group_index+32+GOOD_MASSEGE_LENGTH*i);
//prize=Integer.valueOf(prize, 16)+"";
//System.out.println(i+"  prize:    "+prize);prize=Double_Number.data_twozero("2", Double.parseDouble(prize)/100+"");
//ds1.add(prize);
//
//String t=good_group.substring(group_index+32+GOOD_MASSEGE_LENGTH*i,group_index+38+GOOD_MASSEGE_LENGTH*i);
//t=Integer.valueOf(t, 16)+"";
//System.out.println(i+"  total:    "+t);
//t=Double_Number.data_twozero("2", Double.parseDouble(t)/100+"");
//
//
//String pichi=good_group.substring(group_index+38+GOOD_MASSEGE_LENGTH*i,group_index+46+GOOD_MASSEGE_LENGTH*i);
//pichi=Integer.valueOf(pichi, 16)+"";
//System.out.println(i+"  pichi   "+pichi);
//ds1.add(pichi);
//
//
//String unit=good_group.substring(aa+54+GOOD_MASSEGE_LENGTH*i,aa+56+GOOD_MASSEGE_LENGTH*i);
//unit=Integer.valueOf(unit, 16)+"";
//ds1.add(unit);
//System.out.println(i+"  unit   "+unit);
//			    ds1.add(t);
//			    ds2.add(ds1);
//			   }
//
//			   Message handMsg4 = new Message();
//			   handMsg4.obj = "yes";
//			   handMsg4.what = 4;
//			   mHandler.sendMessage(handMsg4);
////			    }
////			 else
////			System.out.println("???????40?????");
//			   }
//			good_group="";
//			s="";
//
//
//		}
//
//		if(s.contains("24a8")&s.length()==72){
//		if(Byte_Tool.jiaoyan(s)){
//		int a=s.indexOf("24a8");
//		meber_card=s.substring(a+4,a+36);
//		Log.i("???????-----------", meber_card);
//		card_long=Byte_Tool.card2int(meber_card);
//		physics_card=s.substring(a+36,a+68);
//
//
//
//		Log.i("??????-------------", physics_card);
//		physics_card_long=Byte_Tool.card2int(physics_card);
//
//
//
//		Log.i("??????-------------", physics_card);
//		Card_Login(meber_card,physics_card);
//		}
//		s="";
//		    }
//
//
//	       if(s.contains("16ab")&s.length()==44){//?????????????  ff05c6013df
//		   int aa=s.indexOf("16ab");
//		   String pay_net_ment=s.substring(aa+4,aa+40);
//		   System.out.println("?????????  "+pay_net_ment);
//		   for(int i=0;i<18;i++){
//		   pnm+=pay_net_ment.substring(i*2+1, i*2+2);
//		   }
//		   System.out.println("????????? pnm "+pnm);
//		   if(pnm.length()<18){
//			   ToastUtils.showToast(Main.this, "???????????????????");
//		   }
//	       }
//
//
//		    if(s.contains(no_merber)&s.length()==1620){//??????????,??Ùv?????1580?????
//			Log.i(no_merber+" : ", "??????????");//00??????,91??????92????????93????????94???????95???????
//			//zhifu_bl=false;
//		    if(Byte_Tool.jiaoyan(s)){//§µ?????
//		    Start_Scroll(10000);
//		    print_bl=true;
//		   //	clean_goods_list();
//
//			weiyima=sbyte.gotWYM(wym_bl,0);
//			wym_bl=false;
//		    Message handMsg2 = new Message();
//		    handMsg2.what=10;//?????????
//		    order_handler.sendMessage(handMsg2);
//		   	print_back=s;
//		    ds1365.clear();
//		   	if(s.contains("ff")){
//		   	s="";
//		   	}
//		   	int a=print_back.indexOf(no_merber);
//		   	pay_style=print_back.substring(a+6,a+8);
//			Log.i(no_merber+" ----pay_style-----", pay_style);//00??????,91??????92????????93????????94???????95???????
//
//		       if(!pay_style.equals("00")){
//		    	   Message handMsg4 = new Message();
//				   handMsg4.obj = "yes";
//				   handMsg4.what = 20;
//			       mHandler.sendMessage(handMsg4);
//			       }
//
//
//		       f_total=print_back.substring(a+8,a+14);
//		       f_total=Integer.valueOf(f_total, 16)+"";
//		       f_total=Double_Number.data_twozero("2", Double.parseDouble(f_total)/100+"");
//		   	 Log.i("????????--", f_total+"");
//		   	message_demo(f_total,5);
//
//		   	 Log.i("????--", print_back.substring(16,18)+"");
//
//for(int i=0;i<Integer.parseInt(print_back.substring(16,18),16);i++){
//ds1=new LinkedList<String>();
//ds1.add(Integer.valueOf(print_back.substring(18+GOOD_MASSEGE_LENGTH*i,24+GOOD_MASSEGE_LENGTH*i),16)+"");
////ds1.add(d183.substring(a+16+20*i,a+22+20*i));
//String w=print_back.substring(30+GOOD_MASSEGE_LENGTH*i,36+GOOD_MASSEGE_LENGTH*i);
//    w=Integer.valueOf(w, 16)+"";
////w=Integer.parseInt( w.substring(0, 2))*65536+Integer.valueOf(w.substring(2, 4), 16)*256+Integer.valueOf(w.substring(4, 6), 16)+"";
//w=Double_Number.data_twozero("3", Double.parseDouble(w)/1000+"");
//ds1.add(w);
//
//prize=print_back.substring(36+GOOD_MASSEGE_LENGTH*+i,42+GOOD_MASSEGE_LENGTH*i);
//prize=Integer.valueOf(prize, 16)+"";
////prize=Integer.parseInt( prize.substring(0, 2))*65536+Integer.valueOf(prize.substring(2, 4), 16)*256+Integer.valueOf(prize.substring(4, 6), 16)+"";
//prize=Double_Number.data_twozero("2", Double.parseDouble(prize)/100+"");
//ds1.add(prize);
//
//String t=print_back.substring(42+GOOD_MASSEGE_LENGTH*i,48+GOOD_MASSEGE_LENGTH*i);
//t=Integer.valueOf(t, 16)+"";
////t=Integer.parseInt( t.substring(0, 2))*65536+Integer.valueOf(t.substring(2, 4), 16)*256+Integer.valueOf(t.substring(4, 6), 16)+"";
//t=Double_Number.data_twozero("2", Double.parseDouble(t)/100+"");
//ds1.add(t);
//
//
//String pichi=print_back.substring(48+GOOD_MASSEGE_LENGTH*i,56+GOOD_MASSEGE_LENGTH*i);
//ds1.add(pichi);
//String unit=print_back.substring(56+GOOD_MASSEGE_LENGTH*i,58+GOOD_MASSEGE_LENGTH*i);
//unit=Integer.valueOf(unit, 16)+"";
//ds1.add(unit);
//System.out.println(i+"  pichi :"+pichi);
//System.out.println(i+"  unit  :"+unit);
//System.out.println(i+"  weight:  "+w);
//System.out.println(i+"  prize:   "+prize);
//System.out.println(i+"  total:   "+t);
//ds1365.add(ds1);
//		}
//
//
//
// System.out.println(" ds1365.size()  "+ds1365.size());
// for(int i=0;i<ds1365.size();i++){
//    fp1365[i]=ds1365.get(i).get(0);
//	f_prize1365[i]=Double_Number.NetString(Double.parseDouble(ds1365.get(i).get(2)));
//	ft1365[i]=Double_Number.NetString(Double.parseDouble(ds1365.get(i).get(3)));
//	fn1365[i]=dp.Search_Data(Integer.parseInt(ds1365.get(i).get(0)));
//	fjf1365[i]=Double.parseDouble(Double_Number.data_twozero(Double_Number.Nettodouble(dp.Search_jifen
//	(Integer.parseInt(ds1365.get(i).get(0))))*Double.parseDouble(ds1365.get(i).get(3))+""));
//
//fys1365[i]=dp.Search_ys_prize(Integer.parseInt(ds1365.get(i).get(0)));
//frate1365[i]=dp.Search_rate(Integer.parseInt(ds1365.get(i).get(0)));
//System.out.println(" fys1365[i] "+ i+" : "+fys1365[i]);
//System.out.println(" frate1365[i] "+ i+" : "+frate1365[i]);
//
//
//if(ds1365.get(i).get(5).equals("3")){
//fw1365[i]=Double_Number.NetString(Double.parseDouble(ds1365.get(i).get(1)));
//}
//else{
//fw1365[i]=Double_Number.NetString(Double.parseDouble(ds1365.get(i).get(1))*1000);
//}
//fu1365[i]=ds1365.get(i).get(5);
//cargo_num[i]="0";
//pichi[i]="00000000";
//}
//
//
//if(pay_style.equals("91")){
///***
//??00??????,91??????92????????93????????94???????95???????
//0????????????? 1???????????????????2?????????????????????????  ????3?????????????????????????
//4?????§á??????? 5?????????????????6???????????????7?????????????????8???????????????? 99????????????????
//***/
//
//Log.i("???????????  ??? ", "pnm  "+pnm);
//// order(ds2.size(),Double_Number.NetString(Double.parseDouble(total))+"",dp,dw,d_prize,dt,dn,du,6+"",0+"",0+"","0,2","0,2");
//if(pnm.equals("")){
//	ERP_Payment(Socket_Tool.ORP(ds1365.size(),Double_Number.NetString(Double.parseDouble(f_total))+"", fp1365,fw1365,f_prize1365,fn1365,fu1365,6+"",0+"",0+"","0,2","0,2",""
//		,"0","0",Socket_Tool.Get_index(),weiyima,dt.Search_Data(40),MC));
//}
//
//else
//	ERP_Payment(Socket_Tool.ORP(ds1365.size(),Double_Number.NetString(Double.parseDouble(f_total))+"", fp1365,fw1365,f_prize1365,fn1365,fu1365,2+"",0+"",0+"","0,2","0,2",pnm
//			,"0","0",Socket_Tool.Get_index(),weiyima,dt.Search_Data(40),MC));
//wym_bl=true; pnm="";
//}
//
//
//if(pay_style.equals("92")){
//Log.i("?????????????  ??? ", "pnm  "+pnm);
//if(pnm.equals("")){
//	ERP_Payment(Socket_Tool.ORP(ds1365.size(),Double_Number.NetString(Double.parseDouble(f_total)),fp1365,fw1365,f_prize1365,fn1365,fu1365,7+"",0+"",0+"","0,2","0,2",""
//			,"0","0",Socket_Tool.Get_index(),weiyima,dt.Search_Data(40),MC));
//}
//else
//	ERP_Payment(Socket_Tool.ORP(ds1365.size(),Double_Number.NetString(Double.parseDouble(f_total)),fp1365,fw1365,f_prize1365,fn1365,fu1365,3+"",0+"",0+"","0,2","0,2",pnm
//	        ,"0","0",Socket_Tool.Get_index(),weiyima,dt.Search_Data(40),MC));
//wym_bl=true; pnm="";
//}
// if(pay_style.equals("00")){
//     //if(bmt==null){
//	   //weiyima=sbyte.gotWYM();
// 	bmt=new BM_thread();//???????????0.5??
// 	bmt.start();
//	    Message handMsg19 = new Message();
//	    handMsg19.obj ="feihuanyuan";
//	    handMsg19.what = 19;
//	   	mHandler.sendMessage(handMsg19);
//
//	   	String d="DWL\tPLU\tAFFFVj\t\n" +
//                "    PLU\t1\t2019\t0\t3\t1523,2\t0,0\t0,0\t0\t0\t0\t0\t0\t0\t1\tÆ»¹û1\t\t\t\t\t\t\t\t0\t0\t0\t0\t0\t0\t0\t0\t0\t0\t0\t0\t0,0\t0,0\t0\t0\t0,0\t0,0\t0,0\t0\t0\t0,0\t0,0\t0,0\t0\t0\t0,0\t0,0\t0,0\t0\t0\t0,0\t0,0\t0,0\t0\t0\t0\t0,0\t0\t0\t1,0\t10,0\t\n" +
//                "    END\tPLU\tAFFFVj\t\n" +
//                "    ea\t";
//
//
//	   	String ss="DWL\tTMS\tbI3ARv\t\n" +
//                "    TMS\t2\t22\t\n" +
//                "    END\tTMS";
//
//	ERP_Payment(Socket_Tool.ERP(ds1365.size(),Double_Number.NetString(Double.parseDouble(f_total)),fp1365,fw1365,f_prize1365,
//    ft1365,fn1365,fu1365,0+"",0+"",0+"",Double_Number.NetString(Double.parseDouble(f_total)),
//    "0,2",fjf1365,fys1365,frate1365,"0","0",cargo_num,pichi,Socket_Tool.Get_index(),weiyima,dt.Search_Data(40),MC));
//         //	  yc.Search_Data();
//         //	  yc.isData(db,yc.geshu, ds1365.size()+"",Double_Number.NetString(Double.parseDouble(f_total)),fp1365,fw1365,f_prize1365,
////			    ft1365,fn1365,fu1365,0+"",0+"",0+"",Double_Number.NetString(Double.parseDouble(f_total)),
////			    "0,2",fjf1365,fys1365,frate1365,"0","0",cargo_num,pichi);
//
////		order(ds1365.size(),Double_Number.NetString(Double.parseDouble(f_total)),fp1365,fw1365,f_prize1365,ft1365,fn1365,fu1365,2+"",
////				0+"",0+"", "0,2","0,2",fjf1365,fys1365,frate1365);
////    System.out.println("??????????");
//    }
//
// }
//					   Message handMsg4 = new Message();//???????????????????
//					   handMsg4.obj = "feihuiyuan";
//					   handMsg4.what = 29;
//				       mHandler.sendMessage(handMsg4);
//				       print_back=""; s="";
//
//				    }
//
//
////				   if(s.contains("04a0")){
////					   Log.i("???????-------------",s);
////					   }
////					   if(s.contains("04c239")){//FF0488 xx ???????
////					   if(Shiliu_Detail.jiaoyan(s)){ //§µ?????
////					   Log.i("??????????!!!!!!!!!!!!------------   ",s);
////					   //connectThread.sendbyte(new byte[]{(byte)0xFF,(byte)0x54,(byte)0x89,(byte)0x00,(byte)0x01,(byte)0x18,(byte)0x45,(byte)0x26,(byte)0x14,(byte)0x00,(byte)0x11,(byte)0x22,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x7F});
////					   Message handMsg1 = new Message();
////					   handMsg1.obj = weight;
////					   handMsg1.what = CHOUJIAN;
////					   mHandler.sendMessage(handMsg1);}
////					   //Start_Scroll();
////					   s="";
////					   }
////				   if(s.contains("04c239")){//FF0488 xx ???????
////				   Log.i("??????????!!!!!!!!!!!!------------   ",s);
////				   //connectThread.sendbyte(new byte[]{(byte)0xFF,(byte)0x54,(byte)0x89,(byte)0x00,(byte)0x01,(byte)0x18,(byte)0x45,(byte)0x26,(byte)0x14,(byte)0x00,(byte)0x11,(byte)0x22,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x7F});
////				   Message handMsg1 = new Message();
////				   handMsg1.obj = weight;
////				   handMsg1.what = CHOUJIAN;
////				   mHandler.sendMessage(handMsg1);
////				   //Start_Scroll();
////				   }
//
//
//	 if(s.contains("04ba41")){//??????	   01-23 08:55:34.829: I/System.out(28313): ???????s ff04ba41
//    if(Byte_Tool.jiaoyan(s)){ //§µ?????
//    Message handMsg2 = new Message();
//    handMsg2.what=15;
//    order_handler.sendMessage(handMsg2);
//    //stop=s;
//    Log.i("????? ----------", "stop"); }
//    s="";
//	 }
//
//
//		if(s.contains(merber)&s.length()>1600){//0272b8   ?????????626
//		meber_s=s;print_bl=true;
//		if(Integer.parseInt(meber_s.substring(16,18),16)<41){
//			System.out.println("0146b8:--?????????---" + meber_s);
//			Start_Scroll(10000);
//			weiyima=sbyte.gotWYM(wym_bl,0);
//			wym_bl=false;
//			Message handMsg2 = new Message();
//			handMsg2.what=10;//?????????
//			order_handler.sendMessage(handMsg2);
//			meber_s=s;
//			if(s.contains("ff")){
//			s="";
//			}
//
//			int a=meber_s.indexOf(merber);
//			pay_style=meber_s.substring(a+6,a+8);
//			Log.i("0146b8???????-------", pay_style);
//			card_total=meber_s.substring(a+8,a+14);
//			card_total=Integer.valueOf(card_total, 16)+"";
//			//card_total=Integer.parseInt( card_total.substring(0, 2))*65536+Integer.valueOf(card_total.substring(2, 4), 16)*256+Integer.valueOf(card_total.substring(4, 6), 16)+"";
//			card_total=Double_Number.data_twozero("2", Double.parseDouble(card_total)/100+"");
//			Log.i("0146b8???????card_total-------", card_total);
//			Message handMsg5 = new Message();
//			handMsg5.obj =card_total;
//			handMsg5.what = 5;
//			mHandler.sendMessage(handMsg5);
//			ds2.clear();
//
//			    Log.i("0146b8??????????-----", meber_s.substring(16,18));
//				for(int i=0;i<Integer.parseInt(meber_s.substring(16,18),16);i++){
//				ds1=new LinkedList<String>();
//
//				System.out.println("0146b8:--?????????---???-" + Integer.valueOf(meber_s.substring(18+GOOD_MASSEGE_LENGTH*i,24+GOOD_MASSEGE_LENGTH*i),16));
//
//				ds1.add(Integer.valueOf(meber_s.substring(18+GOOD_MASSEGE_LENGTH*i,24+GOOD_MASSEGE_LENGTH*i),16)+"");
//				String w=meber_s.substring(30+GOOD_MASSEGE_LENGTH*i,36+GOOD_MASSEGE_LENGTH*i);
//				w=Integer.valueOf(w, 16)+"";
//
//				w=Double_Number.data_twozero("3", Double.parseDouble(w)/1000+"");
//				System.out.println("0146b8:--?????????---w-" + w);
//				ds1.add(w);
//				prize=meber_s.substring(36+GOOD_MASSEGE_LENGTH*i,42+GOOD_MASSEGE_LENGTH*i);
//				prize=Integer.valueOf(prize, 16)+"";
//				prize=Double_Number.data_twozero("2", Double.parseDouble(prize)/100+"");
//				System.out.println("0146b8:--?????????---prize-" + prize);
//				ds1.add(prize);
//
//
//				String t=meber_s.substring(42+GOOD_MASSEGE_LENGTH*i,48+GOOD_MASSEGE_LENGTH*i);
//				t=Integer.valueOf(t, 16)+"";
//
//				t=Double_Number.data_twozero("2", Double.parseDouble(t)/100+"");
//				System.out.println("0146b8:--?????????---t-" + t);
//				ds1.add(t);
//
//
//				String pichi=meber_s.substring(48+GOOD_MASSEGE_LENGTH*i,56+GOOD_MASSEGE_LENGTH*i);
//				ds1.add(pichi);
//
//				String unit=meber_s.substring(56+GOOD_MASSEGE_LENGTH*i,58+GOOD_MASSEGE_LENGTH*i);
//				unit=Integer.valueOf(unit, 16)+"";
//				ds1.add(unit);
//				System.out.println("unit:"+unit);
//				System.out.println("--?????????--unit-" + unit);
//				ds2.add(ds1);
//				}
//
//				  for(int i=0;i<ds2.size();i++){
//				  d_dp[i]=ds2.get(i).get(0);
//				  d_prize[i]=Double_Number.NetString(Double.parseDouble(ds2.get(i).get(2)));
//				  d_dt[i]=Double_Number.NetString(Double.parseDouble(ds2.get(i).get(3)));
//				  d_dn[i]=dp.Search_Data(Integer.parseInt(ds2.get(i).get(0)));
//				  d_djf[i]=Double.parseDouble(Double_Number.data_twozero(Double_Number.Nettodouble(dp.Search_jifen
//							(Integer.parseInt(ds2.get(i).get(0),16)))*Double.parseDouble(ds2.get(i).get(3))+""));
//
//				  d_ys1365[i]=dp.Search_ys_prize(Integer.parseInt(ds2.get(i).get(0),16));
//				  d_rate1365[i]=dp.Search_rate(Integer.parseInt(ds2.get(i).get(0),16));
//
//				  System.out.println(" d_ys1365[i] "+ i+" : "+d_ys1365[i]);
//				  System.out.println(" d_rate1365[i] "+ i+" : "+d_rate1365[i]);
//
//				if(ds2.get(i).get(5).equals("3")){
//					d_dw[i]=Double_Number.NetString(Double.parseDouble(ds2.get(i).get(1)));
//				}
//				else{
//					d_dw[i]=Double_Number.NetString(Double.parseDouble(ds2.get(i).get(1))*1000);
//				    }
//				    d_du[i]=ds2.get(i).get(5);
//				    cargo_num[i]="0";
//				    pichi[i]="00000000";
//				    }
//			ERP_Payment(Socket_Tool.ORP(ds2.size(),Double_Number.NetString(Double.parseDouble(card_total)),d_dp,d_dw,d_prize,d_dn,d_du, 1+"",card_long[0]+"",card_long[1]+"","0,2",
//		  Double_Number.NetString(Double.parseDouble(card_total)),"0",physics_card_long[0]+"",physics_card_long[1]+"",Socket_Tool.Get_index(),weiyima,dt.Search_Data(40),MC));
//
////dingdan(ds2.size(),Double_Number.NetString(Double.parseDouble(card_total)),d_dp,d_dw,d_prize,d_dn,d_du, 1+"",card_long[0]+"",
////		  card_long[1]+"","0,2",Double_Number.NetString(Double.parseDouble(card_total)),"0");
//
//		}
//			    meber_s="";
//			    s="";
//			  // clean_goods_list();
//		}}
//         } catch (NumberFormatException e) {
//         e.printStackTrace();
//        System.out.println(" NumberFormatException  "+"");
//    	}
//        }
//    }
//    } catch (IOException e) {
//        e.printStackTrace();
// 	   Message handMsg4 = new Message();
//	   handMsg4.what = 32;
//	   mHandler.sendMessage(handMsg4);
//        try{
//        adapter = new BlueToothDeviceAdapter(getApplicationContext(), R.layout.bluetooth_device_list_item);
//	    bTAdatper = BluetoothAdapter.getDefaultAdapter();
//	   // initReceiver();
//	   // registerBoradcastReceiver();
//	  	adapter.clear();
//
//		   if(bTAdatper.isDiscovering()) {
//		   bTAdatper.cancelDiscovery();
//		   }
//	   // openBlueTooth();
//	    //?????????????õô
//	    Set<BluetoothDevice> pairedDevices = bTAdatper.getBondedDevices();
//	    //?????????õô?§Ò???
//	    if (pairedDevices.size() > 0) {
//	        for (BluetoothDevice device : pairedDevices) {
//	            adapter.add(device);
//	    }
//	    }
//
//	      bTAdatper.startDiscovery();
//	  	  device  = (BluetoothDevice) adapter.getItem(0);
//    	  connectDevice(device);
//
//}
//catch(Exception ee){
//	ToastUtils.showToast(Main.this, "???????????¨²?");
//
//	open_blue_thread();
//}
//
//       }
//       }
//String pnm="";
//        /*
//         *  ????????
//         */
//
//String print_back="";
//String meber_s="";
//
//public void sendbyte( byte[] bytes) {
//            if (outputStream != null) {
//                try {
//                    //????????
//                outputStream.write(bytes);
//               //text_msg.setText("§³????????"+msg);
//                } catch (IOException e) {
//                    e.printStackTrace();
//               //text_msg.setText("send_msg_error "+msg);
//                }
//            }
//        }
//    }
//
//public static boolean wym_bl=true;
//    /**
//     * ???????
//     */
//    private class ListenerThread extends Thread {
//        private BluetoothServerSocket serverSocket;
//        private BluetoothSocket socket;
//
//        @Override
//        public void run() {
//            try {
//                serverSocket = bTAdatper.listenUsingRfcommWithServiceRecord( NAME, BT_UUID);
//                while (true) {
//                    //????????????????õô????
//                    socket = serverSocket.accept();
//                    connectThread = new ConnectThread(socket, false);
//                    connectThread.start();
//            }
//            } catch (IOException e) {
//                e.printStackTrace();
//
//            	try{
//          adapter = new BlueToothDeviceAdapter(getApplicationContext(), R.layout.bluetooth_device_list_item);
//          bTAdatper = BluetoothAdapter.getDefaultAdapter();
//          adapter.clear();
//          openBlueTooth();
//            		    //?????????????õô
//            		    Set<BluetoothDevice> pairedDevices = bTAdatper.getBondedDevices();
//            		    //?????????õô?§Ò???
//            		    if (pairedDevices.size() > 0) {
//            		        for (BluetoothDevice device : pairedDevices) {
//            		            adapter.add(device);
//            		    }
//            		    }
//
//            		   bTAdatper.startDiscovery();
//
//            	  device  = (BluetoothDevice) adapter.getItem(0);
//            	  connectDevice(device);
//            	  // }
//
//            	}
//            	catch(Exception ee){
//            		ToastUtils.showToast(Main.this, "????????¨²?");
//            	}
//            }
//        }
//    }
//
//
//    public static  LinkedList<LinkedList<String>>  ds1365=new LinkedList<LinkedList<String>>();
//    public static  String d_dp[];
//    public static  String d_dw[];
//    public static  String d_prize[];
//    public static  String d_dt[];
//    public static  String d_dn[];
//    public static  String d_du[];
//    public static  double d_djf[];
//    public static  String d_ys1365[];
//    public static  String d_rate1365[];
//    public static  String total="0.00";
//    public static  String card_total="0.00";
//    public static  String fp1365[];
//    public static   String fw1365[];
//    public static   String f_prize1365[];
//    public static   String ft1365[];
//    public static   String fn1365[];
//    public static   String fu1365[];
//    public static   double fjf1365[];
//    public static   String fys1365[];
//    public static   String frate1365[];
//    public static   String cargo_num[];
//    public static   String pichi[];
//    public static   String f_total="0.01";
//	int p_num=1;
//
//    public static void ERP_Payment(String payment){
//	System.out.println("???socket????REP   "+payment);
//	//System.out.println("state:"+state);
//    //if(state.equals("true")){
//	  try {
//       outputStream = socket.getOutputStream();
//
//       outputStream.write(payment.getBytes("gb2312"));//payment.getBytes("gb2312")
//       outputStream.flush();
//      }catch (IOException e) {
//      e.printStackTrace();
//      }
//	 // }
//	  }
//
////	 public static String Get_index(){
////		    String num ="0";
////	        //????query()???Cursor
////	  	    Cursor cs = dbHelper.query();
////	  	    while (cs.moveToNext()){
////	  		int _id = cs.getInt(cs.getColumnIndex("_id"));
////	  		if(_id==1){
////	  		num= cs.getString(cs.getColumnIndex("num"));
////	  	    Log.i("num-------",num);
////	  	}
////	  	}
////return num;
////	 }
//
//
// public static String weiyima="010203040506070809101112";
// /*****??????????¡¤???ERP****/
//public  void order1(int size,String  d_total,String plu[],String weight[],String d_prize[],String e_total[],String name[],
//String unit[],String pay,String card_num,String pwd,String cash,String card_money, String[] jifen,String[] ysprize,
//String[]rate,String buy_physics_01,String buy_physics_02,String cargo_num[],String pichi[]){
//
//String num ="0";
////????query()???Cursor
//Cursor cs = dbHelper.query();
//while (cs.moveToNext()){
//int _id = cs.getInt(cs.getColumnIndex("_id"));
//if(_id==1){
//num= cs.getString(cs.getColumnIndex("num"));
//Log.i("num-------",num);
//}
//}
//	  final Calendar c = Calendar.getInstance();
//	  c.setTimeZone(TimeZone.getTimeZone("GMT+8:00"));
//	  String mYear = String.valueOf(c.get(Calendar.YEAR)); // ?????????
//	  String mMonth = String.valueOf(c.get(Calendar.MONTH) + 1);// ???????¡¤?
//	  String mDay = String.valueOf(c.get(Calendar.DAY_OF_MONTH));// ???????¡¤?????????
//	  String mHour = String.valueOf(c.get(Calendar.HOUR_OF_DAY));//?
//	  String mMinute = String.valueOf(c.get(Calendar.MINUTE));//??
//	  String mSecond = String.valueOf(c.get(Calendar.SECOND));//??
//	  String s=new SimpleDateFormat("yyyyMMddHHmmss").format(c.getTime());
//	 String ops="";
//	 System.out.println("???????"+size+"???");
//	 for(int i=0;i<size;i++){
//	 ops+="RES\t"+weiyima+"\t"+num+"\t"+e_total[i]+"\t"+plu[i]+"\t"+"3"+"\t"+"4"+"\t"+"0,2"+"\t"+weight[i]+"\t"+unit[i]+"\t"+"0"+"\t"
//	 +Double_Number.NetString(Double.parseDouble(rate[i]))+"\t"+"0,0"+"\t"+d_prize[i]+"\t"+name[i]+"\t"
//	 +Double_Number.NetString(Double.parseDouble(jifen[i]))+"\t"+cargo_num[i]+"\t"+pichi[i]+"\t\r\n";// +cargo_num[i]+"\t"+pichi[i]+"\t\r\n";
//	  }
////	 for(int i=0;i<size;i++){
////	 ops+="RES\t"+weiyima+"\t"+num+"\t"+e_total[i]+"\t"+plu[i]+"\t"+"3"+"\t"+"4"+"\t"+"0,2"+"\t"+weight[i]+"\t"+unit[i]+"\t"+"0"+"\t"
////	 +Double_Number.NetString(Double.parseDouble(rate[i]))+"\t"+"0,0"+"\t"+d_prize[i]+"\t"+name[i]+"\t"
////	 +Double_Number.NetString(                    jifen[i])+"\t"+cargo_num[i]+"\t"+pichi[i]+"\t\r\n";// +cargo_num[i]+"\t"+pichi[i]+"\t\r\n";
////	  }
//
//  final String payment=
// "DWL\tREP\t"+s+"\t"+dt.Search_Data(40)+"\t"+MC+"\t\r\n"
//   +"REP\t"+weiyima+"\t" +mYear.substring(2, mYear.length())+"\t"+mMonth+"\t"+mDay+"\t"+mHour+"\t"+mMinute+"\t"+mSecond+"\t"+num+"\t"
//   +num+"\t"+"0"+"\t"+card_num+"\t"+pwd+"\t"+d_total+"\t"+cash+"\t"+card_money+"\t"+"0"+"\t"+"0"+"\t"+"0"+"\t"+"0,2"+"\t"+"0,2"+"\t"
//   +pay+"\t"+"0"+"\t"+""+"\t"+""+"\t"+"0,0"+"\t"+"0,0"+"\t"+""+"\t"+"2"+"\t"+buy_physics_01+"\t"+buy_physics_02+"\t"//physics_card_long[0]
//		 +"0"+"\t"+"0"+"\t\r\n" //"\t"+physics_card_long[0]+"\t"+physics_card_long[1]+"\t"+"0"+"\t"+"0"+
//   + ops
//   + "REE\t"+weiyima+"\t\r\n"
//   + "END\tREP\t"+s+"\t"+dt.Search_Data(40)+"\t"+weiyima+"\t"+MC+"\t\r\n";
//
//	 // yc.Search_Data();
//	 // yc.isData(db,yc.geshu, size+"", d_total, plu, weight, d_prize, e_total, name, unit, pay, card_num, pwd, cash, card_money,jifen, ysprize,rate);
//  System.out.println("state:"+state);
//if(state.equals("true")){
//	  try {
//       outputStream = socket.getOutputStream();
//       System.out.println("???socket????REP   "+payment);
//       outputStream.write(payment.getBytes("gb2312"));//payment.getBytes("gb2312")
//       outputStream.flush();
//      }catch (IOException e) {
//      e.printStackTrace();
//      }
//	  }
//	  }
//
//public static Socket socket;
//public static OutputStream outputStream ;
//
//
//
//
//Socket_Tool st;
//public static int height;
//final static double GOOD_LIST_HEIGHT=0.6;
//public  static ListView goods_list;
//public static TextView pay_state;
//public static long[] card_long=new long[2];
//static long[] physics_card_long=new long[2];
//public  Handler order_handler= new Handler()
//	{
//	public void handleMessage(Message msg) {
//		switch (msg.what) {
//		 case 1:
//				/**
//			 ??00??????,91??????92????????93????????94???????95???????
//			  0????????????? 1???????????????????2?????????????????????????  ????3?????????????????????????
//			  4?????§á??????? 5?????????????????6???????????????7?????????????????8???????????????? 99????????????????
//			**/
//		    System.out.println("order_handler   ????"+pay_style);
//		    if(pay_style.equals("93")){
//			System.out.println("???????"+card_total);
//			bmt=new BM_thread();//???????????0.5??
//			bmt.start();
//
////			order(ds2.size(),Double_Number.NetString(Double.parseDouble(card_total)),d_dp,d_dw,d_prize,d_dt,d_dn,d_du,1+"",
////					card_long[0]+"",card_long[1]+"","0,2",Double_Number.NetString(Double.parseDouble(card_total)),d_djf,d_ys1365,d_rate1365
////					,physics_card_long[0]+"",physics_card_long[0]+"",cargo_num,pichi);
//
//			ERP_Payment(Socket_Tool.ERP(ds2.size(),Double_Number.NetString(Double.parseDouble(card_total)),d_dp,d_dw,d_prize,d_dt,d_dn,d_du,1+"",
//			card_long[0]+"",card_long[1]+"","0,2",Double_Number.NetString(Double.parseDouble(card_total)),d_djf,d_ys1365,d_rate1365
//			,physics_card_long[0]+"",physics_card_long[0]+"",cargo_num,pichi,Socket_Tool.Get_index(),weiyima,dt.Search_Data(40),MC));
//		    card_long[0]=0;card_long[1]=0;physics_card_long[1]=0;physics_card_long[0]=0;
//	    }
//
//if(pay_style.equals("91")){
//System.out.println("??????ERP???"+f_total);
//bmt=new BM_thread();//???????????0.5??
//bmt.start();
//ERP_Payment(Socket_Tool.ERP(ds1365.size(),Double_Number.NetString(Double.parseDouble(f_total)),fp1365,fw1365,f_prize1365,
//	    ft1365,fn1365,fu1365,2+"",0+"",0+"",Double_Number.NetString(Double.parseDouble(f_total)),
//	    "0,2",fjf1365,fys1365,frate1365,"0","0",cargo_num,pichi,"8",weiyima,dt.Search_Data(40),MC));
//
//
////	order(ds1365.size(),Double_Number.NetString(Double.parseDouble(f_total)),fp1365,fw1365,f_prize1365,ft1365,fn1365,fu1365,3+"",
////   0+"",0+"","0,2","0,2",fjf1365,fys1365,frate1365,0+"",0+"",cargo_num,pichi);
//card_long[0]=0;card_long[1]=0;physics_card_long[0]=0;physics_card_long[0]=0;
//System.out.println("???????????????????????");//??????
//View_Height_Set(goods_list,(int) (height*GOOD_LIST_HEIGHT));
//pay_state.setVisibility(View.GONE);
//qcode.setVisibility(View.GONE);
// }
//
//   if(pay_style.equals("92")){
//   System.out.println("?????????ERP???"+f_total);
//     bmt=new BM_thread();//???????????0.5??
//	bmt.start();
//
//	ERP_Payment(Socket_Tool.ERP(ds1365.size(),Double_Number.NetString(Double.parseDouble(f_total)),fp1365,fw1365,f_prize1365,
//		    ft1365,fn1365,fu1365,3+"",0+"",0+"",Double_Number.NetString(Double.parseDouble(f_total)),
//		    "0,2",fjf1365,fys1365,frate1365,"0","0",cargo_num,pichi,"8",weiyima,dt.Search_Data(40),MC));
//
////   	order(ds1365.size(),Double_Number.NetString(Double.parseDouble(f_total)),fp1365,fw1365,f_prize1365,ft1365,fn1365,fu1365,3+"",
////	    	0+"",0+"","0,2","0,2",fjf1365,fys1365,frate1365,0+"",0+"",cargo_num,pichi);
//   card_long[0]=0;card_long[1]=0;physics_card_long[0]=0;physics_card_long[0]=0;
//   System.out.println("???????????????????????");//??????
//   View_Height_Set(goods_list,(int) (height*GOOD_LIST_HEIGHT));
//   pay_state.setVisibility(View.GONE);
//   qcode.setVisibility(View.GONE);
// }
//
//
//	       break;
//		   case 10:
//			 	merber_ll.setVisibility(View.GONE);//?????????
//	               View_Height_Set(merber_ll,0);
//	               View_Height_Set(goods_list,(int) (height*GOOD_LIST_HEIGHT));
//			break;
//		   case 11:
//
//			      Bitmap bitmap = ZXingUtils.createQRImage(dtmt.Search_Data(24)+weiyima,300,300);
//	         	  iv_discuss.setImageBitmap(bitmap);
//			break;
//		   case 12:
//			   connectThread.sendbyte(Byte_Tool.cancel(meber_card, "02"));
//			break;
//		   case 13:
//				System.out.println("order handle ?????   "+msg.obj.toString());
//			    vs=msg.obj.toString();
//
//			break;
//		   case 14:
//
//			   System.out.println("msg.toString() :  "+msg.toString());
//			   ContentValues values4 = new ContentValues();
//		 	   values4.put("num",msg.toString());
//		 	   String where = "_id" + " = ?";
//		 	   String[] whereValue = {"2"};
//		 	  // long row=  db.update(TABLENAME, values, where, whereValue);//?????????????????
//		 	 odHelper.update(values4, where, whereValue);
//		 	 Order_seach os=new Order_seach(Main.this);
//		 	 os.search_shop_num(Main.this, 2);
//
//			break;
//		   case 15:
//			   System.out.println("???????????????????????");//??????
//			   ewm_ll.setVisibility(View.GONE);
//			   //pay_state.setText("????????");
//			   pay_state.setVisibility(View.GONE);
//			   qcode.setVisibility(View.GONE);
//			   LinearLayout.LayoutParams params3= (LinearLayout.LayoutParams)goods_list.getLayoutParams();//?????????????????
//		       params3.height=(int) (height*GOOD_LIST_HEIGHT);//????????????????
//		       goods_list.setLayoutParams(params3);
//			   list_total.setText("");
//			   stuList.clear();
//			   la =new ListAdapter(stuList,Main.this);
//			   goods_list.setAdapter(la);
//	           View_Height_Set(merber_ll,0);
//			   break;
//		}
//		}
//	    };
//
//
//    public  Handler mHandler= new Handler() {
//    	public void handleMessage(Message msg) {
//    		switch (msg.what) {
//    		case 0:
//    		break;
//    		case 1:
//    	          zhongliang.setText(msg.obj.toString());
//    			break;
//    		case 2:
//    			try{
//    			prize_tv.setText(msg.obj.toString());
//    			}
//    			catch(NumberFormatException  e){
//    			}
//
//    		break;
//    		case 3:
//    		total_tv.setText(Double_Number.data_twozero("2", msg.obj.toString()));
//			break;
//
//		case 4:
//		Goods stu = null;
//		stuList.add(null);
//		stuList.clear();
//		//if(!msg.obj.toString().endsWith("nothing")){
//			//if(ds2.size()<41){
//			    for(int i=0;i<ds2.size();i++){
//					for(int i1=0;i1<ds2.get(i).size();i1++){
//					Log.i("????handle?????????  "+i+":"+i1+":", ds2.get(i).get(i1));
//			        stu=new Goods();
//			        stu.setNum(i+1+".");
//			        stu.setName(dp.Search_Data(Integer.parseInt(ds2.get(i).get(0))));
//						if(ds2.get(i).get(4).equals("3")){
//						stu.setWeight(ds2.get(i).get(1)+" ");
//						}
//					else
//					  stu.setWeight(Double.parseDouble(ds2.get(i).get(1))*1000+" ");
//
//			        stu.setPrize(ds2.get(i).get(2));//+"?"
//			        stu.setTotal(ds2.get(i).get(5));
//					}
//					stuList.add(stu);
//					}
//			      //  }
//
//			//else
//			//	ToastUtils.showToast(Main.this, "???????40?????");
//		     //}
//				if(stuList.size()<11){
//			    merber_ll.setVisibility(View.VISIBLE);
//			    }
//				else   {
//			               View_Height_Set(merber_ll,0);
//			               View_Height_Set(goods_list,(int) (height*GOOD_LIST_HEIGHT));
//				}
//
//
//		if(stuList.size()<15){
//			goods_list.setStackFromBottom(false);
//			goods_list.setTranscriptMode(AbsListView.TRANSCRIPT_MODE_NORMAL);
//		}
//		else{
//			goods_list.setStackFromBottom(true);
//			goods_list.setTranscriptMode(AbsListView.TRANSCRIPT_MODE_ALWAYS_SCROLL);	//TRANSCRIPT_MODE_ALWAYS_SCROLL
//		}
//		   // stuList.clear();
//		   la =new ListAdapter(stuList,Main.this);
//		   goods_list.setAdapter(la);
//
//	    break;
//		case 5:
// 	     list_total.setText("???? "+Double_Number.data_twozero("2",msg.obj.toString())+"?");
//		break;
// 	         case 8:
//		     //Log.i("d180 handler  ", Search_Data(Integer.parseInt(msg.obj.toString())));
// 	   	     try{
//		        goods.setText(dp.Search_Data(Integer.parseInt(msg.obj.toString())));
//    		    } catch (NumberFormatException e) {
//			   e.printStackTrace();
//				}
//
//		break;
//		case 7:
//			stuList.clear();
//	    	la.notifyDataSetChanged();
//	    	list_total.setText("???? "+"0.00"+"?");
//		break;
//
//		case CHOUJIAN:
//			System.out.println("handle ???");
////connectThread.sendbyte(new byte[]{(byte)0xFF,(byte)0x5E,(byte)0x89,(byte)0x00,(byte)0x02,(byte)0x18,(byte)0x09,(byte)0x01,(byte)0x77,(byte)0x00,(byte)0x00,(byte)0x32,(byte)0x00,(byte)0x04,(byte)0x18,(byte)0x09,(byte)0x01,(byte)0x92,(byte)0x00,(byte)0x00,(byte)0x32,(byte)0x00,(byte)0x02,(byte)0x18,(byte)0x09,(byte)0x01,(byte)0x77,(byte)0x00,(byte)0x00,(byte)0x32,(byte)0x00,(byte)0x03,(byte)0x18,(byte)0x09,(byte)0x01,(byte)0x76,(byte)0x00,(byte)0x00,(byte)0x32,(byte)0x00,(byte)0x01,(byte)0x18,(byte)0x09,(byte)0x01,(byte)0x99,(byte)0x00,(byte)0x00,(byte)0x32,(byte)0x00,(byte)0x04,(byte)0x18,(byte)0x09,(byte)0x01,(byte)0x67,(byte)0x00,(byte)0x00,(byte)0x32,(byte)0x00,(byte)0x02,(byte)0x18,(byte)0x09,(byte)0x01,(byte)0x85,(byte)0x00,(byte)0x00,(byte)0x32,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x95});
//            connectThread.sendbyte(new byte[]{(byte)0xFF,(byte)0x54,(byte)0xc3,(byte)0x00,(byte)0x02,(byte)0x18,(byte)0x09,(byte)0x01,(byte)0x77,(byte)0x00,(byte)0x00,(byte)0x32,(byte)0x00,(byte)0x04,(byte)0x18,(byte)0x09,(byte)0x01,(byte)0x92,(byte)0x00,(byte)0x00,(byte)0x32,(byte)0x00,(byte)0x02,(byte)0x18,(byte)0x09,(byte)0x01,(byte)0x77,(byte)0x00,(byte)0x00,(byte)0x32,(byte)0x00,(byte)0x03,(byte)0x18,(byte)0x09,(byte)0x01,(byte)0x76,(byte)0x00,(byte)0x00,(byte)0x32,(byte)0x00,(byte)0x01,(byte)0x18,(byte)0x09,(byte)0x01,(byte)0x99,(byte)0x00,(byte)0x00,(byte)0x32,(byte)0x00,(byte)0x04,(byte)0x18,(byte)0x09,(byte)0x01,(byte)0x67,(byte)0x00,(byte)0x00,(byte)0x32,(byte)0x00,(byte)0x02,(byte)0x18,(byte)0x09,(byte)0x01,(byte)0x85,(byte)0x00,(byte)0x00,(byte)0x32,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0xd5});
//			break;
//		case 19:
//
//	         qcode.setVisibility(View.GONE);
//	         pay_state.setVisibility(View.GONE);
//
////	         LinearLayout.LayoutParams params1= (LinearLayout.LayoutParams)goods_list.getLayoutParams();//?????????????????
////	         params1.height=(int) (height*GOOD_LIST_HEIGHT);//????????????????
////	         goods_list.setLayoutParams(params1);
//	         ewm_ll.setVisibility(View.GONE);
//	        // merber_ll.setVisibility(View.VISIBLE);
//		break;
//		case 20://???????????????????§Ò?????
//           View_Height_Set(merber_ll,0);
//           View_Height_Set(goods_list,(int) (height/21*9));
//	         ewm_ll.setVisibility(View.VISIBLE);
//	         qcode.setVisibility(View.VISIBLE);
//	         pay_state.setVisibility(View.VISIBLE);
//
//	 		break;
//
//
//		    case 25:
//			judge_unit(1,Unit_mn.int_unit(Integer.parseInt(msg.obj.toString())),true);
//	 		break;
//
//		    case 26:
//		   	 ToastUtils.showToast(Main.this, " Main.this,???????????????");
//		    break;
//
//		    case 27:
//		   ToastUtils.showToast(Main.this, "Main.this  ????????????????");
//		    break;
//
//		    case 28:
//			 System.out.println("??????:   "+msg.obj.toString());
//			 if(msg.obj.toString().equals("01")){
//				  //  stabilization.setBackground(getResources().getDrawable(R.drawable.peel));
//				 wending.setText("???");
//			 }
//			 else
//				 //  stabilization.setBackground(getResources().getDrawable(R.drawable.no_peel));
//				 wending.setText("");
//			    break;
//
//			case 29:
//				Goods stu1 = null;
//				stuList.add(null);
//				stuList.clear();
//				if(!msg.obj.toString().endsWith("nothing")){
//
//					if(ds1365.size()<41){
//			    for(int i=0;i<ds1365.size();i++){
//					for(int i1=0;i1<ds1365.get(i).size();i1++){
//
//			        stu1=new Goods();
//			        stu1.setNum(i+1+".");
//			        stu1.setName(dp.Search_Data(Integer.parseInt(ds1365.get(i).get(0))));
//						if(ds1365.get(i).get(5).equals("3")){
//						stu1.setWeight(ds1365.get(i).get(1)+" ");
//						}
//						else{
//						  stu1.setWeight(Double.parseDouble(ds1365.get(i).get(1))*1000+" ");
//						}
//			        stu1.setPrize(ds1365.get(i).get(2));//+"?"
//			        stu1.setTotal(ds1365.get(i).get(3));
//					}
//					stuList.add(stu1);
//					}
//			        }
//
//				     }
//				if(stuList.size()<13){
//					goods_list.setStackFromBottom(false);
//					goods_list.setTranscriptMode(AbsListView.TRANSCRIPT_MODE_NORMAL);
//				}
//				else{
//					goods_list.setStackFromBottom(true);
//					goods_list.setTranscriptMode(AbsListView.TRANSCRIPT_MODE_ALWAYS_SCROLL);
//				}
//				   la =new ListAdapter(stuList,Main.this);
//				   goods_list.setAdapter(la);
//
//			    break;
//
//
//
//			case 30:
//			Goods stu11 = null;
//			stuList.add(null);
//			stuList.clear();
//			if(!msg.obj.toString().endsWith("nothing")){
//
//				if(ds2.size()<41){
//				    for(int i=0;i<ds2.size();i++){
//						for(int i1=0;i1<ds2.get(i).size();i1++){
//						Log.i("????handle?????????  "+i+":"+i1+":", ds2.get(i).get(i1));
//				        stu11=new Goods();
//				        stu11.setNum(i+1+".");
//				        stu11.setName(dp.Search_Data(Integer.parseInt(ds2.get(i).get(0))));
//							if(ds2.get(i).get(5).equals("3")){
//							stu11.setWeight(ds2.get(i).get(1)+" ");
//							}
//							else{
//							  stu11.setWeight(Double.parseDouble(ds2.get(i).get(1))*1000+" ");
//							}
//				        stu11.setPrize(ds2.get(i).get(2));//+"?"
//				        stu11.setTotal(ds2.get(i).get(3));
//						}
//						stuList.add(stu11);
//						}
//				        }
//
//			     }
//			if(stuList.size()<13){
//				goods_list.setStackFromBottom(false);
//				goods_list.setTranscriptMode(AbsListView.TRANSCRIPT_MODE_NORMAL);
//			}
//			else{
//				goods_list.setStackFromBottom(true);
//				goods_list.setTranscriptMode(AbsListView.TRANSCRIPT_MODE_ALWAYS_SCROLL);
//			}
//			   la =new ListAdapter(stuList,Main.this);
//			   goods_list.setAdapter(la);
//
//		    break;
//
//		    case 31:
//		    	state=msg.obj.toString();
//		 		break;
//		    case 32:
//		    	System.out.println("???????");
//		        blue_close.setVisibility(View.VISIBLE);
//		 		break;
//
//
//    		}
//    		}
//    };
//
//    String state="true";
//
//static LinearLayout ewm_ll;
//List<Goods> stuList;
//
//
//public static void Card_Login(String card_num0,String card_num1){
//	  final Calendar c = Calendar.getInstance();
//	  c.setTimeZone(TimeZone.getTimeZone("GMT+8:00"));
//	  String s=new SimpleDateFormat("yyyyMMddHHmmss").format(c.getTime());
//
//
////	  final String payment="UPL\tVIP\t"+weiyima+"\t"+MC+"\t"+Long.parseLong(card_num, 16)
////	  +"\t"+Long.parseLong(pwd, 16)+""+"\t\r\n"
////	  Long l=Long.parseLong(s, 16);
//  final String payment="UPL\tVIP\t"+weiyima+"\t"+MC+"\t"+Long.parseLong(card_num0, 16)
//  +"\t"+Long.parseLong(card_num1, 16)+""+"\t\r\n"
//	  +"UPL\tEND"+"\t"+MC+"\t\r\n";
//	  System.out.println("payment  "+payment);
//	                 try {
//	                	   outputStream = socket.getOutputStream();
//	                	   System.out.println("payment:"+payment);
//	                	   outputStream.write(payment.getBytes("gb2312"));
//	                	   outputStream.flush();
//	                    }catch (IOException e) {
//	                    e.printStackTrace();
//	                    }
//
//	  }
//
//
//
//static SQLiteDatabase db;
//
////????????
//public void Ud_minus(String minus,String plu){
////??§Ó??????
//db.execSQL("update ht set vl=? where plu= ?", new Object[]{minus,plu});
//ToastUtils.showToast(this, "???????"+plu);
//}
//
//
//Cursor cursor;
//public String  Search_unit(int a){
//cursor = db.rawQuery("select * from ht", null);
//String s="";
//while(cursor.moveToNext()){
//
//	//plu[geshu] = cursor.getString(cursor.getColumnIndex("plu"));
//	if(Integer.parseInt(cursor.getString(cursor.getColumnIndex("plu")))==a){
//	s= cursor.getString(cursor.getColumnIndex("p_name5"));
//	Log.i("??????????"+cursor.getCount()+">>>>>"+"   ",s +"");
//
//break;
//}
//else{
//s="kg";
//}
//
//}
//return s;
//}
//
//
///**
// * ?????????????õô
// */
//private void getBoundedDevices() {
//    //?????????????õô
//    Set<BluetoothDevice> pairedDevices = bTAdatper.getBondedDevices();
//    //?????????õô?§Ò???
//    if (pairedDevices.size() > 0) {
//        for (BluetoothDevice device : pairedDevices) {
//            adapter.add(device);
//}
//}
//}
//
//
//
//
//
//
//
//
//String  OrganizeId="",CreateUserName="";
//String sc_rp="";
//class ScalesTask extends AsyncTask<Integer, Integer, String>{
//String s="";
//public ScalesTask(String s) {
//this.s=s;
//}
//
//protected String doInBackground(Integer... pr) {
//
//	try{
//	//???????????
//		 //net_num=-1;
//		 String params="MachineCode="+MC;
//		 sc_rp= GetPostUtil.sendGet(s,params);
//		// System.out.println("params   "+ params);
//
//  		undertakingTask ut= new undertakingTask("http://api.abcd-123.com/api/CenterInstitution");
//   		ut.execute(100);
//
//    //String  url=s;
//    //sc_rp=HttpDemo.getResultFromNetByGet(url);
//    //wp_response=wp_response.substring(1, wp_response.length()-1);
//    //?????§Þ???????§Õ???,??Ùã??
//    String backlogJsonStrTmp = sc_rp.replace("\\", "");
//    // ????????????
//    sc_rp = backlogJsonStrTmp.substring(1,backlogJsonStrTmp.length() - 1);
//    sc_rp=sc_rp.substring(1, sc_rp.length());
//   // System.out.println("????????????---------------"+sc_rp.toString());
//   // no_net.setVisibility(View.GONE);
//}
//catch (Exception e)
// {
// e.printStackTrace();// no_net.setVisibility(View.VISIBLE);
// //net_state.setBackground(Main.this.getResources().getDrawable(R.drawable.net_close));
// }
//publishProgress(20);
//return "??????";
//	}
//
//
//protected void onPostExecute(String result) {
//Scales_respon();
////no_net.setVisibility(View.VISIBLE);
//super.onPostExecute(result);
//}}
//
//void  Scales_respon(){
//
//    try
//    {
//    	JSONObject ja = new JSONObject(sc_rp);//??????JSONObject????
//    	OrganizeId=ja.getString("OrganizeId");
//    	CreateUserId=ja.getString("CreateUserId");
//    	CreateUserName=ja.getString("CreateUserName");
//    	//System.out.println("?????OrganizeId---------"+OrganizeId);
//    	//System.out.println("?????CreateUserId---------"+CreateUserId);
//    	//System.out.println("?????CreateUserName---------"+CreateUserName);
//
//    	LoginloadTask lt= new LoginloadTask("http://api.abcd-123.com/api/BManagementController");//??????
//    	lt.execute(100);
//
//    	PLUTask plutsask= new PLUTask("http://api.abcd-123.com/api/PLU");//??????
//		plutsask.execute(100);
//
//     }
//     catch (Exception e)
//	 {
//     e.printStackTrace();
//}
//}
//
//
//
//
//class VersionTask extends AsyncTask<Integer, Integer, String>{
//String s="";
//public VersionTask(String s) {
//this.s=s;
//}
//protected String doInBackground(Integer... pr) {
//try{
//	vs=HttpDemo.getResultFromNetByGet("http://upfile.abcd-123.com/apk/version.txt");
//    //System.out.println("?·Ú???---------------"+vs);
//}
//catch (Exception e)
// {
// e.printStackTrace();
// //net_state.setBackground(Main.this.getResources().getDrawable(R.drawable.net_close));
// //no_net.setVisibility(View.VISIBLE);
// }
//publishProgress(20);
//return "??????";
//	}
//
//
//protected void onPostExecute(String result) {
//Version_respon();
//super.onPostExecute(result);
//}}
//
//void  Version_respon(){}
//String wp_params;
//String ID;
//String Photo="",Photo1="";
//String Boothid;
//String MName;
//String SBusiness;
//String ODuration;
//String CRating;
//String Relationship;
//String RSchooling;
//String Contact;
//String MarketName;
//String AgeID;
//String Age;
//String Sex;
//String CreateDate;
//String CreateUserId;
//String ModifyDate;
//String ModifyUserId;
//String ModifyUserName;
//String wp_response="";
//
//class LoginloadTask extends AsyncTask<Integer, Integer, String>{//????????
//String s="";
//public LoginloadTask(String s) {
//this.s=s;
//}
//
//protected String doInBackground(Integer... pr) {
//try{
//     //???????????
//     JSONObject object =new JSONObject();
//	 object.put("BindUserId",CreateUserId);
//	 //System.out.println("????????:   "+object.toString());
//	 //System.out.println("????????   --:  "+wp_response);
//	 wp_response= GetPostUtil.sendGet(s,"queryJson="+object.toString());
//    //wp_response= HttpDemo.getResultFromNetByGet(url);
//    //wp_response=wp_response.substring(1, wp_response.length()-1);
//    //?????§Þ???????§Õ???,??Ùã??
//    String backlogJsonStrTmp = wp_response.replace("\\", "");
//    wp_response = backlogJsonStrTmp.substring(1,backlogJsonStrTmp.length() - 1);
//    // ???????????????§¹????
////System.out.println("????????   --:  "+wp_response);
//}
//catch (Exception e)
//{
// e.printStackTrace();
// //no_net.setVisibility(View.VISIBLE);
//}
//publishProgress(20);
//return "??????";
//}
//
//
//protected void onPostExecute(String result) {
//		  Login_respon();
//		//  pb1.setVisibility(View.GONE);
//		  super.onPostExecute(result);
//	      }
//          }
//
//
//
//void  Login_respon(){
//	 try
//	    {
//	    JSONArray ja = new JSONArray(wp_response.substring(1, wp_response.length()));//??????JSONObject????
//	    JSONObject obj = ja.getJSONObject(0);
//	     ID=obj.getString("ID");
//	     Photo=obj.getString("Photo");
//	     Photo1=obj.getString("Photo1");
//	     //Photo2=obj.getString("Photo2");
//	     //Photo3=obj.getString("Photo3");
//	     Log.i("Photo1...  ",Photo1);
//	     Boothid=obj.getString("Boothid");
//	     Log.i("Boothid...  ",Boothid);
//	     MName=obj.getString("MName");
//	     //MarketName_tv.setText(MName);
//	     Log.i("MName...  ",MName);
//	     SBusiness=obj.getString("SBusiness");
//	     Log.i("SBusiness...  ",SBusiness);
//	     MarketID=obj.getString("MarketID");
//	     MarketName=obj.getString("MarketName");
//
//	     ModifyUserName=obj.getString("ModifyUserName");
//	     CreateUserName=obj.getString("CreateUserName");
//	     CRating=obj.getString("CRating");
//	     Permit=obj.getString("Permit");
//	   //  System.out.println("Permit   "+Permit);
//	   	EVloadTask el= new EVloadTask("http://api.abcd-123.com/api/Evaluation");//??????????
//		el.execute(100);
//
//        ACloadTask aclt= new ACloadTask("http://api.abcd-123.com/api/AccessAccount");//??????
//        aclt.execute(100);
//
//        ScrollTask st= new ScrollTask("http://api.abcd-123.com/api/Adsen");//???????
//        st.execute(100);
//
//
//		new Task("http://www.abcd-123.com/"+Photo.substring(6, Photo.length()),0x123).execute(100);
//		new Task("http://www.abcd-123.com/"+Photo1.substring(6, Photo1.length()),0).execute(100);
//  }
//catch (Exception e)
// {
// e.printStackTrace();
//
//}
//}
//
//public Bitmap head,license;
///*******????????????????????? handle*****/
//Handler handler=new Handler(){//
//	        public void handleMessage(Message msg) {
//		    if(msg.what==0x123){
//		    	String s[];
//		    	s=Local_data.getImagePathFromSD("/Test",5);
//		    	//System.out.println("head ?§Ø???????"+!String_Tool.jiaoji(s, "head"));
//		    	if(!String_Tool.jiaoji(s, "head")){
//				BmpUtil.SavaImage(head, Environment.getExternalStorageDirectory().getPath()+"/Test","head");
//			      }
//
//		     String filePath = Environment.getExternalStorageDirectory().getAbsolutePath() +"/"+"Test"+"/"+"head.png";
//			 Bitmap bit =BitmapFactory.decodeFile(filePath) ;
//			 roundImageView.setImageBitmap(bit);//??????
//
//		}
//
//		if(msg.what==0){
//			String s[];
//	    	s=Local_data.getImagePathFromSD("/Test",5);
//	    	//System.out.println("license ?§Ø???????"+!String_Tool.jiaoji(s, "license"));
//	    	if(!String_Tool.jiaoji(s, "license")){
//			BmpUtil.SavaImage(license, Environment.getExternalStorageDirectory().getPath()+"/Test","license");
//			}
//		        String filePath = Environment.getExternalStorageDirectory().getAbsolutePath() +"/"+"Test"+"/"+"license.png";
//			    Bitmap bit =BitmapFactory.decodeFile(filePath) ;
//			    Drawable drawable = new BitmapDrawable(bit);
//	            licence.setBackgroundDrawable(drawable); //??????
//
//		}
//	};
//};
//
///*******????????????????*****/
//class Task extends AsyncTask<Integer, Integer, String>{//
//	String s="";
//	int a;
//	//Bitmap bitmap;
//	public Task(String s,int a) {
//	this.s=s;
//	this.a=a;
//
//	}
//
//
//
//
//protected String doInBackground(Integer... pr) {
//	if(a==0){
//		license=GetImageInputStream(s);
//	}
//	if(a==0x123){
//		head=GetImageInputStream(s);
//	}
//
//	publishProgress(20);
//	return "??????";
//	}
//
//
//
//
//protected  void  onPostExecute(String result) {
//	Message message=new Message();
//	message.what=a;
//	handler.sendMessage(message);
//	super.onPostExecute(result);
//}
//}
//
//
//
//
//
//
///**
// * ?????????
// * @param imageurl ????????
// * @return Bitmap ????¦Ë?
// */
//public Bitmap GetImageInputStream(String imageurl){
//	URL url;
//	HttpURLConnection connection=null;
//	Bitmap bitmap=null;
//	try {
//		url = new URL(imageurl);
//		connection=(HttpURLConnection)url.openConnection();
//		connection.setConnectTimeout(6000); //???????
//		connection.setDoInput(true);
//		connection.setUseCaches(false); //???¨°???????
//		InputStream inputStream=connection.getInputStream();
//		bitmap=BitmapFactory.decodeStream(inputStream);
//		inputStream.close();
//	} catch (Exception e) {
//		e.printStackTrace();
//	}
//	return bitmap;
//}
//
//
//
//String srp="";
//class ScrollTask extends AsyncTask<Integer, Integer, String>{//??????????
//String s="";
//public ScrollTask(String s) {
//this.s=s;
//}
//
//protected String doInBackground(Integer... pr) {
//try{
//	  JSONObject object =new JSONObject();
//	  object.put("MarketName",MarketName);
//	  //object.put("ModifyUserName",ModifyUserName);
//	  String params="queryJson="+object.toString();//d5d5d1cf-9067-4443-9e43-39978c2f5d71
//	  srp= GetPostUtil.sendGet(s,params);
//	 // Log.i("??????ScrollTask   params:", params);
//     // System.out.println("??????ScrollTask--"+srp);
//      no_net.setVisibility(View.GONE);
//}
//catch (Exception e)
// {
// e.printStackTrace();// no_net.setVisibility(View.VISIBLE);
// }
//publishProgress(20);
//return "??????";
// }
//
//protected void onPostExecute(String result) {
//	    Scroll_respon();
//
//		pb.setVisibility(View.GONE);
//		super.onPostExecute(result);
//}
//}
//
//
//public static String Picture[];
//String picture_name[];
//public String[]  pt;
//@SuppressLint("DefaultLocale")
//void  Scroll_respon(){
//	    try
//	    {
//	    JSONArray ja = new JSONArray(srp);//??????JSONObject????
//	    scroll_size=ja.length();
//	    Picture=new String[scroll_size];
//	 for(int a=0;a<scroll_size;a++){
//     JSONObject obj = ja.getJSONObject(a);
//     ID=obj.getString("ID");
//	 Picture[a]=obj.getString("Picture");
//	        }
// pt=String_Tool.removeArrayEmptyTextBackNewArray(Picture);
//
// List list1 =new ArrayList();
// for(int a=0;a<pt.length;a++){
//pt[a]= "http://www.abcd-123.com/"+pt[a].substring(6, pt[a].length());
//list1.add(a+"");
//	 	   }
//	 	   for(int a=0;a<list1.size();a++){
//           System.out.println("list1:"+list1.get(a));
//	 	   }
//           List list2 =new ArrayList();
//
//          // mListString=getImagePathFromSD();
//
//
//          // initBanner (picture_name);
//
//System.out.println("picture_name????    :   "+picture_name.length);
//for(int a1=0;a1<picture_name.length;a1++){
// System.out.println("picture_name"+a1+"  :"+picture_name[a1]);
// list2.add(picture_name[a1].substring(2, picture_name[a1].length()));
// }
//
//	          for(int a=0;a<list2.size();a++){
//	 	 		 System.out.println("list2:"+list2.get(a));
//	 	 	   }
//
//
//	         list1.removeAll(list2);
//	         Iterator<String> it=list1.iterator();
//	         ArrayList<String>  df=new ArrayList<String>();
//	         while (it.hasNext()) {
//	        	 df.add(it.next());
//	         }
//	         for(int a=0;a<df.size();a++){
//	         System.out.println("?????????"+df.get(a)+"  :"+pt[Integer.parseInt(df.get(a))]);
//	      	 Bitmap bb=GetImageInputStream(pt[Integer.parseInt(df.get(a))]);
//	      	BmpUtil.SavaImage(bb, Environment.getExternalStorageDirectory().getPath()+"/Test"+"/ads","ad"+df.get(a));
//		 	 //SavaImage(bitmap, Environment.getExternalStorageDirectory().getPath()+"/Test","head");
//		     //String filePath = Environment.getExternalStorageDirectory().getAbsolutePath() +"/"+"Test"+"/"+"head.png";
//	         }
//	    // Scroll_viewpager();
//       //roundImageView.setImageBitmap(bit);//??????
//        //initBanner(pt);
//
//	    }
//	     catch (Exception e)
//	    {
//	    e.printStackTrace();
//	    }
//
//        }
//
//
//
//
//
//
//
//
//public static <T> List<T> compare(T[] t1, T[] t2) {
//    List<T> list1 = Arrays.asList(t1); //??t1???????list????
//    List<T> list2 = new ArrayList<T>();//???????2???????§Ó?????????
//    for (T t : t2) {
//        if (!list1.contains(t)) {
//            list2.add(t);
//        }
//    }
//    return list2;
//}
//
//
//
//String MarketID;
//String Permit="";
//String evrp="";
//class EVloadTask extends AsyncTask<Integer, Integer, String>{//???????????
//String s="";
//public EVloadTask(String s) {
//this.s=s;
//}
//
//protected String doInBackground(Integer... pr) {
//try{
//
//     String url=s;
//
//	  JSONObject object =new JSONObject();
//	  object.put("MarketName",MarketID);
//	  //object.put("Permit",Permit);//1123344
//     evrp= GetPostUtil.sendGet(s,"queryJson="+object.toString());
//}
//catch (Exception e)
//   {
// e.printStackTrace();
// //no_net.setVisibility(View.VISIBLE);
//    }
//	publishProgress(20);
//	return "??????";
//	}
//
//
//protected  void  onPostExecute(String result) {
//	    EV_respon();
//		//pb1.setVisibility(View.GONE);
//		super.onPostExecute(result);
//}
//}
//
//String[] Sstar,Qstar;
//void  EV_respon(){
//	     try
//	    {
//
//	    JSONArray ja = new JSONArray(evrp);//??????JSONObject????
//	    Sstar=new String[ja.length()];
//	    Qstar=new String[ja.length()];
//
//	    for(int a=0;a<ja.length();a++){
//	    	   JSONObject obj = ja.getJSONObject(a);
//	    	   Sstar[a]=obj.getString("Sstar");
//	    	   Qstar[a]=obj.getString("Qstar");
//	    }
//		//System.out.println("Qstar  ???? "+Double_Number.pingjunzhi(Qstar));
//		//System.out.println("Sstar  ???? "+Double_Number.pingjunzhi(Sstar));
//
//		service_rate.setRating(Double_Number.pingjunzhi(Sstar));
//		quanlity_rate.setRating(Double_Number.pingjunzhi(Qstar));
//	  }
//    catch (Exception e)
//	{
//    e.printStackTrace();
//	    	    // Bitmap mBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.no_net1);
//	    	    // licence.setImageBitmap(mBitmap);
//	}
//}
//
//
//
//String ac="";
//class ACloadTask extends AsyncTask<Integer, Integer, String>{//???????????
//String s="";
//public ACloadTask(String s) {
//this.s=s;
//}
//
//protected String doInBackground(Integer... pr) {
//try{
//
//     String url=s;
//
//	  JSONObject object =new JSONObject();
//	  object.put("MName",MName);
//	  //object.put("Permit",Permit);//1123344
//     ac= GetPostUtil.sendGet(s,"queryJson="+object.toString());
//
//
//
//}
//catch (Exception e)
// {
// e.printStackTrace();
// //no_net.setVisibility(View.VISIBLE);
// }
//	publishProgress(20);
//	return "??????";
//	}
//
//
//
//
//protected  void  onPostExecute(String result) {
//	    //AC_respon();
//		//pb1.setVisibility(View.GONE);
//		super.onPostExecute(result);
//}
//}
//
//
//
//void  AC_respon(){
//	     try
//	    {
//
//	    JSONArray ja = new JSONArray(ac);//??????JSONObject????
//	    } catch (Exception e)
//	    		{
//	    	     e.printStackTrace();
//	    	    // Bitmap mBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.no_net1);
//	    	    // licence.setImageBitmap(mBitmap);
//	  }
//}
//
//
//
//String plu_rp="";
//class PLUTask extends AsyncTask<Integer, Integer, String>{
//String s;
//public PLUTask(String s) {
//this.s=s;
//}
//
//protected String doInBackground(Integer... pr) {
//	try{
//	      //???????????
//		  String params="OrganizeId="+OrganizeId+"&queryJson="+"{}"+"&sidx="+"PLUID"+"&sord="+"desc";//d5d5d1cf-9067-4443-9e43-39978c2f5d71
//		  plu_rp= GetPostUtil.sendGet(s,params);
//		  Log.i("params:    ", params);
//
//    //?????§Þ???????§Õ???,??Ùã??
//    String backlogJsonStrTmp = plu_rp.replace("\\", "");
//    // ????????????
//    plu_rp = backlogJsonStrTmp.substring(1,backlogJsonStrTmp.length() - 1);
//    plu_rp=plu_rp.substring(1, plu_rp.length());
//   // System.out.println("PLUTask????:------------"+plu_rp);
//  // no_net.setVisibility(View.GONE);
//}
//catch (Exception e)
// {
// e.printStackTrace();
// //net_state.setBackground(Main.this.getResources().getDrawable(R.drawable.net_close));
// //no_net.setVisibility(View.VISIBLE);
// }
//	 publishProgress(20);
//     return "??????";
//	}
//
//
//protected void onPostExecute(String result) {
//	   PLU_respon();
//	 //  no_net.setVisibility(View.VISIBLE);
//	super.onPostExecute(result);
//}}
//String plu_Name[];
//String plu_Price[];
//String plu_UnitID[];
//String plu_broadcast_ct[];
//int SCROLL_INDEX=6;
//void  PLU_respon(){
//         try
//        {
//    	JSONArray ja = new JSONArray(plu_rp);//??????JSONObject????
//    	plu_Name=new String [ja.length()];
//    	plu_Price=new String [ja.length()];
//    	plu_UnitID=new String [ja.length()];
//    	plu_broadcast_ct=new String [ja.length()];
//
//    	if(ja.length()>0){
//    		listItems.clear();
//    		for(int a=0;a<ja.length();a++){
//    			//System.out.println("ja.length()?????"+ja.length());
//    		    JSONObject obj = ja.getJSONObject(a);
//    		    plu_Name[a]=obj.getString("Name");
//    		    plu_Price[a]=obj.getString("Price");
//    		    plu_UnitID[a]=obj.getString("UnitID");
//
//
//    			    Map<String, Object> listItem = new HashMap<String, Object>();
//    				listItem.put("name", plu_Name[a]);
//    				listItem.put("prize", plu_Price[a]+"?/kg");
//    			    listItems.add(listItem);
//    		}
//    		}
//    	else
//    	{
//
//       		for(int a=0;a<5;a++){
//
//    			    Map<String, Object> listItem = new HashMap<String, Object>();
//    				listItem.put("name","???????");
//    				listItem.put("prize", "0.00?/kg");
//    			    listItems.add(listItem);
//       		}
//       		}
//
//    	    //System.out.println("listItems?????"+listItems.size());
//    		mListviewAdapter =new ListviewAdapter(this,listItems);
//    		lview.setAdapter(mListviewAdapter);
//    		//?Ú…????
//    		//if(listItems.size()>20){
//             new Timer().schedule(new TimeTaskScroll(this, lview), 100, 500);
//        }
//     catch (Exception e)
//	 {
//     e.printStackTrace();
//     }
//}
//
//class undertakingTask extends AsyncTask<Integer, Integer, String>{
//String s="";
//public undertakingTask(String s) {
//this.s=s;
//}
//
//protected String doInBackground(Integer... pr) {
//
//	try{
// 	//???????????
//    String  url=s;
//    ut_re= HttpDemo.getResultFromNetByGet(url);
//   // wp_response=wp_response.substring(1, wp_response.length()-1);
//    //?????§Þ???????§Õ???,??Ùã??
//    String backlogJsonStrTmp = ut_re.replace("\\", "");
//    // ????????????
//    ut_re = backlogJsonStrTmp.substring(1,backlogJsonStrTmp.length() - 1);
//    // ???????????????§¹????
//    //System.out.println("undertakingTask response          ????:"+ut_re);
//   // no_net.setVisibility(View.GONE);
//}
//catch (Exception e)
// {
// e.printStackTrace();
// //net_state.setBackground(Main.this.getResources().getDrawable(R.drawable.net_close));//no_net.setVisibility(View.VISIBLE);
// }
//	publishProgress(20);
//    return "??????";
//	}
//
//
//protected void onPostExecute(String result) {
//	undertakingTask_respon();
//		pb.setVisibility(View.GONE);
//		super.onPostExecute(result);
//}
//}
//
//String Content="";
//String ut_re;
//void  undertakingTask_respon(){
//	       try
//	       {
//
//	        JSONArray ja = new JSONArray(ut_re);//??????JSONObject????
//		    JSONObject obj = ja.getJSONObject(0);
//
//		    Content=obj.getString("Content");
//		   // System.out.println("undertakingTask Content    ????:"+Content);
//		    undertakeing.setText(Content);
//	     }
//         catch (Exception e)
//		 {
//	     e.printStackTrace();
//		 }
//}
//
////?????APP
//private long  mExitTime;
//public boolean onKeyDown(int keyCode, KeyEvent event) {
//if (keyCode == KeyEvent.KEYCODE_BACK) {
// if ((System.currentTimeMillis() - mExitTime) > 2000) {
//        Toast.makeText(this, "?????????????", Toast.LENGTH_SHORT).show();
//         mExitTime = System.currentTimeMillis();
//
// } else {
////onClinkBluetoothOff();
//	 try {
//		socket1.close();
//		socket.close();
//	} catch (IOException e) {
//	e.printStackTrace();
//	}
//	 yichi=true;
//bt_boolean=false;
////BluetoothManager.turnOffBluetooth();
////connectThread.destroy();
//onDestroy(); System.gc();finish();
////MyApplication.getInstance().exit();
// }
//
//return true;
//   }
//   return super.onKeyDown(keyCode, event);
//}
//
//
///**
// * ????????
// */
//private void openBlueTooth() {
//    if (bTAdatper == null) {
//        Toast.makeText(this, "????õô?????????????", Toast.LENGTH_SHORT).show();
//    }
//    if (!bTAdatper.isEnabled()) {
//       /* Intent i = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
//        startActivity(i);*/
//        bTAdatper.enable();
//    }
//    //???????????????õô????????
//    if (bTAdatper.getScanMode() != BluetoothAdapter.SCAN_MODE_CONNECTABLE_DISCOVERABLE) {
//        Intent i = new Intent(BluetoothAdapter.ACTION_REQUEST_DISCOVERABLE);
//        //???????????
//        i.putExtra(BluetoothAdapter.EXTRA_DISCOVERABLE_DURATION, 0);
//        startActivity(i);
//}
//}
//
//
//
//
//
//
//
//
//public  void Reback_order(int size,String  d_total,String plu[],String weight[],String d_prize[],String e_total[],String name[],
//String unit[],String pay,String card_num,String pwd,String cash,String card_money, double[] jifen,String[] ysprize,
//String[]rate,String buy_physics_01,String buy_physics_02,String cargo_num[],String pichi[]){
//////???????????????????
////String num ="0";
//////????query()???Cursor
////Cursor cs = dbHelper.query();
////while (cs.moveToNext()){
////int _id = cs.getInt(cs.getColumnIndex("_id"));
////if(_id==1){
////num= cs.getString(cs.getColumnIndex("num"));
////Log.i("num-------",num);
////}
////}
//final Calendar c = Calendar.getInstance();
//c.setTimeZone(TimeZone.getTimeZone("GMT+8:00"));
//String mYear = String.valueOf(c.get(Calendar.YEAR)); // ?????????
//String mMonth = String.valueOf(c.get(Calendar.MONTH) + 1);// ???????¡¤?
//String mDay = String.valueOf(c.get(Calendar.DAY_OF_MONTH));// ???????¡¤?????????
//String mHour = String.valueOf(c.get(Calendar.HOUR_OF_DAY));//?
//String mMinute = String.valueOf(c.get(Calendar.MINUTE));//??
//String mSecond = String.valueOf(c.get(Calendar.SECOND));//??
//String s=new SimpleDateFormat("yyyyMMddHHmmss").format(c.getTime());
//String ops="";
//System.out.println("???????"+size+"???");
//for(int i=0;i<size;i++){
//ops+="RES\t"+weiyima+"\t"+Socket_Tool.Get_index()+"\t"+"-"+e_total[i]+"\t"+plu[i]+"\t"+"3"+"\t"+"4"+"\t"+"0,2"+"\t"+"-"+weight[i]+"\t"+unit[i]+"\t"+"1"+"\t"
//+Double_Number.NetString(Double.parseDouble(rate[i]))+"\t"+ysprize[i]+"\t"+d_prize[i]+"\t"+name[i]+"\t"
//+Double_Number.NetString(jifen[i])+"\t"+cargo_num[i]+"\t"+pichi[i]+"\t\r\n";// +cargo_num[i]+"\t"+pichi[i]+"\t\r\n";
//}
//
//final String payment=
//"DWL\tREP\t"+s+"\t"+dt.Search_Data(40)+"\t"+MC+"\t\r\n"
//+"REP\t"+weiyima+"\t" +mYear.substring(2, mYear.length())+"\t"+mMonth+"\t"+mDay+"\t"+mHour+"\t"+mMinute+"\t"+mSecond+"\t"+Socket_Tool.Get_index()+"\t"
//+Socket_Tool.Get_index()+"\t"+"0"+"\t"+card_num+"\t"+pwd+"\t"+"-"+d_total+"\t"+"-"+cash+"\t"+card_money+"\t"+"0"+"\t"+"0"+"\t"+"0"+"\t"+"0,2"+"\t"+"0,2"+"\t"
//+pay+"\t"+"0"+"\t"+""+"\t"+""+"\t"+"0,0"+"\t"+"0,0"+"\t"+""+"\t"+"2"+"\t"+buy_physics_01+"\t"+buy_physics_02+"\t"//physics_card_long[0]
//+"0"+"\t"+"0"+"\t\r\n" //"\t"+physics_card_long[0]+"\t"+physics_card_long[1]+"\t"+"0"+"\t"+"0"+
//+ ops
//+ "REE\t"+weiyima+"\t\r\n"
//+ "END\tREP\t"+s+"\t"+dt.Search_Data(40)+"\t"+weiyima+"\t"+MC+"\t\r\n";
//
////yc.Search_Data();
////yc.isData(db,yc.geshu, size+"", d_total, plu, weight, d_prize, e_total, name, unit, pay, card_num, pwd, cash, card_money,
////jifen, ysprize,rate,buy_physics_01,buy_physics_02,cargo_num,pichi);
//
//System.out.println("???socket????REP   "+payment);
//System.out.println("state:"+state);
//if(state.equals("true")){
//
//try {
//outputStream = socket.getOutputStream();
//
//outputStream.write(payment.getBytes("gb2312"));//payment.getBytes("gb2312")
//outputStream.flush();
//}catch (IOException e) {
//e.printStackTrace();
//}
//}
//}




//
//public  void order(int size,String  d_total,String plu[],String weight[],String d_prize[],String e_total[],String name[],
//String unit[],String pay,String card_num,String pwd,String cash,String card_money, double[] jifen,String[] ysprize,
//String[]rate,String buy_physics_01,String buy_physics_02,String cargo_num[],String pichi[]){
//	    //???????????????????
//	    String num ="0";
//       //????query()???Cursor
// 	    Cursor cs = dbHelper.query();
// 	    while (cs.moveToNext()){
// 		int _id = cs.getInt(cs.getColumnIndex("_id"));
// 		if(_id==1){
// 		num= cs.getString(cs.getColumnIndex("num"));
// 	    Log.i("num-------",num);  	
// 	}
// 	}
// final Calendar c = Calendar.getInstance();
// c.setTimeZone(TimeZone.getTimeZone("GMT+8:00"));
// String mYear = String.valueOf(c.get(Calendar.YEAR)); // ?????????
// String mMonth = String.valueOf(c.get(Calendar.MONTH) + 1);// ???????¡¤?
// String mDay = String.valueOf(c.get(Calendar.DAY_OF_MONTH));// ???????¡¤?????????
// String mHour = String.valueOf(c.get(Calendar.HOUR_OF_DAY));//?
// String mMinute = String.valueOf(c.get(Calendar.MINUTE));//??
// String mSecond = String.valueOf(c.get(Calendar.SECOND));//??
// String s=new SimpleDateFormat("yyyyMMddHHmmss").format(c.getTime());
//String ops="";
//System.out.println("???????"+size+"???");
//for(int i=0;i<size;i++){
//ops+="RES\t"+weiyima+"\t"+num+"\t"+e_total[i]+"\t"+plu[i]+"\t"+"3"+"\t"+"4"+"\t"+"0,2"+"\t"+weight[i]+"\t"+unit[i]+"\t"+"0"+"\t"
//+Double_Number.NetString(Double.parseDouble(rate[i]))+"\t"+ysprize[i]+"\t"+d_prize[i]+"\t"+name[i]+"\t"
//+Double_Number.NetString(jifen[i])+"\t"+cargo_num[i]+"\t"+pichi[i]+"\t\r\n";// +cargo_num[i]+"\t"+pichi[i]+"\t\r\n";
// }
//
//final String payment=
//"DWL\tREP\t"+s+"\t"+dt.Search_Data(40)+"\t"+MC+"\t\r\n"
//+"REP\t"+weiyima+"\t" +mYear.substring(2, mYear.length())+"\t"+mMonth+"\t"+mDay+"\t"+mHour+"\t"+mMinute+"\t"+mSecond+"\t"+num+"\t"
//+num+"\t"+"0"+"\t"+card_num+"\t"+pwd+"\t"+d_total+"\t"+cash+"\t"+card_money+"\t"+"0"+"\t"+"0"+"\t"+"0"+"\t"+"0,2"+"\t"+"0,2"+"\t"
//+pay+"\t"+"0"+"\t"+""+"\t"+""+"\t"+"0,0"+"\t"+"0,0"+"\t"+""+"\t"+"2"+"\t"+buy_physics_01+"\t"+buy_physics_02+"\t"//physics_card_long[0]
//	 +"0"+"\t"+"0"+"\t\r\n" //"\t"+physics_card_long[0]+"\t"+physics_card_long[1]+"\t"+"0"+"\t"+"0"+
//+ ops
//+ "REE\t"+weiyima+"\t\r\n"
//+ "END\tREP\t"+s+"\t"+dt.Search_Data(40)+"\t"+weiyima+"\t"+MC+"\t\r\n";
// 
//// yc.Search_Data();
//// yc.isData(db,yc.geshu, size+"", d_total, plu, weight, d_prize, e_total, name, unit, pay, card_num, pwd, cash, card_money,
////jifen, ysprize,rate,buy_physics_01,buy_physics_02,cargo_num,pichi); 
////
//    System.out.println("???socket????REP   "+payment);
//    System.out.println("state:"+state);
////  if(state.equals("true")){
//
// try {
//  outputStream = socket.getOutputStream();
//  outputStream.write(payment.getBytes("gb2312"));//payment.getBytes("gb2312")
//  outputStream.flush();
// }catch (IOException e) {
// e.printStackTrace();
// }
//// }
// }



//public String dingdan(int size,String  d_total,String plu[],String weight[],String d_prize[],String name[],String unit[],String pay,String card_num,
//		  String pwd,String cash,String card_money,String pay_net_num,String buy_physics_01,String buy_physics_02,String index,String weiyima, String balance_num,String mc){
////	  String num ="0";
////		    Cursor cs = dbHelper.query();
////		    while (cs.moveToNext()){
////		  	int _id = cs.getInt(cs.getColumnIndex("_id"));
////		  	if(_id==1){
////		  	num= cs.getString(cs.getColumnIndex("num"));
////		    Log.i("???????num----",num);  	
////		  	}
////		  	}
//		  final Calendar c = Calendar.getInstance();
//		  c.setTimeZone(TimeZone.getTimeZone("GMT+8:00"));
//		  String mYear = String.valueOf(c.get(Calendar.YEAR)); // ?????????
//		  String mMonth = String.valueOf(c.get(Calendar.MONTH) + 1);// ???????¡¤?
//		  String mDay = String.valueOf(c.get(Calendar.DAY_OF_MONTH));// ???????¡¤?????????
//		  String mHour = String.valueOf(c.get(Calendar.HOUR_OF_DAY));//?
//		  String mMinute = String.valueOf(c.get(Calendar.MINUTE));//??
//		  String mSecond = String.valueOf(c.get(Calendar.SECOND));//??
//		  String s=new SimpleDateFormat("yyyyMMddHHmmss").format(c.getTime());
//		  //weiyima=s.substring(2, s.length())+"001001"+Double_Number.Get_Six_String(Integer.parseInt(num));
//		  System.out.println("mHour  "+mHour);
//		  String ops="";
//
//
//	  for(int i=0;i<size;i++){
//	  ops="ORS\t"+weiyima+"\t"+index+"\t"+d_prize[i]+"\t"+plu[i]+"\t"+"1"+"\t"+"1"+"\t"+"0,2"+"\t"+weight[i]+"\t"+unit[i]+"\t"+"0"+"\t"+"111,2"+"\t"+d_prize[i]+"\t"+"111,2"+"\t"+name[i]+"\t"+"2,2"+"\t"+"0"+"\t"+"00000000"+"\t\r\n";
//	  }
//
//	  final String payment="DWL\tORP\t"+s+"\t"+balance_num+"\t"+mc+"\t\r\n"		  
//	  +"ORP\t"+weiyima+"\t"+mYear.substring(2, mYear.length())+"\t"+mMonth+"\t"+mDay+"\t"+mHour+"\t"+mMinute+"\t"+mSecond+"\t"+index+"\t"+index+"\t"+"0"+"\t"+card_num+"\t"
//	  +pwd+"\t"+d_total+"\t"+cash+"\t"+card_money+"\t"+"1"+"\t"+"0"+"\t"+"0"+"\t"+"0,2"+"\t"+"0,2"+"\t"+pay+"\t"+pay_net_num+"\t"+""+"\t"+""+"\t"+"0,0"+"\t"+
//	       "0,0"+"\t"+""+"\t"+"2"+"\t"+buy_physics_01+"\t"+buy_physics_02+"\t"+"0"+"\t"+"0"+"\t\r\n"
//		     +ops
//		     + "ORE\t"+weiyima+"\t\r\n"
//		     + "END\tORP\t"+s+"\t1001\t"+weiyima+"\t"+mc+"\t\r\n";
//	  
//return payment;
//	  }


//public void dingdan(int size,String  d_total,String plu[],String weight[],String d_prize[],String name[],String unit[],String pay,String card_num,String pwd,String cash,String card_money,String pay_net_num){
//String num ="0";
//
//	  Cursor cs = dbHelper.query();
//	  while (cs.moveToNext()){
//	  	int _id = cs.getInt(cs.getColumnIndex("_id"));
//	  	if(_id==1){
//	  	num= cs.getString(cs.getColumnIndex("num"));
//	      Log.i("???????num----",num);  	
//	  	}
//	  	}
//	  final Calendar c = Calendar.getInstance();
//	  c.setTimeZone(TimeZone.getTimeZone("GMT+8:00"));
//	  String mYear = String.valueOf(c.get(Calendar.YEAR)); // ?????????
//	  String mMonth = String.valueOf(c.get(Calendar.MONTH) + 1);// ???????¡¤?
//	  String mDay = String.valueOf(c.get(Calendar.DAY_OF_MONTH));// ???????¡¤?????????
//	  String mHour = String.valueOf(c.get(Calendar.HOUR_OF_DAY));//?
//	  String mMinute = String.valueOf(c.get(Calendar.MINUTE));//??
//	  String mSecond = String.valueOf(c.get(Calendar.SECOND));//??
//	  String s=new SimpleDateFormat("yyyyMMddHHmmss").format(c.getTime());
//	  //weiyima=s.substring(2, s.length())+"001001"+Double_Number.Get_Six_String(Integer.parseInt(num));
//	  System.out.println("mHour  "+mHour);
//	  String ops="";
//
////	  for(int i=0;i<size;i++){
////	  ops="ORS\t"+weiyima+"\t"+num+"\t"+d_prize[i]+"\t"+plu[i]+"\t"+"1"+"\t"+"1"+"\t"+"0,2"+"\t"+weight[i]+"\t"+unit[i]+"\t"+"0"+"\t"+"111,2"+"\t"+d_prize[i]+"\t"+"111,2"+"\t"+name[i]+"\t"+"111,2"+"\t\r\n";
////	  }
//
//	
//for(int i=0;i<size;i++){
//ops="ORS\t"+weiyima+"\t"+num+"\t"+d_prize[i]+"\t"+plu[i]+"\t"+"1"+"\t"+"1"+"\t"+"0,2"+"\t"+weight[i]+"\t"+unit[i]+"\t"+"0"+"\t"+"111,2"+"\t"+d_prize[i]+"\t"+"111,2"+"\t"+name[i]+"\t"+"2,2"+"\t"+"0"+"\t"+"00000000"+"\t\r\n";
//}
//
//final String payment="DWL\tORP\t"+s+"\t"+dt.Search_Data(40)+"\t"+MC+"\t\r\n"		  
//+"ORP\t"+weiyima+"\t"+mYear.substring(2, mYear.length())+"\t"+mMonth+"\t"+mDay+"\t"+mHour+"\t"+mMinute+"\t"+mSecond+"\t"+num+"\t"+num+"\t"+"0"+"\t"+card_num+"\t"
//+pwd+"\t"+d_total+"\t"+cash+"\t"+card_money+"\t"+"1"+"\t"+"0"+"\t"+"0"+"\t"+"0,2"+"\t"+"0,2"+"\t"+pay+"\t"+pay_net_num+"\t"+""+"\t"+""+"\t"+"0,0"+"\t"+
//   "0,0"+"\t"+""+"\t"+"2"+"\t"+physics_card_long[0]+"\t"+physics_card_long[1]+"\t"+"0"+"\t"+"0"+"\t\r\n"
//	     +ops
//	     + "ORE\t"+weiyima+"\t\r\n"
//	     + "END\tORP\t"+s+"\t1001\t"+weiyima+"\t"+MC+"\t\r\n";
//
//System.out.println("state:"+state);
////if(state.equals("true")){
//try {
//outputStream = socket.getOutputStream();
//System.out.println("ORP payment:"+payment);
//outputStream.write(payment.getBytes("gb2312"));
//outputStream.flush();
//}catch (IOException e) {
//e.printStackTrace();
//}
////}
//}
//	 

//public void clean_goods_list(){
//    qcnum=60;
//    if(qct==null&print_bl){//&Integer.parseInt(weight)==0)
//	   qct=new qcThread();
//	   qct.start();
//	   }
//      }
//
//
//private qcThread qct=null;
//public int qcnum=60;
//public static final int qcWHAT=1;
//private qcHandle qch=null;
//class qcThread extends Thread{
// @Override
// public void run() {
//     super.run();
//     while (!Thread.interrupted()){
//         while (qcnum>=0){
//             Message message= qch.obtainMessage(qcWHAT,qcnum+"");
//            qch.sendMessage(message);
//            // System.out.println("???????§Ò?n?????: "+qcnum);
//             try {
//             Thread.sleep(1000);
//             } catch (InterruptedException e) {
//             e.printStackTrace();
//             }
//             qcnum--;
//           }
//         //?????????????????
//         if(qcnum<0){
//             Message handMsg1 = new Message();
//				handMsg1.obj="";
//				handMsg1.what = 4;
//     		qch.sendMessage(handMsg1);
//				qct.interrupt();//????§Ø?
//				qct=null;
//				//qcnum=60;
//         }
//       }
//     }
//   }
//
//



///sent_TIM();
//final Calendar c = Calendar.getInstance();
//c.setTimeZone(TimeZone.getTimeZone("GMT+8:00"));
//String mYear = String.valueOf(c.get(Calendar.YEAR));//?????????
//String mMonth = String.valueOf(c.get(Calendar.MONTH) + 1);// ???????¡¤?
//String mDay = String.valueOf(c.get(Calendar.DAY_OF_MONTH));// ???????¡¤?????????
//String mHour = String.valueOf(c.get(Calendar.HOUR_OF_DAY));//?
//String mMinute = String.valueOf(c.get(Calendar.MINUTE));//??
//String mSecond = String.valueOf(c.get(Calendar.SECOND));//??
//connectThread.sendbyte(Stringtobyte.Set_time(mYear, mMonth, mDay, mHour, mMinute, mSecond));

//byte[] goods(String code,int cargo_code,long index_code,String unit,Double  prize,String name){
//for(int i1=1;i1<52;i1++){
//	if(is){
//		is=false;
//	}	
//}
//yo.Search_Data();
//a++;
//av.add(goods(a,2,"test1276574534"+a,"3",Double.parseDouble(12.12+a+""),"????"+a));
//good_massege(av);	
//if(a%2==1){
//	BluetoothManager.turnOffBluetooth();
//System.out.println("??????");
//}
//if(a%2==0){
//	BluetoothManager.turnOnBluetooth();
//	open_blue_thread();
//System.out.println("??????");
//}
//connectThread.sendbyte(new byte[]{(byte)0xff,(byte)0xf5,(byte)0xb2,(byte)0x01,(byte)0x00,(byte)0x00,(byte)0x04,(byte)0x00,(byte)0x00,(byte)0x02,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x1c,(byte)0xbe,(byte)0x99,(byte)0x1a,(byte)0x69,(byte)0x00,(byte)0x09,(byte)0x0b,(byte)0xc1,(byte)0xf1,(byte)0xc1,(byte)0xab,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x03,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0xac,});

//?¡¤?????
//?¡¤?????
//connectThread.sendbyte(new byte[]{(byte)0xff,(byte)0xd6,(byte)0x84,(byte)0x00,(byte)0x02,(byte)0x01,(byte)0x02,(byte)0x03,(byte)0x04,(byte)0x01,(byte)0x00,(byte)0x02,(byte)0x05,(byte)0x06,(byte)0x07,(byte)0x08,(byte)0x01,(byte)0x00,(byte)0x02,(byte)0x12,(byte)0x34,(byte)0x56,(byte)0x78,(byte)0x01,(byte)0x00,(byte)0x02,(byte)0x22,(byte)0x33,(byte)0x44,(byte)0x55,(byte)0x01,(byte)0x00,(byte)0x02,(byte)0x55,(byte)0x66,(byte)0x77,(byte)0x88,(byte)0x01,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x62});

//connectThread.sendbyte(new byte[]{(byte)0xff,(byte)0xd6,(byte)0x84,(byte)0x00,(byte)0x01,(byte)0x01,(byte)0x02,(byte)0x03,(byte)0x04,(byte)0x01,(byte)0x00,(byte)0x01,(byte)0x05,(byte)0x06,(byte)0x07,(byte)0x08,(byte)0x01,(byte)0x00,(byte)0x01,(byte)0x12,(byte)0x34,(byte)0x56,(byte)0x78,(byte)0x90,(byte)0x00,(byte)0x01,(byte)0x22,(byte)0x33,(byte)0x44,(byte)0x55,(byte)0x66,(byte)0x00,(byte)0x01,(byte)0x55,(byte)0x66,(byte)0x77,(byte)0x88,(byte)0x66,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0xf0});
//connectThread.sendbyte(new byte[]{(byte)0xff,(byte)0xd6,(byte)0x84,(byte)0x00,(byte)0x01,(byte)0x01,(byte)0x02,(byte)0x03,(byte)0x04,(byte)0x01,(byte)0x00,(byte)0x01,(byte)0x05,(byte)0x06,(byte)0x07,(byte)0x08,(byte)0x01,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0x00,(byte)0xa5});
//?????????2?????????10?????????

//private void onClinkBluetoothOff(){
//    if(bTAdatper.isEnabled()){
//    	bTAdatper.disable();
//        Toast.makeText(this,"Turned off Bluetooth", Toast.LENGTH_SHORT).show();
//    }
//    else {
//        Toast.makeText(this,"Bluetooth is already off!",Toast.LENGTH_SHORT).show();
//}
//}
//


//
//
//public void  Set_time( String year,String mouth,String day,String hour,String minute,String second){
//	Log.i("Integer.toHexString(Integer.parseInt(year) ", Shiliu_Detail.numToHex16(Integer.parseInt(year)).substring(2,6));
//	byte b0[]=new byte[]{(byte)0xff,(byte)0x0b,(byte)0xc4}; 
//	//byte b0[]=new byte[]{(byte)0xff,(byte)0x0b,(byte)0x32}; 
//	byte b_year[]=Shiliu_Detail.hexString2Bytes(Shiliu_Detail.numToHex16(Integer.parseInt(year)).substring(2,6));//;0x07,(byte)0xe2
//	byte bb[]=Shiliu_Detail.addBytes(b0, b_year);
//	byte b_mouth[]=Shiliu_Detail.hexString2Bytes(Shiliu_Detail.numToHex16(Integer.parseInt(mouth)).substring(4, 6));
//	byte b1[]=Shiliu_Detail.addBytes(bb, b_mouth);
//	byte b_day[]=Shiliu_Detail.hexString2Bytes(Shiliu_Detail.numToHex16(Integer.parseInt(day)).substring(4, 6));
//	
//	Log.i("Integer.toHexString(Integer.parseInt(day) ", Shiliu_Detail.numToHex16(Integer.parseInt(day)));
//	byte b2[]=Shiliu_Detail.addBytes(b1, b_day);
//	byte b_hour[]=Shiliu_Detail.hexString2Bytes(Shiliu_Detail.numToHex16(Integer.parseInt(hour)).substring(4, 6));
//	byte b3[]=Shiliu_Detail.addBytes(b2,b_hour);
//	byte b_minute[]=Shiliu_Detail.hexString2Bytes(Shiliu_Detail.numToHex16(Integer.parseInt(minute)).substring(4, 6));
//	byte b4[]=Shiliu_Detail.addBytes(b3,b_minute);
//	byte b_second[]=Shiliu_Detail.hexString2Bytes(Shiliu_Detail.numToHex16(Integer.parseInt(second)).substring(4,6));
//	byte b5[]=Shiliu_Detail.addBytes(b4,b_second);
//
//	//String s="";
//	//s=Shiliu_Detail.yihuo(Shiliu_Detail.byte2hex(b5)+"");
//
//	
//	byte b6[]=new byte[1];
//	b6[0]=Shiliu_Detail.getXor(b5);
//    System.out.println("§µ??? "+ Shiliu_Detail.toHexString1(b6)+"");
//	byte b7[]=Shiliu_Detail.addBytes(b5,b6);
//	//String hex = Integer.toHexString(Integer.parseInt(year));
//System.out.println("16?????   "+Shiliu_Detail.toHexString1(b7));
//	for(int i1=0;i1<b7.length;i1++){
//	Log.i("b_year?? "+i1+" ", b7[i1]+"");
//     }
//	connectThread.sendbyte(b7);
//}






//protected void onDestroy() {
//  super.onDestroy();
//  //???????
//  if (bTAdatper != null && bTAdatper.isDiscovering()) {
//      bTAdatper.cancelDiscovery();
//  }
//  //???BroadcastReceiver????????§Û?
//   //unregisterReceiver(mReceiver);
//}



//private void registerBoradcastReceiver() {
//	//??????
//  IntentFilter stateChangeFilter = new IntentFilter(
//          BluetoothAdapter.ACTION_STATE_CHANGED);
//  IntentFilter connectedFilter = new IntentFilter(
//          BluetoothDevice.ACTION_ACL_CONNECTED);
//  IntentFilter disConnectedFilter = new IntentFilter(
//          BluetoothDevice.ACTION_ACL_DISCONNECTED);
//  registerReceiver(stateChangeReceiver, stateChangeFilter);
//  registerReceiver(stateChangeReceiver, connectedFilter);
//  registerReceiver(stateChangeReceiver, disConnectedFilter);
//}

//private BroadcastReceiver stateChangeReceiver = new BroadcastReceiver() {
//  @Override
//  public void onReceive(Context context, Intent intent) {
//      String action = intent.getAction();
//      if (action.equals(BluetoothDevice.ACTION_ACL_CONNECTED)) {
//          //????????
//      } else if (action.equals(BluetoothDevice.ACTION_ACL_DISCONNECTED)) {
//          //??????????§Ø?
//          BluetoothDevice device = intent.getParcelableExtra(BluetoothDevice.EXTRA_DEVICE);
//          String name = device.getName();
//        ToastUtils.showToast(Main.this, name + "??????????"+getApplicationContext());
//        bluetoothStatus = false;
//          return;
//      }
//  }
//};





//boolean bluetoothStatus=false;
//private BroadcastReceiver mReceiver = new BroadcastReceiver() {
//     public void onReceive(Context context, Intent intent) {
//         switch (intent.getAction()) {
//             case BluetoothAdapter.ACTION_STATE_CHANGED:
//                 int blueState = intent.getIntExtra(BluetoothAdapter.EXTRA_STATE, 0);
//                 switch (blueState) {
//                     case BluetoothAdapter.STATE_TURNING_ON:
//                         Log.e("??????TAG", "TURNING_ON");
//                         break;
//                     case BluetoothAdapter.STATE_ON:
//                  	   bluetoothStatus=true;
//                         Log.e("??????TAG", "STATE_ON");
//                         break;
//                     case BluetoothAdapter.STATE_TURNING_OFF:
//                         Log.e("??????TAG", "STATE_TURNING_OFF");
//                         break;
//                     case BluetoothAdapter.STATE_OFF:
//                  	   bluetoothStatus=false;
//                         Log.e("??????TAG", "STATE_OFF");
//                         break;
//                 }
//                 break;
//         }
//     }
// };


//private void initReceiver() {
////????
//IntentFilter filter = new IntentFilter();
//filter.addAction(BluetoothDevice.ACTION_FOUND);
//filter.addAction(BluetoothAdapter.ACTION_DISCOVERY_STARTED);
//filter.addAction(BluetoothAdapter.ACTION_DISCOVERY_FINISHED);
//registerReceiver(mReceiver, filter);
//}
//
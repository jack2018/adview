package ye.fang.ad;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ContentUris;
import android.content.Context;
import android.content.res.Configuration;
import android.database.Cursor;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.MediaController;
import android.widget.VideoView;
import ye.fang.adapter.Detail;
import ye.fang.adapter.DetailAdapter;
import ye.fang.adapter.Goods;
import ye.fang.adapter.ListAdapter;
import ye.fang.adapter.ScrollBanner;
import ye.fang.record.ChartView;
import ye.fang.tool.DimenTool;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;



public class MainActivity extends Activity {

    private VideoView video;
    private ListView goods_list,now_detail;
    List<Goods> stuList;
    List<Detail> detailList;
    ScrollBanner sb_demographic;

    //public static String[] shuzi=new String[]{6.0+"",8.0+"",5.4+"",6.6+"",6.0+"",7.0+"",8.5+"",5.4+"",7.6+"",6.2+"",6.2+"",10.4+"",7.0+"",8.5+"",5.4+""};
    public static String[] shuzi=new String[]{1586+"",5412+"",3522+"",1150+"",4800+"",2000+"",2600+"",3111+"",2845+"",1489+"",4878+"",1547+"",2685+"",3210+"",1866+""};

    @SuppressLint("NewApi")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        for(int a=0;a<shuzi.length;a++){
            shuzi[a]=6000-Integer.parseInt(shuzi[a])+"";

        }


        ChartView myView = new ChartView(this);
        myView = (ChartView) findViewById(R.id.hour_view);
        myView.setInfo(
                new String[]{""},   //X轴刻
                new String[]{"0","1000","2000","3000","4000","5000","6000"},   //Y轴刻度
                shuzi
        );



        initView();

        Configuration config = getResources().getConfiguration();
        int smallestScreenWidth = config.smallestScreenWidthDp;
        Log.i("smallest width : ", smallestScreenWidth+"");


        DimenTool.gen();
    }

    private void initView() {

        video = (VideoView) findViewById(R.id.video);
        goods_list=(ListView)findViewById(R.id.goods_list);
        now_detail=(ListView)findViewById(R.id.now_detail);


        sb_demographic = (ScrollBanner) findViewById(R.id.sb_demographic);
        List<String> demographicsList=new ArrayList<String>();
        for(int i=0;i<20;i++){
            demographicsList.add("第"+i+"条内容");
        }
        sb_demographic.setList(demographicsList);
        sb_demographic.startScroll();




        String path ="/storage/emulated/0/video/gogo.mp4";
        //String path = Environment.getExternalStorageDirectory().getPath()+"/"+et.getText().toString();//获取视频路径
        Uri uri = Uri.parse(path);//将路径转换成uri
        //video.setVideoURI(uri);//为视频播放器设置视频路径
        video.setVideoURI(Uri.parse("http://2449.vod.myqcloud.com/2449_22ca37a6ea9011e5acaaf51d105342e3.f20.mp4"));// 网络视频
        video.setMediaController(new MediaController(MainActivity.this));//显示控制栏



        video.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {

            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.start();
                mp.setLooping(true);

            }
        });










        stuList=new ArrayList<Goods>();
        for(int i=0;i<5;i++){
            Goods stu=new Goods();
            stu.setNum(i+"");
            stu.setName("name"+i);
            stu.setGoods("goods");
            stu.setResult("合格");

            stuList.add(stu);
        }


        la =new ListAdapter(stuList,this);
        goods_list.setAdapter(la);






        detailList=new ArrayList<Detail>();
        for(int i=0;i<5;i++){
            Detail stu=new Detail();

            stu.setName("name"+i);
            stu.setQuanlity("1.000");
            stu.setPrize("10.00");
            stu.setMoney("10.00");
            detailList.add(stu);
        }


        dta =new DetailAdapter(detailList,this);
        now_detail.setAdapter(dta);







    }
    ListAdapter  la;
    DetailAdapter dta;
    public Uri getMediaUriFromPath(Context context, String path) {
        Uri mediaUri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
        Cursor cursor = context.getContentResolver().query(mediaUri,
                null,
                null,
                null,
                null);

        Uri uri = null;
        if(cursor.getCount()>0){
            for(int i=0;i<cursor.getCount();i++){
                cursor.moveToPosition(i);
                int index = cursor.getColumnIndex(MediaStore.Video.Media.DATA);
                if(index!=-1){
                    String path1 = cursor.getString(index);
                    Log.i("path1 ======>" ,path1);
                    if(path1.equals(path)){
                        uri = ContentUris.withAppendedId(mediaUri,
                                cursor.getLong(cursor.getColumnIndex(MediaStore.Video.Media._ID)));
                        return uri;
                    }
                }

            }
        }else{
            return null;
        }
        cursor.close();
        return null;

    }





}

package ye.fang;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.job.JobInfo;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.provider.ContactsContract;
import android.support.v7.widget.DialogTitle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.animation.SlideInRightAnimation;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.HorizontalBarChart;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;
import com.github.mikephil.charting.formatter.PercentFormatter;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;

import org.jetbrains.anko.DialogsKt;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Observable;
import java.util.Set;
import java.util.TreeMap;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import jp.wasabeef.recyclerview.animators.SlideInLeftAnimator;
import me.yuqirong.cardswipelayout.CardItemTouchHelperCallback;
import me.yuqirong.cardswipelayout.CardLayoutManager;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import ye.fang.ad.R;
import ye.fang.adapter.CommiteDataAdapter;
import ye.fang.adapter.DateTotalAdapter;
import ye.fang.adapter.DayCheckDataAdapter;
import ye.fang.adapter.DayCheckDataAdapter3;
import ye.fang.adapter.DayPriceAdapter;
import ye.fang.model.AcountInfo;
import ye.fang.model.DataTotalModel;
import ye.fang.model.DayCheck;
import ye.fang.model.DayCount;
import ye.fang.model.DayGoodPrice;
import ye.fang.model.DayReport;
import ye.fang.model.DayReportSum;
import ye.fang.model.DaylyPrice;
import ye.fang.model.MapKeyComparator;
import ye.fang.model.RankAll;
import ye.fang.model.ScalesModel;
import ye.fang.tool.CalendarDay;
import ye.fang.tool.Contants;
import ye.fang.tool.MapValueComparator;
import ye.fang.tool.ReRetrofitUntil;
import ye.fang.tool.SPUtils;
import ye.fang.tool.SendJson;
import ye.fang.tool.ToastUtils;
import ye.fang.wigth.AutoScrollRecyclerView;
import ye.fang.wigth.DialogBuilder;
import ye.fang.wigth.LoadingDialog;
import ye.fang.wigth.UpdateRecycle;

import static ye.fang.tool.Contants.BaseDeviceNo;
import static ye.fang.tool.Contants.BaseMarketName;
import static ye.fang.tool.Contants.BaseUrl;

public class MainStartActivity extends Activity implements UpdateRecycle {
    @BindView(R.id.tv_big_title)
    TextView tvBigTitle;
    @BindView(R.id.chartView2)
    BarChart chartView2;
    @BindView(R.id.chatview3)
    LineChart chatview3;
    @BindView(R.id.chatview4)
    HorizontalBarChart chatview4;
    Context context;
    LoadingDialog loadingDialog;
    @BindView(R.id.rel_commitdate)
    AutoScrollRecyclerView relCommitdate;
    @BindView(R.id.rel_check_data)
    AutoScrollRecyclerView relCheckData;
    @BindView(R.id.rel_history_check_data)
    AutoScrollRecyclerView relHistoryCheckData;
    @BindView(R.id.rel_price_date)
    AutoScrollRecyclerView relPriceDate;
    @BindView(R.id.tv_time)
    TextView tvTime;
    @BindView(R.id.re_data_total)
    RecyclerView reDataTotal;
    @BindView(R.id.chart_totle_datle)
    PieChart chartTotleDatle;
    Date date =new Date();
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd");
    Map<String, Double> totalgo = new TreeMap<String, Double>();//每日销售e走势
    Map<String, Double> totalrank = new TreeMap<String, Double>();//每日销售e走势
    double totalMoney=0.0;//每日销售
    int totalCount =0;
    DialogBuilder alertDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_main);
        ButterKnife.bind(this);
        context = this;
        loadingDialog = LoadingDialog.getInstance(context);
//        handler.sendEmptyMessageDelayed(0,10000);//截屏
        io.reactivex.Observable.interval(1000,TimeUnit.MILLISECONDS).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers
                        .mainThread())
                .subscribe(new Consumer<Long>() {
                    @Override
                    public void accept(Long aLong) throws Exception {
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                        date=new Date();
                        tvTime.setText(simpleDateFormat.format(date)+"  ");
                    }
                });
        alertDialog = new DialogBuilder(MainStartActivity.this);
        alertDialog.title("温馨提示!!").message("请填写配置文件").sureText("确定").setCancelable(false).setSureOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

//        alertDialog = new AlertDialog.Builder(MainStartActivity.this);
//        alertDialog.setTitle("温馨提示|");
//        alertDialog.setMessage("请填写配置文件");
//        alertDialog.setPositiveButton("确定", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialogInterface, int i) {
//                dialogInterface.dismiss();
//            }
//        });
        init();
    }

    public void init() {
          final String SD_PATH = "/sdcard/configapp/config.xml";
          final String IN_PATH = "/configapp/config.xml";
          String savePath="";
        if (Environment.getExternalStorageState().equals(
                Environment.MEDIA_MOUNTED)) {
            savePath = SD_PATH;
        } else {
            savePath = context.getApplicationContext().getFilesDir()
                    .getAbsolutePath()
                    + IN_PATH;
        }
        File file = new File(savePath);
        if(file.exists()){
            try {
                pullXml(file);
            } catch (Exception e) {
                e.printStackTrace();
            }
            getScales();
            tvBigTitle.setText(BaseMarketName);
        }else {
            alertDialog.build().show();
        }
    }

    public void getScales() {
        loadingDialog.show();
        Call<String> call = ReRetrofitUntil.getRetrofit().getScales(BaseDeviceNo);
        call.enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                loadingDialog.dismiss();
                if (null != response.body()) {
                    if(response.body().equals("null")){
                        Toast.makeText(MainStartActivity.this, "组织号查询失败，请请确认是否配置", Toast.LENGTH_SHORT).show();
                        return;
                    }
                    Gson gson = new Gson();
                    ScalesModel scalesModel = gson.fromJson(response.body().toString(), ScalesModel.class);
                    if(scalesModel!=null){
                        SPUtils.put(MainStartActivity.this, Contants.OrgId, scalesModel.getOrganizeId());
//                    reportCount();
//                    reportSum();

                        daySaleReport(true);
                        dayCheck();
                        historyDayCheck();
                        getHistoryMoneyData();
//                    dayPrices();
                    }
                }
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {
                loadingDialog.dismiss();
                ToastUtils.showToast(MainStartActivity.this,"网络连接错误");
                Log.e("ressseer", "ressseer" + t.getMessage());
//                Toast.makeText(MainActivity.this, "网络连接错误", Toast.LENGTH_SHORT).show();
            }
        });
    }

    /*每日价格统计*/
    public void reportCount() {
        loadingDialog.show();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

        Call<String> call = ReRetrofitUntil.getRetrofit().ReportCount(SendJson.sendData(simpleDateFormat.format(CalendarDay.getDate(-80)), simpleDateFormat.format(new Date())), "ScaleNumber", "desc", 10000);
        call.enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                loadingDialog.dismiss();
                if (null != response.body()) {
                    Gson gson = new Gson();
                    List<DaylyPrice> daylyPrices = gson.fromJson(response.body(), new TypeToken<List<DaylyPrice>>() {
                    }.getType());
                    Map<String, Double> studentMap = new TreeMap<String, Double>();
                    if (daylyPrices != null && daylyPrices.size() > 0) {
                        for (int i = 0; i < daylyPrices.size(); i++) {
                            if (studentMap.containsKey(daylyPrices.get(i).getOrderDate())) {
                                double numberList = studentMap.get(daylyPrices.get(i).getOrderDate());
                                numberList += daylyPrices.get(i).getRealMoney();
                                studentMap.put(daylyPrices.get(i).getOrderDate(), numberList);
                            } else {
                                double numberList2 = daylyPrices.get(i).getRealMoney();
                                studentMap.put(daylyPrices.get(i).getOrderDate(), numberList2);
                            }
                        }
                    }
//                    daytotle(studentMap);
//                    dataReport(daylyPrices);
                }
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {
                loadingDialog.dismiss();
                Log.e("ressseer", "ressseer" + t.getMessage());
//                Toast.makeText(MainActivity.this, "网络连接错误", Toast.LENGTH_SHORT).show();
            }
        });
    }
    /*今日销售统计*/
    List<DayReport> daylyPrices;
    List<DayReport> daylyttrices;
    Call<String> call;
    String text1="";
    public void daySaleReport(final boolean isshowdialog) {
        int dateleng = 10000;
        if(isshowdialog){
            loadingDialog.show();
        }
        date.setTime(date.getTime()+1000);
         Date nowdate = new Date();
        final String text2=simpleDateFormat.format(nowdate);

        if(isshowdialog){
            call = ReRetrofitUntil.getRetrofit().Report(SendJson.sendData3("",""), "OrderDate", "asc", dateleng);//首次进入
        }else {
            if(TextUtils.isEmpty(text1)){
                text1 = simpleDateFormat2.format(nowdate)+" 00:00:00";
            }
             call = ReRetrofitUntil.getRetrofit().Report(SendJson.sendData4(text1, text2), "ScaleNumber", "desc", dateleng);
        }
        call.enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                loadingDialog.dismiss();
                if (null != response.body()) {
                    Gson gson = new Gson();
                    daylyPrices = gson.fromJson(response.body(), new TypeToken<List<DayReport>>() {}.getType());
//                    Collections.sort(daylyPrices);
                    Map<String, Double> studentMap = totalgo;
                    if (daylyPrices != null && daylyPrices.size() > 0) {
                        for (int i = 0; i < daylyPrices.size(); i++) {
                            String saletime = daylyPrices.get(i).getOrderDate().substring(11, 13);
                            if (studentMap.containsKey(saletime)) {
                                double numberList = studentMap.get(saletime);
                                numberList += daylyPrices.get(i).getRealMoney();
                                studentMap.put(saletime, numberList);
                            } else {
                                double numberList2 = daylyPrices.get(i).getRealMoney();
                                studentMap.put(daylyPrices.get(i).getOrderDate().substring(11, 13), numberList2);
                            }
                        }
                    }
                    Map<String, Double> studentMapd = totalrank;
                    if (daylyPrices != null && daylyPrices.size() > 0) {
                        for (int i = 0; i < daylyPrices.size(); i++) {
                            if (studentMapd.containsKey(daylyPrices.get(i).getProductName())) {
                                double numberList = studentMapd.get(daylyPrices.get(i).getProductName());
                                numberList += 1.0;
                                studentMapd.put(daylyPrices.get(i).getProductName(), numberList);
                            } else {
                                double numberList2 = daylyPrices.get(i).getAmount();
                                studentMapd.put(daylyPrices.get(i).getProductName(), 1.0);
                            }
                        }
                        text1=daylyPrices.get(daylyPrices.size()-1).getOrderDate();
                        Date date2 = null;
                        try {
                            date2 = simpleDateFormat.parse(text1);
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                        date2.setTime(date2.getTime()+1000);
                        text1 =   simpleDateFormat.format(date2);
                    }
                    List<Map.Entry<String, Double>> entryList = new ArrayList<Map.Entry<String, Double>>(studentMapd.entrySet());
                    totalrank =studentMapd;

                    for (int i = 0; i < daylyPrices.size(); i++) {
                        totalMoney+=daylyPrices.get(i).getAmount();
                    }
                    if(daylyPrices.size()!=0){
                        saleTotle(studentMap);//每日销售走势
                        totalgo=studentMap;
                        rankTotle(entryList);//交易排行
                        commiteData(daylyPrices,isshowdialog);//及时成交
                        totalCount+=daylyPrices.size();
                        setTotalData(totalMoney+"",totalCount+"");//数据汇总
                    }
                    if(isshowdialog){
                        getBM();
                    }
                    senddate.sendEmptyMessageDelayed(1,2000);//关闭循环
                }
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {
                loadingDialog.dismiss();
                daySaleReport(true);
                Log.e("ressseer", "ressseer" + t.getMessage());
//                Toast.makeText(MainActivity.this, "网络连接错误", Toast.LENGTH_SHORT).show();
            }
        });
    }
Handler senddate = new Handler(){
    @Override
    public void handleMessage(Message msg) {
        super.handleMessage(msg);
//        daySaleReport(false);
    }
};
    /*每日交易商品排行*/
    public void reportSum() {
        loadingDialog.show();
        Call<String> call = ReRetrofitUntil.getRetrofit().ReportSum(SendJson.sendData3("", ""), "ProductName", "desc", 10000);
        call.enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                loadingDialog.dismiss();
                if (null != response.body()) {
                    Gson gson = new Gson();
                    List<DayReportSum> daylyPrices = gson.fromJson(response.body(), new TypeToken<List<DayReportSum>>() {
                    }.getType());
                    Map<String, Double> studentMap = new TreeMap<String, Double>();
                    if (daylyPrices != null && daylyPrices.size() > 0) {
                        for (int i = 0; i < daylyPrices.size(); i++) {
                            if (studentMap.containsKey(daylyPrices.get(i).getProductName())) {
                                double numberList = studentMap.get(daylyPrices.get(i).getProductName());
                                numberList += 1.0;
                                studentMap.put(daylyPrices.get(i).getProductName(), numberList);
                            } else {
                                double numberList2 = daylyPrices.get(i).getAmount();
                                studentMap.put(daylyPrices.get(i).getProductName(), 1.0);
                            }
                        }

                    }
//                    daytotle(studentMap);
                    List<Map.Entry<String, Double>> entryList = new ArrayList<Map.Entry<String, Double>>(studentMap.entrySet());
                    Collections.sort(entryList, new MapValueComparator());
//                    rankTotle(entryList);
                }
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {
                loadingDialog.dismiss();
                Log.e("ressseer", "ressseer" + t.getMessage());
//                Toast.makeText(MainActivity.this, "网络连接错误", Toast.LENGTH_SHORT).show();
            }
        });
    }

    /*每日检测*/
    public List<DayCheck> dayChecks;
    public void dayCheck() {
        loadingDialog.show();
        Call<ArrayList<DayCheck>> call = ReRetrofitUntil.getRetrofit().AccessAccount(SendJson.sendData("",""));
        call.enqueue(new Callback<ArrayList<DayCheck>>() {
            @Override
            public void onResponse(Call<ArrayList<DayCheck>> call, Response<ArrayList<DayCheck>> response) {
                loadingDialog.dismiss();
                if (null != response.body()) {
//                    Gson gson = new Gson();
//                    List<DayCheck> daylyPrices = gson.fromJson(response.body(), new TypeToken<List<DayCheck>>() {
//                    }.getType());
                    dayChecks =response.body();
                    if(dayChecks==null|dayChecks.size()==0){
                        return;
                    }
                    checkData(dayChecks);
                }
            }

            @Override
            public void onFailure(Call<ArrayList<DayCheck>> call, Throwable t) {
                loadingDialog.dismiss();
                Log.e("ressseer", "ressseer" + t.getMessage());
//                Toast.makeText(MainActivity.this, "网络连接错误", Toast.LENGTH_SHORT).show();
            }
        });
    }
    /*历史检测*/
    public List<DayCheck> histordayChecks;
    public void historyDayCheck() {
        loadingDialog.show();
        Calendar now = Calendar.getInstance();
        now.add(Calendar.DAY_OF_MONTH, -3);
        String endDate = new SimpleDateFormat("yyyy-MM-dd").format(now.getTime());
        String nowday = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        Call<ArrayList<DayCheck>> call = ReRetrofitUntil.getRetrofit().AccessAccount(SendJson.sendData(endDate,nowday));
        call.enqueue(new Callback<ArrayList<DayCheck>>() {
            @Override
            public void onResponse(Call<ArrayList<DayCheck>> call, Response<ArrayList<DayCheck>> response) {
                loadingDialog.dismiss();
                if (null != response.body()) {
//                    Gson gson = new Gson();
//                    List<DayCheck> daylyPrices = gson.fromJson(response.body(), new TypeToken<List<DayCheck>>() {
//                    }.getType());
                    histordayChecks =response.body();
                    if(histordayChecks==null|histordayChecks.size()==0){
                        return;
                    }
                    historyCheckData(histordayChecks);
                }
            }

            @Override
            public void onFailure(Call<ArrayList<DayCheck>> call, Throwable t) {
                loadingDialog.dismiss();
                Log.e("ressseer", "ressseer" + t.getMessage());
//                Toast.makeText(MainActivity.this, "网络连接错误", Toast.LENGTH_SHORT).show();
            }
        });
    }
    /*每日单价*/
    List<DayGoodPrice> daylyPricess;
    public void dayPrices() {
        loadingDialog.show();
        Call<String> call = ReRetrofitUntil.getRetrofit().getPlu((String) SPUtils.get(Contants.OrgId, ""), "{}", "PLUID", "desc", 10000);
        String cvvv = (String) SPUtils.get(Contants.OrgId, "");
        call.enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                loadingDialog.dismiss();
                if (null != response.body()) {
                    Gson gson = new Gson();
                    daylyPricess = gson.fromJson(response.body(), new TypeToken<List<DayGoodPrice>>() {
                    }.getType());
                    dayPrice(daylyPricess);
                }
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {
                loadingDialog.dismiss();
                Log.e("ressseer", "ressseer" + t.getMessage());
//                Toast.makeText(MainActivity.this, "网络连接错误", Toast.LENGTH_SHORT).show();
            }
        });
    }
    /*日销售额统计*/
    public void daytotle(Map<String, Double> studentMap) {
        chartView2.getDescription().setEnabled(false);
        // if more than 60 entries are displayed in the chart, no values will be
        // drawn
        chartView2.setMaxVisibleValueCount(60);
        chartView2.setDoubleTapToZoomEnabled(false);
        // scaling can now only be done on x- and y-axis separately
        chartView2.setPinchZoom(false);
//        ValueFormatter custom = new MyValueFormatter("$");
        chartView2.setDrawBarShadow(false);
        chartView2.setDrawGridBackground(false);
        XAxis xAxis = chartView2.getXAxis();
        chartView2.getAxisLeft().setTextColor(getResources().getColor(R.color.white));
        chartView2.getAxisRight().setTextColor(getResources().getColor(R.color.white));
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setTextColor(getResources().getColor(R.color.white));
        xAxis.setGranularity(1);
        xAxis.setDrawGridLines(false);
        chartView2.getAxisLeft().setDrawGridLines(false);
        // add a nice and smooth animation
        chartView2.animateY(1500);
        chartView2.getLegend().setEnabled(false);
        ArrayList<BarEntry> values = new ArrayList<>();
        if (studentMap == null) {
//            values.add(new BarEntry(0, 40));
//            values.add(new BarEntry(1, 20));
//            values.add(new BarEntry(2, 30));
//            values.add(new BarEntry(3, 40));
//            values.add(new BarEntry(4, 50));
//            values.add(new BarEntry(5, 60));
//            values.add(new BarEntry(6, 70));
        } else {
            Set<String> stringSet = studentMap.keySet();
            final ArrayList<String> datat = new ArrayList<>();
            for (String s : stringSet) {
                datat.add(s);
            }
            for (int i = 0; i < studentMap.size(); i++) {
                double d = studentMap.get(datat.get(i));
                values.add(new BarEntry(i, (float) d));
            }
            xAxis.setValueFormatter(new IAxisValueFormatter() {
                @Override
                public String getFormattedValue(float v, AxisBase axisBase) {
                    return datat.get((int) v).substring(8,10)+"号";
                }
            });
        }
        BarDataSet set1;
        if (chartView2.getData() != null &&
                chartView2.getData().getDataSetCount() > 0) {
            set1 = (BarDataSet) chartView2.getData().getDataSetByIndex(0);
            set1.setValues(values);
            set1.setValueTextColor(getResources().getColor(R.color.white));
            chartView2.getData().notifyDataChanged();
            chartView2.notifyDataSetChanged();
        } else {
            set1 = new BarDataSet(values, "Data Set");
            set1.setColors(ColorTemplate.VORDIPLOM_COLORS);
            set1.setDrawValues(false);

            ArrayList<IBarDataSet> dataSets = new ArrayList<>();
            dataSets.add(set1);

            BarData data = new BarData(dataSets);
            chartView2.setData(data);
            chartView2.setFitBars(true);
        }
        chartView2.invalidate();
    }

    /*每日统计*/
    public void saleTotle(Map<String, Double> datte) {
        chatview3.getDescription().setEnabled(false);

        // enable touch gestures
        chatview3.setTouchEnabled(true);
        chatview3.animateXY(1500, 1500);
        chatview3.setDragDecelerationFrictionCoef(0.9f);
        // enable scaling and dragging
        chatview3.setDragEnabled(true);
        chatview3.setScaleEnabled(false);
        chatview3.setDrawGridBackground(false);
        chatview3.setHighlightPerDragEnabled(false);
        chatview3.getXAxis().setTextColor(getResources().getColor(R.color.white));
        chatview3.getAxisLeft().setTextColor(getResources().getColor(R.color.white));
        chatview3.getAxisRight().setTextColor(getResources().getColor(R.color.white));
        // if disabled, scaling can be done on x- and y-axis separately
        chatview3.setPinchZoom(true);
        chatview3.getLegend().setTextColor(getResources().getColor(R.color.white));
        chatview3.getXAxis().setValueFormatter(new IAxisValueFormatter() {
            @Override
            public String getFormattedValue(float v, AxisBase axisBase) {
                int in=(int) v;
               String dot = (v -in)*60+"";
//              String fir = dot.split("/.")[0];
//               if(fir.length()<2){
//                   return in+":0"+fir+"";
//               }
                return in+":"+dot.substring(0,2)+"";
            }
        });
        ArrayList<Entry> values1 = new ArrayList<>();
        Set<String> stringss = datte.keySet();
        for (String s : stringss) {
            double dat = datte.get(s);
            values1.add(new Entry(Integer.valueOf(s), (float) dat));
        }
//        values1.add(new Entry(0, 100));
//        values1.add(new Entry(1, 300));
//        values1.add(new Entry(2, 200));
//        values1.add(new Entry(3, 400));
//        values1.add(new Entry(4, 600));
//        values1.add(new Entry(5, 700));
//        values1.add(new Entry(6, 200));
//        values1.add(new Entry(7, 100));

        if (chatview3.getData() != null) {
            LineDataSet set1 = (LineDataSet) chatview3.getData().getDataSetByIndex(0);
            set1.setValues(values1);
            chatview3.getData().notifyDataChanged();
            chatview3.notifyDataSetChanged();
        } else {
            // create a dataset and give it a type
            LineDataSet set1 = new LineDataSet(values1, "销售统计（元）");
            set1.setAxisDependency(YAxis.AxisDependency.LEFT);
            set1.setColor(ColorTemplate.getHoloBlue());
            set1.setCircleColor(Color.WHITE);
            set1.setValueTextColor(Color.WHITE);
            set1.setLineWidth(2f);
            set1.setCircleRadius(3f);
            set1.setFillAlpha(65);
            set1.setFillColor(ColorTemplate.getHoloBlue());
            set1.setHighLightColor(Color.rgb(244, 117, 117));
            set1.setDrawCircleHole(false);
            LineData data = new LineData(set1);
            chatview3.setData(data);
        }
    }

    /*销售排行*/
    ArrayList<RankAll> allArrayList;
    public void rankTotle(final List<Map.Entry<String, Double>> datte) {
        if(datte==null||datte.size()==0){
            return;
        }
        allArrayList  = new ArrayList<>();
        for (int i = 0; i < datte.size(); i++) {
            RankAll rankAll = new RankAll(datte.get(i).getKey(),datte.get(i).getValue());
            allArrayList.add(rankAll);
        }
        Collections.sort(allArrayList);
        Collections.reverse(allArrayList);
        chatview4.setDrawBarShadow(false);
        chatview4.getDescription().setEnabled(false);
        // if more than 60 entries are displayed in the chart, no values will be
        // drawn
        chatview4.setMaxVisibleValueCount(60);
        chatview4.setDoubleTapToZoomEnabled(false);
        // scaling can now only be done on x- and y-axis separately
        chatview4.setPinchZoom(false);
//        ValueFormatter custom = new MyValueFormatter("$");
        chatview4.setDrawBarShadow(false);
        chatview4.setDrawGridBackground(false);
        XAxis xAxis = chatview4.getXAxis();
        chatview4.getAxisLeft().setTextColor(getResources().getColor(R.color.white));
        chatview4.getAxisRight().setTextColor(getResources().getColor(R.color.white));
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setTextColor(getResources().getColor(R.color.white));
        xAxis.setDrawGridLines(false);
        chatview4.getAxisLeft().setDrawGridLines(false);
        // add a nice and smooth animation
        chatview4.animateY(0);
        chatview4.getLegend().setEnabled(false);
        ArrayList<BarEntry> values = new ArrayList<>();
//        for (int i = 0; i < 7; i++) {
            for(int i=0;i<allArrayList.size();i++){
                if(i<7){
                    double dass = allArrayList.get(i).getValue();
                    values.add(new BarEntry(i, (float) dass));
                }
            }
//        }
        xAxis.setValueFormatter(new IAxisValueFormatter() {
            @Override
            public String getFormattedValue(float v, AxisBase axisBase) {
                return allArrayList.get((int)v).getName();
            }
        });
//        values.add(new BarEntry(0, 10));
//        values.add(new BarEntry(1, 20));
//        values.add(new BarEntry(2, 30));
//        values.add(new BarEntry(3, 40));
//        values.add(new BarEntry(4, 50));
//        values.add(new BarEntry(5, 60));
//        values.add(new BarEntry(6, 70));
        BarDataSet set1;
        if (chatview4.getData() != null &&
                chatview4.getData().getDataSetCount() > 0) {
            set1 = (BarDataSet) chatview4.getData().getDataSetByIndex(0);
            set1.setValues(values);
            set1.setValueTextColor(getResources().getColor(R.color.white));
            chatview4.getData().notifyDataChanged();
            chatview4.notifyDataSetChanged();
        } else {
            set1 = new BarDataSet(values, "Data Set");
            set1.setColors(ColorTemplate.VORDIPLOM_COLORS);
            set1.setValueTextColor(Color.WHITE);
            set1.setDrawValues(false);
            ArrayList<IBarDataSet> dataSets = new ArrayList<>();
            dataSets.add(set1);

            BarData data = new BarData(dataSets);
            chatview4.setData(data);
            chatview4.setFitBars(true);
        }

        chatview4.invalidate();
    }
    CommiteDataAdapter commiteDataAdapter;
    /*及时成交*/
    public void commiteData(List<DayReport> dayReports,boolean isshowdialog) {
//        Collections.reverse(dayReports);
        Collections.sort(dayReports);
        if(isshowdialog){
        relCommitdate.setLayoutManager(new LinearLayoutManager(MainStartActivity.this));
        commiteDataAdapter = new CommiteDataAdapter();
//        commiteDataAdapter.setAnimation(new SlideInRightAnimation());
        relCommitdate.setUpdateIns(this);
        commiteDataAdapter.setNewData(dayReports);
        relCommitdate.setAdapter(commiteDataAdapter);
        relCommitdate.start();
        }else {
            if(commiteDataAdapter!=null){
                for (int i = 0; i <dayReports.size() ; i++) {
                    commiteDataAdapter.addData(dayReports.get(i));
                }
                commiteDataAdapter.notifyDataSetChanged();
            }else {
                relCommitdate.setLayoutManager(new LinearLayoutManager(MainStartActivity.this));
                commiteDataAdapter = new CommiteDataAdapter();
                relCommitdate.setUpdateIns(this);
                commiteDataAdapter.setNewData(dayReports);
                relCommitdate.setAdapter(commiteDataAdapter);
                relCommitdate.start();
            }
        }

    }

    /*每日监测*/
    public void checkData(List<DayCheck> dayReports) {
        relCheckData.setLayoutManager(new LinearLayoutManager(MainStartActivity.this));
        DayCheckDataAdapter commiteDataAdapter = new DayCheckDataAdapter();
//        commiteDataAdapter.openLoadAnimation(BaseQuickAdapter.SLIDEIN_RIGHT);
        commiteDataAdapter.setNewData(dayReports);
        relCheckData.setAdapter(commiteDataAdapter);
        relCheckData.setUpdateIns(this);
        relCheckData.start();
    }
    /*历史监测*/
    public void historyCheckData(List<DayCheck> dayReports) {
        List<List<DayCheck>> dss = dividerList(dayReports, new Comparator<DayCheck>() {
            @Override
            public int compare(DayCheck dayCheck, DayCheck t1) {
                return dayCheck.getBillData().substring(0, 10).equals(t1.getBillData().substring(0, 10)) ? 0 : 1;
            }
        });
        List<DayCheck> dayCheckList = new ArrayList<>();
        Log.e("", "");
        for (int i = 0; i < dss.size(); i++) {
            String data = dss.get(i).get(0).getBillData().substring(0, 10);
            DayCheck dayCheck = new DayCheck();
            dayCheck.setType(1);
            dayCheck.setCheckDate(data);
            dayCheckList.add(dayCheck);
            dayCheckList.addAll(dss.get(i));
        }

        relHistoryCheckData.setLayoutManager(new LinearLayoutManager(MainStartActivity.this));
        final DayCheckDataAdapter3 commiteDataAdapter = new DayCheckDataAdapter3(dayCheckList);
//        commiteDataAdapter.openLoadAnimation(BaseQuickAdapter.SLIDEIN_RIGHT);
//        commiteDataAdapter.setDuration(3000);
//        commiteDataAdapter.isFirstOnly(false);
        relHistoryCheckData.setAdapter(commiteDataAdapter);
        relHistoryCheckData.start();

//        CardItemTouchHelperCallback cardCallback = new CardItemTouchHelperCallback(relHistoryCheckData.getAdapter(), dayCheckList);
//        ItemTouchHelper touchHelper = new ItemTouchHelper(cardCallback); CardLayoutManager cardLayoutManager = new CardLayoutManager(relHistoryCheckData, touchHelper);
//        relHistoryCheckData.setLayoutManager(cardLayoutManager);
//        touchHelper.attachToRecyclerView(relHistoryCheckData);
//        relHistoryCheckData.smoothScrollToPosition(1);
    }
    public static <T> List<List<T>> dividerList(List<T> list, Comparator<? super T> comparator) {
        List<List<T>> lists = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            boolean isContain = false;
            for (int j = 0; j < lists.size(); j++) {
                if (lists.get(j).size() == 0 || comparator.compare(lists.get(j).get(0), list.get(i)) == 0) {
                    lists.get(j).add(list.get(i));
                    isContain = true;
                    break;
                }
            }
            if (!isContain) {
                List<T> newList = new ArrayList<>();
                newList.add(list.get(i));
                lists.add(newList);
            }
        }
        return lists;
    }
    /*每日单价*/
    public void dayPrice(List<DayGoodPrice> dayReports) {
        relPriceDate.setLayoutManager(new LinearLayoutManager(MainStartActivity.this));
        DayPriceAdapter commiteDataAdapter = new DayPriceAdapter();
        commiteDataAdapter.setAnimation(new SlideInRightAnimation());
        relPriceDate.setAdapter(commiteDataAdapter);
        relPriceDate.setUpdateIns(this);
        for (int i = 0; i < dayReports.size(); i++) {
            commiteDataAdapter.addData(dayReports.get(i));
        }
        relPriceDate.start();
    }
    public void dataReport(List<DaylyPrice> daylyPrices){
        DaylyPrice daylyPrice = null;
        if(null!=daylyPrices&&daylyPrices.size()>0){
            daylyPrice=daylyPrices.get(0);
        }else {
            daylyPrice = new DaylyPrice();
            daylyPrice.setCardMoney(0.0);
            daylyPrice.setCardMoney1(0.0);
//            daylyPrice.setCardMoney2(0.0);
//            daylyPrice.setCardMoney3(0.0);
        }
        List<PieEntry> strings = new ArrayList<>();
//        double totle = daylyPrice.getSumoverCardMoney3()+daylyPrice.getSumoverCardMoney2()+daylyPrice.getSumoverCardMoney1()+daylyPrice.getSumoverCardMoney();
        strings.add(new PieEntry((float)(80),"水果类"));
        strings.add(new PieEntry((float)(20),"肉类"));
//        strings.add(new PieEntry((float)(daylyPrice.getSumoverCardMoney2()*100/totle),"金额3"));
//        strings.add(new PieEntry((float)(daylyPrice.getSumoverCardMoney3()*100/totle),"金额4"));
        PieDataSet dataSet = new PieDataSet(strings,"");
        dataSet.setValueTextColor(Color.BLACK);
        ArrayList<Integer> colors = new ArrayList<Integer>();
        colors.add(getResources().getColor(R.color.pankred));
        colors.add(getResources().getColor(R.color.dankred));
//        colors.add(getResources().getColor(R.color.deepcolor));
//        colors.add(getResources().getColor(R.color.yellow));
        dataSet.setColors(colors);
        PieData pieData = new PieData(dataSet);
        pieData.setDrawValues(true);
        pieData.setValueFormatter(new PercentFormatter());
//        pieData.setValueTextSize(12f);
        pieData.setValueTextColor(Color.WHITE);
        chartTotleDatle.setData(pieData);
        chartTotleDatle.setDrawHoleEnabled(false);
        chartTotleDatle.setTransparentCircleRadius(50f);
        chartTotleDatle.setRotationEnabled(false);
//        Description description = new Description();
//        description.setText("");
//        chartTotleDatle.setDescription(description);
//        chartTotleDatle.setHoleRadius(0f);
        chartTotleDatle.setExtraOffsets(0.0f,0.0f,0.0f,0.0f);
//        chartTotleDatle.animateY(1500);
//        chartTotleDatle.setTransparentCircleRadius(0f);
//        chartTotleDatle.setCenterTextColor(Color.WHITE);
//        chartTotleDatle.getLegend().setEnabled(false);
//        chartTotleDatle.setEntryLabelColor(Color.WHITE);

        chartTotleDatle.invalidate();
    }

    @Override
    protected void onStop() {
        super.onStop();
        relCheckData.stop();
        relCommitdate.stop();
        relPriceDate.stop();
    }

    @Override
    public void updateAll(int type) {
        if(type==0){
            relCheckData.smoothScrollToPosition(0);
        }
        if(type==1){
            relCommitdate.smoothScrollToPosition(0);
        }
            if(type==2){
                relPriceDate.smoothScrollToPosition(0);
            }
            if(type==3){
            relHistoryCheckData.smoothScrollToPosition(0);
            }
//        commiteData(daylyPrices);
//        checkData(dayChecks);
//        dayPrice(daylyPricess);
    }

    DateTotalAdapter dateTotalAdapter;
    public void setTotalData(String... data){
        dateTotalAdapter = new DateTotalAdapter();
        BigDecimal decimal = new BigDecimal(data[0]);
      BigDecimal decimal12=  decimal.setScale(2,RoundingMode.UP);
        DataTotalModel dataTotalModel = new DataTotalModel(R.drawable.totalmoney,decimal12.toString(),"交易金额");
        dateTotalAdapter.addData(dataTotalModel);
        DataTotalModel dataTotalMode2 = new DataTotalModel(R.drawable.cus_total,data[1],"交易笔数");
        dateTotalAdapter.addData(dataTotalMode2);
        DataTotalModel dataTotalMode3 = new DataTotalModel(R.drawable.cus_total2,data[1],"客流量");
        dateTotalAdapter.addData(dataTotalMode3);
        DataTotalModel dataTotalMode4 = new DataTotalModel(R.drawable.cus_total,decimal12.toString(),"商户数量");
        dateTotalAdapter.addData(dataTotalMode4);

//        DataTotalModel dataTotalMode5 = new DataTotalModel(R.drawable.totalmoney,decimal12.toString(),"交易金额");
//        dateTotalAdapter.addData(dataTotalMode5);
//        DataTotalModel dataTotalMode6 = new DataTotalModel(R.drawable.cus_total,data[1],"交易笔数");
//        dateTotalAdapter.addData(dataTotalMode6);
//        DataTotalModel dataTotalMode7 = new DataTotalModel(R.drawable.cus_total2,data[1],"客流量");
//        dateTotalAdapter.addData(dataTotalMode7);
//        DataTotalModel dataTotalMode8 = new DataTotalModel(R.drawable.cus_total,decimal12.toString(),"商户数量");
//        dateTotalAdapter.addData(dataTotalMode8);


        reDataTotal.setLayoutManager(new GridLayoutManager(MainStartActivity.this,3));
        reDataTotal.setAdapter(dateTotalAdapter);
    }
    public void getBM(){
        Call<String> call = ReRetrofitUntil.getRetrofit().BManagementController();
       call.enqueue(new Callback<String>() {
           @Override
           public void onResponse(Call<String> call, Response<String> response) {
               if(null==response.body()){
                   return;
               }
               Gson gsons = new Gson();
               JsonParser parser = new JsonParser();
               JsonArray Jarray = parser.parse(response.body().toString()).getAsJsonArray();
               ArrayList<AcountInfo> lcs = new ArrayList<AcountInfo>();
               for (JsonElement obj : Jarray) {
                   AcountInfo cse = gsons.fromJson(obj, AcountInfo.class);
                   if(cse.getMarketName().equals(BaseMarketName))
                   lcs.add(cse);
               }
               if(dateTotalAdapter!=null){
                   dateTotalAdapter.getItem(3).setTypeup(lcs.size()+"");
                   dateTotalAdapter.notifyDataSetChanged();
               }
           }

           @Override
           public void onFailure(Call<String> call, Throwable throwable) {

           }
       });
    };
    /*
    * 获取历史销售额
    * */
    String startTime="";
    String endTime="";
    int count =0;
    Map<String,Double> maps = new HashMap<>();
    public void getHistoryMoneyData(){
        maps.clear();
                    Date date=new Date();//取时间
            Calendar calendar = new GregorianCalendar();
            calendar.setTime(date);
            calendar.add(calendar.DATE,-1);//把日期往后增加一天.整数往后推,负数往前移动
            date=calendar.getTime(); //这个时间就是日期往后推一天的结果
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            String dateString1 = formatter.format(date);
            calendar.add(calendar.DATE,-1);//把日期往后增加一天.整数往后推,负数往前移动
            date=calendar.getTime(); //这个时间就是日期往后推一天的结果
            String dateString2 = formatter.format(date);
        calendar.add(calendar.DATE,-1);//把日期往后增加一天.整数往后推,负数往前移动
        date=calendar.getTime(); //这个时间就是日期往后推一天的结果
        String dateString3 = formatter.format(date);
        calendar.add(calendar.DATE,-1);//把日期往后增加一天.整数往后推,负数往前移动
        date=calendar.getTime(); //这个时间就是日期往后推一天的结果
        String dateString4 = formatter.format(date);
        calendar.add(calendar.DATE,-1);//把日期往后增加一天.整数往后推,负数往前移动
        date=calendar.getTime(); //这个时间就是日期往后推一天的结果
        String dateString5 = formatter.format(date);
        calendar.add(calendar.DATE,-1);//把日期往后增加一天.整数往后推,负数往前移动
        date=calendar.getTime(); //这个时间就是日期往后推一天的结果
        String dateString6 = formatter.format(date);
        calendar.add(calendar.DATE,-1);//把日期往后增加一天.整数往后推,负数往前移动
        date=calendar.getTime(); //这个时间就是日期往后推一天的结果
        String dateString7 = formatter.format(date);
        maps.put(dateString1.substring(0,10),0.0);
        maps.put(dateString2.substring(0,10),0.0);
        maps.put(dateString3.substring(0,10),0.0);
        maps.put(dateString4.substring(0,10),0.0);
        maps.put(dateString5.substring(0,10),0.0);
        maps.put(dateString6.substring(0,10),0.0);
        maps.put(dateString7.substring(0,10),0.0);
        String[] datas={dateString1,dateString2,dateString3,dateString4,dateString5,dateString6,dateString7};
        io.reactivex.Observable.fromArray(datas)
                .subscribeOn(AndroidSchedulers.mainThread())
                .observeOn(Schedulers.io())
                .subscribe(new Consumer<String>() {
            @Override
            public void accept(String integer) throws Exception {
                Call<ArrayList<DayCount>> ds = ReRetrofitUntil.getRetrofit().ReportOrder(SendJson.sendData5(integer,integer), "ProductName", "desc",1);
                ds.enqueue(callback);
            }
        });


    }
    Callback<ArrayList<DayCount>> callback = new Callback<ArrayList<DayCount>>() {
    @Override
    public void onResponse(Call<ArrayList<DayCount>> call, Response<ArrayList<DayCount>> response) {
        count++;
  if(response.body().size()>0){
      maps.put(response.body().get(0).getOrderDate().substring(0,10),response.body().get(0).getSumoverAmount());
    }
    if(count==7){
        Map<String, Double> sortMap = new TreeMap<String, Double>(
                new MapKeyComparator());
        sortMap.putAll(maps);
        daytotle(sortMap);
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                dataReport(null);//显示饼状图
            }
        });
    }
    }

    @Override
    public void onFailure(Call<ArrayList<DayCount>> call, Throwable throwable) {

    }
};
public void pullXml(File file) throws IOException, XmlPullParserException {
    try {
        FileInputStream fileInputStream =new FileInputStream(file);
        XmlPullParser xmlPullParser = Xml.newPullParser();
        xmlPullParser.setInput(fileInputStream,"utf-8");
        try {
           while (xmlPullParser.getEventType()!=XmlPullParser.END_DOCUMENT){
               String tagname = xmlPullParser.getName();
           switch (xmlPullParser.getEventType()){
               case  XmlPullParser.START_TAG:
                     if(tagname.equals("info")){}
                  else if(tagname.equals("uid")){
                         BaseDeviceNo =xmlPullParser.nextText();
                     }
                  else if(tagname.equals("ipaddress")){
                         BaseUrl =xmlPullParser.nextText();
                     }
                  else if(tagname.equals("marketName")){
                         BaseMarketName =xmlPullParser.nextText();
                     }
                   break;
               case  XmlPullParser.END_TAG:

                   break;
               default:
                   break;
           }
           xmlPullParser.next();
           }
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        }
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }
}
    @Override
    protected void onDestroy() {
        if(null!=loadingDialog){
            loadingDialog.dismiss();
        }
        super.onDestroy();
    }
    public void capture(Activity activity) throws IOException {
        final String SD_PATH = "/sdcard/configapp/";
        final String IN_PATH = "/configapp/";
        String savePath;
        File filePic;
        if (Environment.getExternalStorageState().equals(
                Environment.MEDIA_MOUNTED)) {
            savePath = SD_PATH;
        } else {
            savePath = activity.getApplicationContext().getFilesDir()
                    .getAbsolutePath()
                    + IN_PATH;
        }
        filePic = new File(savePath+"aa.png");
        activity.getWindow().getDecorView().setDrawingCacheEnabled(true);
        Bitmap bmp = activity.getWindow().getDecorView().getDrawingCache();
        if (!filePic.exists()) {
            filePic.getParentFile().mkdirs();
            filePic.createNewFile();
        }
        FileOutputStream fos = new FileOutputStream(filePic);
        bmp.compress(Bitmap.CompressFormat.JPEG, 100, fos);
        fos.flush();
        fos.close();

    }
    Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            try {
                capture(MainStartActivity.this);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    };
}

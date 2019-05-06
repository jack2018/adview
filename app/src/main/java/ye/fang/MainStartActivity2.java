package ye.fang;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.animation.SlideInRightAnimation;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import ye.fang.ad.R;
import ye.fang.adapter.CommiteDataAdapter;
import ye.fang.adapter.DayCheckDataAdapter2;
import ye.fang.adapter.DayCheckDataAdapter3;
import ye.fang.adapter.DayPriceAdapter2;
import ye.fang.model.DayCheck;
import ye.fang.model.DayGoodPrice;
import ye.fang.model.DayReport;
import ye.fang.model.ScalesModel;
import ye.fang.tool.Contants;
import ye.fang.tool.ReRetrofitUntil;
import ye.fang.tool.RecycleScrollTools;
import ye.fang.tool.SPUtils;
import ye.fang.tool.SendJson;
import ye.fang.wigth.LoadingDialog;
import ye.fang.wigth.ShineTextView;

import static ye.fang.tool.Contants.BaseDeviceNo;

public class MainStartActivity2 extends Activity {
    @BindView(R.id.tctt)
    ShineTextView tctt;
    @BindView(R.id.rel_price_date)
    RecyclerView relPriceDate;
    @BindView(R.id.rel_check_day)
    RecyclerView relCheckDay;
    @BindView(R.id.rel_check_history)
    RecyclerView relCheckHistory;
    @BindView(R.id.rel_start_service)
    RecyclerView relStartService;
    Context context;
    LoadingDialog loadingDialog;
    @BindView(R.id.rel_time_tran)
    RecyclerView relTimeTran;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_main2);
        ButterKnife.bind(this);
        context = this;
        loadingDialog = LoadingDialog.getInstance(context);
        getScales();
    }

    public void getScales() {
        loadingDialog.show();
        Call<String> call = ReRetrofitUntil.getRetrofit().getScales(BaseDeviceNo);
        call.enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                loadingDialog.dismiss();
                if (null != response.body()) {
                    Gson gson = new Gson();
                    ScalesModel scalesModel = gson.fromJson(response.body().toString(), ScalesModel.class);
                    SPUtils.put(MainStartActivity2.this, Contants.OrgId, scalesModel.getOrganizeId());
                    dayPrices();
                    dayCheck();
                    daySaleReport();
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

    /*每日单价*/
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
                    List<DayGoodPrice> daylyPrices = gson.fromJson(response.body(), new TypeToken<List<DayGoodPrice>>() {
                    }.getType());
                    dayPrice(daylyPrices);
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

    /*每日单价数据处理*/
    public void dayPrice(List<DayGoodPrice> dayReports) {
        relPriceDate.setLayoutManager(new LinearLayoutManager(MainStartActivity2.this));
        DayPriceAdapter2 commiteDataAdapter = new DayPriceAdapter2();
        commiteDataAdapter.openLoadAnimation(BaseQuickAdapter.SLIDEIN_LEFT);
        commiteDataAdapter.setDuration(3000);
        commiteDataAdapter.isFirstOnly(false);
        relPriceDate.setAdapter(commiteDataAdapter);
        for (int i = 0; i < dayReports.size(); i++) {
            commiteDataAdapter.addData(dayReports.get(i));
        }
        RecycleScrollTools.getInstance().addRecycleView(relPriceDate);
    }

    /*每日检测*/
    public void dayCheck() {
        loadingDialog.show();
        Call<ArrayList<DayCheck>> call = ReRetrofitUntil.getRetrofit().AccessAccount(SendJson.sendData("2019-01-01", "2019-01-31"));
        call.enqueue(new Callback<ArrayList<DayCheck>>() {
            @Override
            public void onResponse(Call<ArrayList<DayCheck>> call, Response<ArrayList<DayCheck>> response) {
                loadingDialog.dismiss();
                if (null != response.body()) {
                    checkData(response.body());
                }
            }

            @Override
            public void onFailure(Call<ArrayList<DayCheck>> call, Throwable t) {
                loadingDialog.dismiss();
                Log.e("ressseer", "ressseer" + t.getMessage());
            }
        });
    }

    /*每日监测*/
    public void checkData(List<DayCheck> dayReports) {
        relCheckDay.setLayoutManager(new LinearLayoutManager(MainStartActivity2.this));
        DayCheckDataAdapter2 commiteDataAdapter = new DayCheckDataAdapter2();
        commiteDataAdapter.openLoadAnimation(BaseQuickAdapter.SLIDEIN_RIGHT);
        commiteDataAdapter.setDuration(3000);
        commiteDataAdapter.isFirstOnly(false);
        commiteDataAdapter.setNewData(dayReports);
        relCheckDay.setAdapter(commiteDataAdapter);
        checkData2(dayReports);
    }

    /*不合格监测*/
    public void checkData2(List<DayCheck> dayReports) {
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

        relCheckHistory.setLayoutManager(new LinearLayoutManager(MainStartActivity2.this));
        DayCheckDataAdapter3 commiteDataAdapter = new DayCheckDataAdapter3(dayCheckList);
        commiteDataAdapter.openLoadAnimation(BaseQuickAdapter.SLIDEIN_RIGHT);
        commiteDataAdapter.setDuration(3000);
        commiteDataAdapter.isFirstOnly(false);
        relCheckHistory.setAdapter(commiteDataAdapter);
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

    /*今日销售统计*/
    public void daySaleReport() {
        loadingDialog.show();
        Call<String> call = ReRetrofitUntil.getRetrofit().Report(SendJson.sendData3("", ""), "ScaleNumber", "desc", 10000);
        String ss = SendJson.sendData("", "");
        call.enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                loadingDialog.dismiss();
                if (null != response.body()) {
                    Gson gson = new Gson();
                    List<DayReport> daylyPrices = gson.fromJson(response.body(), new TypeToken<List<DayReport>>() {
                    }.getType());
                    Map<String, Double> studentMap = new TreeMap<String, Double>();
                    if (daylyPrices != null && daylyPrices.size() > 0) {
                        for (int i = 0; i < daylyPrices.size(); i++) {
                            String saletime = daylyPrices.get(i).getOrderDate().substring(11, 13);
                            if (studentMap.containsKey(saletime)) {
                                double numberList = studentMap.get(saletime);
                                numberList += daylyPrices.get(i).getAmount();
                                studentMap.put(saletime, numberList);
                            } else {
                                double numberList2 = daylyPrices.get(i).getAmount();
                                studentMap.put(daylyPrices.get(i).getOrderDate().substring(11, 13), numberList2);
                            }
                        }

                    }
                    commiteData(daylyPrices);
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

    /*及时成交*/
    public void commiteData(List<DayReport> dayReports) {
        relTimeTran.setLayoutManager(new LinearLayoutManager(MainStartActivity2.this));
        CommiteDataAdapter commiteDataAdapter = new CommiteDataAdapter();
        commiteDataAdapter.openLoadAnimation(BaseQuickAdapter.SLIDEIN_RIGHT);
        commiteDataAdapter.setDuration(3000);
        commiteDataAdapter.isFirstOnly(false);
        commiteDataAdapter.setNewData(dayReports);
        relTimeTran.setAdapter(commiteDataAdapter);
        RecycleScrollTools.getInstance().addRecycleView(relTimeTran);
    }
}

package ye.fang.tool;

import java.lang.reflect.Array;
import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import ye.fang.model.DayCheck;
import ye.fang.model.DayCount;

public interface GetDataApi {
    @GET("api/Scales")
    Call<String> getScales(@Query("MachineCode") String repo);

    @GET("api/ReportCount")
    Call<String> ReportCount(@Query("queryJson") String queryJson, @Query("sidx") String sidx, @Query("sord") String sord, @Query("rows") int rows);

    @GET("api/ReportSum")
    Call<String> ReportSum(@Query("queryJson") String queryJson, @Query("sidx") String sidx, @Query("sord") String sord, @Query("rows") int rows);

    @GET("api/Report")
    Call<String> Report(@Query("queryJson") String queryJson, @Query("sidx") String sidx, @Query("sord") String sord, @Query("rows") int rows);

    @GET("api/ReportOrder")
    Call<ArrayList<DayCount>> ReportOrder(@Query("queryJson") String queryJson, @Query("sidx") String sidx, @Query("sord") String sord, @Query("rows") int rows);

    @GET("api/AccessAccount")
    Call<ArrayList<DayCheck>> AccessAccount(@Query("queryJson") String organizeId);

    @GET("api/PLU")
    Call<String> getPlu(@Query("OrganizeId") String organizeId, @Query("queryJson") String queryJson, @Query("sidx") String sidx, @Query("sord") String sord, @Query("rows") int rows);

    @GET("api/ReportSum")
    Call<String> ReportSum(@Query("queryJson") String queryJson, @Query("sidx") String sidx, @Query("sord") String sord);


    @GET("api/Report")
    Call<String> Report(@Query("queryJson") String queryJson, @Query("sidx") String sidx, @Query("sord") String sord);

    @GET("api/ReportDay")
    Call<String> ReportDay(@Query("queryJson") String queryJson, @Query("sidx") String sidx, @Query("sord") String sord);

    @GET("api/Member")
    Call<String> Member(@Query("queryJson") String queryJson);

    @GET("api/BManagementController")
    Call<String> BManagementController();

    @GET("api/Activity")
    Call<String> getActivity();

    @GET("api/Market")
    Call<String> Market();


    @GET("api/AccessAccount")
    Call<String> AccessAccount();

    @GET("api/DataItemList")
    Call<String> DataItemList();

    @GET("api/DataItemDetail")
    Call<String> DataItemDetail(@Query("itemId") String itemId);

    @GET("api/StockCommodity")
    Call<String> StockCommodity(@Query("queryJson") String itemId, @Query("rows") String rows, @Query("sidx") String sidx);

}

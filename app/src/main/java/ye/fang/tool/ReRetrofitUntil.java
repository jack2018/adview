package ye.fang.tool;

import android.os.Environment;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

import static ye.fang.tool.Contants.BaseUrl;


public class ReRetrofitUntil {
    public static GetDataApi getRetrofit(){
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
//设置日志Level
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);
        File httpCacheDirectory = new File(Environment.getExternalStorageDirectory()+File.separator+"cache", "Mark");
        Cache cache = null;
        try {
            cache = new Cache(httpCacheDirectory, 1 * 1024 * 1024);
        } catch (Exception e) {
            Log.e("OKHttp", "Could not create http cache", e);
        }
        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(logging)
                .cache(cache)
                .connectTimeout(60, TimeUnit.SECONDS)
                .readTimeout(60, TimeUnit.SECONDS)
                .writeTimeout(60, TimeUnit.SECONDS).build();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BaseUrl)
                //增加返回值为Gson的支持(以实体类返回)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(client)
                .build();
        GetDataApi getDataApi = retrofit.create(GetDataApi.class);
        return getDataApi;
    }
    public static <T> List<T> gsonListObject(String data , Class<T> classOfT){
        Gson gson = new Gson();
        JsonParser parser = new JsonParser();
        JsonArray Jarray = parser.parse(data).getAsJsonArray();
        ArrayList<T> lcs = new ArrayList<>();
        for(JsonElement obj : Jarray ){
            T cse = gson.fromJson( obj , classOfT);
            lcs.add(cse);
        }
                return lcs;
    }
}

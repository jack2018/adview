package ye.fang.tool;

import android.text.TextUtils;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by 18650 on 2019/1/19.
 */

public class SendJson {
    public static String sendData(String beginDay,String endDay){
        JSONObject jsonObject = new JSONObject();
        JSONObject jsonObject2= new JSONObject();
        try {
            jsonObject.put("ResourceId",SPUtils.get("orgid",""));
            JSONArray jsonArray = new JSONArray();
            jsonArray.put(jsonObject);
            jsonObject2.put("Organizejson",jsonArray);
            jsonObject2.put("Category","1");

            Date date = new Date();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            if(TextUtils.isEmpty(beginDay)){
                jsonObject2.put("StartTime",simpleDateFormat.format(date));
                jsonObject2.put("EndTime",simpleDateFormat.format(date));
            }else {
                jsonObject2.put("StartTime",beginDay);
                jsonObject2.put("EndTime",endDay);
            }
            jsonObject2.put("Organizejson",jsonArray);
            jsonObject2.put("Category","1");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jsonObject2.toString();
    }
    public static String sendData2(String beginDay,String endDay){
//        JSONObject jsonObject = new JSONObject();
        JSONObject jsonObject2= new JSONObject();
        try {
//            jsonObject.put("ResourceId",SPUtils.get("orgid",""));
//            JSONArray jsonArray = new JSONArray();
//            jsonArray.put(jsonObject);
//            jsonObject2.put("Organizejson",jsonArray);
            Date date = new Date();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            if(TextUtils.isEmpty(beginDay)){
                jsonObject2.put("StartTime",simpleDateFormat.format(date));
                jsonObject2.put("EndTime",simpleDateFormat.format(date));
            }else {
                jsonObject2.put("StartTime",beginDay);
                jsonObject2.put("EndTime",endDay);
            }
            jsonObject2.put("Category","1");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jsonObject2.toString();
    }
    public static String sendData3(String beginDay,String endDay){
        JSONObject jsonObject = new JSONObject();
        JSONObject jsonObject2= new JSONObject();
        try {
            jsonObject.put("ResourceId",SPUtils.get("orgid",""));
            JSONArray jsonArray = new JSONArray();
            jsonArray.put(jsonObject);
            jsonObject2.put("Organizejson",jsonArray.toString());
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date date = new Date();
            if(TextUtils.isEmpty(beginDay)){
                jsonObject2.put("StartTime",simpleDateFormat.format(date));
                jsonObject2.put("EndTime",simpleDateFormat.format(date));
            }else {
                jsonObject2.put("StartTime",beginDay);
                jsonObject2.put("EndTime",endDay);
            }
            jsonObject2.put("Category","1");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jsonObject2.toString();
    }

    public static String sendData4(String beginDay,String endDay){
        JSONObject jsonObject = new JSONObject();
        JSONObject jsonObject2= new JSONObject();
        try {
            jsonObject.put("ResourceId",SPUtils.get("orgid",""));
            JSONArray jsonArray = new JSONArray();
            jsonArray.put(jsonObject);
            jsonObject2.put("Organizejson",jsonArray.toString());
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date date = new Date();
            if(TextUtils.isEmpty(beginDay)){
                jsonObject2.put("StartDateTime",simpleDateFormat.format(date));
                jsonObject2.put("EndDateTime",simpleDateFormat.format(date));
            }else {
                jsonObject2.put("StartDateTime",beginDay);
                jsonObject2.put("EndDateTime",endDay);
            }
            jsonObject2.put("Category","1");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jsonObject2.toString();
    }

    public static String sendData5(String beginDay,String endDay){
        JSONObject jsonObject = new JSONObject();
        JSONObject jsonObject2= new JSONObject();
        try {
            jsonObject.put("ResourceId",SPUtils.get("orgid",""));
            JSONArray jsonArray = new JSONArray();
            jsonArray.put(jsonObject);
            jsonObject2.put("Organizejson",jsonArray.toString());
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date date = new Date();
            if(TextUtils.isEmpty(beginDay)){
                jsonObject2.put("StartDateTime",simpleDateFormat.format(date));
                jsonObject2.put("EndDateTime",simpleDateFormat.format(date));
            }else {
                jsonObject2.put("StartDateTime",beginDay+" 00:00:00");
                jsonObject2.put("EndDateTime",endDay+" 23:59:59");
            }
            jsonObject2.put("Category","1");
            jsonObject2.put("DateType","hour");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jsonObject2.toString();
    }
}

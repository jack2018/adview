package recoginze.sdl.com.configapp;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.UUID;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {
    String Uid="";
    EditText et_ipaddress;
    EditText et_mart_name;
    String regex = "^([hH][tT]{2}[pP]:/*|[hH][tT]{2}[pP][sS]:/*|[fF][tT][pP]:/*)(([A-Za-z0-9-~]+).)+([A-Za-z0-9-~\\/])+(\\?{0,1}(([A-Za-z0-9-~]+\\={0,1})([A-Za-z0-9-~]*)\\&{0,1})*)$";
    private static String generateFileName() {
        return UUID.randomUUID().toString();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Uid =getUniqueID();
        TextView tv_uuid = findViewById(R.id.tv_uuid);
        tv_uuid.setText(Uid);
        et_ipaddress = findViewById(R.id.et_ipaddress);
        et_mart_name = findViewById(R.id.et_mart_name);
        PermissionsUtils.checkPermissions(this, Manifest.permission.CAMERA, Manifest.permission.READ_EXTERNAL_STORAGE,Manifest.permission.WRITE_EXTERNAL_STORAGE);
//      boolean is=  PermissionsUtils.checkPermissions(this, Manifest.permission.CAMERA, Manifest.permission.READ_EXTERNAL_STORAGE,Manifest.permission.WRITE_EXTERNAL_STORAGE);
//       TextView tv_uuid = findViewById(R.id.tv_uuid);
//       tv_uuid.setText(getUniqueID());//大唐市场
        findViewById(R.id.btn_check).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String ipadd =et_ipaddress.getText().toString();
                    String markName =et_mart_name.getText().toString();
if(TextUtils.isEmpty(ipadd)||TextUtils.isEmpty(markName)){
    Toast.makeText(MainActivity.this, "请先填写完善信息", Toast.LENGTH_SHORT).show();
}else {
   Pattern pattern = Pattern.compile(regex);
   if(pattern.matcher(ipadd).matches()){
       Thread thread = new Thread(){
           @Override
           public void run() {
               binddata();
           }
       };
       thread.start();
       saveFile(MainActivity.this,Uid,et_ipaddress.getText().toString(),et_mart_name.getText().toString());
   }else {
       Toast.makeText(MainActivity.this, "网址输入错误", Toast.LENGTH_SHORT).show();
   }
}
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        checkFile(MainActivity.this);
    }
    public  String getUniqueID() {
        //获得独一无二的Psuedo ID
        String serial = null;

        String m_szDevIDShort = "35" +
                Build.BOARD.length() % 10 + Build.BRAND.length() % 10 +

                Build.CPU_ABI.length() % 10 + Build.DEVICE.length() % 10 +

                Build.DISPLAY.length() % 10 + Build.HOST.length() % 10 +

                Build.ID.length() % 10 + Build.MANUFACTURER.length() % 10 +

                Build.MODEL.length() % 10 + Build.PRODUCT.length() % 10 +

                Build.TAGS.length() % 10 + Build.TYPE.length() % 10 +

                Build.USER.length() % 10; //13 位

        try {
            serial = android.os.Build.class.getField("SERIAL").get(null).toString();
            //API>=9 使用serial号
            return new UUID(m_szDevIDShort.hashCode(), serial.hashCode()).toString();
        } catch (Exception exception) {
            //serial需要一个初始化
            serial = "serial"; // 随便一个初始化
        }
        //使用硬件信息拼凑出来的15位号码
        return new UUID(m_szDevIDShort.hashCode(), serial.hashCode()).toString();
    }
    private  final String SD_PATH = "/sdcard/configapp/";
    private  final String IN_PATH = "/configapp/";

    public void checkFile(Context context){
        String savePath;
        File filePic;
        if (Environment.getExternalStorageState().equals(
                Environment.MEDIA_MOUNTED)) {
            savePath = SD_PATH;
        } else {
            savePath = context.getApplicationContext().getFilesDir()
                    .getAbsolutePath()
                    + IN_PATH;
        }
        filePic = new File(savePath+"config.xml");
        if(filePic.exists()){
            try {
                pullXml(filePic);
            } catch (IOException e) {
                e.printStackTrace();
            } catch (XmlPullParserException e) {
                e.printStackTrace();
            }
        }
    }

    public  void saveFile(Context context,String Uid,String IPAddress,String MarketName) throws IOException {
        String savePath;
        File filePic;
        if (Environment.getExternalStorageState().equals(
                Environment.MEDIA_MOUNTED)) {
            savePath = SD_PATH;
        } else {
            savePath = context.getApplicationContext().getFilesDir()
                    .getAbsolutePath()
                    + IN_PATH;
        }
        XmlSerializer xmlSerializer = Xml.newSerializer();
        filePic = new File(savePath+"config.xml");
        if(!filePic.exists()){
            filePic.getParentFile().mkdir();
            filePic.createNewFile();
        }else {
            Log.e("","");
        }
        FileOutputStream fileOutputStream = new FileOutputStream(filePic);
//       FileOutputStream fileOutputStream = openFileOutput(savePath+"config.xml",Context.MODE_PRIVATE);
        xmlSerializer.setOutput(fileOutputStream, "UTF-8");
        xmlSerializer.startDocument("UTF-8", true);
        xmlSerializer.startTag(null, "info");

        xmlSerializer.startTag(null,"uid");
        xmlSerializer.text(Uid);
        xmlSerializer.endTag(null,"uid");

        xmlSerializer.startTag(null,"ipaddress");
        xmlSerializer.text(IPAddress);
        xmlSerializer.endTag(null,"ipaddress");

        xmlSerializer.startTag(null,"marketName");
        xmlSerializer.text(MarketName);
        xmlSerializer.endTag(null,"marketName");


        xmlSerializer.endTag(null,"info");
        xmlSerializer.endDocument();
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(MainActivity.this, "信息配置成功", Toast.LENGTH_SHORT).show();
            }
        });
    }

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
//                                BaseDeviceNo =xmlPullParser.nextText();
                            }
                            else if(tagname.equals("ipaddress")){
                                et_ipaddress.setText(xmlPullParser.nextText());
                            }
                            else if(tagname.equals("marketName")){
                                et_mart_name.setText(xmlPullParser.nextText());
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
    Socket socket;
public void binddata(){
     String data ="DWL\tINF\t\r\nINF\t"+0+"\t"+0+"\t"+0+"\tADS-30上得利(测试版)\t1\t6\t"+Uid+"\t"+0+"\t\r\nEND\tINF\t\r\n";
     Log.e("uuid","uidshen"+Uid);
     byte databyte[] = data.getBytes();
    try {// 创建一个Socket对象，并指定服务端的IP及端口号
        socket = new Socket();
        SocketAddress socAddress = new InetSocketAddress("www.abcd-123.com", 9527);
        // 创建一个InputStream用户读取要发送的文件。
        socket.connect(socAddress,5000);
        OutputStream outputStream = socket.getOutputStream();
        InputStream inputStream =  socket.getInputStream();
        // 创建一个byte类型的buffer字节数组，用于存放读取的本地文件
        byte buffer[] = new byte[1 * 1024];
        int temp = 0;
        // 循环读取文件
//        while ((temp = inputStream.read(buffer)) != -1) {
            // 把数据写入到OuputStream对象中
            outputStream.write(databyte, 0, databyte.length);
//        }
        // 发送读取的数据到服务端
        outputStream.flush();
        while ((temp= inputStream.read(buffer))!=-1){
           String das = new String(buffer,"GBK");
             runOnUiThread(new Runnable() {
                 @Override
                 public void run() {
                     Toast.makeText(MainActivity.this, "绑定成功", Toast.LENGTH_SHORT).show();
                 }
             });
//            socket.close();
        }
        /** 或创建一个报文，使用BufferedWriter写入,看你的需求 **/
//          String socketData = "[2143213;21343fjks;213]";
//          BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
//                  socket.getOutputStream()));
//          writer.write(socketData.replace("\n", " ") + "\n");
//          writer.flush();
        /************************************************/
    } catch (UnknownHostException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }
}

    @Override
    protected void onDestroy() {
    if(socket!=null) {
        try {
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
        super.onDestroy();
    }

    public static String toHexString1(byte[] b){
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < b.length; ++i){
            buffer.append(toHexString1(b[i]));
        }
        return buffer.toString();
    }
    public static String toHexString1(byte b){
        String s = Integer.toHexString(b & 0xFF);
        if (s.length() == 1){
            return "0" + s;
        }else{
            return s;
        }
    }

}

package URL_Connection.Client;

import okhttp3.*;
import java.io.IOException;

public class OK_Client {
    static public void main(String[] agrs) throws IOException {
        /*
        //线程发送请求，同步
        new Thread(new Runnable () {
            @Override
            public void run() {

                try {
                    OkHttpClient client = new OkHttpClient();
                    Request request = new Request.Builder()
                            .url("http://127.0.0.1:8080/demo") //通过url()方法设定目标的网络地址
                            .build();
                    Response response = client.newCall(request).execute();
                    String responseData = response.body().string();

                } catch(Exception e)
                {
                    e.printStackTrace();
                }
            }
        }).start();

         */

/*
//异步创建
        String url = "http://127.0.0.1:8080/demo";
//1,创建OKhttpClient对象
        OkHttpClient mOkHttpClient = new OkHttpClient();
//2,创建Request
        RequestBody formBody = new FormBody.Builder()
                .add("CommandName","APP0102")
                .add("version", "1")
                .add("appType", "Android")
                .add("userName", "admin")
                .add("password", "1")
                .build();

        Request request = new Request.Builder().url(url).post(formBody).build();
        //3，创建call对象并将请求对象添加到调度中
        mOkHttpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                Log.e("测试", e+"");
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {

            }

        });


 */
        OkHttpClient okHttpClient = new OkHttpClient();
        /*
        发送json数据
         */
        //HashMap<String> paramMap = new HashMap<>();
        //paramMap.put("city","shanghai");
        //paramMap.put("appkey","338720");

        String reqStr="Visiting Server Test (ok_client)";
        System.out.println("Sending Message:"+reqStr);//发送报文
        Request request = new Request.Builder()
                .addHeader("content-type", "application/json")
                .url("http://127.0.0.1:8080/demo")
                .post(RequestBody.create(MediaType.parse("application/json; charset=utf-8"),reqStr))
                .build();
        Response response = okHttpClient.newCall(request).execute();
        System .out.println("Return code (ok_client):" +response.code()) ;//返回状态码
        String result = okHttpClient.newCall(request).execute().body().string();

        System.out.println(result);
    }
}

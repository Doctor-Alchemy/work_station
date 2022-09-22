package URL_Connection.Client;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class URL_Client
{
    static public void main(String[] agrs)
    {
        //线程来发送请求
        new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                HttpURLConnection httpURLConnection = null;
                BufferedReader reader = null;
                try
                {
                    String reqStr="Visiting Server Test (url_client)";//测试练习
                    URL url = new URL("http://127.0.0.1:8080/demo");
                    httpURLConnection = (HttpURLConnection) url.openConnection();
                    httpURLConnection.setRequestMethod("POST");
                    // 设置是否向httpUrlConnection输出，因为这个是post请求，参数要放在
                    // http正文内，因此需要设为true, 默认情况下是false;
                    httpURLConnection.setDoOutput(true);
                    // 设置是否从httpUrlConnection读入，默认情况下是true;
                    httpURLConnection.setDoInput(true);
                    // Post 请求不能使用缓存
                    httpURLConnection.setUseCaches(false);
                    httpURLConnection.setConnectTimeout(8000);
                    httpURLConnection.setReadTimeout(8000);
                    //httpURLConnection.getResponseCode() ;//得到状态码

                    // // 建立连接
                    // httpURLConnection.connect();
                    // 此处getOutputStream会隐含的进行connect(即：如同调用上面的connect()方法，
                    // 所以在开发中不调用上述的connect()也可以)。
                    DataOutputStream out = new DataOutputStream(httpURLConnection.getOutputStream());
                    // 消息包中 发送数据
                    out.writeBytes(reqStr);
                    System.out.println("Sending Message:"+reqStr);//发送报文
                    // 接收数据，读取数据
                    InputStream in = httpURLConnection.getInputStream();
                    reader = new BufferedReader(new InputStreamReader(in));
                    StringBuilder read = new StringBuilder();
                    String line;
                    while((line = reader.readLine()) != null)
                    {
                        read.append(line);
                    }
                    line = read.toString();
                    System.out.println("Return code (url_client):" +httpURLConnection.getResponseCode());//返回的状态码

                }catch (Exception e)
                { }
            }
        }).start();
    }

}

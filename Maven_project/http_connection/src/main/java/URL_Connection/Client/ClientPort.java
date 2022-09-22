package URL_Connection.Client;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.StringRequestEntity;
import org.apache.commons.httpclient.methods.multipart.MultipartRequestEntity;
import org.apache.commons.httpclient.methods.multipart.Part;
import org.apache.commons.httpclient.params.HttpConnectionManagerParams;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * Hello world!
 *
 */
public class ClientPort
{
    private static final Logger logger = LoggerFactory.getLogger(ClientPort.class);
    public static void main( String[] args ) throws MalformedURLException {
        //String url="http://127.0.0.1:8080/demo";
        URL url = new URL("http://127.0.0.1:8080/demo");
        String reqStr="Visiting Server Test";//测试练习
        String contentType="application/json";
        String charset="UTF-8";
        String ss=doPost(String.valueOf(url),  reqStr,  contentType,  charset) ;
        System.out.println("return thing:" +ss);//返回内容
    }
    /**
     * 执行一个HTTP POST请求，返回请求响应的HTML
     *
     * @param url     请求的URL地址
     * @param reqStr  请求的查询参数,可以为null
     * @param charset 字符集
     * @return 返回请求响应的HTML
     */
    public static String doPost(String url, String reqStr, String contentType, String charset) {
        System.out.println("Sending Message:"+reqStr);//发送报文
        HttpClient client = new HttpClient();
        PostMethod method = new PostMethod(url);

        // HttpURLConnection  urlConnection = (HttpURLConnection) url.openConnection();
        try {
            HttpConnectionManagerParams managerParams = client.getHttpConnectionManager().getParams();
            managerParams.setConnectionTimeout(30000); // 设置连接超时时间(单位毫秒)
            managerParams.setSoTimeout(30000); // 设置读数据超时时间(单位毫秒)

            method.setRequestEntity(new StringRequestEntity(reqStr, contentType, "UTF-8"));

            client.executeMethod(method);
            System.out.println("Return code:" +method.getStatusCode());//返回的状态码
            if (method.getStatusCode() == HttpStatus.SC_OK) {
               String resultStr= IOUtils.toString(method.getResponseBodyAsStream(),"UTF-8");
                System.out.println("resultStr:"+resultStr);
               return resultStr;

            }
        } catch (UnsupportedEncodingException e1) {
            logger.error(e1.getMessage());
            return "";
        } catch (IOException e) {
            logger.error("执行HTTP Post请求" + url + "时，发生异常！" + e.toString());
            return "";
        } finally {
            method.releaseConnection();
        }
        return null;
    }
    /**
     * 执行一个HTTP POST请求，返回请求响应的HTML
     *
     * @param url     请求的URL地址
     * @param reqStr  请求的查询参数,可以为null
     * @param charset 字符集
     * @return 返回请求响应的HTML
     */
    public static String doPostMuStr(String url, Part[] reqStr) {
        HttpClient client = new HttpClient();

        PostMethod method = new PostMethod(url);
        try {
            HttpConnectionManagerParams managerParams = client.getHttpConnectionManager().getParams();
            managerParams.setConnectionTimeout(30000); // 设置连接超时时间(单位毫秒)
            managerParams.setSoTimeout(30000); // 设置读数据超时时间(单位毫秒)
//            method.getParams().setParameter(HttpMethodParams.HTTP_CONTENT_CHARSET, "utf-8");
            method.setRequestEntity(new MultipartRequestEntity(reqStr, method.getParams()));
//            method.setContentChunked(true);
            client.executeMethod(method);
            System.out.println("Return code:" +method.getStatusCode());//返回的状态码
            if (method.getStatusCode() == HttpStatus.SC_OK) {
                return IOUtils.toString(method.getResponseBodyAsStream(),"UTF-8");
            }
        } catch (UnsupportedEncodingException e1) {
            logger.error(e1.getMessage());
            return "";
        } catch (IOException e) {
            logger.error("执行HTTP Post请求" + url + "时，发生异常！" + e.toString());
            return "";
        } finally {
            method.releaseConnection();
        }
        return null;
    }
}



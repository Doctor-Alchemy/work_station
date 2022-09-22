package com.test;

import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.URI;


public class HttpHandlerDemo   implements HttpHandler{

    @Override
    public void handle(HttpExchange httpExchange) throws IOException {
        //请求地址
        InetSocketAddress inetSocketAddress=httpExchange.getRemoteAddress();
        System.out.println("Request ip adress:"+inetSocketAddress);//请求ip地址
        System.out.println("Request host:"+inetSocketAddress.getHostName());//请求host
        System.out.println("Request port (1/2):"+inetSocketAddress.getPort());//请求port
        //请求方式
        String requestMethod=httpExchange.getRequestMethod();
        System.out.println("Request way:"+httpExchange.getRequestMethod());//请求方式
        //url
        URI url=httpExchange.getRequestURI();
        System.out.println("url:"+url);
        if(requestMethod.equalsIgnoreCase("GET")){//客户端的请求是get方法
            //设置服务端响应的编码格式，否则在客户端收到的可能是乱码
            Headers responseHeaders = httpExchange.getResponseHeaders();
            responseHeaders.set("Content-Type", "text/html;charset=UTF-8");

            //在这里通过httpExchange获取客户端发送过来的消息
            //URI url = httpExchange.getRequestURI();
            //InputStream requestBody = httpExchange.getRequestBody();

            String response = "this is server";

            httpExchange.sendResponseHeaders(HttpURLConnection.HTTP_OK, response.getBytes("UTF-8").length);

            OutputStream responseBody = httpExchange.getResponseBody();
            OutputStreamWriter writer = new OutputStreamWriter(responseBody, "UTF-8");
            writer.write(response);
            writer.close();
            responseBody.close();
        }
        else {
            //请求报文
            InputStream inputStream=httpExchange.getRequestBody();
            ByteArrayOutputStream  bas=new ByteArrayOutputStream();
            int i;
            while((i=inputStream.read())!=-1) {
                bas.write(i);
            }
            String requestmsg=bas.toString();
            System.out.println("Request Message:"+requestmsg);//请求报文

            //返回报文
            String resmsg=" Congratulations on your success!";//成功
            httpExchange.sendResponseHeaders(HttpURLConnection.HTTP_OK,resmsg.getBytes("UTF-8").length );
            OutputStream outputStream=httpExchange.getResponseBody();
            outputStream.write(resmsg.getBytes("UTF-8"));
            outputStream.close();
            System.out.println("Communication is over!");//通讯结束
        }
        System.out.println();
    }

}


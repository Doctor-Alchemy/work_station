package com.test.httpserver;

import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.*;
import java.net.InetSocketAddress;

public class httpServerRturnJson {
    public static void main(String[] arg) throws Exception {
        HttpServer server = HttpServer.create(new InetSocketAddress(8001), 0);
        server.createContext("/post", new BasicPostHttpHandler());
        // 使用默认的 excutor
        server.setExecutor(null);
        server.start();
    }
}
class BasicPostHttpHandler implements HttpHandler{

    @Override
    public void handle(HttpExchange httpExchange) throws IOException {

        InputStream is = httpExchange.getRequestBody();

        String requestData = is2string(is);
        //System.out.println("request: " + requestData);
        String response = "{\"pid\":\"0007078\",\"pname\":\"savitar\"}";   // 有时候没法出这个结果
        // String response = "hello world";  // 同上
        System.out.println("response: " + response);
        is.close();

        Headers headers = httpExchange.getResponseHeaders();
        headers.set("Content-Type", "application/json; charset=utf-8");
        headers.set("Access-Control-Allow-Origin", "*");
        headers.set("Access-Control-Allow-Methods","GET,POST,PUT,DELETE,OPTIONS");
        headers.set("Access-Control-Allow-Headers", "Origin,X-Requested-With,Content-Type,Accept");

        httpExchange.sendResponseHeaders(200, response.getBytes().length);
        OutputStream os = httpExchange.getResponseBody();
        os.write(response.getBytes());
        os.close();
    }

    private String is2string(InputStream is) throws IOException {
        final int bufferSize = 1024;
        final char[] buffer = new char[bufferSize];
        final StringBuilder out = new StringBuilder();
        Reader in = new InputStreamReader(is, "UTF-8");

        for (; ; ) {
            int rsz = in.read(buffer, 0, buffer.length);
            if (rsz < 0)
                break;
            out.append(buffer, 0, rsz);
        }
        return out.toString();
    }

}



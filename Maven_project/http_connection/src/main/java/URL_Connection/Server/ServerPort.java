package URL_Connection.Server;


import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ServerPort {
    //启动端口
    private static final int port=8080;
    private static final String Httpcontext="/demo";
    private static final int nThreads=8;
    public static void main(String[] args) {

        HttpServer httpServer;
        try {
            httpServer=HttpServer.create(new InetSocketAddress(port),0);
            httpServer.createContext(Httpcontext,new httpDemo() );
            //			设置并发数
            ExecutorService  executor=Executors.newFixedThreadPool(nThreads);
            httpServer.setExecutor(executor);
            httpServer.start();
            System.out.println("enable port:"+port);//启动端口
            System.out.println("root node:"+Httpcontext);//根节点
            System.out.println("concurrency:"+nThreads);//并发数
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println();
    }

}



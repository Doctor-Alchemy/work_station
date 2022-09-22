package com.test;

import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadHttpServer {
    //启动端口
    private static final int port1=8080;
    private static final int port2=8880;
    private static final String Httpcontext="/demo";
    private static final int nThreads=8;
    public static void main(String[] args) {
        /*
        HttpServer httpServer;
        try {
            httpServer=HttpServer.create(new InetSocketAddress(port),0);
            httpServer.createContext(Httpcontext,new HttpHandlerDemo() );
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
         */
        ThreadHttpServer server =new ThreadHttpServer() ;
        server.Server1() ;
        server.Server2() ;
    }


    public void Server1(){
        HttpServer httpServer1;
        try {
            httpServer1=HttpServer.create(new InetSocketAddress(port1),0);
            httpServer1.createContext(Httpcontext,new HttpHandlerDemo() );
            //			设置并发数
            ExecutorService  executor=Executors.newFixedThreadPool(nThreads);
            httpServer1.setExecutor(executor);
            httpServer1.start();
            System.out.println("enable port1:"+port1);//启动端口
            System.out.println("root node:"+Httpcontext);//根节点
            System.out.println("concurrency:"+nThreads);//并发数
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println();
    }
    public void Server2(){
        HttpServer httpServer2;
        try {
            httpServer2=HttpServer.create(new InetSocketAddress(port2),0);
            httpServer2.createContext(Httpcontext,new HttpHandlerDemo() );
            //			设置并发数
            ExecutorService  executor=Executors.newFixedThreadPool(nThreads);
            httpServer2.setExecutor(executor);
            httpServer2.start();
            System.out.println("enable port2:"+port2);//启动端口
            System.out.println("root node:"+Httpcontext);//根节点
            System.out.println("concurrency:"+nThreads);//并发数
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println();
    }
}


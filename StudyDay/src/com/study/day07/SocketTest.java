package com.study.day07;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author 梁世龙
 * @create 2019-02-15 14:42
 * 网络编程
 * InetAddress：表示互联网（或局域网）的一台主机的地址
 */
public class SocketTest {

    @Test
    public void testSocket() throws IOException {
        InetAddress address =InetAddress.getByName("127.0.0.1");
        Socket socket = new Socket(address,8989);
        InputStream is = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is));
        System.out.println(bufferedReader.readLine());

        is.close();
        bufferedReader.close();
        socket.close();
    }

    @Test
    public void testInetAddress() throws UnknownHostException {
        InetAddress address =InetAddress.getByName("www.baidu.com");
        System.out.println(address);//www.baidu.com/115.239.210.27  输出域名/IP
    }

    @Test
    public void testServerSocket() throws IOException {
        ServerSocket serverSocket = new ServerSocket(8989);
        //随时接受请求
        Socket socket = serverSocket.accept();

        OutputStream os = socket.getOutputStream();
        PrintWriter printWriter = new PrintWriter(os);
        printWriter.write("来自服务端的问候。。。");

        printWriter.close();
        os.close();

        socket.close();
        serverSocket.close();
    }
}

package com.study.day07;

import org.junit.Test;

import java.io.*;

/**
 * @author 梁世龙
 * @create 2019-01-24 16:18
 */
public class IoTest {

    /**
     * File：代表物理意义的文件或者目录
     *
     *
     */
    @Test
   public void testFile(){
        //创建文件
        File file = new File("C:\\Users\\Administrator\\Desktop\\mongodb总业务量.txt");
        //判断文件名
        String fileName =file.getName();
        System.out.println(fileName);

        //访问文件的绝对路径
        String path = file.getAbsolutePath();
        System.out.println(path);

        //文件检测
        System.out.println(file.exists());

        //获取文件信息
        System.out.println(file.length());

   }

   @Test
   public void testReader() throws IOException {
        //利用字符输入流读取文档的内容，输出到控制台
       Reader reader = new FileReader("C:\\Users\\Administrator\\Desktop\\mongodb总业务量.txt");

       char[] buffer = new char[10];
       int len = 0;

       while ((len = reader.read(buffer))!=-1){
           for (int i=0;i<len;i++){
               System.out.print(buffer[i]);
           }
       }

       reader.close();
   }

   @Test
   public void testOutputStream()throws IOException {
        OutputStream out = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\123.txt");
        String content = "www.lsl.com\nHello!";
        out.write(content.getBytes());
        out.close();
   }

   @Test
    public void testCopeFile() throws IOException {
        //创建定位到hello.txt的文件的输入流
        InputStream in = new FileInputStream("C:\\Users\\Administrator\\Desktop\\mongodb总业务量.txt");
       //创建定位到hello2.txt的文件输入流
        OutputStream os =  new FileOutputStream("C:\\Users\\Administrator\\Desktop\\123.txt");
       //创建一个byte数组，用于读写文件
        byte [] buffer = new byte[1024*10];
        int len =0;
       //读写文件
        while ((len = in.read(buffer))!=-1){
            os.write(buffer,0,len);
        }
       //关闭流
       in.close();
       os.close();
   }

   @Test
   public void testBuffer() throws IOException {
        //缓冲流
       Reader in = new FileReader("C:\\Users\\Administrator\\Desktop\\mongodb总业务量.txt");
       BufferedReader bufferedReader = new BufferedReader(in);

       Writer out = new FileWriter("C:\\Users\\Administrator\\Desktop\\123.txt");
       BufferedWriter bufferedWriter = new BufferedWriter(out);

       //进行读写操作
       //bufferedReader.readLine()每次读取一行
       String str =null;
       while ((str=bufferedReader.readLine())!=null){
           bufferedWriter.write(str);
           bufferedWriter.write("\n");
       }
       bufferedReader.close();
       bufferedWriter.close();
   }

   //把字节流转换为字符流
   @Test
   public void testInputStreamReader()throws IOException{
        //指向文档的字节流
       InputStream in = new FileInputStream("C:\\Users\\Administrator\\Desktop\\123.txt");
       //把上面的流转为字符流
       Reader reader = new InputStreamReader(in);
       //把字符流转换为带缓冲的字符流
       BufferedReader bufferedReader = new BufferedReader(reader);

       OutputStream out = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\1234.txt");
       Writer writer = new OutputStreamWriter(out);
       BufferedWriter bufferedWriter = new BufferedWriter(writer);

       String str = null;
       int i =0;
       while ((str=bufferedReader.readLine()) != null){
           System.out.println(str);
           if(i!=0){
               bufferedWriter.write("/n");
           }
           bufferedWriter.write(str);
           i++;
       }

       //关闭
       in.close();
       reader.close();
       bufferedReader.close();

       bufferedWriter.close();
       writer.close();
       out.close();
   }

   //RandomAccessFile 对文件读写操作
   @Test
   public void testRandomAccessFile()throws  IOException{
        //创建RandomAccessFile类
       RandomAccessFile accessFile = new RandomAccessFile("C:\\Users\\Administrator\\Desktop\\123.txt","rw");

        //对文件操作
        String str=null;

        while ((str=accessFile.readLine())!=null){
            System.out.println(str);
        }

        //向文件结尾写入www
      // accessFile.writeChars("www");

       //关闭RandomAccessFile对象
       accessFile.close();
   }

    //给指定行加入文本
    @Test
    public void testRandomAccessFile2() throws  IOException{
        //创建RandomAccessFile类
        RandomAccessFile accessFile = new RandomAccessFile("C:\\Users\\Administrator\\Desktop\\123.txt","rw");

        //先读取第一行
        String line = accessFile.readLine();
        byte[] buffer = new byte[(int) (accessFile.length()-line.length())];
        accessFile.read(buffer);

        //移动指纹到第一行后面
        accessFile.seek(line.length());
        accessFile.writeBytes("\nI LOVE XX");
        //在写入之前读到的内容
        accessFile.write(buffer);
        accessFile.close();
    }
}

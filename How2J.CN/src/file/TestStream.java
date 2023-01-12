package file;

import java.io.*;

public class TestStream {
    public static void main(String[] args) {
        // 以字节流的形式 向文件写入数据; 如果文件夹不存在，就会抛出异常，但是文件是空的话，就会创建新的文件

        try{
            File f = new File("d:/lol.txt");
            // 准备字节数组，准别写入
            byte data [] ={88,89};
            // 创建基于文件的输出流
            FileOutputStream fos = new FileOutputStream(f);
            fos.write(data);
            // 关闭数据流
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        /*
        try{
            File f = new File("d:/lol.txt");
            FileInputStream fis = new FileInputStream(f);
            // 创建字节数组，长度为文件的长度
            byte [] all = new byte[(int)f.length()];
            // 以字节流的形式来读取文件
            fis.read(all);
            // 将结果打印出来
            for(byte b: all){
                System.out.println(b);
            }
            // 每次使用完，得关闭
            fis.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        try{
            // 建立一个文件
            File f = new File("d:/lol.txt");
            // 创建基于文件的输入流
            FileInputStream fis = new FileInputStream(f); // 将数据读取到内存中
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 建立一个文件输出流
        try {
            File f2 = new File("d:/lol.txt");
            FileOutputStream fos = new FileOutputStream(f2);
        } catch (IOException  e) {
            e.printStackTrace();
        }

         */
    }


}

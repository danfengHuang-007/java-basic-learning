package file;

import java.io.File;

public class TestFile2 {
    // 用递归的方法来遍历子文件夹
    static  long minSize = Integer.MAX_VALUE;
    static long maxSize = 0;
    static File minFile;
    static  File maxFile;
    public static void listFiles(File file){
        // 如果当前文件是file
        if (file.isFile()){
            if (file.length()>maxSize){
                maxSize = file.length();
                maxFile = file;
            }
            if (file.length()!=0 && file.length()<minSize){
                minSize = file.length();
                minFile = file;
            }
            return;
        }
        // 如果当前文件是文件夹
        if (file.isDirectory()){
            File[] fs = file.listFiles();
            if (fs!=null){
                for (File f: fs){
                    listFiles(f);
                }
            }
        }
    }
    public static void main(String[] args) {
        /*
        // 遍历文件夹
        File f = new File("c:\\windows");
        // 返回当前文件夹下的所有文件
        File [] fs = f.listFiles();
        // 如果该数组是空的，直接返回
        if (fs==null){
            return;
        }
        // create 两个变量来存储最大和最小值
        long minSize = Integer.MAX_VALUE;
        long maxSize = 0;
        // create 最大和最小的file
        File minFile = null;
        File maxFile = null;
        // 开始遍历文件夹
        for(File file: fs){
            // 如果这个文件是文件夹，则继续遍历
            if (file.isDirectory()){
                continue;
            }
            // 如果当前的文件 大于目前的最大值 则赋值到max value 上
            if(file.length()>maxSize){
                maxSize = file.length();
                maxFile = file;
            }
            // 如果当前的文件不为空，如果小于目前的最小值，则进行赋值
            if (file.length()!= 0 && file.length()<minSize){
                minSize = file.length();
                minFile = file;
            }
        }
        //System.out.println("最大的文件是%s，其大小是%,d字节%n", maxFile.getAbsoluteFile(), maxFile.length());

         */



    }
}

package file;

import java.io.File;
import java.util.Date;

public class TestFile {
    public static void main(String[] args) {
        /*
        File f1= new File("/Users/Dawei/Desktop/COMP6442/activity_02/part2");
        System.out.println("f1的绝对路径："+ f1.getAbsolutePath());

        File f2 = new File("HelloWorld.java");
        System.out.println("f2的绝对路径：" + f2.getAbsolutePath());
        // 把f1当作父目录，创建f3 文件
        File f3 = new File(f1, "LOL.exe");
        System.out.println("f3的绝对路径：" + f3.getAbsolutePath());

         */
        File f = new File("/Users/Dawei/Desktop");
        /*
        System.out.println("当前文件是: "+f);
        // 判断文件是否存在
        System.out.println("判断是否存在："+ f.exists());
        // 是否是文件夹
        System.out.println("判断是否是文件夹：" + f.isDirectory());
        // 是否是文件
        System.out.println("判断是否是文件："+ f.isFile());
        // 获取文件的长度
        System.out.println("获取文件的长度："+f.length());
        // 文件最后修改时间
        long time = f.lastModified();
        Date d = new Date(time);
        System.out.println("获取文件的最后修改时间："+ d);
        //f.setLastModified(0);
        // 重命名文件
       // File f2 = new File("/Users/Dawei/Desktop/COMP2120:6120/期末复习");
        //f.renameTo(f2);
        // 以字符串形式返回当前文件夹下的所有文件

         */
        f.list();
        // 以文件数组的形式 返回当前文件夹下的所有文件
        File[] fs = f.listFiles();
        f.getParent();// 以字符串形式返回获取所在文件夹
        f.getParentFile(); // 以文件形式返回获取所在文件夹
        // f.mkdir() 如果父文件夹不存在，那么创建失效
        // f.mkdirs(); 如果父文件夹不存在，那么就会创建父文件夹
        //f.createNewFile(); 如果父文件夹不存在，那么就不能创建空文件，会抛出异常;
        //f.getParentFile().mkdirs; 在创建空文件之前，都会创建一个父文件夹;
        // f.listRoots(); 列出所有的盘符
        f.delete(); // 删除文件
        f.deleteOnExit();// 删除临时文件




    }
}

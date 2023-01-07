package exception;
import java.io.File;
import java. io.FileInputStream;
import java.io.FileNotFoundException;

public class TestException {
    /*
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("d:/LOL.exe");
        new FileInputStream(f);
    }

     */
    public static void main(String[] args) {
        File f = new File("d:/LOL.exe");
        try{
            System.out.println("试图打开 d:/LOL.exe");
            new FileInputStream(f);
            System.out.println("成功打开");

        } catch (Exception e) {
            // FileNotFoundException是Exception的子类, 用exception 也可以捕捉到异常
            System.out.println("d:/LOL.exe不存在");
            e.printStackTrace();
        }
    }
}

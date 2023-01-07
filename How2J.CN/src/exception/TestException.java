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
        StringBuffer sb = new StringBuffer();
        for (int i =0;i<Integer.MAX_VALUE;i++){
            sb.append('a');
        }
        // ArithmeticException
        //int a = 5/0;
        // ArrayIndexOutOfBoundsException
        //int [] j = new int[5];
        //j[10] = 10;
        // NullPoint Exception
        //String str  = null;
        //str.length();
        //System.out.println(method());
        //method1();
        /*
        File f = new File("d:/LOL.exe");
        try{
            System.out.println("试图打开 d:/LOL.exe");
            new FileInputStream(f);
            System.out.println("成功打开");
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date d = sdf.parse("2016-06-03");

        } catch (ParseException|FileNotFoundException e){
            if(e instanceof FileNotFoundException){
                System.out.println("d:/LOL.exe不存在");
            }
            if (e instanceof ParseException) {
                System.out.println("日期格式解析错误");
            }
            e.printStackTrace();

        }
        finally {


         */

    }
    /*
    private static int method(){
        File f = new File("d:/LOL.exe");
        try{
            System.out.println("尝试获取打开文件");
            new FileInputStream(f);
            return 1;
        }catch (FileNotFoundException e){
            System.out.println("文件打开失败");
            return 2;
        }
        finally {
            return 3;
        }
    }
    /*
    private static void method1(){
        try{
            method2();
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
    private static void method2 () throws  FileNotFoundException{
        File f = new File("d:/LOL.exe");
        System.out.println("试图打开 d:/LOL.exe");
        new FileInputStream(f);
        System.out.println("成功打开");
    }

    public void method(){
        try{
            System.out.println(1);
        }catch (Exception e){
            System.out.println(2);
        }
        finally {
            System.out.println(3);
        }
    }

     */

}

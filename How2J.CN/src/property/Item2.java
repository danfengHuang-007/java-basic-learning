package property;

public class Item2 {
    //懒汉式单例模式
    private Item2 (){};
    public static  Item2 instance;
    public static Item2 getInstance(){
        if (instance==null){
            instance = new Item2();
        }
        return instance;
    }
}

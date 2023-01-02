package character;

public class GiantDragon {
    /*
    // 以下是饿汉式创建单例
    //私有化构造方法使得该类无法在外部通过new 进行实例化
    private GiantDragon(){};
    // 类属性 指向一个实例化对象；
    public static GiantDragon instance = new GiantDragon();
    //  提供对象调用
    public static GiantDragon getInstance(){
        return instance;
    };

     */
    private GiantDragon(){};
    public static GiantDragon instance; // 先指向null
    public static GiantDragon getInstance(){
        //第一次访问的时候，发现instance没有指向任何对象，这时实例化一个对象
        if (instance==null){
            instance = new GiantDragon();
        }
        return instance;
    }

}

package character;

public class Hero2 {
    // 饿汉式单例模式
    private Hero2(){};
    public static Hero2 instance = new Hero2();
    public static Hero2 getInstance(){
        return instance;
    }
}

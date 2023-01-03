package property;

public class LifePotion extends Item{
    // 重写
    @Override
    public void effect() {
        //super.effect();
        System.out.println("血瓶使用后，可以回血");
    }
}

package practice;

public class Spider extends Animal{
    public Spider(int legs) {
        super(legs);
    }
    @Override
    void eat() {
        System.out.println("蜘蛛吃大便");
    }
}

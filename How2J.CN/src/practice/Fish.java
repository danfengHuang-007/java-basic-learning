package practice;

public class Fish extends Animal implements Pet{
    int legs = 0;
    private String name;

    public Fish(){
        super(0);
    }

    @Override
    void eat() {

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;

    }

    @Override
    public void play() {

    }

    public void walk(int legs){
        System.out.println("鱼有"+legs+"条腿，因此不能走路");
    }
}

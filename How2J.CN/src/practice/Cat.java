package practice;

public class Cat extends Animal implements Pet{
    String name;

    protected Cat(String name) {
        super(4);
    }

    public Cat(){
        this(" ");


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

    public void eat(){
        System.out.println("猫吃老鼠");
    }
}

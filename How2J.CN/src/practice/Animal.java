package practice;

public abstract class Animal {
    String name;
    protected int legs;
    protected Animal(int legs){
        this.legs = legs;
    }

    abstract void eat();


     void walk(int legs){
        System.out.println(legs+"腿走路");
    }
}

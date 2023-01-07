package character;

public interface Mortal {
    public void die();
    // JDK8 以后 接口也可以实现具体的方法了
    default public void revive(){
        System.out.println("本英雄复活了");
    }

}

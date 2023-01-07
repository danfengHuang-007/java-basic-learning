package character;

public interface AP {
    public static final int resistPhysic =  100;
    int resistMagic = 100; // 这里默认是public static final
    public void magicAttack();
    default public void attack(){
        System.out.println("添加一个默认方法");
    }

}

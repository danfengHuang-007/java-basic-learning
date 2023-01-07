package character;

public interface AD {
    // 空的方法体
    public void physicAttack();
    default public void attack(){
        System.out.println("增加一个默认方法");
    };

}

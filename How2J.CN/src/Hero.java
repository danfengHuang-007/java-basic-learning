public class Hero {
    String name;
    float hp; // 血值
    float armor; // 护甲
    int moveSpeed; // 移动速度
    // 有的方法不需要返回值，这个时候就把返回类型设置为void,表示该方法不返回任何值
    void keng(){
        System.out.println("坑队友");
    }

    void addSpeed(int speed){
        moveSpeed = moveSpeed + speed;
    }

    float getArmor(){
        return armor;
    }
    // 超神
    void legendary(){};
    float getHp(){
        return hp;
    }
    void recovery(float blood){
        hp = hp + blood;
    }

    public static void main(String[] args) {
        // create heroes
        Hero garen = new Hero();
        garen.name = "盖仑";
        garen.hp = 616.28f;
        garen.armor = 23.576f;
        garen.moveSpeed = 350;
        garen.addSpeed(100);

        Hero teemo = new Hero();
        teemo.name = "提莫";
        teemo.hp = 383f;
        teemo.armor = 14f;
        teemo.moveSpeed = 330;

    }
}

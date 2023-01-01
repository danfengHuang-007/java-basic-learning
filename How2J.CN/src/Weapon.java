public class Weapon extends Item{
    //String name;
    //int price;
    int damage; // 攻击力

    public static void main(String[] args) {
        Weapon infinityEdge = new Weapon();
        infinityEdge.damage = 65;
        infinityEdge.name = "无尽之刃";
        infinityEdge.price = 3600;
    }

}

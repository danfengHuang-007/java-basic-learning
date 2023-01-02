package property;

public class Armor extends Item {
    int ac;

    public static void main(String[] args) {
        Armor bujia = new Armor();
        bujia.name = "布甲";
        bujia.price = 300;
        bujia.ac = 15;

        Armor suoziJia = new Armor();
        suoziJia.name = "锁子甲";
        suoziJia.price = 500;
        suoziJia.ac = 40;
    }
}

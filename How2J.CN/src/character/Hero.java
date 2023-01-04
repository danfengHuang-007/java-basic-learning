package character;

import character1.Support;
import property.*;

public class Hero {
    private int id;
    float maxHP;
    {
        maxHP = 200; // 初始化块
    }
    public String name;
    protected float hp; // 血值
    float armor; // 护甲
    int moveSpeed; // 移动速度
    static String copyRight; // 类属性,静态属性. 如果一个属性声明成类属性，那么所有的对象，都共享这么一个值
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
    // 对象方法，需要有对象才能调用
    public void die(){
        hp = 0;
    }
    // 静态类方法
    public static void battleWin(){
        System.out.println("battle win");
    }

    public static int itemCapacity = 8; // 声明的时候 初始化


/*
    //有参的构造方法
    //默认的无参的构造方法就失效了
 */
//    public Hero(String heroName){
//        name = heroName;
//    }
//    public Hero(){
//        System.out.println("实例化一个对象的时候，必然调用构造方法");
//    }

    // 构造方法的重载
    /*
    public Hero(String heroName, float heroHp){
        name = heroName;
        hp = heroHp;
    }
     */
    // 为Hero设计4个参数的构造方法
    /*
    public Hero(String heroName, float heroHP, float heroArmor, int heroMoveSpeed){
        name = heroName;
        hp = heroHP;
        armor = heroArmor;
        moveSpeed = heroMoveSpeed;
    }

    public void showAddressInMemory(){
        System.out.println("打印this看到的虚拟地址："+this);
    }

    public void setName1(String name){
        name = name;
    }

    public void setName2(String heroName){
        name = heroName;
    }

     */

    public void showAddressInMemory(){
        System.out.println("打印this看到的虚拟地址："+this);
    }

    public void setName3(String name){
        this.name = name; // this.name 指的是属性name, 右边的name 指的是参数name;
    }
//    public  Hero(String name){
//        this.name = name;
//    }
    // 在一个构造方法中调用另外一个构造方法
//    public  Hero(String name, float Hp){
//        this(name);
//        this.hp = Hp;
//    }
//
//    public Hero(String name, float Hp, float armor, int moveSpeed){
//        this(name,100 );
//        this.armor = armor;
//        this.moveSpeed = moveSpeed;
//    }
    // 回血
    public void huixue(int xp){
        hp=hp + xp;
        //回血完毕后，血瓶=0
        xp = 0;
    }
    public void attack(Hero hero, int damage){
        hero.hp = hero.hp - damage;
    }
    // 复活
    public Hero(String heroName, float heroHp){
        System.out.println("Hero的有一个参数的构造方法 ");
        name = heroName;
        hp = heroHp;
    }
    // 无参构造方法

    public Hero(){
        System.out.println("Hero的无参的构造方法 ");
    }





    public void revive(Hero hero){
        hero.hp = 100;
    }
    public void equip(Weapon w){
    }
    // 在不实用多态的情况下
    public void useLifePotion(LifePotion lp){
        lp.effect();
    }

    public void useMagicPotion(MagicPotion mp){
        mp.effect();
    }
    // 使用多肽
    public void useItem(Item i){
        System.out.println("hero use item");
        i.effect();
    }
    public void kill(Mortal m){
        m.die();
    }
//    public void finalize(){
//        System.out.println("这个英雄正在被回收");
//    }
    // 当两个对象的hp 相同时，这两个对象相等:
    public boolean equals(Object o){
        if (o instanceof Hero){
            Hero h = (Hero) o;
            return this.hp == h.hp;
        }
        return false;
    }

    public static void main(String[] args) {
        // create heroes
        //实例化一个对象的时候，必然调用构造方法
//        Hero garen = new Hero("盖仑");
//        Hero teemo = new Hero("提莫");
        //Hero shabi = new Hero("caonima", 100000);
        //Hero suMan = new Hero("shabi", -10000, 10, 1);
        /*
        Hero h = new Hero();
        h.setName1("shabi");
        System.out.println(h.name); // 当参数名和属性名一样时，打印的结果是null;
        h.setName2("shabi");
        System.out.println(h.name); // name = shabi
        h.setName3("shabisuman");
        System.out.println(h.name);

        Hero garen = new Hero();
        System.out.println("打印对象看到的虚拟地址："+garen);
        garen.showAddressInMemory();
        garen.name ="盖仑" ;
        garen.hp = 616.28f;
        garen.armor = 23.576f;
        garen.moveSpeed = 350;
        garen.addSpeed(100);

        Hero teemo = new Hero();
        teemo.name = "提莫";
        teemo.hp = 383f;
        teemo.armor = 14f;
        teemo.moveSpeed = 330;

         */
        //Hero garen = new Hero();
        //Hero teemo = new Hero();
        /*
        Hero garen = new Hero("garen", 100);
        Hero teemo = new Hero("teemo", 100);
        Hero.copyRight = "Suman 是傻逼";
        //System.out.println(copyRight);
        //teemo.hp = 100;
        //garen.hp = 10;
        //int xueping =100;
       // garen.huixue(xueping);
        garen.attack(teemo,110);
        teemo.revive(teemo); // 提莫复活
        //System.out.println(garen.hp);
        //System.out.println(teemo.hp);
        //System.out.println(garen.copyRight);
        //garen.copyRight = "Suman 滚你妈的";
        //System.out.println(teemo.copyRight);
        garen.die();
        System.out.println(garen.hp);
        // 无需对象，直接通过类调用
        Hero.battleWin();
        System.out.println(Hero.itemCapacity);
        // 向上转型（子类转父类）
        Hero h = new Hero();
        ADHero adHero = new ADHero();
        APHero ap = new APHero();
        Support s = new Support();
        //h = adHero;
        h = s;
        // 向下转型，需强制转换
        adHero = (ADHero) h;
        // adHero = (ADHero) ap; 没有继承关系的类型进行互相转换一定会失败，所以会出现编译错误
        AD ad = adHero; // 把adHero 转换成AD 接口

        ADHero ad = new ADHero();
        APHero ap = new APHero();
        Hero h1 = ad; // 向上转换
        Hero h2 = ap;
        System.out.println(h1 instanceof ADHero);
        System.out.println(h2 instanceof APHero);
        System.out.println(h1 instanceof Hero);

        ADHero ad = new ADHero();
        Hero h = ad;
        AD adi = (AD) h;// 这里h的类型是ADHero, 转换成AD 接口 是向上转换；
       // APHero ap = (APHero) adi; // ADHero和APHero之间没有继承关系，不能直接强转。
        LifePotion lp = new LifePotion();
        MagicPotion mp = new MagicPotion();
        Hero garen = new Hero();
        //garen.useLifePotion(lp);
        //garen.useMagicPotion(mp);
        garen.useItem(lp);
        garen.useItem(mp);

        Hero garen = new Hero();
        ADHero ad = new ADHero();
        APHero ap = new APHero();
        ADAPHero adap = new ADAPHero();
        garen.kill(ad);
        garen.kill(ap);
        garen.kill(adap);

         */
        //Hero.battleWin();
        //new Hero();
        //Hero garen = new ADHero();
        //System.out.println(garen.toString());
        //System.out.println(garen); // 直接打印对象就是打印它的toString()返回值;
//        Hero h;
//        for (int i=0;i<10000;i++){
//            h = new Hero();
//        }
        Hero h1 = new Hero();
        h1.hp = 300;
        Hero h2 = new Hero();
        h2.hp = 400;
        Hero h3 = new Hero();
        h3.hp = 300;
        System.out.println(h1==h2);
        System.out.println(h1==h3);
        //System.out.println(h1.equals(h2));
        //System.out.println(h1.equals(h3));















    }
}

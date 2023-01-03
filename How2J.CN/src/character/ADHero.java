package character;

import property.Item;
import property.LifePotion;
import property.Mortal;

// 物理攻击
public class ADHero extends Hero implements AD, Mortal {
    int moveSpeed = 400;
    public int getMoveSpeed(){
        return this.moveSpeed;
    }
    public int getMoveSpeed2(){
        return super.moveSpeed;
    }
    public ADHero(){

        //super();
        System.out.println("AD Hero的构造方法");
    }
    //使用关键字super 显式调用父类带参的构造方法
    public ADHero(String name, Float hp){
        super(name,hp);
        System.out.println("AD Hero的构造方法");
    }

    // 方法重载
    public void attack(){
        System.out.println(name+" 进行了一次攻击 ，但是不确定打中谁了");
    }

    public void attack(Hero h1){
        System.out.println(name+" 对 "+h1.name+"进行了一次攻击");
    }

    public void attack(Hero h1, Hero h2){
        System.out.println(name + " 对 "+ h1.name +"和"+h2.name+"进行了攻击");
    }
    //可变数量的参数
    public void attack(Hero...heros){
        for (Hero hero : heros) {
            System.out.println(name + " 攻击了 " + hero.name);
        }
    }

    @Override
    public void die() {
        System.out.println("笨死的");
    }

    @Override
    public void physicAttack() {
        System.out.println("进行物理攻击");
    }
    // 隐藏父类的battleWin方法
    public static void battleWin(){
        System.out.println("ad hero battle win");
    }
    public void useItem(Item i){
        System.out.println("adhero use item");
        super.useItem(i);
    }


    public static void main(String[] args) {
        /*
        ADHero bh = new ADHero();
        bh.name = "赏金猎人";
        Hero h1 = new Hero("盖伦",100);
       // h1.name = "盖伦";

        Hero h2 = new Hero("提莫",100);
        //h2.name = "提莫";

        //bh.attack(h1);
        //bh.attack(h1, h2);

        //Hero.battleWin();
        //ADHero.battleWin();
        //如果父类和子类创建的是静态方法，结果会调用引用所在的父类方法；
        //如果父类和子类创建的是非静态方法，结果会调用引用所指向的子类方法；
       // Hero h = new ADHero(); // 向上转型
        //h.battleWin(); //尽管h 指向子类对象，但还是调用父类的方法
        new ADHero("suman", (float) 0.1); // 先调用父类的构造方法，然后再调用子类的构造方法
         */
        ADHero ah = new ADHero();
        //System.out.println(ah.getMoveSpeed());
        //System.out.println(ah.getMoveSpeed2()); // 通过super 可以调用父类的moveSpeed 属性
        LifePotion lp = new LifePotion();
        ah.useItem(lp);





    }


}


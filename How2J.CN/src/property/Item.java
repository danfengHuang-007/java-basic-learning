package property;

public class Item {
    String name;
    int price;

    public String toString(){
        return name+":"+price;
    }

    public void buy(){
        System.out.println("购买");
    }

    public void effect(){
        System.out.println("物品使用后，可以有效果");
    }

    public boolean equals(Object o){
        if (o instanceof Item){
            Item i = (Item) o;
            return this.price == i.price;
        }
        return false;
    }

    public static void main(String[] args) {
        /*
        Item xuepin =  new Item();
        xuepin.name = "血瓶";
        xuepin.price = 50;

        Item caoxie = new Item();
        caoxie.name = "草鞋";
        caoxie.price = 300;

        Item changJing = new Item();
        changJing.name = "长剑";
        changJing.price = 350;

        Item i = new Item();
        i.effect();

        LifePotion lp = new LifePotion();
        lp.effect(); // 调用执行重写的方法，而不是父类的方法;

        MagicPotion mp = new MagicPotion();
        mp.effect();


        // 父类引用指向子类对象
//        Item i1 = new LifePotion();
//        Item i2 = new MagicPotion();
//        System.out.println("i1  是Item类型，执行effect打印:");
//        i1.effect();
//        System.out.println("i2也是Item类型，执行effect打印:");
//        i2.effect();
         */
        Item i =new Item();
        Item i2 = new Item();
        Item i3 = new Item();
        i3.name="santoh";
        i3.price = 1000;
        i2.name="suman";
        i2.price=200;
        i.name = "shabi";
        i.price = 1000;
        System.out.println(i.toString());
        System.out.println(i.equals(i2));
        System.out.println(i.equals(i3));





    }
}

package character1;

import character.Hero;

public class Support extends Hero {
    public void heal(){
        System.out.println("给未知英雄治疗");
    }

    public void heal (Hero h){
        System.out.println(name+"为" + h.name + "进行治疗");
    }

    public void heal (Hero h, int hp){
        System.out.println(name + "对" + h.name + "加了" + hp+ "点血");
    }

    public static void main(String[] args) {
        Support support = new Support();
        Hero h1 = new Hero("suman", 100);

        support.heal(h1);
        support.heal(h1, 30);
    }
}

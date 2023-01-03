package character;

import property.Mortal;

public class ADAPHero extends Hero implements AD, AP, Mortal {
    @Override
    public void physicAttack() {
        System.out.println("进行物理攻击");
    }

    @Override
    public void magicAttack() {
        System.out.println("进行魔法攻击");
    }

    @Override
    public void die() {
        System.out.println("被队友坑死的");
    }
}


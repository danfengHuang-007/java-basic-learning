package character;

import property.Mortal;

public class ADAPHero extends Hero implements AD, AP, Mortal {
    @Override
    public void physicAttack() {
        System.out.println("进行物理攻击");
    }

    // 当实现类实现多个接口，接口中有相同的默认方法时，实现类需要重写默认方法。
    @Override
    public void attack() {

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


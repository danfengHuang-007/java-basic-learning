package character;
// 物理攻击
public class ADHero extends Hero implements AD{

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

    public static void main(String[] args) {
        ADHero bh = new ADHero();
        bh.name = "赏金猎人";
        Hero h1 = new Hero("盖伦",100);
       // h1.name = "盖伦";

        Hero h2 = new Hero("提莫",100);
        //h2.name = "提莫";

        bh.attack(h1);
        bh.attack(h1, h2);


    }

    @Override
    public void physicAttack() {
        System.out.println("进行物理攻击");
    }
}


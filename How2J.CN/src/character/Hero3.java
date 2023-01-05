package character;

public abstract class Hero3 {
    String name;
    float hp;
    int moveSpeed;
    float armor;

    public static void main(String[] args) {
        // 本地类有自定义的类名;
        /*
        class somehero extends Hero3{
            public void attack(){
                System.out.println(name+": 新的进攻手段");
            }
        }
        somehero sh = new somehero();
        sh.name = "地卜师";
        sh.attack();

         */

        ADHero adh = new ADHero();
        adh.attack();
        // 在匿名类中使用外部的属性，这个属性必须得声明为final
        final int damage = 5;
        System.out.println(adh); // character.ADHero@279f2327 adh 属于ADHero
        Hero3 h3 = new Hero3() {
            // 当场实现attack方法;
            /*
            public void attack(){
                System.out.println(name+"新的进攻手段");
            };
             */
            public void attack(){
                System.out.println("新的进攻手段，造成%d点伤害"+damage);
            }
        };
       // h3.name = "Suman";
        h3.attack();
        System.out.println(h3); // Hero3$1 系统自动分配的名 所以这个类又叫做匿名类;

        // 抽象类不能被实例化
        //Hero3 h3 = new Hero3();
        class AnonymousHero extends Hero3{
            int damage;
            public AnonymousHero(int damage){
                this.damage = damage;
            }
            public void attack(){
                damage =10;
                System.out.println("新的进攻手段，造成%d点伤害"+this.damage);
            }
        }
        Hero3 h4 = new AnonymousHero(damage);
        //System.out.println(h4);

    }

    private void attack() {
    }
    //public  abstract void attack(); // 子类会被要求实现attack方法;
}

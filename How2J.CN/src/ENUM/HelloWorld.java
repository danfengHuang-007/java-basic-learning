package ENUM;

public class HelloWorld {
    public static void main(String[] args) {
        /*
        Season season = Season.SPRING;
        switch(season){
            case SPRING:
                System.out.println("春天");
                break;
            case SUMMER:
                System.out.println("夏天");
                break;
            case AUTUMN:
                System.out.println("秋天");
                break;
            case WINTER:
                System.out.println("冬天");
                break;

        }
        for (Season s: Season.values()){
            System.out.println(s);
        }
         */
        HeroType heroType = HeroType.ASSIST;
        switch (heroType){
            case PUSH:
                System.out.println("推进");
                break;
            case ASSIST:
                System.out.println("辅助");
                break;
            case RANGED:
                System.out.println("远程");
                break;
            case TANK:
                System.out.println("坦克");
                break;
            case WIZARD:
                System.out.println("法师 ");
                break;
            case ASSASSIN:
                System.out.println("刺客");
                break;
            case WARRIOR:
                System.out.println("近战");
                break;
            case FARMING:
                System.out.println("打野");
                break;
        }

    }

}

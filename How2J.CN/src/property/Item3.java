package property;

public abstract class Item3 {
    String name;
    public abstract boolean dispoable();

    public static void main(String[] args) {
        // 创建一个匿名类
        Item3 i3 = new Item3() {
            // 当场实现dispoable 方法;
            @Override
            public boolean dispoable() {
                return true;
            }
        };
        i3.dispoable();
        System.out.println(i3);// Item3$1 匿名类
    }
}

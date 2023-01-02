package character;

public class Support1 extends Hero implements Healer{
    @Override
    public void heal() {
        System.out.println("治疗");
    }
}

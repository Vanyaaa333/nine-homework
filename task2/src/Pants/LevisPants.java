package Pants;

public class LevisPants implements IPants{
    @Override
    public void putOn() {
        System.out.println("Штаны Levi's надеты");
    }

    @Override
    public void takeOff() {
        System.out.println("Штаны Levi's сняты");
    }
}

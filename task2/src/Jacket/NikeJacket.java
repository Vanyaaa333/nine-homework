package Jacket;

public class NikeJacket implements IJacket{
    @Override
    public void putOn() {
        System.out.println("Куртка Nike надета");
    }

    @Override
    public void takeOff() {
        System.out.println("Куртка Nike снята");
    }
}

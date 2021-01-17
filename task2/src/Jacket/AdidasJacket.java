package Jacket;

public class AdidasJacket implements IJacket{


    @Override
    public void putOn() {
        System.out.println("Куртка Adidas надета");
    }

    @Override
    public void takeOff() {
        System.out.println("Куртка Adidas снята");
    }
}

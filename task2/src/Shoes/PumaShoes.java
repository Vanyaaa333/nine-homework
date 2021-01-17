package Shoes;

public class PumaShoes implements IShoes{


    @Override
    public void putOn() {
        System.out.println("Кроссовки Puma надеты");
    }

    @Override
    public void takeOff() {
        System.out.println("Кроссовки Puma сняты");
    }
}

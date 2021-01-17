package Robots.Head;

public class SamsungHead implements IHead{

    private int price;

    public SamsungHead(int price) {
        this.price = price;
    }

    @Override
    public void speak() {
        System.out.println("Hello I'm head from Samsung");
    }

    @Override
    public int getPrise() {
        return price;
    }
}

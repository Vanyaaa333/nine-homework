package Robots.Head;

public class SonyHead implements IHead{

    private int price;

    public SonyHead(int price) {
        this.price = price;
    }

    @Override
    public void speak() {
        System.out.println("Hello I'm head from Sony");
    }

    @Override
    public int getPrise() {
        return price;
    }
}

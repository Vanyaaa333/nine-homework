package Robots.Head;

public class ToshibaHead implements IHead{

    private int price;

    public ToshibaHead(int price) {
        this.price = price;
    }

    @Override
    public void speak() {
        System.out.println("Hello I'm head from Toshiba");
    }

    @Override
    public int getPrise() {
        return price;
    }
}

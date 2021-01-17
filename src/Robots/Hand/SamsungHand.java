package Robots.Hand;

public class SamsungHand implements IHand{

    private int price;

    public SamsungHand(int price) {
        this.price = price;
    }

    @Override
    public void doSymbolWithHands() {
        System.out.println("Robot shows Samsung symbol with hands");
    }

    @Override
    public int price() {
        return price;
    }
}

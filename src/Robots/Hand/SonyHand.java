package Robots.Hand;

public class SonyHand implements IHand {

    private int price;

    public SonyHand(int price) {
        this.price = price;
    }

    @Override
    public void doSymbolWithHands() {
        System.out.println("Robot shows Sony symbol with hands");
    }

    @Override
    public int price() {
        return price;
    }
}
package Robots.Hand;

public class ToshibaHand implements IHand{

    private int price;

    public ToshibaHand(int price) {
        this.price = price;
    }

    @Override
    public void doSymbolWithHands() {
        System.out.println("Robot shows Toshiba symbol with hands");
    }

    @Override
    public int price() {
        return price;
    }
}

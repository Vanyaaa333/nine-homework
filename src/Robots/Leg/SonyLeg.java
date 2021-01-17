package Robots.Leg;

public class SonyLeg implements ILeg{

    private int price;

    public SonyLeg(int price) {
        this.price = price;
    }

    @Override
    public void createSymbol() {
        System.out.println("Start to create symbol Sony on the snow");
    }

    @Override
    public int getPrise() {
        return price;
    }
}

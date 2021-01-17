package Robots.Leg;

public class ToshibaLeg implements ILeg{

    private int price;

    public ToshibaLeg(int price) {
        this.price = price;
    }

    @Override
    public void createSymbol() {
        System.out.println("Start to create symbol Toshiba on the snow");
    }

    @Override
    public int getPrise() {
        return price;
    }
}

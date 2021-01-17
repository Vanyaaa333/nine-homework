package Robots.Leg;

public class SamsungLeg implements ILeg{

    private int price;

    public SamsungLeg(int price) {
        this.price = price;
    }

    @Override
    public void createSymbol() {
        System.out.println("Start to create symbol Samsung on the snow");
    }

    @Override
    public int getPrise() {
        return price;
    }
}

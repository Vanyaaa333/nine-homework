package Pants;

public class ArmaniPants implements IPants{


    @Override
    public void putOn() {
        System.out.println("Штаны Armani надеты");
    }

    @Override
    public void takeOff() {
        System.out.println("Штаны Armani сняты");
    }
}

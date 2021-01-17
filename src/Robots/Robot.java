package Robots;

import Robots.Hand.IHand;
import Robots.Head.IHead;
import Robots.Leg.ILeg;

public class Robot implements IRobot{

    private IHand hand;
    private IHead head;
    private ILeg leg;
    String name;

    public String getName() {
        return name;
    }

    public Robot(IHand hand, IHead head, ILeg leg, String name) {
        this.hand = hand;
        this.head = head;
        this.leg = leg;
        this.name = name;
    }

    public IHand getHand() {
        return hand;
    }

    public void setHand(IHand hand) {
        this.hand = hand;
    }

    public IHead getHead() {
        return head;
    }

    public void setHead(IHead head) {
        this.head = head;
    }

    public ILeg getLeg() {
        return leg;
    }

    public void setLeg(ILeg leg) {
        this.leg = leg;
    }

    @Override
    public int robotPrice() {
        int totalPrice = head.getPrise()+hand.price()+ leg.getPrise();
        return totalPrice;
    }

    @Override
    public void robotActions() {
        head.speak();
        hand.doSymbolWithHands();
        leg.createSymbol();
    }
}

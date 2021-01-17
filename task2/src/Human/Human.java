package Human;

import Jacket.IJacket;
import Pants.IPants;
import Shoes.IShoes;

public class Human implements IHuman{

    private IJacket jacket;
    private IShoes shoes;
    private IPants pants;
    private String name;

    public String getName() {
        return name;
    }

    public Human(IJacket jacket, IShoes shoes, IPants pants, String name) {
        this.jacket = jacket;
        this.shoes = shoes;
        this.pants = pants;
        this.name = name;
    }

    @Override
    public void putOn() {
        jacket.putOn();
        shoes.putOn();
        pants.putOn();
    }

    @Override
    public void takeOff() {
        jacket.takeOff();
        shoes.takeOff();
        pants.takeOff();
    }
}

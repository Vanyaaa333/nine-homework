import Human.Human;
import Jacket.AdidasJacket;
import Jacket.NikeJacket;
import Pants.ArmaniPants;
import Pants.LevisPants;
import Shoes.FilaShoes;
import Shoes.PumaShoes;

import java.util.ArrayList;

public class DemoMain{
    public static ArrayList<Human> humans = new ArrayList<>();

    public static void main(String[] args) {
        Human FirstHuman = new Human(new AdidasJacket(),new PumaShoes(),new LevisPants(),"Mike");
        humans.add(FirstHuman);
        Human SecondHuman = new Human(new NikeJacket(),new FilaShoes(),new ArmaniPants(),"Mike");
        humans.add(SecondHuman);
        for(Human human:humans){
            human.putOn();
            human.takeOff();
            System.out.println("-----------------------");
        }
    }
}

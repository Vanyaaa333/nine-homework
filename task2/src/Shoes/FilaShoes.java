package Shoes;

public class FilaShoes implements IShoes{


    @Override
    public void putOn() {
        System.out.println("Кроссовки Fila надеты");
    }

    @Override
    public void takeOff() {
        System.out.println("Кроссовки Fila сняты");
    }
}

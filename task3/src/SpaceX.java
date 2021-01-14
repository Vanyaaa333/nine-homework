import java.util.Scanner;

public class SpaceX implements IStart{
    /*
    If counter > 10 rocket will blow up
    If counter < 10 rocket will take wing
     */
    @Override
    public boolean prelaunchSystemCheck() {
        System.out.println("Введите ваше любимое число");
        Scanner sc = new Scanner(System.in);
        int counter = sc.nextInt();
        if(counter<10){
            return true;
        }
        return false;
    }

    @Override
    public void enginesLaunching() {
        System.out.println("Двигатели spaceX запущены.Все системы в норме");
        for (int i = 10; i >= 0 ; i--) {
            System.out.println(i);
        }
    }

    @Override
    public void start() {
        System.out.println("Старт spaceX");
    }
}

import java.util.Random;

public class Shatl implements IStart{
    @Override
    public boolean prelaunchSystemCheck() {
        Random rand = new Random();
        int counter = rand.nextInt(11);
        if (counter>3){
            return true;
        }
        return false;
    }

    @Override
    public void enginesLaunching() {
        System.out.println("Двигатели Shatl запущены.Все системы в норме");
        for (int i = 10; i >= 0 ; i--) {
            System.out.println(i);
        }
    }

    @Override
    public void start() {
        System.out.println("Старт Shatl");
    }
}

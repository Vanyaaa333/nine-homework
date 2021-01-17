import java.util.Random;

public class Kosmodrom{

    public static void launching(IStart start){
        if(start.prelaunchSystemCheck()){
            start.enginesLaunching();
            start.start();
        }
        else{
            System.out.println("Предстартовая проверка провалена");
        }
    }

}

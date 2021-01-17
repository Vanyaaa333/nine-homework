package Robots;

import Robots.Hand.IHand;
import Robots.Hand.SamsungHand;
import Robots.Hand.SonyHand;
import Robots.Hand.ToshibaHand;
import Robots.Head.SamsungHead;
import Robots.Head.SonyHead;
import Robots.Head.ToshibaHead;
import Robots.Leg.ILeg;
import Robots.Leg.SamsungLeg;
import Robots.Leg.SonyLeg;
import Robots.Leg.ToshibaLeg;

import java.util.ArrayList;

public class RobotDemo {
    public static int biggestRobotPrise;
    public static String nameOfMostExpensiveRobot;
    public static ArrayList<Robot> robots= new ArrayList<>();

    public static void main(String[] args) {
	Robot robot1 = new Robot(new SamsungHand(20), new ToshibaHead(40), new SonyLeg(30),"R2-D2 ");
        robots.add(robot1);
	Robot robot2 = new Robot(new ToshibaHand(15),new SonyHead(60), new SamsungLeg(25),"C-3PO");
        robots.add(robot2);
	Robot robot3 = new Robot(new SonyHand(22),new SamsungHead(55),new ToshibaLeg(21),"TC-14");
        robots.add(robot3);
        for (Robot robot:robots) {
            robot.robotActions();
            System.out.println("-------------------");
            if(biggestRobotPrise<robot.robotPrice()) {
                biggestRobotPrise = robot.robotPrice();
                nameOfMostExpensiveRobot = robot.getName();
            }
        }
        System.out.printf("%s is most expensive robot with coast %d $",nameOfMostExpensiveRobot,biggestRobotPrise);
    }
}

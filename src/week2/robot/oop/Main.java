package week2.robot.oop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // //ask user info (static method)
        Robot robot = Main.createRobot();
//        Robot robot2 = new Robot("a", "asd");
//        Robot robot3 = new Robot("a", "asd");
//        Robot robot4 = new Robot("a", "asd");
//        Robot robot5 = new Robot("a", "asd");
//
// run robot (instance method)
        robot.run();
//        robot2.run();

        int numberOfCreatedRobot = Robot.getNumberOfCreatedRobot();
        System.out.println(numberOfCreatedRobot);
    }

    public static Robot createRobot() {
        // //ask user info
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter robot name:");
        String robotName = sc.nextLine();
        System.out.println("Enter message:");
        String msg = sc.nextLine();

        Robot robot = new Robot(robotName, msg);
        return robot;
    }
}

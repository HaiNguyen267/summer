package week2.robot.oop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // //ask user info
        Robot robot = createRobot();
        // run robot
        robot.run();
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

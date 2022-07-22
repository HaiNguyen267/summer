package week2.robot.oop;

import java.util.Scanner;

public class Robot {
    private static int numberOfCreatedRobot = 0;
    private String name;
    private String msg;

    public Robot(String name, String msg) {
        this.name = name;
        this.msg = msg;
        numberOfCreatedRobot++;
    }

    public void run() {
        int choice = printMenuAndGetUserChoice();
        performAction(choice);
    }
    private int printMenuAndGetUserChoice() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Remind message\n" +
                "2. Do calculation\n");
        int choice = Integer.parseInt(sc.nextLine());

        return choice;
    }

    private void performAction(int choice) {
        Scanner sc = new Scanner(System.in);
        if (choice == 1) {
            printMessage();
        } else {
            doCalculation();
        }
    }

    private void printMessage() {
        System.out.println("Message: " + msg);
    }

    private void doCalculation() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum: " + (sum));

    }

    public static int getNumberOfCreatedRobot() {
        return numberOfCreatedRobot;
    }
}

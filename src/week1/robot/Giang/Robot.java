package week1.robot.Giang;

import java.util.Scanner;

public class Robot {
    String name;
    String message;

    public Robot(String name, String message) {
        this.name = name;
        this.message = message;
    }

    public void printMenu() {
        System.out.println("1. Remind message\n" +
                "2. Do calculation");
    }

    public void remindMessage() {
        System.out.println(message);
    }

    public void sum() {
        System.out.println("Enter two numbers: ");
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        System.out.println("The sum: " + (number1+number2) );
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        printMenu();
        String choose = sc.nextLine();

        if (choose.equals("1")) {
            remindMessage();
        } else {
            sum();
        }
    }
}

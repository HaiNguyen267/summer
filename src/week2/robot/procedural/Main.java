package week2.robot.procedural;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //ask user info
        System.out.println("Enter robot name:");
        String robotName = sc.nextLine();
        System.out.println("Enter message:");
        String msg = sc.nextLine();


        // print menu and get user choice
        int choice = printMenuAndGetUserChoice();

        // perform action
        performAction(choice, msg);
    }

    public static void performAction(int choice, String msg) {
        Scanner sc = new Scanner(System.in);
        if (choice == 1) {
            System.out.println("Message: " + msg);
        } else {
            System.out.println("Enter two numbers: ");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int sum = num1 + num2;
            System.out.println("The sum: " + (sum));
        }
    }

    public static int printMenuAndGetUserChoice() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Remind message\n" +
                "2. Do calculation\n");
        int choice = Integer.parseInt(sc.nextLine());

        return choice;
    }
}

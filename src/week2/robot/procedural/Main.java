package week2.robot.procedural;

import week2.robot.oop.Robot;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        printProgramInfo();
//        sayHello("Vu");
//        sayHello("Giang");
//        sayHello("Lam");
//        sayHello("Quan");
//
//        int randomNum = generateRandomNumber();
//        double bmi = calculateBMI(60, 170);

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

    private static void performAction(int choice, String msg) {
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

    private static int printMenuAndGetUserChoice() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Remind message\n" +
                "2. Do calculation\n");
        int choice = Integer.parseInt(sc.nextLine());

        return choice;
    }


    // no input, no output
    private static void printProgramInfo() {
        System.out.println("A Java program");
    }

    // input. no output
    private static void sayHello(String name) {
        System.out.println("Hello " + name);
    }

    // no input, output
    private static int generateRandomNumber() {
        return (int) (Math.random() * 11);
    }

    // input and output
    private static void checkBMI(int weightKg, int heightCm ) {
        // calculate bmi
        double bmi = calculateBMI(weightKg, heightCm);

        printResult(bmi);

    }

    private static void printResult(double bmi) {
        // print result
        if (bmi > 25) {
            System.out.println("You are overweight");
        } else if (bmi >= 18.5) {
            System.out.println("You are healthy");
        } else {
            System.out.println("Underweight");
        }
    }

    private static double calculateBMI(int weightKg, int heightCm) {
        double heightM = (double) heightCm / 100;

        double bmi = weightKg / (heightM * heightM);

        return bmi;
    }
}

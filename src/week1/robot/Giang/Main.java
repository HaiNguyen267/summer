package week1.robot.Giang;

import week1.robot.Giang.Robot;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        // creating object (instance)
//        Student giangNguyen = new Student("Giang", 19, "truonggiang@gmail.com");
//        Student vu = new Student("Vu", 20, "vudoan2gmail.com");
//
//        String catName = "Hat";
//        int age = 2;
//        String color = "Yellow";
//
//
//        Cat cat = new Cat(catName, age, color);
//        // calling instance method
//        giangNguyen.introduce();
//        vu.introduce();
//        cat.meomeo();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter robot name: ");
        String name = sc.nextLine();
        System.out.println("Enter message: ");
        String message = sc.nextLine();

        Robot robot = new Robot(name, message);
        robot.run();
    }
}

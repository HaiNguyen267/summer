package week1;

import week1.object.Cat;
import week1.object.Student;

public class Main {
    public static void main(String[] args) {
        // creating object (instance)
        Student giangNguyen = new Student("Giang", 19, "truonggiang@gmail.com");
        Student vu = new Student("Vu", 20, "vudoan2gmail.com");

        String catName = "Hat";
        int age = 2;
        String color = "Yellow";


        Cat cat = new Cat(catName, age, color);
        // calling instance method
        giangNguyen.introduce();
        vu.introduce();
        cat.meomeo();
    }
}

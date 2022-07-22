package week2.robot.class_design.no_inheritance;

import java.util.List;

public class Coder {

    private String name;
    private int age;
    private List<String> languages;

    public Coder(String name, int age, List<String> languages) {
        this.name = name;
        this.age = age;
        this.languages = languages;
    }

    public void eat() {
        System.out.println("I love pizza");
    }

    public void sleep() {
        System.out.println("I sleep 8 hours a day");
    }

    public void code() {
        System.out.println("Coding");
    }

    public void fixBug() {
        System.out.println("Bug fixing");
    }

    public void learnNewLanguages() {
        languages.add("Java");
    }
}

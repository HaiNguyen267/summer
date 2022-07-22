package week2.robot.class_design.inheritance;

import java.util.List;

public class Coder extends Human {
    private List<String> languages;
    public Coder(String name, int age, List<String> languages) {
        super(name, age);
        this.languages = languages;
    }

    public void code() {
        System.out.println("Coding");
    }

    public void fixBug() {
        System.out.println("Fixing");
    }

    public void learnNewLanguages(String newLanguage) {
        languages.add(newLanguage);
    }
}

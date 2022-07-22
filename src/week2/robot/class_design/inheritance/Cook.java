package week2.robot.class_design.inheritance;

public class Cook extends Human {
    private int yearsOfExperience;

    public Cook(String name, int age, int yearsOfExperience) {
        super(name, age);
        this.yearsOfExperience = yearsOfExperience;
    }

    public void cook() {}

    public void decorateFood() {

    }

    public void washDishes() {
    }
}

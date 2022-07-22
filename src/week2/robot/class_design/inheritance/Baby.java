package week2.robot.class_design.inheritance;

public class Baby extends Human{
    public Baby(String name, int age) {
        super(name, age);
    }

    public void doA() {
        eat();
        sleep();
    }

    public void cry() {
        System.out.println("Crying");
    }
}

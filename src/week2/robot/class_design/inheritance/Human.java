package week2.robot.class_design.inheritance;

public class Human {
    protected String name;
    protected int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private void doSomething() {

    }

    protected void eat() {
        System.out.println("I am eating food");
    }

    protected void sleep() {
        System.out.println("I sleep at night");
    }
}

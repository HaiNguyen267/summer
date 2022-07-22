package week2.robot.class_design.no_inheritance;

public class Baby {
    private String name;
    private int age;
    private String nickname;


    public Baby(String name, int age, String nickname) {
        this.name = name;
        this.age = age;
        this.nickname = nickname;
    }

    public void eat() {
        System.out.println("i am eating");
    }

    public void sleep() {
        System.out.println("zzz");
    }

    public void cry() {
        System.out.println("Waah");
    }

}

package week2.robot.class_design.inheritance;

public class Police extends Human {
    private String location;
    private String weapon;

    public Police(String name, int age, String location, String weapon) {
        super(name, age);
        this.location = location;
        this.weapon = weapon;
    }

    public void arrestCriminal() {}

    public void protectPeople() {}

    public void helpPeople() {}
}

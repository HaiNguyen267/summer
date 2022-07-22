package week2.robot.access_modifier.users;

public class User {
    // fields (private protected)
    private String name;
    private String email;


    public void useComputer() {
        Computer computer = new Computer();
        computer.logIn();
        computer.run();
        computer.checkHardware();
    }

    // methods
}

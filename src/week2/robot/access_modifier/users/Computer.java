package week2.robot.access_modifier.users;

// ACCESS MODIFiER: private or public, or protected (inheritance)
public class Computer {
    // fields (private)
    protected String manufacturer;
    private int ram;
    private int ssd;
    private String os;

    public Computer() {

    }
    public Computer(String manufacturer, int ram, int ssd, String os) {
        this.manufacturer = manufacturer;
        this.ram = ram;
        this.ssd = ssd;
        this.os = os;
    }

    void logIn() {
        System.out.println("Logged in");
    }

    public void run() {
        bootStrapOs();
        checkHardware();
        askPassword();
    }

    private void askPassword() {
    }

    protected void checkHardware() {

    }

    protected void bootStrapOs() {

    }

    private void writeDataOnHardDrive() {
        System.out.println("Write something to hard drive");
    }
}

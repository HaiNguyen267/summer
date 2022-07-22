package week2.robot.access_modifier.devices;

import week2.robot.access_modifier.users.Computer;

public class PC extends Computer {

    public void run() {
        bootStrapOs();
        checkHardware();
//        askPassword();
    }
}

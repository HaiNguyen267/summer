package week3.pet_lover.pets;

import week3.pet_lover.app.Menu;
import week3.pet_lover.user.User;


public class Hamster extends Pet{
    public Hamster(User owner) {
        super(owner);
        this.feedingAmount = PetInfo.HAMSTER.getFeedingAmount();
        this.sound = PetInfo.HAMSTER.getSound();
    }

    @Override
    public void runActionMenu() {
        String msg = "\nHamster\n" +
                "1. Feed\n" +
                "2. Run the treadmill\n" +
                "3. Make sounds\n" +
                "0. Back";

        Menu menu = new Menu(msg, 0, 3);

        while (!menu.isStopped()) {
            int choice = menu.printMenuAndGetUserChoice();

            if (choice == 0) {
                menu.stop();
            } else {
                performAction(choice);
            }
        }
    }

    private void performAction(int actionIndex) {
        switch (actionIndex) {
            case 1:
                beingFed();
                break;
            case 2:
                runTreadmill();
                break;
            case 3:
                makeSound();
                break;
        }
    }

    private void runTreadmill() {
        System.out.println("Sqeak! I am running the treadmill");
    }
}

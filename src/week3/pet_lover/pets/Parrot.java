package week3.pet_lover.pets;

import week3.pet_lover.app.Menu;
import week3.pet_lover.user.User;

import java.util.Scanner;

public class Parrot extends Pet{

    public Parrot(User owner) {
        super(owner);
        this.feedingAmount = PetInfo.PARROT.getFeedingAmount();
        this.sound = PetInfo.PARROT.getSound();
    }

    @Override
    public void runActionMenu() {
        String msg = "\nParrot\n" +
                "1. Feed\n" +
                "2. Teach\n" +
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
                teach();
                break;
            case 3:
                makeSound();
                break;
        }
    }

    private void teach() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter something to teach the parrot: ");
        String content = sc.nextLine();

        sound = content;
        makeSound();
    }
}

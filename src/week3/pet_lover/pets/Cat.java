package week3.pet_lover.pets;

import week3.pet_lover.app.Menu;
import week3.pet_lover.user.User;


public class Cat extends Pet{

    public Cat(User owner) {
        super(owner);
        this.feedingAmount = PetInfo.CAT.getFeedingAmount();
        this.sound = PetInfo.CAT.getSound();
    }

    @Override
    public void runActionMenu() {
        String msg = "\nCat\n" +
                "1. Feed\n" +
                "2. Play with toys\n" +
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
                playWithToys();
                break;
            case 3:
                makeSound();
                break;
        }
    }

    private void playWithToys() {
        System.out.println("Meow! i am playing with toys");
    }

}

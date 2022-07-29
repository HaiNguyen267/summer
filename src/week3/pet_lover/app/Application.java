package week3.pet_lover.app;

import week3.pet_lover.pets.*;
import week3.pet_lover.user.User;

public class Application {
    private User user;
    private Cat cat;
    private Dog dog;
    private Hamster hamster;
    private Parrot parrot;

    public Application() {
        initUserAndPets();
    }

    private void initUserAndPets() {
        user = new User(1000, 30);
        cat = new Cat(user);
        dog = new Dog(user);
        hamster = new Hamster(user);
        parrot = new Parrot(user);
    }

    public void runMenu() {
        String msg = "Choose a pet or action:\n" +
                "1. Cat\n" +
                "2. Dog\n" +
                "3. Hamster\n" +
                "4. Parrot\n" +
                "5. Buy more food\n" +
                "0. Exit";

        Menu menu = new Menu(msg, 0, 5);

        while (!menu.isStopped()) {
            System.out.println(user.getInfo());
            int choice = menu.printMenuAndGetUserChoice();

            if (choice == 0) {
                menu.stop();
            } else if (choice == 5){
                user.runBuyFoodMenu();
            } else {
                Pet pet = choosePetBasedOnUserChoice(choice);
                pet.runActionMenu();
            }
        }
    }

    private Pet choosePetBasedOnUserChoice(int choice) {
        switch (choice) {
            case 1: return cat;
            case 2: return dog;
            case 3: return hamster;
            case 4: return parrot;
        }

        return null;
    }
}

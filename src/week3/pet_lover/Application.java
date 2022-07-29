package week3.pet_lover;

import week3.pet_lover.pets.*;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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

    /*public void runMenu() {
        String msg = "Choose a pet or action:\n" +
                "1. Cat\n" +
                "2. Dog\n" +
                "3. Hamster\n" +
                "3. Parrot\n" +
                "5. Buy more food\n" +
                "0. Back";
        List<Integer> validChoices = (List<Integer>) IntStream.rangeClosed(0, 6).collect(Collectors.toList());
        Menu menu = new Menu(msg, validChoices);

        while (!menu.isStopped()) {
            int choice = menu.printMenuAndGetUserChoice();

            if (choice == 0) {
                menu.stop();
            } else if (choice == 5){
                user.runBuyFoodMenu();
            } else {
                Pet pet = choosePetBasedOnUserChoice(choice);
            }
        }
    }*/

    private Pet choosePetBasedOnUserChoice(int choice) {

        return null;
    }
}

package week3.pet_lover;

import week3.pet_lover.pets.Pet;

public class User {
    private int balance;
    private int food;

    public User(int balance, int food) {
        this.balance = balance;
        this.food = food;
    }

    public void feedPet(Pet pet) {
        if (pet.getFeedingAmount() > food) {
            System.out.println("You don't have enough food");
        } else {
            pet.makeSound();
            food -= pet.getFeedingAmount();
            System.out.println("You fed the pet");
        }
    }
}

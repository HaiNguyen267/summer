package week3.pet_lover.user;

import week3.pet_lover.pets.Pet;

import java.util.Scanner;

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

    public void runBuyFoodMenu() {
        int spentAmount = askHowMuchToSpend();

        balance -= spentAmount;
        food += spentAmount * 3;
    }

    private int askHowMuchToSpend() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter amount of money spent buying food ($1 = x3 food): ");
        int amount = Integer.parseInt(sc.nextLine());

        while (amount > balance) {
            System.out.println("Not enough money. Please enter again: ");
            amount = Integer.parseInt(sc.nextLine());
        }

        return amount;
    }

    public String getInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("\nYour balance: $%d\n", balance));
        sb.append(String.format("Your food: %d", food));

        return sb.toString();
    }
}

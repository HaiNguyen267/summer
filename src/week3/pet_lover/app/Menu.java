package week3.pet_lover.app;

import java.util.List;
import java.util.Scanner;

public class Menu {

    private String msg;
    private int minChoice;
    private int maxChoice;
    private boolean stopped;

    public Menu() {

    }

    public Menu(String msg, int minChoice, int maxChoice) {
        this.msg = msg;
        this.minChoice = minChoice;
        this.maxChoice = maxChoice;
    }

    public int printMenuAndGetUserChoice() {
        Scanner sc = new Scanner(System.in);
        System.out.println(msg);

        while (true) {
            try {
                int choice = Integer.parseInt(sc.nextLine());
                // if the choice is valid
                if (choice >= minChoice && choice <= maxChoice) {
                    return choice;
                } else {
                    System.out.println(String.format("Please enter number from %d to %d", minChoice, maxChoice));
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number");
            }
        }
    }

    public boolean isStopped() {
        return stopped;
    }

    public void stop() {
        stopped = true;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setValidChoiceRange(int min, int max) {
        this.minChoice = min;
        this.maxChoice = max;
    }
}

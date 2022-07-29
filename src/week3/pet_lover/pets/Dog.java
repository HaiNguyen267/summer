package week3.pet_lover.pets;

import week3.pet_lover.app.Menu;
import week3.pet_lover.user.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Dog extends Pet {

    private List<TrainedAction> trainedActions;

    private class TrainedAction{
        private String actionName;
        private String actionMsg;

        public TrainedAction(String actionName, String actionMsg) {
            this.actionName = actionName;
            this.actionMsg = actionMsg;
        }

        public String getActionName() {
            return actionName;
        }

        public String getActionMsg() {
            return actionMsg;
        }
    }
    public Dog(User owner) {
        super(owner);
        this.feedingAmount = PetInfo.DOG.getFeedingAmount();
        this.sound = PetInfo.DOG.getSound();
        this.trainedActions = new ArrayList<>();
    }

    @Override
    public void runActionMenu() {
        Menu menu = new Menu();

        while (!menu.isStopped()) {
            // because the menu can be changed every time user trains the dog
            setMsgAndValidChoiceForMenu(menu);

            int choice = menu.printMenuAndGetUserChoice();

            if (choice == 0) {
                menu.stop();
            } else {
                performAction(choice);
            }
        }
    }

    private void setMsgAndValidChoiceForMenu(Menu menu) {
        String msg = createMenuMessage();
        menu.setMsg(msg);

        int defaultActionNum = 3;
        int trainedActionNum = trainedActions.size();
        // the total number of actions the dog can perform is the number of choices that user can choose
        menu.setValidChoiceRange(0, defaultActionNum + trainedActionNum);
    }

    private String createMenuMessage() {

        StringBuilder sb = new StringBuilder();
        String defaultActionMsg = "\nDog\n" +
                "1. Feed\n" +
                "2. Train\n" +
                "3. Make sounds\n";
        sb.append(defaultActionMsg);

        int count = 4;
        for (TrainedAction action : trainedActions) {
            sb.append(String.format("%d. %s\n", count, action.getActionName()));
            count++;
        }

        sb.append("0. Back");

        return sb.toString();
    }


    private void performAction(int actionIndex) {
        if (actionIndex <= 3) {
            performDefaultAction(actionIndex);
        } else {
            performTrainedAction(actionIndex);
        }
    }

    private void performDefaultAction(int actionIndex) {
        switch (actionIndex) {
            case 1:
                beingFed();
                break;
            case 2:
                train();
                break;
            case 3:
                makeSound();
                break;
        }
    }

    private void train() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the action name: ");
        String actionName = sc.nextLine();

        while (actionNameAlreadyExist(actionName)) {
            System.out.println("The action was already learnt by the dog!");
            System.out.println("Enter the other action name: ");
            actionName = sc.nextLine();
        }

        System.out.println("Enter the action message: ");
        String actionMsg = sc.nextLine();

        trainedActions.add(new TrainedAction(actionName, actionMsg));

    }

    private boolean actionNameAlreadyExist(String actionName) {
        return trainedActions.stream()
                .map(TrainedAction::getActionName)
                .anyMatch(name -> name.equals(actionName));
    }

    private void performTrainedAction(int actionIndex) {
        // the first trained action will be shown in the menu with index 4
        // but the index of it in the trainedActions list is 0
        TrainedAction action = trainedActions.get(actionIndex - 4);

        System.out.println(action.getActionMsg());
    }
}

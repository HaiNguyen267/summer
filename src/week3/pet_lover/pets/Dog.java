package week3.pet_lover.pets;

import week3.pet_lover.User;

public class Dog extends Pet {

    public Dog(User owner) {
        super(owner);
        this.feedingAmount = PetInfo.DOG.getFeedingAmount();
        this.sound = PetInfo.DOG.getSound();
    }

    @Override
    public void runActionMenu() {

    }
}

package week3.pet_lover.pets;

import week3.pet_lover.User;

public class Cat extends Pet{

    public Cat(User owner) {
        super(owner);
        this.feedingAmount = PetInfo.CAT.getFeedingAmount();
        this.sound = PetInfo.CAT.getSound();
    }

    @Override
    public void runActionMenu() {

    }
}

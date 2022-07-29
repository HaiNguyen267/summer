package week3.pet_lover.pets;

import week3.pet_lover.User;

public class Parrot extends Pet{

    public Parrot(User owner) {
        super(owner);
        this.feedingAmount = PetInfo.PARROT.getFeedingAmount();
        this.sound = PetInfo.PARROT.getSound();
    }

    @Override
    public void runActionMenu() {

    }
}

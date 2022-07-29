package week3.pet_lover.pets;

import week3.pet_lover.User;

public class Hamster extends Pet{
    public Hamster(User owner) {
        super(owner);
        this.feedingAmount = PetInfo.HAMSTER.getFeedingAmount();
        this.sound = PetInfo.HAMSTER.getSound();
    }

    @Override
    public void runActionMenu() {

    }
}

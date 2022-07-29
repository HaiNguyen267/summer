package week3.pet_lover.pets;


import week3.pet_lover.user.User;

public abstract class Pet {
    protected int feedingAmount;
    protected String sound;
    protected User owner;

    public Pet(User owner) {
        this.owner = owner;
    }

    public int getFeedingAmount() {
        return feedingAmount;
    }

    public String getSound() {
        return sound;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public void beingFed() {
        owner.feedPet(this);
    }

    public void makeSound() {
        System.out.println(sound);
    }

    public abstract void runActionMenu();

}

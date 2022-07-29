package week3.pet_lover.pets;

public enum PetInfo {
    CAT(3, "Meow meow"), DOG(5, "Woof woof"), HAMSTER(1, "Sqeak"), PARROT(1, "Whistle");

    private final int feedingAmount;
    private final String sound;

    PetInfo(int feedingAmount, String sound) {
        this.feedingAmount = feedingAmount;
        this.sound = sound;
    }

    public int getFeedingAmount() {
        return feedingAmount;
    }

    public String getSound() {
        return sound;
    }
}

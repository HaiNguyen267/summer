package week3.pet_lover;

import week1.object.Dog;
import week3.pet_lover.pets.Cat;
import week3.pet_lover.pets.Hamster;
import week3.pet_lover.pets.Parrot;

public class Application {
    private User user;
    private Cat cat;
    private Dog dog;
    private Hamster hamster;
    private Parrot parrot;

    public Application() {
        initUserAndPets();
    }

    private void initUserAndPets() {
        user = new User(1000, 30);
        cat = new Cat(user);
//        dog = new Dog(user);
        hamster = new Hamster(user);
        parrot = new Parrot(user);
    }
}

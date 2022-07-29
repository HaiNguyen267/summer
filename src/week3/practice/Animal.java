package week3.practice;

public abstract class Animal {
    protected int age;
    protected String color;

    protected Animal(int age, String color) {
        this.age = age;
        this.color = color;
    }

    protected abstract void eat();
    protected abstract void sleep();
    protected abstract void playWithFriends();
}

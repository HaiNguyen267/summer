package week3.example;

public abstract class Human {
    protected String name;
    protected int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    protected abstract void entertain();
    public abstract void eatFavoriteFood();
}

package week3.example;

public class Student extends Human{
    private int id;
    public Student(String name, int age, int id) {
        super(name, age);
        this.id = id;
    }

    @Override
    protected void entertain() {

    }

    @Override
    public void eatFavoriteFood() {

    }
}

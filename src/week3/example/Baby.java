package week3.example;

public class Baby extends Human{
    public Baby(String name, int age) {
        super(name, age);
    }

    @Override
    protected void entertain() {
        System.out.println();
    }

    @Override
    public void eatFavoriteFood() {

    }
}

package week3.example;

public class Attacker extends Human implements FootballPlayer{
    public Attacker(String name, int age) {
        super(name, age);
    }

    @Override
    public void kick() {
        System.out.println("");
    }

    @Override
    public void run() {

    }

    @Override
    public void shoot() {

    }

    @Override
    public void pass() {

    }

    @Override
    public void celebrate() {

    }

    @Override
    protected void entertain() {

    }

    @Override
    public void eatFavoriteFood() {

    }
}

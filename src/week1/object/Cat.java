package week1.object;

public class Cat {
    // field
    String name;
    int age;
    String color;

    public Cat (String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    // method
    public void meomeo() {
        System.out.println("The cat name is " + name );
    }
}

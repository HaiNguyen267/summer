package week1.object;

public class Student {
//    fields
    String name;
    int age;
    String email;

    public Student(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    //    methods
    public void introduce() {
        System.out.println("My name is " + name  );
        System.out.println("I'm " + age +" years old" );
        System.out.println("My email is " + email );
    }
}

package week5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1. print the exception info
        // 2. handle by code

        Student giang = new Student("Giang");
        Student hai = new Student("Hai");
        Student vu = new Student("Vu");
        List<Student> list = Arrays.asList(giang, hai, vu);

        String name = "lam";
        Student student = findStudentByName(name, list);
    }

    private static Student findStudentByName(String name, List<Student> list) {
        for (Student student : list) {
            if (student.getName().equals(name)) {
                return student;
            }
        }
        throw new StudentNotFoundException("Not found student with name="+name);
    }


}


class StudentNotFoundException extends RuntimeException {
    public StudentNotFoundException(String message) {
        super(message);
    }
}

package week4.theory;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\NKcomputer\\IdeaProjects\\summer\\src\\week4\\theory\\lam.txt");

        boolean createdSuccessfully = file.createNewFile();

        if (createdSuccessfully) {
            System.out.println("Successfully");
        } else {
            System.out.println("Failed");
        }


    }
}

package week4.exercise;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class FileCreator {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of numbers to generate: ");
        int count = Integer.parseInt(sc.nextLine());
        System.out.println("Enter the lower:");
        int min = Integer.parseInt(sc.nextLine());
        System.out.println("Enter the upperbound: ");
        int max = Integer.parseInt(sc.nextLine());

        String randomName = generateRandomFileName();
        String path = ".\\src\\week4\\random_number\\" + randomName;



        try (PrintWriter printWriter = new PrintWriter(path)) {
            for (int i = 0; i < count; i++) {
                int randomNumber = generateRandomNumber(min, max);
                printWriter.println(randomNumber);
            }
        }

        System.out.println(String.format("Created a file named %s, containing %d random numbers from %d to %d", randomName, count, min, max));
    }

    private static int generateRandomNumber(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    private static String generateRandomFileName() {
        String characters =  "ABCDEFGHIJKLMNOPQRSTUVWXYZ12345674890";

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            int randomIndex = (int) (Math.random() * characters.length());
            sb.append(characters.charAt(randomIndex));
        }

        sb.append(".txt");
        return sb.toString();
    }
}

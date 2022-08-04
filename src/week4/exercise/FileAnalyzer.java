package week4.exercise;

import java.io.*;
import java.util.Scanner;

public class FileAnalyzer {
    public static void main(String[] args) throws IOException {

        File folder = new File("src/week4/random_number");

        File[] files = folder.listFiles();

        // Using Scanner
        long start1 = System.currentTimeMillis();
        processingByScanner(files);
        long end1 = System.currentTimeMillis();

        // Using BufferedReader
        long start2 = System.currentTimeMillis();
        processingByBufferedReader(files);
        long end2 = System.currentTimeMillis();

        // Compare Scaner and BufferReader
        printStatistics(start1, end1, start2, end2);
    }

    private static void printStatistics(long start1, long end1, long start2, long end2) {
        long timeByScanner = end1 - start1;
        System.out.println();
        System.out.println("timeByScanner = " + timeByScanner + "ms");

        long timeByBufferedReader = end2 - start2;
        System.out.println("timeByBufferedReader = " + timeByBufferedReader + "ms");

        double compared = (double) timeByBufferedReader / timeByScanner;
        System.out.println("Using  BufferReader is  " + ((double)1 / compared) + " faster than the Scanner");
    }

    private static void processingByBufferedReader(File[] files) throws IOException {
        System.out.println("\nRead file using BufferedReader");
        for (File file : files) {
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = reader.readLine();
            while (line != null) {
                int num = Integer.parseInt(line);
                min = Math.min(min, num);
                max = Math.max(max, num);
                line = reader.readLine();
            }

            System.out.println("\nFile: " + file.getName());
            System.out.println("Min: " + min);
            System.out.println("Max: " + max);
        }
    }

    private static void processingByScanner(File[] files) throws FileNotFoundException {
        System.out.println("Read file using scanner");
        for (File file : files) {
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                int num = Integer.parseInt(scanner.nextLine());
                min = Math.min(min, num);
                max = Math.max(max, num);
            }

            System.out.println("\nFile: " + file.getName());
            System.out.println("min: " + min);
            System.out.println("max: " + max);
        }
    }
}

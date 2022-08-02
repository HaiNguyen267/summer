package extra1_functional_programming;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        int[] arr = {-4, 20, 6, 91, 16, 0, -20};

        int max = arr[0];
        // imperative
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // declarative
        int max2 = Arrays.stream(arr).max().getAsInt();

        FriendlyMan man = new FriendlyMan();
        man.say();

        HelloSayer man2 = new HelloSayer() {
            @Override
            public void say() {
                System.out.println("Hi");
            }
        };
        man2.say();
    }
}

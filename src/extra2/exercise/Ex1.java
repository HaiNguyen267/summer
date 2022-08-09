package extra2.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex1 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(-5, 2, 11, -52, 6, 90, -21, 4, 12, 5);

        // MAP
        // 1. create a new list containing doubled values of the list
        List<Integer> doubledList = list.stream().map(x -> x*2).collect(Collectors.toList());
        System.out.println(doubledList);

        // 2. create a new string list contains "odd" and "even" accordingly to the values in the list
        List<String> oddEvenList = list.stream().map(x -> x%2==0 ? "even" : "odd").collect(Collectors.toList());
        System.out.println(oddEvenList);

        // 3. create a new list containing values of the list plus 1
        List<Integer> incrementList = list.stream().map(x -> x+1).collect(Collectors.toList());
        System.out.println(incrementList);

        // 4. create a new string list contains "negative" and "positive" accordingly to the values in the list
        List<String> nevPosList = list.stream().map(x -> x>=0 ? "positive" : "negative").collect(Collectors.toList());
        System.out.println(nevPosList);
    }
}

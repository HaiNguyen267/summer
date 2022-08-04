package extra1_functional_programming;

import week1.object.Cat;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {


        List<String> list = Arrays.asList("Hai", "Hieu", "Lam",  "Tuan", "Quan", "Vu");

        long count = list.stream()
                .filter(name -> name.length() == 4)
                .count();

        List<String> sortedList = list
                            .stream()
                            .sorted((name1, name2) -> name1.length() > name2.length() ? 1 : 0)
                            .toList();

        Optional<String> op1 = Optional.of("Quan");
        // NPE
        if (op1.isPresent()) {
            System.out.println(op1.get());
        } else {
            System.out.println("Null");
        }

        System.out.println("sortedList = " + sortedList);

    }
}

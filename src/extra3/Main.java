package extra3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // count the occurences of each element
        int[] arr = {1,2,4,1,1,2,3,4,2,3,1,4};
        // element 1: 4 times
        // element 2: 3 times
        // element 3: 2 times
        // element 4: 2 times

        //  find a pair              2 3
        //Input: nums = [1,0,1,1], k = 1
        //Output: true

        //Input:
        int[] nums = {1,2,3,1,2,3};
        int k = 3;



        //Output: false
    }

    private static int f1(List<Integer> list) {
        return 2;
    }
    private static int hashFunction(String s) {
        int num = 0;
        for (char ch : s.toCharArray()) {
            num += ch;
        }
        return s.length() + num;
    }
}

package array_programme;

import java.util.*;

public class FindFifthMaxValueInArray {
    public static void main(String[] args) {
        int arr[] = {1, 7, 38, 24, 8, 4, 7, 9};

        TreeSet<Integer> set = new TreeSet<>();
        for (int a : arr) {
            set.add(a);
        }
        List<Integer> list = new ArrayList<>(set.descendingSet());
        System.out.println(list.get(5));
    }
}

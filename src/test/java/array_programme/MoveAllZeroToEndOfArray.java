package array_programme;

import java.util.Arrays;

public class MoveAllZeroToEndOfArray {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        int nonZeroIndex = 0;
        for (int a : arr) {
            if (a != 0) {
                arr[nonZeroIndex] = a;
                nonZeroIndex++;
            }
        }
        for (int i = nonZeroIndex; i < arr.length; i++) {
            arr[i] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }
}

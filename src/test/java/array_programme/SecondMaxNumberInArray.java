package array_programme;

public class SecondMaxNumberInArray {
    public static void main(String[] args) {
        int arr[] = {1, 4, 6, 2, 5, 6};

        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int a : arr) {
            if (a > firstMax) {
                secondMax = firstMax;
                firstMax = a;
            } else if (a > secondMax) {
                secondMax = a;
            }
        }
        System.out.println(secondMax);
    }
}

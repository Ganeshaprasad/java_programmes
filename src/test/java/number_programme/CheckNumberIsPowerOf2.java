package number_programme;

public class CheckNumberIsPowerOf2 {
    public static void main(String[] args) {
        //Input: 16 → true
        //Input: 18 → false
        //using math.pow
        int num = 16;
        boolean isPower = false;
        for (int i = 0; Math.pow(2, i) <= num; i++) {
            if (Math.pow(2, i) == num) {
                isPower = true;
            }
        }
        if (isPower == true) {
            System.out.println("16 is power of 2");
        } else {
            System.out.println("16  not is power of 2");
        }
    }
}

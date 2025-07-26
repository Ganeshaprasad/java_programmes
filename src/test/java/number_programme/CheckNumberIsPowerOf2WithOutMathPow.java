package number_programme;

public class CheckNumberIsPowerOf2WithOutMathPow {
    public static void main(String[] args) {
        //16-->true    18-->false
        int num = 16;
        if (num <= 0) {
            System.out.println("not power of 2");
            return;
        }

        while (num > 1) {
            if (num % 2 != 0) {
                System.out.println("not power of 2");
                return;
            }
            num = num / 2;
        }
        System.out.println("number is power of 2");

    }
}

package hw1_9;

public class hw1 {
    public static int sumOfDigits(int n) {
        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n = n / 10;
        }

        return sum;
    }

}

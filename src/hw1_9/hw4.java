package hw1_9;

public class hw4 {
    public static void binFraction(double x, int n) {

        double fraction = x % 1;

        for (int i = 0; i < n; i++) {
            fraction *= 2;
            int digit = (int) fraction;
            System.out.print(digit);
            fraction -= digit;
        }

        System.out.println();
    }

}

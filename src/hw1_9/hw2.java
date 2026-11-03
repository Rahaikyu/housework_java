package hw1_9;

public class hw2 {
    public static int sumOfSeven(int a, int b) {
        if (a > b) {
            return 0;
        }

        int start = Math.max(a, 10);
        int end = Math.min(b, 99);

        int totalSum = 0;

        for (int i = start; i <= end; i++) {

            if (i % 7 == 0) {
                int firstDigit = i / 10;
                int secondDigit = i % 10;
                totalSum += (firstDigit + secondDigit);
            }
        }

        return totalSum;
    }

}

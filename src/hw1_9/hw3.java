package hw1_9;

public class hw3 {
    public static int sumOfThirteen(int n) {
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (getSumOfDigits(i) % 13 == 0) {
                count++;
            }
        }

        return count;
    }

    private static int getSumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

}

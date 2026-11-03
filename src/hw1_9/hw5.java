package hw1_9;

public class hw5 {
    public static double avgOf4Digit(int[] arr) {
        if (arr == null || arr.length == 0) {
            return -1.0;
        }

        long sum = 0;
        int count = 0;

        for (int num : arr) {
            if (num >= 1000 && num <= 9999) {
                sum += num;
                count++;
            }
        }

        if (count == 0) {
            return -1.0;
        }

        return (double) sum / count;
    }

}
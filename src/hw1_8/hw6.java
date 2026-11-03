package hw1_8;

import java.util.Scanner;

public class hw6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int mostPopular = arr[0];
        int maxCount = 0;

        for (int i = 0; i < n; i++) {
            int currentElement = arr[i];
            int currentCount = 0;

            for (int j = 0; j < n; j++) {
                if (arr[j] == currentElement) {
                    currentCount++;
                }
            }

            if (currentCount > maxCount) {
                maxCount = currentCount;
                mostPopular = currentElement;
            }
        }

        System.out.println(mostPopular);
    }
}

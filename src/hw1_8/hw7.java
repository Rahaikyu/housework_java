package hw1_8;

import java.util.Scanner;

public class hw7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();

        int[] arr = new int[n];
        int negCount = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] < 0) {
                negCount++;
            }
        }

        int[] negatives = new int[negCount];
        int[] nonNegatives = new int[n - negCount];

        int negIndex = 0;
        int nonNegIndex = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                negatives[negIndex++] = arr[i];
            } else {
                nonNegatives[nonNegIndex++] = arr[i];
            }
        }

        int index = 0;
        for (int i = 0; i < negatives.length; i++) {
            arr[index++] = negatives[i];
        }
        for (int i = 0; i < nonNegatives.length; i++) {
            arr[index++] = nonNegatives[i];
        }

        if (n > 0) {
            System.out.print(arr[0]);
            for (int i = 1; i < n; i++) {
                System.out.print(" " + arr[i]);
            }
            System.out.println();
        }
    }
}

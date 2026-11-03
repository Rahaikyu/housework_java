package hw1_8;

import java.util.Scanner;

public class hw4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = 4 + i * 3;
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
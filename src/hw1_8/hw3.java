package hw1_8;

import java.util.Scanner;

public class hw3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            int current = sc.nextInt();

            if (current % 2 != 0) {
                sum += current;
                count++;
            }
        }

        if (count == 0) {
            System.out.println("NO");
        } else {

            double average = (double) sum / count;

            System.out.printf("%.2f\n", average);
        }
    }
}

package hw1_7;

import java.util.Scanner;

public class hw8 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while (n > 0) {
            int digit = n % 10;

            if (digit % 2 != 0) {
                System.out.println(digit);
                return;
            }

            n = n / 10;
        }

        System.out.println("NO");
    }
}

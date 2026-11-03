package hw1_7;

import java.util.Scanner;

public class hw9 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int minDigit = 9;

        while (n > 0) {
            int digit = n % 10;

            if (digit > 0 && digit < minDigit) {
                minDigit = digit;
            }

            n = n / 10;
        }

        System.out.println(minDigit);
    }
}

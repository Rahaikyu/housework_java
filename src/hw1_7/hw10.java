package hw1_7;

import java.util.Scanner;

public class hw10 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int candidate = n + 1;

        while (true) {
            boolean rickPrime = true;

            for (int i = 2; i * i <= candidate; i++) {
                if (candidate % i == 0) {
                    rickPrime = false;
                    break;
                }
            }

            if (rickPrime) {
                System.out.println(candidate);
                return;
            }

            candidate++;
        }
    }
}
package hw1_5;

import java.util.Scanner;

public class hw5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();


        boolean result = (a + b == 0) ||
                (a + c == 0) ||
                (a + d == 0) ||
                (b + c == 0) ||
                (b + d == 0) ||
                (c + d == 0);

        System.out.println(result);
    }
}

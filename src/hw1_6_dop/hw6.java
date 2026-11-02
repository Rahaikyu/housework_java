package hw1_6_dop;

import java.util.Scanner;

public class hw6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("impossible");
            sc.close();
            return;
        }

        int a2 = a * a;
        int b2 = b * b;
        int c2 = c * c;

        if (a2 + b2 == c2 || a2 + c2 == b2 || b2 + c2 == a2) {
            System.out.println("right");
        } else if (a2 + b2 < c2 || a2 + c2 < b2 || b2 + c2 < a2) {
            System.out.println("obtuse");
        } else {
            System.out.println("acute");
        }

        sc.close();
    }
}

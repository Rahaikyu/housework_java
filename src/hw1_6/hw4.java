package hw1_6;

import java.util.Locale;
import java.util.Scanner;

public class hw4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        if (!sc.hasNextDouble()) {
            return;
        }

        double a = sc.nextDouble();
        double b = sc.nextDouble();

        if (a == 0) {
            if (b > 0) {
                System.out.println("any x");
            } else {
                System.out.println("no such x");
            }
        } else if (a > 0) {
            double r = -b / a;
            if (r == 0.0) r = 0.0;

            if (r < 0) {
                System.out.println("any x");
            } else {
                System.out.printf(Locale.US, "x<%.1f or x>%.1f\n", -r, r);
            }
        } else {
            double r = -b / a;
            if (r == 0.0) r = 0.0;

            if (r <= 0) {
                System.out.println("no such x");
            } else {
                System.out.printf(Locale.US, "%.1f<x<%.1f\n", -r, r);
            }
        }


    }
}
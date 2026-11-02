package hw1_6_dop;

import java.util.Scanner;

public class hw2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int d = sc.nextInt();


        if (m < 1 || m > 12 || d < 1) {
            System.out.println(-1);
            return;
        }


        int maxDays = 0;
        int passed = 0;

        switch (m) {
            case 12:
                maxDays = 31;
                passed = 334;
                break;
            case 11:
                maxDays = 30;
                passed = 304;
                break;
            case 10:
                maxDays = 31;
                passed = 273;
                break;
            case 9:
                maxDays = 30;
                passed = 243;
                break;
            case 8:
                maxDays = 31;
                passed = 212;
                break;
            case 7:
                maxDays = 31;
                passed = 181;
                break;
            case 6:
                maxDays = 30;
                passed = 151;
                break;
            case 5:
                maxDays = 31;
                passed = 120;
                break;
            case 4:
                maxDays = 30;
                passed = 90;
                break;
            case 3:
                maxDays = 31;
                passed = 59;
                break;
            case 2:
                maxDays = 28;
                passed = 31;
                break;
            case 1:
                maxDays = 31;
                passed = 0;
                break;
        }

        if (d > maxDays) {
            System.out.println(-1);
        } else {

            System.out.println(365 - (passed + d));
        }
    }
}

package hw1_7;

import java.util.Scanner;

public class hw5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;

        while (n > 0) {
            n = n / 2;
            count++;
        }

        System.out.println(count);
    }
}
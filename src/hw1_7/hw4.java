package hw1_7;

import java.util.Scanner;

public class hw4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int q = 0;

        while(a >= b) {
            a = a - b;
            q++;
        }

        System.out.println(q + " " + a);
    }
}
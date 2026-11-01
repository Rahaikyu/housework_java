package hw1_5;

import java.util.Scanner;

public class hw4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        System.out.println(x >= 100 && x <= 999 && x % 5 == 0);
    }
}

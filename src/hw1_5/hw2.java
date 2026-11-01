package hw1_5;

import java.util.Scanner;

public class hw2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();


        System.out.println(x >= -3 && x <= 5 || x >= 9 && x <= 15);
    }
}

package hw1_5;

import java.util.Scanner;

public class hw3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();


        System.out.println(!((x >= -2 && x <= 3) || (x >= 6 && x <= 9)));
    }
}

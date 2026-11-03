package hw1_7;

import java.util.Scanner;

public class hw2{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        while (sc.hasNextInt()) {
            int a = sc.nextInt();

            if(a > 10) {
                sum += a;
            }

            if(a % 5 == 0) {
                break;
            }
        }

        System.out.println(sum);
    }
}

package hw1_7;

import java.util.Scanner;

public class hw3{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        while(true) {
            int a = sc.nextInt();

            if(a < 10 || a >= 99) {
                break;
            }

            int digit1 = a / 10;
            int digit2 = a % 10;

            sum += (digit1 + digit2);
        }

        System.out.println(sum);
    }
}

package hw1_7;

import java.util.Scanner;

public class hw6 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int i = 25;
        int n = sc.nextInt();
        int sum = 0;

        while(i <= n) {
            if(i % 2 == 0) {
                sum += i;
            }
            i++;
        }

        System.out.println(sum);
    }
}
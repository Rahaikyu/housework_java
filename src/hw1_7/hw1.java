package hw1_7;

import java.util.Scanner;

public class hw1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int check = 0;

        while(true) {
            int a = sc.nextInt();
            check++;

            if(a < 0) {
                break;
            }
        }

        System.out.println(check);
    }
}

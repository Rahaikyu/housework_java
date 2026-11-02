package hw1_6;

import java.util.Scanner;

public class hw1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num >= 0 && num <= 9) {
            System.out.println("DIGIT");
        } else if (num >= 10 && num <= 99) {
            System.out.println("NUM");
        } else {
            System.out.println("OTHER");
        }


    }
}

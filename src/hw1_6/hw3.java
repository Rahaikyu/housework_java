package hw1_6;

import java.util.Scanner;

public class hw3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tort = sc.nextInt();
        int lastNum = tort % 10;
        int lastTwoNum = tort % 100;

        if (lastTwoNum >= 11 && lastTwoNum <= 14) {
            System.out.println(tort + " TORTOV");
        } else if (lastNum == 1) {
            System.out.println(tort + " TORT");
        } else if (lastNum >= 2 && lastNum <= 4) {
            System.out.println(tort + " TORTA");
        } else {
            System.out.println(tort + " TORTOV");
        }
    }
}

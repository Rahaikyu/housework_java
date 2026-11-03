package hw1_8;

import java.util.Scanner;

public class hw2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;
        boolean hasEven = false;

        for (int i = 0; i < n; i++) {
            int current = sc.nextInt();

            if (current % 2 == 0) {
                sum += current;
                hasEven = true;
            }
        }

        if (hasEven) {
            System.out.println(sum);
        } else {
            System.out.println("NO");
        }
    }
}

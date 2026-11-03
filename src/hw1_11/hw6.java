package hw1_11;

import java.util.Scanner;

public class hw6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();

        int size = 2 * n + 1;
        int[][] a = new int[size][size];

        int r = n;
        int c = n;
        int currentNumber = 0;
        a[r][c] = currentNumber++;

        int[] dr = {-1,  0, 1, 0};
        int[] dc = { 0, -1, 0, 1};

        int direction = 0;
        int steps = 1;

        while (currentNumber < size * size) {
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < steps; j++) {
                    if (currentNumber >= size * size) break;
                    r += dr[direction];
                    c += dc[direction];
                    a[r][c] = currentNumber++;
                }
                direction = (direction + 1) % 4;
            }
            steps++;
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.printf("%3d", a[i][j]);
            }
            System.out.println();
        }
    }
}

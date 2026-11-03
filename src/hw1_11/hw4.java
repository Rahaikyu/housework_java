package hw1_11;
import java.util.Scanner;

public class hw4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] a = new int[n][m];

        for (int k = 0; k < n * m; k++) {
            int i = k / m;
            int j = k % m;
            a[i][j] = i * j;
        }
    }
}
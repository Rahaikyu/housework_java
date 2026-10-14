import java.util.Scanner;

public class hw2 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        int a = 2;
        int n = num.nextInt();

        long result = (n < 0 || n >= 32) ? 0 : (1 << n);

        System.out.println(result);
    }
}

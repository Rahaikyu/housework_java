import java.util.Scanner;

public class hw5 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        long A = num.nextLong();
        int i = num.nextInt();

        int mask = (i >= 32) ? -1 : (1 << i) - 1;

        long result = A & mask;

        System.out.println(result);
    }
}

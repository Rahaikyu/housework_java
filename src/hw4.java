import java.util.Scanner;

public class hw4 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        long A = num.nextLong();
        int i = num.nextInt();

        long result = (i < 0 || i >= 32) ? A : (A ^ (1 << i));

        System.out.println(result);
    }
}

import java.util.Scanner;

public class hw1 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        if (num.hasNextLong()) {
            long A = num.nextLong();
            int i = num.nextInt();

            long result = (i >= 32) ? 0 : (A >> i) << i;

            System.out.println(result);
        }
    }
}
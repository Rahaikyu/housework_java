import java.util.Scanner;

public class hw6 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        int N = num.nextInt();

        long result = ((N & (N - 1)) == 0) ? 0 : 1;

        System.out.println(result);
    }
}

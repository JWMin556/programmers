import java.util.*;

public class Main {

    static long A, B, C;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        A = sc.nextLong();
        B = sc.nextLong();
        C = sc.nextLong();

        System.out.println(pow(A, B));
    }

    private static long pow(long a, long b) {
        if (b == 0) return 1;

        long half = pow(a, b / 2);

        long result = (half * half) % C;

        if (b % 2 == 1) {
            result = (result * a) % C;
        }

        return result;
    }
}
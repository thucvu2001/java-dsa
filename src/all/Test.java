package all;

import java.util.Scanner;

public class Test {
    public static long ext(long a, long b, long[] x, long[] y) {
        if (b == 0) {
            x[0] = 1;
            y[0] = 0;
            return a;
        }
        long[] x1 = new long[1];
        long[] y1 = new long[1];
        long tmp = ext(b, a % b, x1, y1);
        x[0] = y1[0];
        y[0] = x1[0] - (a / b) * y1[0];
        return tmp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long[] x = new long[1];
        long[] y = new long[1];
        System.out.println(ext(a, b, x, y));
        System.out.println(x[0] + " " + y[0]);

    }
}

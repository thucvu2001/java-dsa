package p1_LyThuyetSo_ToHop;

import java.util.Scanner;

// tìm hệ số x, y sao cho ax + by = gcd(a, b)
public class ExtendedEuclid {
    public static long ext(long a, long b, long[] x, long[] y) {
        if (b == 0) {
            x[0] = 1L;
            y[0] = 0L;
            return a;
        }
        long[] x1 = new long[1];
        long[] y1 = new long[1];
        long temp = ext(b, a % b, x1, y1);
        x[0] = y1[0];
        y[0] = x1[0] - (a / b) * y1[0];
        return temp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long[] x = new long[1];
        long[] y = new long[1];
        long d = ext(a, b, x, y);
        System.out.println(d);
        System.out.println(x[0] + " " + y[0]);
    }
}

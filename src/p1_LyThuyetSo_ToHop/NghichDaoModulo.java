package p1_LyThuyetSo_ToHop;

import java.util.Scanner;

public class NghichDaoModulo {

    // tìm nghịch đảo module x sao cho ax % m = 1 % m = 1
    // x được gọi là nghịch đảo modulo của a dưới module m
    // điều kiện: gcd(a, m) = 1
    public static long ext(long a, long b, long[] x, long[] y) {
        if (b == 0) {
            x[0] = 1;
            y[0] = 0;
            return a;
        }
        long[] x1 = new long[1];
        long[] y1 = new long[1];
        long temp = ext(b, a % b, x1, y1);
        x[0] = y1[0];
        y[0] = x1[0] - (a / b) * y1[0];
        return temp;
    }

    // O(logN)
    public static void inv(long a, long m) {
        long[] x = new long[1];
        long[] y = new long[1];
        long d = ext(a, m, x, y);
        if (d != 1) {
            System.out.println("khong ton tai nghich dao modulo");
        } else {
            System.out.println("ucln: " + d);
            System.out.println("nghich dao module x: " + ((x[0] % m) + m) % m);
        }
    }

    // O(N)
    public static long inv2(long a, long m) {
        for (int i = 1; i < m; i++) {
            if (a * i % m == 1) {
                return i;
            }
        }
        return 0;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long m = scanner.nextLong();
        inv(a, m);
    }
}

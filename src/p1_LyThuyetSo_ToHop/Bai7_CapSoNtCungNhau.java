package p1_LyThuyetSo_ToHop;

import java.util.Scanner;

public class Bai7_CapSoNtCungNhau {
    public static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        for (long i = a; i < b; i++) {
            for (long j = i + 1; j <= b; j++) {
                if (gcd(i, j) == 1) {
                    System.out.println("(" + i + "," + j + ")");
                }
            }
        }
    }
}

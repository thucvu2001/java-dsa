package p1_LyThuyetSo_ToHop;

import java.util.Scanner;

public class Bai8_SoTPrime {
    public static boolean[] prime = new boolean[10000001];

    public static void sang() {
        for (int i = 0; i <= 10000000; i++) {
            prime[i] = true;
        }
        prime[0] = false;
        prime[1] = false;
        for (int i = 2; i <= Math.sqrt(10000000); i++) {
            for (int j = i * i; j <= 10000000; j += i) {
                prime[j] = false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        sang();
        long n = scanner.nextLong();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (prime[i] == true) {
                System.out.println((long) i * i);
            }
        }
    }
}

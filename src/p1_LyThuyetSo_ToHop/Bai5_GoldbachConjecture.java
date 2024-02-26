package p1_LyThuyetSo_ToHop;

import java.util.Scanner;

public class Bai5_GoldbachConjecture {

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
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            for (int i = 1; i <= n / 2; i++) {
                if (prime[i] && prime[n - i]) {
                    System.out.println(i + " " + (n - i));
                }
            }
        }
    }
}

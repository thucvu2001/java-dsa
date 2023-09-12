package p1_LyThuyetSo_ToHop;

import java.util.Scanner;

public class Bai3_SangSoNguyenToTrenDoan {
    public static void sang(int l, int r) {
        boolean prime[] = new boolean[r - l + 1];
        for (int i = 0; i <= r - l; i++) {
            prime[i] = true;
        }

        for (int i = 2; i <= Math.sqrt(r); i++) {
            for (int j = Math.max(i * i, (l + i - 1) / i * i); j <= r; j += i) {
                prime[j - l] = false;
            }
        }

        for (int i = l; i <= r; i++) {
            if (prime[i - l]) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int left = scanner.nextInt();
        int right = scanner.nextInt();

        sang(left, right);
    }
}

package p1_LyThuyetSo_ToHop;

import java.util.Scanner;

public class Bai6_SoThuanNguyenTo {
    public static boolean check(int n) {
        while (n != 0) {
            int x = n % 10;
            if (x != 2 && x != 3 && x != 5 && x != 7) {
                return false;
            }
            n /= 10;
        }
        return true;
    }

    public static boolean prime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return n > 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            if (check(n) && prime(n)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}

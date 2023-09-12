package p1_LyThuyetSo_ToHop;

import java.util.Scanner;

public class Bai4_SoNtCoCacChuSoNt {
    public static boolean prime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return n > 2;
    }

    public static boolean chuSoNt(int n) {
        while (n != 0) {
            int tmp = n % 10;
            if (tmp != 2 && tmp != 3 && tmp != 5 && tmp != 7) {
                return false;
            }
            n /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        for (int i = a; i <= b; i++) {
            if (chuSoNt(i) && prime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}

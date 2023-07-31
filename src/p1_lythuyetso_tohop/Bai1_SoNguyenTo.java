package p1_lythuyetso_tohop;

import java.util.Scanner;

public class Bai1_SoNguyenTo {
    public static boolean checkPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return n > 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (checkPrime(n)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

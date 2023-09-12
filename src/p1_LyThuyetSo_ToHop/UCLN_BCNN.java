package p1_LyThuyetSo_ToHop;

import java.util.Scanner;

public class UCLN_BCNN {
    public static int ucln1(int a, int b) {
        if (a == 0 || b == 0) {
            return a + b;
        }
        while (a != 0 && b != 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        return a + b;
    }

    public static int ucln2(int a, int b) {
        if (b == 0) {
            return a;
        }
        return ucln2(b, a % b);
    }

    public static int bcnn(int a, int b) {
        return a / ucln2(a, b) * b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println(ucln1(x, y));
        System.out.println(bcnn(x, y));
    }
}

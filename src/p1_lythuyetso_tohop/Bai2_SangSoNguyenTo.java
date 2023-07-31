package p1_lythuyetso_tohop;

import java.util.Scanner;

public class Bai2_SangSoNguyenTo {
    public static boolean[] prime = new boolean[10000000];

    public static void sang() {
        for (int i = 0; i < 10000000; i++) {
            prime[i] = true;
        }
        prime[0] = false;
        prime[1] = false;
        for (int i = 2; i < Math.sqrt(10000000); i++) {
            if (prime[i] == true) {
                for (int j = i * i; j < 10000000; j += i) {
                    prime[j] = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        sang();
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            if (prime[n] == true) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}

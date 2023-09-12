package p1_LyThuyetSo_ToHop;

import java.util.Scanner;

public class TongUoc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        long sum = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                sum += i;
                if (i != n / i) {
                    System.out.print(n / i + " ");
                    sum += n / i;
                }
            }
        }

        System.out.println("\n" + sum);
    }
}

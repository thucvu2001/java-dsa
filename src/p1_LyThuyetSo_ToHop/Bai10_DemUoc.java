package p1_LyThuyetSo_ToHop;

import java.util.Scanner;

public class Bai10_DemUoc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        long sum = 1;
        for (int i = 1; i <= t; i++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            sum = sum * (m + 1);
        }
        System.out.println(sum);
    }
}

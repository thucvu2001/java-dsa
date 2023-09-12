package p1_LyThuyetSo_ToHop;

import java.util.Scanner;

// Đếm ước sử dụng phân tích thừa số nguyên tố của một số
public class DemUoc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int cnt = 1;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            int tmp = 0;
            while (n % i == 0) {
                tmp++;
                n /= i;
            }
            cnt *= (tmp + 1);
        }
        if (n > 1) {
            cnt *= 2;
        }
        System.out.println(cnt);
    }
}

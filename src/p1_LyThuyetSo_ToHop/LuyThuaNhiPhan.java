package p1_LyThuyetSo_ToHop;

import java.util.Scanner;

public class LuyThuaNhiPhan {

    static long binPow(long a, long b, long c) {
        if (b == 0) {
            return 1;
        }
        long x = binPow(a, b / 2, c);
        if (b % 2 == 1) {
            return (x % c) * (x % c) * (a % c) % c;
        } else {
            return (x % c) * (x % c) % c;
        }
    }


    // tính theo phân tích thừa số nguyên tố của số mũ (b), nếu bit cuối cùng của b là 1 thì nhân vào
    // vd tính 3^19
    // 19 = 10011
    // 3^19 = 3^(2^4) * 3^(2^1) * 3^(2^0)
    // 3^19 = 3^16    * 3^2     * 3^1
    //
    static long binPow2(long a, long b, long c) {
        if (a == 0) {
            return 0;
        }
        if (b == 0) {
            return 1;
        }
        long res = 1;
        while (b != 0) { // xét bit của b từ cuối lên
            if (b % 2 == 1) { // nếu bit cuối là 1 thì nhân vào kết quả
                res *= a;
                res %= c;
            }
            a *= a;
            a %= c;
            b /= 2;
        }
        return res;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        System.out.println(binPow2(2, 3, 1000000007));
    }
}

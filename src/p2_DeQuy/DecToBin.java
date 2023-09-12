package p2_DeQuy;

import java.util.Scanner;

public class DecToBin {
    public static void convert(int n) {
        if (n > 0) {
            convert(n / 2);
            System.out.print(n % 2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        convert(n);
    }
}

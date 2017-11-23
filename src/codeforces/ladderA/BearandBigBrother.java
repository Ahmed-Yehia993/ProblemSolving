package codeforces.ladderA;

import java.util.Scanner;

public class BearandBigBrother {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int years = 0;

        while (a <= b) {
            years++;
            a *= 3;
            b *= 2;
        }
        System.out.println(years);
    }
}

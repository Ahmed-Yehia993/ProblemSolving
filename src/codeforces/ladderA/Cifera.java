package codeforces.ladderA;

import java.util.Scanner;

public class Cifera {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k, l, NOD = 0;
        k = scanner.nextInt();
        l = scanner.nextInt();
        long temp = k;
        int times = 0;
        while (temp < l) {
            temp *= k;
            times++;
        }
        if (temp == l) {
            System.out.printf("YES\n%d", times);
        } else {
            System.out.println("NO");
        }
    }
}

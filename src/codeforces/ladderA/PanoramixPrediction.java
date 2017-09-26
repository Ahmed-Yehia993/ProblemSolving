package codeforces.ladderA;

import java.util.Scanner;

public class PanoramixPrediction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        System.out.println((nextPrime(n1) == n2) ? "YES" : "NO");
    }

    private static int nextPrime(int num) {
        num++;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                num++;
                i = 2;
            } else {
                continue;
            }
        }
        return num;
    }
}

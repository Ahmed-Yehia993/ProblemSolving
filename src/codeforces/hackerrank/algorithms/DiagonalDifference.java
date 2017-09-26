package codeforces.hackerrank.algorithms;

import java.util.Scanner;

public class DiagonalDifference {


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] num = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                String line = scanner.next();
                num[i][j] = Integer.valueOf(line).intValue();
            }
        }
        int sumpd = 0, sumsd = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j)
                    sumpd += num[i][j];
                if ((i + j) == (n - 1))
                    sumsd += num[i][j];
            }
        }
        System.out.println(Math.abs(sumpd - sumsd));
    }
}

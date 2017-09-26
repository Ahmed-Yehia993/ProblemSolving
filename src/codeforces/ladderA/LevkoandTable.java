package codeforces.ladderA;

import java.util.Scanner;

public class LevkoandTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[][] table = new int[n][n];
        for (int i = 0; i < n; i++) {
            table[i][i] = k;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }
}

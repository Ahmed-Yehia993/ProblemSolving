package hackerrank.warmup;

import java.io.*;
import java.util.*;

public class DiagonalDifference {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] matrrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrrix[i][j] = scanner.nextInt();
            }
        }
        int mainDiagonal = 0, secondDiagonal = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    mainDiagonal += matrrix[i][j];
                }
                if (Math.abs(i + j) == (n - 1)) {
                    secondDiagonal += matrrix[i][j];
                }
            }
        }
        System.out.println(Math.abs(mainDiagonal - secondDiagonal));

    }
}

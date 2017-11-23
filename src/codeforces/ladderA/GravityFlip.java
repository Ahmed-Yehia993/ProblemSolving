package codeforces.ladderA;

import java.util.Arrays;
import java.util.Scanner;

public class GravityFlip {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] columes = new int[n];
        for (int i = 0; i < n; i++) {
            columes[i] = scanner.nextInt();
        }
        Arrays.sort(columes);

        for (int i = 0; i < n; i++) {
            System.out.print(columes[i] + " ");
        }
    }
}

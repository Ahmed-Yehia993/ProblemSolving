package codeforces.ladderA;

import java.util.Arrays;
import java.util.Scanner;

public class LinetoCashier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nop = new int[n];
        int [] que = new int[n];
        for (int i = 0; i < n; i++) {
            nop[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < nop[i]; j++) {
                int prod = scanner.nextInt();
                que[i] +=(prod*5)+15;
            }
        }
        int small = Arrays.stream(que).reduce((x, y) -> x < y ? x : y).getAsInt();
        System.out.println(small);
    }
}

package codeforces.FirstTimeToSolve;

import java.util.Scanner;

public class KidsLoveCandies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] NOC = new int[n];
            int count = 0;
            for (int j = 0; j < n; j++) {
                NOC[i] = scanner.nextInt();
                count += (int)(NOC[i] / k);
            }
            System.out.println(count);

        }
    }
}

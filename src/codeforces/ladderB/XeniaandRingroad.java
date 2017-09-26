package codeforces.ladderB;

import java.util.Scanner;

public class XeniaandRingroad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] tasks = new int[m];
        for (int i = 0; i < m; i++) {
            tasks[i] = scanner.nextInt();
        }
        int cur = 1;
        long sol = 0;
        for (int i = 0; i < m; i++) {
            if (tasks[i] > cur) {
                sol += tasks[i] - cur;
                cur = tasks[i];
            } else if (tasks[i] < cur) {
                sol += (n + 1) - cur;
                cur = 1;
                sol += tasks[i] - cur;
                cur = tasks[i];
            }
        }
        System.out.println(sol);
    }
}

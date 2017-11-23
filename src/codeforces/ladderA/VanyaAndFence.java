package codeforces.ladderA;

import java.util.Scanner;

public class VanyaAndFence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int h = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int ai = scanner.nextInt();
            if (ai > h)
                count += 2;
            else
                count += 1;
        }
        System.out.println(count);
    }
}

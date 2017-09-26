package codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class ChessTourney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] num = new int[2 * n];
        for (int i = 0; i < 2 * n; i++) {
            num[i] = scanner.nextInt();
        }
        Arrays.sort(num);
        int[] fArray = new int[n];
        int[] sArray = new int[n];
        System.arraycopy(num, 0, fArray, 0, n);
        System.arraycopy(num, n, sArray, 0, n);
        int count = 0;
        for (int i = 0; i < n; i++) {

            if (sArray[i] > fArray[i])
                count++;

        }
        if (count >= n)
            System.out.print("YES");
        else
            System.out.print("NO");
    }
}
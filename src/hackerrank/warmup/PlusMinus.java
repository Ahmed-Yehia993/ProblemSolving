package hackerrank.warmup;

import java.io.*;
import java.util.*;

public class PlusMinus {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        int countNegative = 0, countPoisitive = 0, zeros = 0;

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (num > 0) {
                countPoisitive++;
            } else if (num < 0)
                countNegative++;
            else
                zeros++;
        }

        System.out.println((double) countPoisitive / (double) n);
        System.out.println((double) countNegative / (double) n);
        System.out.println((double) zeros / (double) n);

    }

}

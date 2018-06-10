package codeforces.hackerrank.algorithms;

import java.util.Scanner;

public class SuperReducedString {

    static int isMadhavArray(int[] a) {
        int start = 0;
        int size = 0;
        int base = a[0];
        for (int i = start; i < a.length; i++) {
            int tot = 0;
            int end = start + i;
            System.out.println(start +" " + end);
            if(end < a.length) {
                for (int j = start; j <= end; j++) {
                    tot += a[j];
                }
                if (tot != base)
                    return 0;
                start += i + 1;
            }
        }
        return 1;
    }

    public static void main(String[] args) {

        System.out.println( isDigitIncreasing(37));
        /*

        String result = super_reduced_string(s);
        System.out.println(result);*/
    }
   static boolean isDigitIncreasing(int num)
    {
        int n = 1;
        int sum = 1;
        while (n <= num) {
            if (num % n == 0 && n * 10 > num) return true;
            sum = sum * 10 + 1;
            n += sum;
        }
        return false;
    }
}

package codeforces.ladderA;

import java.util.Scanner;

public class LifeWithoutZeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long a = scanner.nextLong();
        long b = scanner.nextLong();

        long c = a + b;

        long awz = removeZero(a);
        long bwz = removeZero(b);
        long cwz = removeZero(c);
        if ((awz + bwz) == cwz)
            System.out.println("YES");
        else
            System.out.println("NO");
    }

    public static long removeZero(long n) {
        char[] number = Long.toString(n).toCharArray();
        String num = "";
        for (int i = 0; i < number.length; i++) {
            if (number[i] != '0')
                num += number[i];
        }
        return new Long(num).longValue();
    }
}

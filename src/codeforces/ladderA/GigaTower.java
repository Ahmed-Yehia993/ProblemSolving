package codeforces.ladderA;

import java.util.Scanner;

public class GigaTower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 1; i <= 16; i++) {
            if (check(n + i)) {
                System.out.println(i);
                break;
            }
        }
    }

    public static boolean check(int number) {
        char[] num = Integer.toString(number).toCharArray();
        for (int i = 0; i < num.length; i++) {
            if (num[i] == '8') {
                return true;
            }
        }
        return false;
    }
}

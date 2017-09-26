package codeforces.ladderA;

import java.util.Scanner;

public class VasyaandDigitalRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int d = scanner.nextInt();
        if (d == 0 && k > 1) {
            System.out.println("No solution");
        } else
            for (int i = 0; i < k; i++) {
                if (i == 0) {
                    System.out.print(d);
                } else System.out.print(0);
            }
    }
}

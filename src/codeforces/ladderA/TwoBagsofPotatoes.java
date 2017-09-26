package codeforces.ladderA;

import java.util.Scanner;

public class TwoBagsofPotatoes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        int k = scanner.nextInt();
        int n = scanner.nextInt();
        int x = k - y % k;
        int top = n - y;
        if (x <= top) {
            System.out.print(x + " ");
            x += k;
            while (x <= top) {
                System.out.print(x + " ");
                x += k;
            }
            System.out.print(" \n");
        } else {
            System.out.print(-1);
        }
    }
}

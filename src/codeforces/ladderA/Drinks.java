package codeforces.ladderA;

import java.util.Scanner;

public class Drinks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double total = 0;
        for (int i = 0; i < n; i++) {
            total += scanner.nextInt();

        }
        total = total/100;
        double res = ((double)total/(double)n);
        System.out.println(res * 100);
    }
}

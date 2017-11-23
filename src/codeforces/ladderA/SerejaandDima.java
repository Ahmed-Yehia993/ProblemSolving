package codeforces.ladderA;

import java.util.Scanner;

public class SerejaandDima {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] cards = new int[n];
        for (int i = 0; i < n; i++) {
            cards[i] = scanner.nextInt();
        }

        int seraj = 0, dima = 0;

        int start = 0;
        int last = cards.length - 1;
        int i = 0;
        while (last >= start) {
            if (i % 2 == 0) {
                if (cards[start] > cards[last]) {
                    seraj += cards[start];
                    start++;
                } else {
                    seraj += cards[last];
                    last--;
                }
            } else {
                if (cards[start] > cards[last]) {
                    dima += cards[start];
                    start++;
                } else {
                    dima += cards[last];
                    last--;
                }
            }
            i++;
        }
        System.out.println(seraj + " " + dima);

    }
}

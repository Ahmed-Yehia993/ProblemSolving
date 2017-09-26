package codeforces.ladderA;

import java.util.HashMap;
import java.util.Scanner;

public class CollectingBeatsisFun {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        char[][] board = new char[4][4];
        for (int i = 0; i < 4; i++) {
            board[i] = sc.next().toCharArray();
        }
        HashMap<String, Integer> counts = new HashMap<>();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                String ke = String.valueOf(board[i][j]);
                if (board[i][j] != '.') {
                    if (!counts.containsKey(ke)) {
                        counts.put(ke, 1);
                    } else {
                        int x = counts.get(ke) + 1;
                        counts.put(ke, x);
                    }
                }
            }
        }
        for (String key : counts.keySet()) {
            if (counts.get(key) > 2 * k) {
                System.out.println("NO");
                System.exit(0);
            }
        }
        System.out.println("YES");
    }
}

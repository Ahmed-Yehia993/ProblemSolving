package codeforces.ladderA;

import java.util.Scanner;

public class DZYLovesChessboard {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        char[][] checcboard = new char[n][m];
        String data = "";
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (scanner.hasNext()) {
                data = scanner.next();
                count = 0;
            } else {
                break;
            }
            for (int j = 0; j < m; j++)
                checcboard[i][j] = data.charAt(count++);
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (checcboard[i][j] == '.') {
                    if ((j + i) % 2 == 0) checcboard[i][j] = 'B';
                    else checcboard[i][j] = 'W';
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(checcboard[i][j]);
            }
            System.out.println();
        }
    }
}

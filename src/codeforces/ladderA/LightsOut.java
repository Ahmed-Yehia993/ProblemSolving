package codeforces.ladderA;

import java.util.Scanner;

public class LightsOut {
    static int[][] arr = new int[3][3];
    int[][] res = new int[3][3];


    public static void main(String[] args) {
        String data = "";
        Scanner sc = new Scanner(System.in);

        int[][] res = new int[3][3];

        for (int i = 0; i < 3; ++i) {
            String line = sc.nextLine();
            arr[i] = lineToIntArray(line);
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                new LightsOut().add(res, arr[i][j], i, j);
                new LightsOut().add(res, arr[i][j], i - 1, j);
                new LightsOut().add(res, arr[i][j], i, j - 1);
                new LightsOut().add(res, arr[i][j], i, j + 1);
                new LightsOut().add(res, arr[i][j], i + 1, j);

            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (res[i][j] % 2 == 0)
                    System.out.print(1);
                else System.out.print(0);
            }
            System.out.println();
        }

    }

    public void add(int[][] res, int num, int i, int j) {
        if (i >= 0 && j >= 0 && i < 3 && j < 3) {
            res[i][j] += num;
        }
    }

    private static int[] lineToIntArray(String line) {
        String[] cols = line.split(" ");
        int[] ints = new int[cols.length];
        for (int i = 0; i < cols.length; ++i) {
            ints[i] = Integer.parseInt(cols[i]);
        }
        return ints;
    }
}

package codeforces.ladderA;

import java.util.Scanner;

public class Team {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] matrix = new int[n][3];
        int sol = 0;
        for (int i = 0; i < matrix.length; i++) {
            int x = scanner.nextInt(), y = scanner.nextInt(), z = scanner.nextInt();
            if (x + y + z >= 2)
                sol++;

        }
        System.out.println(sol);


    }


}

package hackerrank.Implementation;

import java.util.Scanner;

public class BreakingTheRecords {

    static int[] breakingRecords(int[] score) {
        // Complete this function
        int[] result = new int[2];

        int max = score[0];
        int min = score[0];
        int countMax = 0, countMin = 0;
        for (int i = 1; i < score.length; i++) {
            if (score[i] > max) {
                max = score[i];
                countMax++;
            }
            if (score[i] < min) {
                min = score[i];
                countMin++;
            }
        }

        result[0] = countMax;
        result[1] = countMin;
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] score = new int[n];
        for (int score_i = 0; score_i < n; score_i++) {
            score[score_i] = in.nextInt();
        }
        int[] result = breakingRecords(score);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }
}

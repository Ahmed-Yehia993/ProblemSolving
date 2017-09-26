package codeforces.ladderA;


import java.util.Arrays;
import java.util.Scanner;

public class YaroslavandPermutations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = scanner.nextInt();
        }
        Arrays.sort(num);
        int con = 1, mxCon = 1;
        for (int i = 1; i < n; i++) {
            if (num[i] == num[i - 1]) {
                con++;
                if (con > mxCon)
                    mxCon = con;
            } else
                con = 1;
        }
        if (mxCon <= (n + 1) / 2)
            System.out.println("YES");
        else
            System.out.println("NO");
    }

}

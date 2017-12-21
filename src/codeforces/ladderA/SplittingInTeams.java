package codeforces.ladderA;

import java.util.Scanner;

public class SplittingInTeams {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int cnt1 = 0, cnt2 = 0;
        for (int i = 0; i < n; i++) {
            int h  = scanner.nextInt();
            if (h == 1)
                cnt1++;
            else
                cnt2++;
        }
        if (cnt1 > cnt2)
            System.out.println(cnt2 + (cnt1 - cnt2) / 3);
        else
            System.out.println(cnt1);

    }
}

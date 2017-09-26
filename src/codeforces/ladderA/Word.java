package codeforces.ladderA;

import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] s = scanner.nextLine().toCharArray();
        int lcc = 0, ucc = 0;
        String res = "";
        for (int i = 0; i < s.length; i++) {
            res += s[i];
            if (Character.isUpperCase(s[i])) {
                ucc++;
            } else {
                lcc++;
            }
        }
        if (ucc > lcc) {
            System.out.println(res.toUpperCase());
        } else
            System.out.println(res.toLowerCase());

    }
}

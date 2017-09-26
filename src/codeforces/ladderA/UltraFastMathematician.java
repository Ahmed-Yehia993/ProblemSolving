package codeforces.ladderA;

import java.util.Scanner;

public class UltraFastMathematician {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.next();
        String s2 = scanner.next();
        String res = "";

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == s2.charAt(i)) res += "0";
            else res += "1";
        }
        System.out.println(res);
    }
}

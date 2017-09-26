package codeforces.ladderA;

import java.util.Scanner;

public class Lever {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] lev = scanner.nextLine().toCharArray();
        long right = 0, left = 0;
        boolean pivot = false, cn = false;
        for (int i = 0; i < lev.length; i++) {
            if (lev[i] == '=' && pivot)
                left += 1;
            else if (lev[i] == '=' && pivot == false)
                right += 1;
            if (pivot && lev[i] != '^' && lev[i] != '=') {
                right += Long.valueOf(lev[i] + "");
                cn = true;
            } else if (pivot == false && lev[i] != '^' && lev[i] != '=') {
                left += Long.valueOf(lev[i] + "");
                cn = true;
            }
            if (lev[i] == '^')
                pivot = true;

        }
        if (cn == false) {
            right = left = 0;
        }
        if (right > left)
            System.out.println("right");
        else if (left > right)
            System.out.println("left");
        else
            System.out.println("balance");
    }
}

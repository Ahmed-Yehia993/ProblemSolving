package codeforces.ladderA;

import java.util.Scanner;

public class BeautifulYear {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        year++;
        while (!isUniqueChars2(year)){
            year++;
        }
        System.out.println(year);
    }

    public static boolean isUniqueChars2(int year) {
        String str = Integer.toString(year);
        boolean[] char_set = new boolean[256];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if (char_set[val]) {
                return false;
            }
            char_set[val] = true;
        }
        return true;
    }
}

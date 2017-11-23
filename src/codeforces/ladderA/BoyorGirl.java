package codeforces.ladderA;

import java.util.HashSet;
import java.util.Scanner;

public class BoyorGirl {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String un = scanner.next();
        HashSet<Character> cha = new HashSet<>();
        for (int i = 0; i < un.length(); i++) {
            cha.add(un.charAt(i));
        }
        if (cha.size() % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else
            System.out.println("IGNORE HIM!");
    }
}

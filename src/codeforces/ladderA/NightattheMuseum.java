package codeforces.ladderA;


import java.util.Scanner;

public class NightattheMuseum {
    public static void main(String[] args) {

        char[] a = new char[]{
                'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        Scanner scanner = new Scanner(System.in);
        char current = 'a';

        String s = scanner.next();
        int rotated = 0;
        for (int i = 0; i < s.length(); i++) {
            rotated += Math.min(Math.abs(find(current, a) - find(s.charAt(i), a)), Math.abs(26 - Math.abs(find(current, a) - find(s.charAt(i), a))));
            current = s.charAt(i);
        }
        System.out.println(rotated);
    }

    public static int find(char s, char[] a) {
        for (int i = 0; i < a.length; i++) {
            if (s == a[i])
                return i;
        }
        return -1;
    }

}
package codeforces.ladderA;

import java.util.Scanner;

public class BlackSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] cal = new int[5];
        cal[1] = scanner.nextInt();
        cal[2] = scanner.nextInt();
        cal[3] = scanner.nextInt();
        cal[4] = scanner.nextInt();
        int total = 0;
        String s = scanner.next();
        for (int i = 0; i < s.length(); i++) {
            total += cal[Integer.parseInt(s.charAt(i) + "")];
        }
        System.out.println(total);
    }
}

package codeforces.ladderA;

import java.util.Scanner;

public class Magnets {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int group = 1;
        String last = scanner.next();
        for (int i = 1; i < n; i++) {
            String side = scanner.next();
            if (!last.equals(side)) {
                group++;
                last = side;
            }

        }
        System.out.println(group);

    }
}

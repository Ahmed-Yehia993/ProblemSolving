package codeforces.ladderA;

import java.util.Scanner;

public class Parallelepiped {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s1 = scanner.nextInt(), s2 = scanner.nextInt(), s3 = scanner.nextInt();

        int a = (int) Math.sqrt((s1 * s3) / s2);
        int b = (int) Math.sqrt((s2 * s1) / s3);
        int c = (int) Math.sqrt((s3 * s2) / s1);
        System.out.println(4 * (a + b + c));
    }
}

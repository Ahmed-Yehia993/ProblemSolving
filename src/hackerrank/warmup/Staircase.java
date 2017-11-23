package hackerrank.warmup;

import java.util.Scanner;

public class Staircase {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int spaces = n - i - 1;
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int j = spaces; j <n ; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

}

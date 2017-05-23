package codeforces.ladderA;

import java.util.Scanner;

public class PerfectPermutation {
	public static int[] per;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		per = new int[n];
		if (n > 1) {
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= n; j++) {
					if (i != j && check(j)) {
						per[i - 1] = j;
						break;
					}
				}
			}
			if (!check(0)) {
				System.out.println(-1);
				System.exit(0);
			}
			for (int i = 0; i < per.length; i++) {
				System.out.print(per[i] + " ");
			}
		} else {
			System.out.println(-1);
		}
	}

	public static boolean check(int value) {
		for (int i = 0; i < per.length; i++) {
			if (per[i] == value) {
				return false;
			}

		}
		return true;
	}

}

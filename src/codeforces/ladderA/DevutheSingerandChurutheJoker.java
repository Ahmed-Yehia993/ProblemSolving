package codeforces.ladderA;

import java.util.Scanner;

public class DevutheSingerandChurutheJoker {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int d = scanner.nextInt();
		int[] durations = new int[n];
		int sum = 0;
		for (int i = 0; i < n; i++) {
			int dd = scanner.nextInt();
			durations[i] = dd;
			sum += dd;
		}

		if (sum + 10 * (n - 1) > d)
			System.out.println(-1);
		else
			System.out.println((d - sum) / 5);

	}

}

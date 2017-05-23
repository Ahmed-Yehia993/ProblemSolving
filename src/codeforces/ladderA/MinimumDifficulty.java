package codeforces.ladderA;

import java.util.Scanner;

public class MinimumDifficulty {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] higths = new int[n];
		for (int i = 0; i < higths.length; i++) {
			higths[i] = scanner.nextInt();
		}

		int t;
		int mm;
		int ans = Integer.MAX_VALUE;

		for (int i = 1; i < n - 1; i++) {
			mm = 0;
			for (int j = 0; j < n - 1; j++) {
				if (j == i) {
					t = higths[j + 1] - higths[j - 1];
				} else if (j + 1 == i)
					t = higths[j + 2] - higths[j];
				else
					t = higths[j + 1] - higths[j];

				mm = Math.max(mm, t);

			}
			ans = Math.min(ans, mm);
		}
		System.out.println(ans);
	}

}

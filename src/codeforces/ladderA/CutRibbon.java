package codeforces.ladderA;

import java.util.Arrays;
import java.util.Scanner;

public class CutRibbon {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] cuts = new int[3];

		cuts[0] = scanner.nextInt();
		cuts[1] = scanner.nextInt();
		cuts[2] = scanner.nextInt();
		int[] max_cuts = new int[4001];
		Arrays.sort(cuts);
		for (int i = 0; i <= n; i++) {
			max_cuts[i] = Integer.MIN_VALUE;
		}

		max_cuts[0] = 0;
		max_cuts[cuts[0]] = 1;
		max_cuts[cuts[1]] = 1;
		max_cuts[cuts[2]] = 1;

		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < 3; j++) {
				if (cuts[j] > i)
					break;
				max_cuts[i] = Math.max(max_cuts[i - cuts[j]] + 1, max_cuts[i]);
			}
		}
		System.out.println(max_cuts[n]);
	}

}

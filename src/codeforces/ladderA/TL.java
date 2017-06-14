package codeforces.ladderA;

import java.util.Arrays;
import java.util.Scanner;

public class TL {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int[] a = new int[n];
		int[] b = new int[m];
		for (int i = 0; i < n; i++) {
			int number = scanner.nextInt();
			a[i] = number;
		}
		for (int i = 0; i < m; i++) {
			int number = scanner.nextInt();
			b[i] = number;
		}
		int v, p, c;

		v = Arrays.stream(a).min().getAsInt();
		p = Arrays.stream(a).max().getAsInt();
		c = Arrays.stream(b).min().getAsInt();

		if (Math.max(2 * v, p) < c)
			System.out.println(Math.max(2 * v, p));
		else
			System.out.println(-1);
	}

}

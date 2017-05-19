package codeforces.ladderA;

import java.util.Arrays;
import java.util.Scanner;

public class Puzzles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner i = new Scanner(System.in);
		int n = i.nextInt() - 1, m = i.nextInt(), z[] = new int[m], mi = 10000, q;
		for (q = 0; q < m; z[q++] = i.nextInt());
		Arrays.sort(z);
		for (q = 0, mi = z[q + n] - z[q]; q + n < m; mi = Math.min(z[q + n] - z[q++], mi));
		System.out.println(mi);
	}

}

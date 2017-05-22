package codeforces.ladderA;

import java.util.Arrays;
import java.util.Scanner;

public class Dragons {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int s = scanner.nextInt();
		int n = scanner.nextInt();
		Pair dragons[] = new Pair[n];
		for (int i = 0; i < n; i++) {
			int xi = scanner.nextInt();
			int yi = scanner.nextInt();
			Pair p = new Pair(xi, yi);
			dragons[i] = p;
		}
		boolean win = true;
		Arrays.sort(dragons);

		for (int i = 0; i < dragons.length; i++) {
			if (dragons[i].key < s) {
				s += dragons[i].value;
				win = win && true;
			} else {
				win = win && false;
			}
		}
		if (win)
			System.out.println("YES");
		else
			System.out.println("NO");
	}

}

class Pair implements Comparable<Pair> {
	Integer key;
	Integer value;

	public Pair(Integer key, Integer value) {
		this.key = key;
		this.value = value;
	}

	@Override
	public int compareTo(Pair o) {
		return this.key.compareTo(o.key);
	}
}

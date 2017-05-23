package codeforces.ladderA;

import java.util.Scanner;

public class CounterExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long l = scanner.nextLong();
		long r = scanner.nextLong();
		if (l % 2 != 0)
			l++;

		if (l + 2 > r)
			System.out.println(-1);
		else
			System.out.println(l + " " + (l + 1) + " " + (l + 2));
	}

}

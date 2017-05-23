package codeforces.ladderA;

import java.util.Scanner;

public class TheaterSquare {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int a = scanner.nextInt();
		System.out.println((long) ((m + a - 1) / a) * ((n + a - 1) / a));
	}

}

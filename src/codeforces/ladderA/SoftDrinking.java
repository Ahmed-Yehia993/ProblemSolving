package codeforces.ladderA;

import java.util.Scanner;

public class SoftDrinking {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt(), k = scanner.nextInt(), l = scanner.nextInt(), c = scanner.nextInt(),
				d = scanner.nextInt(), p = scanner.nextInt(), nl = scanner.nextInt(), np = scanner.nextInt();

		System.out.println(Math.min(((k * l) / nl), Math.min((d * c), (p / np))) / n);
	}

}

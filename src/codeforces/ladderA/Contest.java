package codeforces.ladderA;

import java.util.Scanner;

public class Contest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int d = scanner.nextInt();

		int vasya = Math.max((3 * b) / 10, b - ((b / 250) * d));
		int misha = Math.max((3 * a) / 10, a - ((a / 250) * c));

		if (vasya > misha)
			System.out.println("Vasya");
		else if (misha > vasya)
			System.out.println("Misha");
		else
			System.out.println("Tie");
	}

}

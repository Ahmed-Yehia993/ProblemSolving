package codeforces.ladderA;

import java.util.Scanner;

public class CheapTravel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n, m, a, b;
		Scanner scanner = new Scanner(System.in);

		n = scanner.nextInt();
		m = scanner.nextInt();
		a = scanner.nextInt();
		b = scanner.nextInt();
		if (m * a <= b)
			System.out.println(n * a);
		else
			System.out.println((n / m) * b + Math.min((n % m) * a, b));

	}

}

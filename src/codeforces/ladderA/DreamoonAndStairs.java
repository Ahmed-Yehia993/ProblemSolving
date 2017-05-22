package codeforces.ladderA;

import java.util.Scanner;

public class DreamoonAndStairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int result = 0;

		if (m > n)
			result = -1;
		else {
			if (n % 2 == 0)
				result = n / 2;
			else
				result = (n / 2) + 1;
			while (result % m != 0) {
				result++;
			}
		}

		System.out.println(result);
	}

}

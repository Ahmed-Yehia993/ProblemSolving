package codeforces.ladderA;

import java.util.Scanner;

public class IQTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int countOdd = 0, lastOdd = 0, countEven = 0, lasteven = 0;
		for (int i = 0; i < n; i++) {
			int numb = scanner.nextInt();
			if (numb % 2 == 0) {
				countEven++;
				lasteven = i + 1;
			}
			if (numb % 2 != 0) {
				countOdd++;
				lastOdd = i + 1;
			}

		}
		if (countEven > countOdd) {
			System.out.println(lastOdd);
		} else {
			System.out.println(lasteven);
		}
	}

}

package codeforces.ladderA;

import java.util.Scanner;

public class RomaAndLuckyNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();

		int count = 0;
		for (int i = 0; i < n; i++) {
			int number = scanner.nextInt();
			int digitCount = CountOfLuckyDigitInNumber(number);
			if(digitCount <= k)
				count++;
		}
		System.out.println(count);
	}

	public static int CountOfLuckyDigitInNumber(int number) {
		int count = 0;

		char[] digits = Integer.toString(number).toCharArray();
		for (int i = 0; i < digits.length; i++) {
			if (digits[i] == '7' || digits[i] == '4')
				count++;
		}
		return count;
	}
}

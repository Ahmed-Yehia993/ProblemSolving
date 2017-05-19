package codeforces.ladderA;

import java.util.Scanner;

public class IlyaandBankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String number = scanner.nextLine();
		scanner.close();
		if (Integer.parseInt(number) > 0) {
			System.out.println(number);
		} else {
			int first = Integer.parseInt(number.substring(0, number.length() - 1));
			int second = Integer
					.parseInt(number.substring(0, number.length() - 2) + number.substring(number.length() - 1));

			System.out.println(Math.max(first, second));
		}
	}

}

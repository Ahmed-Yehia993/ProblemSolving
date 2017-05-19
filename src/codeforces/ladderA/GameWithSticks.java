package codeforces.ladderA;

import java.util.Scanner;

public class GameWithSticks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();

		int min = Math.min(n, m);
		if (min % 2 != 0) {
			System.out.println("Akshat");
		} else
			System.out.println("Malvika");

	}

}

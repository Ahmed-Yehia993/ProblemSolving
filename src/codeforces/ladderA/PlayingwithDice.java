package codeforces.ladderA;

import java.util.Scanner;

public class PlayingwithDice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int win = 0;
		int draw = 0;
		int lose = 0;
		for (int i = 1; i <= 6; i++) {
			if (Math.abs(a - i) < Math.abs(b - i)) {
				win++;
			} else if (Math.abs(a - i) > Math.abs(b - i)) {
				lose++;
			} else {
				draw++;
			}
		}
		System.out.println(win + " " + draw + " " + lose);
	}

}

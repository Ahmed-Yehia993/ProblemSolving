package codeforces.ladderA;

import java.util.Scanner;

public class FoxAndSnake {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		char[][] snak = new char[n][m];
		int dotCount = 0;

		for (int i = 0; i < snak.length; i++) {
			for (int j = 0; j < snak[i].length; j++) {
				if (i % 2 == 0) {
					snak[i][j] = '#';
				} else {
					snak[i][j] = '.';
				}
			}
			if (i % 2 != 0) {
				dotCount += 1;
				if (dotCount % 2 != 0) {
					snak[i][m - 1] = '#';
				} else {
					snak[i][0] = '#';
				}

			}

		}
		for (int i = 0; i < snak.length; i++) {
			for (int j = 0; j < snak[i].length; j++) {
				System.out.print(snak[i][j]);
			}
			System.out.println();
		}
	}

}

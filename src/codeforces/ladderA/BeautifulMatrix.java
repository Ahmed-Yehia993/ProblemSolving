package codeforces.ladderA;

import java.util.Scanner;

public class BeautifulMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int[][] matrix = new int[5][5];
		int xPosition = 0, yPosition = 0;

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				int k = scanner.nextInt();
				matrix[i][j] = k;
				if (k == 1) {
					xPosition = i;
					yPosition = j;
				}
			}
		}
		System.out.println(Math.abs(Math.abs(xPosition - 2) + Math.abs(yPosition - 2)));
	}

}

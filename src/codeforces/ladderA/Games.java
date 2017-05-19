package codeforces.ladderA;

import java.util.Scanner;

public class Games {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int[][] teams = new int[number][2];
		for (int i = 0; i < number; i++) {
			for (int j = 0; j < 2; j++) {
				teams[i][j] = scanner.nextInt();
			}
		}
		scanner.close();
		int ans = 0;
		for (int i = 0; i < number; i++) {
			for (int j = 0; j < number; j++) {
				if (teams[i][0] == teams[j][1]) {
					ans++;
				}
			}
		}
		System.out.println(ans);

	}

}

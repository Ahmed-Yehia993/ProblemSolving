package codeforces.ladderA;

import java.util.Scanner;

public class ChoosingTeams {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		int[] member = new int[n];
		for (int i = 0; i < member.length; i++) {
			member[i] = scanner.nextInt();
		}

		int cnt = 0;

		for (int i = 0; i < n; i++)
			if (5 - member[i] >= k)
				cnt++;

		int ans = cnt / 3;
		System.out.println(ans);
	}

}

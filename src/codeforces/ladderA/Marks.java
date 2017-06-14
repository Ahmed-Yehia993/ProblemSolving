package codeforces.ladderA;

import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), m = in.nextInt();
		in.nextLine();
		char[][] grades = new char[n][m];
		boolean[] successful = new boolean[n];
		for (int i = 0; i < n; i++)
			grades[i] = in.nextLine().toCharArray();
		for (int i = 0; i < m; i++) {
			int max = '1';
			for (int j = 0; j < n; j++) {
				if (grades[j][i] > max)
					max = grades[j][i];
			}
			for (int j = 0; j < n; j++)
				if (grades[j][i] == max)
					successful[j] = true;
		}
		int count = 0;
		for (int i = 0; i < n; i++)
			if (successful[i])
				count++;
		System.out.println(count);

		in.close();
	}

}

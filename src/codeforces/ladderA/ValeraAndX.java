package codeforces.ladderA;

import java.util.Scanner;

public class ValeraAndX {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[][] map = new char[n][n];
		String data = "";
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (sc.hasNext()) {
				data = sc.next();
				count = 0;
			} else {
				break;
			}
			for (int j = 0; j < n; j++)
				map[i][j] = data.charAt(count++);
		}
		char digonal = map[0][0];
		char another = map[0][1];
		if (digonal == another) {
			System.out.println("NO");
			System.exit(0);
		}
		boolean flag = true;
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				if ((i == j || i + j == n - 1)) {
					if (map[i][j] != digonal) {
						flag = false;
					}
				} else {
					if (map[i][j] != another)
						flag = false;

				}

			}
		}
		if (flag)
			System.out.println("YES");
		else
			System.out.println("NO");
	}

}

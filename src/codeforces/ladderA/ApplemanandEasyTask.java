package codeforces.ladderA;

import java.util.Scanner;

public class ApplemanandEasyTask {

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

		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {

				int count2 = 0;
				if (i > 0 && map[i - 1][j] == 'o') {
					count2++;
				}
				if (i < n - 1 && map[i + 1][j] == 'o') {
					count2++;
				}
				if (j > 0 && map[i][j - 1] == 'o') {
					count2++;
				}
				if (j < n - 1 && map[i][j + 1] == 'o') {
					count2++;
				}
				if(count2%2!=0){
					System.out.println("NO");
					System.exit(0);
				}
			}
		}
		System.out.println("YES");
	}

}

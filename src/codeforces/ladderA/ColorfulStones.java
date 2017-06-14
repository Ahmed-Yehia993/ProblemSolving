package codeforces.ladderA;

import java.util.Scanner;

public class ColorfulStones {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char[] s = scanner.nextLine().toCharArray();
		char[] t = scanner.nextLine().toCharArray();
		int pos = 0;
		for (int i = 0; i < t.length; i++) {
			if (t[i] == s[pos]) {
				pos++;
			}
		}
		System.out.println(++pos);
	}

}

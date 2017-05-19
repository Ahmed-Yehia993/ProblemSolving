package codeforces.ladderA;

import java.util.Scanner;

public class WayTooLongWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x = new Scanner(System.in);
		int w = x.nextInt();
		for (int i = 0; i <= w; i++) {
			String word = x.nextLine();
			if (word.length() > 10) {
				System.out.println(
						word.substring(0, 1) + (word.length() - 2) + word.substring(word.length() - 1, word.length()));
			} else {
				System.out.println(word);
			}
		}

	}

}

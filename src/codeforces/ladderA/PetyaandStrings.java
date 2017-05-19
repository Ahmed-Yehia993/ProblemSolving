package codeforces.ladderA;

import java.util.Scanner;

public class PetyaandStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x = new Scanner(System.in);
		String fWord = x.nextLine();
		String sWord = x.nextLine();
		int result = fWord.compareToIgnoreCase(sWord);
		if (result < 0) {
			System.out.println("-1");
		} else if (result > 0) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}

}

package codeforces.ladderA;

import java.util.Scanner;

public class Watermelon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x = new Scanner(System.in);
		int w = x.nextInt();
		if (w == 2 || w % 2 != 0) {
			System.out.println("NO");
		} else {
			System.out.println("YES");
		}
	}

}

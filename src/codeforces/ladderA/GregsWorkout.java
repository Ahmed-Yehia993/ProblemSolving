package codeforces.ladderA;

import java.util.Scanner;

public class GregsWorkout {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int chestCount = 0;
		int bicebsCount = 0;
		int backCount = 0;
		for (int i = 0; i < n; i++) {
			int ex = scanner.nextInt();
			int train = i % 3;
			if (train == 0)
				chestCount += ex;
			else if (train == 1)
				bicebsCount += ex;
			else if (train == 2) {
				backCount += ex;
			}
		}

		if (chestCount > bicebsCount && chestCount > backCount)
			System.out.println("chest");
		if (bicebsCount > chestCount && bicebsCount > backCount)
			System.out.println("biceps");
		if (backCount > chestCount && backCount > bicebsCount)
			System.out.println("back");
	}

}

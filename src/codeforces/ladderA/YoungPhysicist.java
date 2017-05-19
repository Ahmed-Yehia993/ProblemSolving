package codeforces.ladderA;

import java.util.Scanner;

public class YoungPhysicist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int sumX = 0, sumY = 0, sumZ = 0;
		for (int i = 0; i < number; i++) {
			for (int j = 0; j < 3; j++) {
				if (j == 0)
					sumX += scanner.nextInt();
				if (j == 1)
					sumY += scanner.nextInt();
				if (j == 2)
					sumZ += scanner.nextInt();
			}
		}
		scanner.close();
		System.out.println(sumX == 0 && sumY == 0 && sumZ == 0 ? "YES" : "NO");

	}

}

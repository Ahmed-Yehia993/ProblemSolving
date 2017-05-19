package codeforces.ladderA;

import java.util.Scanner;

public class ArrivalOfTheGeneral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int[] soliders = new int[number];
		int maxNumber = Integer.MIN_VALUE, maxIndex = 0, minNumber = Integer.MAX_VALUE, minIndex = 0;
		for (int i = 0; i < number; i++) {
			int k = scanner.nextInt();
			soliders[i] = k;
			if (k > maxNumber) {
				maxNumber = k;
				maxIndex = i;
			}
			if (k <= minNumber) {
				minNumber = k;
				minIndex = i;
			}
		}
		if (maxIndex > minIndex)
			System.out.println(Math.abs(maxIndex - 0) + Math.abs((number - 1 - minIndex)) - 1);
		else
			System.out.println(Math.abs(maxIndex - 0) + Math.abs((number - 1 - minIndex)));

	}

}

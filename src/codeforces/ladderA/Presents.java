package codeforces.ladderA;

import java.util.Scanner;

public class Presents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] numbers = new int[n];
		for (int i = 0; i < n; i++) {
			int k = scanner.nextInt();
			numbers[k -1] = i +1;
		}
		scanner.close();
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
	}

}

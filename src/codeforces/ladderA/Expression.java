package codeforces.ladderA;

import java.util.Scanner;

public class Expression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt(), c = scanner.nextInt();
		scanner.close();
		int max = a + b + c;
		max = Math.max(max, a * (b + c));
		max = Math.max(max, a * b * c);
		max = Math.max(max, (a + b) * c);
		System.out.println(max);

	}

}

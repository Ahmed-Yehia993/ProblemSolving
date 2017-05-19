package codeforces.ladderA;

import java.util.Scanner;

public class LuckyDivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x = new Scanner(System.in);
		int n = x.nextInt();
		x.close();
		boolean flag = false;
		int a[] = { 4, 7, 44, 47, 74, 77, 444, 447, 474, 477, 744, 747, 774, 777 };
		for (int i = 0; i <= 13; i++) {
			if (n % a[i] == 0) {
				flag = true;
				break;
			}
		}
		if (flag)
			System.out.println("YES");
		else
			System.out.println("NO");
	}

}

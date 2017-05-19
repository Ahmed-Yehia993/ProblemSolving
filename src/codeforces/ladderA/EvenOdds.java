package codeforces.ladderA;

import java.util.Scanner;

public class EvenOdds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		long n = scanner.nextLong(), k = scanner.nextLong();
		long t = (n%2==0)?n/2:n/2+1;
		long ans = (k>t)?((k-t)*2):(k*2-1);
		System.out.println(ans);
		scanner.close();
	}

}

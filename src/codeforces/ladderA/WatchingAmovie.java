package codeforces.ladderA;

import java.util.Scanner;

public class WatchingAmovie {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int x = scanner.nextInt();

		int[] l = new int[n];
		int[] r = new int[n];
		for (int i = 0; i < n; i++) {
			l[i] = scanner.nextInt();
			r[i] = scanner.nextInt();
		}

		int length = (l[0] - 1) % x;
		
		for(int a = 0; a < n; a++)
	        length += r[a] - l[a] + 1;
	    for(int a = 1; a < n; a++)
	        length += (l[a] - (r[a-1] + 1)) % x;
	    
	    System.out.println(length);
	}

}

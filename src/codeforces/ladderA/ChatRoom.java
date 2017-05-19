package codeforces.ladderA;

import java.util.Scanner;

public class ChatRoom {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		boolean result = x.nextLine().matches("(.*)h(.*)e(.*)l(.*)l(.*)o(.*)");
		System.out.println(result ? "YES" : "NO");
	}

}

package codeforces.ladderA;

import java.util.HashSet;
import java.util.Scanner;

public class IWannaBetheGuy {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt(), a = scanner.nextInt();
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < a; i++)
			set.add(scanner.nextInt());
		int b = scanner.nextInt();
		for (int i = 0; i < b; i++)
			set.add(scanner.nextInt());
		scanner.close();
		System.out.println(set.size() == n ? "I become the guy." : "Oh, my keyboard!");

	}

}

package codeforces.ladderA;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AntonandLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine().substring(1);
		input = input.substring(0, input.length() - 1).trim();

		if (input.length() > 0) {

			String[] result = input.split(",");
			Set<String> set = new HashSet<>();
			for (int i = 0; i < result.length; i++) {
				result[i] = result[i].trim();
				set.add(result[i]);
			}
			System.out.println(set.size());
		} else {
			System.out.println(0);
		}

	}

}

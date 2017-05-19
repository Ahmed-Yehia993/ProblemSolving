package codeforces.ladderA;

import java.util.Scanner;

public class StringTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x = new Scanner(System.in);
		String word = x.nextLine();
		char[] charachters = word.toLowerCase().toCharArray();

		String result = "";
		for (int i = 0; i < charachters.length; i++) {
			if (charachters[i] != 'a' && charachters[i] != 'o' && charachters[i] != 'y' && charachters[i] != 'e'
					&& charachters[i] != 'u' && charachters[i] != 'i') {
				result += "." + charachters[i];

			}
		}
		System.out.println(result);

	}

}

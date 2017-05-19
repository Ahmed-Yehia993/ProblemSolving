package codeforces.ladderA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class HelpfulMaths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x = new Scanner(System.in);
		char[] calc = x.nextLine().toCharArray();
		ArrayList<Integer> digits = new ArrayList<>();
		for (int i = 0; i < calc.length; i++) {
			if (calc[i] != '+') {
				digits.add(Integer.parseInt(calc[i] + ""));
			}
		}

		Collections.sort(digits);
		String result = "";
		for (Iterator iterator = digits.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			result += integer + "+";
		}
		System.out.println(result.substring(0, result.length() - 1));
	}

}

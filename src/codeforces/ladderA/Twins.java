package codeforces.ladderA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Twins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x = new Scanner(System.in);
		int n = x.nextInt();
		ArrayList<Integer> numbers = new ArrayList<>();
		int sum = 0;
		for (int i = 0; i < n; i++) {
			int num = x.nextInt();
			numbers.add(num);
			sum += num;
		}
		Collections.sort(numbers);
		int count = 0, d = 0;
		for (int i = numbers.size() - 1; i >= 0; i--) {
			count += numbers.get(i);
			d++;
			if (count > sum / 2) {
				break;
			}
		}
		System.out.println(d);

	}

}

package codeforces.ladderA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class ValeraandAntiqueItems {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int v = scanner.nextInt();

		HashMap<Integer, ArrayList<Integer>> selles = new HashMap<>();
		for (int i = 1; i <= n; i++) {
			int antiqu = scanner.nextInt();
			selles.put(i, new ArrayList<>());
			for (int j = 0; j < antiqu; j++) {
				int coast = scanner.nextInt();
				if (selles.containsKey(i)) {
					ArrayList<Integer> temp = selles.get(i);
					temp.add(coast);
					selles.put(i, temp);

				}

			}
		}
		for(Integer key:selles.keySet()){
			Collections.sort(selles.get(key));
		}
		int sum=0;
		String Seler="";
		for(Integer key:selles.keySet()){
			if(v > selles.get(key).get(0)){
				sum++;
				Seler+=key+ " ";
			}
		}
		System.out.println(sum);
		System.out.println(Seler);
	}

}

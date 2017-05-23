package codeforces.ladderA;

import java.util.Arrays;
import java.util.Scanner;

public class Laptops {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Laptop[] laptops = new Laptop[n];
		for (int i = 0; i < n; i++) {
			Integer price = scanner.nextInt();
			Integer quality = scanner.nextInt();
			Laptop lap = new Laptop(price, quality);
			laptops[i] = lap;
		}
		Arrays.sort(laptops);

		boolean happy = false;
		for (int i = 0; i < laptops.length - 1; i++) {

			if (laptops[i].quality > laptops[i + 1].quality) {
				happy = true;
			}
		}
		if(happy)
			System.out.println("Happy Alex");
		else
			System.out.println("Poor Alex");
	}

}

class Laptop implements Comparable<Laptop> {

	Integer price;
	Integer quality;

	Laptop(Integer price, Integer quality) {
		super();
		this.price = price;
		this.quality = quality;
	}

	@Override
	public int compareTo(Laptop o) {
		return this.price.compareTo(o.price);
	}

	@Override
	public String toString() {
		return "Laptop [price=" + price + ", quality=" + quality + "]";
	}

}
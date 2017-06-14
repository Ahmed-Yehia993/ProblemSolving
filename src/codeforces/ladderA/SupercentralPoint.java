package codeforces.ladderA;

import java.util.Scanner;

public class SupercentralPoint {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Point[] points = new Point[n];
		for (int i = 0; i < n; i++) {
			Point point = new Point(scanner.nextInt(), scanner.nextInt());
			points[i] = point;

		}
		int count = 0;
		for (int i = 0; i < points.length; i++) {
			Point currentPoint = points[i];
			boolean[] v = new boolean[4];
			boolean c = false;
			for (int j = 0; j < points.length; j++) {
				if (i != j) {
					Point ather = points[j];
					if (ather.x > currentPoint.x && ather.y == currentPoint.y) {
						v[0] = true;
					}
					if (ather.x < currentPoint.x && ather.y == currentPoint.y) {
						v[1] = true;
					}
					if (ather.x == currentPoint.x && ather.y < currentPoint.y) {

						v[2] = true;
					}
					if (ather.x == currentPoint.x && ather.y > currentPoint.y) {

						v[3] = true;
					}
					c = v[0] && v[1] && v[2] && v[3];
				}
			}
			if (c)
				count++;
		}
		System.out.println(count);
	}

}

class Point {
	int x;
	int y;

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

}
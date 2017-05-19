package CodilityLessons;

import java.util.HashSet;
import java.util.Set;

public class MissingInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MissingInteger s = new MissingInteger();
		int[] A = { 1, 3, 6, 4, 1, 2 };
		System.out.println(s.solution(A));
	}

	public int solution(int[] A) {
		// write your code in Java SE 8
		long max = A[0];
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < A.length; i++) {
			if (A[i] > 0) {
				if (set.add(A[i])) {
					if (max < A[i]) {
						max = A[i];
					}
				}
			}
		}
		for (int i = 1; i < max + 2; i++) {
			if (!set.contains(i))
				return i;
		}
		return 1;
	}
}

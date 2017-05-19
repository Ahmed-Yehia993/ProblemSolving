package CodilityLessons;

public class PermCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PermCheck s = new PermCheck();
		int[] A = { 4, 3, 1 };
		System.out.println(s.solution(A));

	}

	public int solution(int[] A) {
		// write your code in Java SE 8
		int[] B = new int[A.length];
		for (int i = 0; i < A.length; i++) {
			if (A[i] > 0 && A[i] <= A.length) {
				if (++B[A[i] - 1] > 1)
					return 0;
			} else
				return 0;
		}
		return 1;

	}
}

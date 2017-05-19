package CodilityLessons;

public class FrogRiverOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int solution(int X, int[] A) {
		// write your code in Java SE 8
		int[] B = new int[X];
		int counter = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] <= X) {
				B[A[i] - 1]++;
				if (B[A[i] - 1] == 1) {
					counter++;
				}
			}
			if (counter == X)
				return i;
		}
		return -1;
	}
}

package CodilityLessons;

public class TapeEquilibrium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int solution(int[] A) {

		int sum1 = 0;
		int sum2 = sumOfArray(A);
		int minDiff = Integer.MAX_VALUE;
		for (int p = 0; p < A.length - 1; p++) {
			sum1 += A[p];
			sum2 -= A[p];
			int diff = sum2 - sum1;
			minDiff = Math.min(minDiff, Math.abs(diff));
		}
		return minDiff;
	}

	public int sumOfArray(int[] A) {
		long sum = 0;
		for (int i = 0; i < A.length; i++) {
			sum += A[i];
		}
		return (int) sum;
	}
}

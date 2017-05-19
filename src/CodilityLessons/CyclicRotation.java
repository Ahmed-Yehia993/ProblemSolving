package CodilityLessons;

public class CyclicRotation {

	public int[] solution(int[] A, int K) {
		int[] temp = A.clone();
		int N = A.length;
		K = (N > 0) ? K % N : 0;
		if (K <= 0)
			return A;

		for (int i = 0; i < K; i++)
			A[i] = temp[(N - K) + i];

		for (int i = 0; i < (N - K); i++)
			A[K + i] = temp[i];

		return A;
	}
}

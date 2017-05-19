package CodilityLessons;

public class PermMissingElem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = { 2, 3, 1, 5 };
		PermMissingElem s = new PermMissingElem();
		s.solution(A);
	}

	public int solution(int[] A) {
		// write your code in Java SE 8
		long len = A.length + 1;
		long currentSum = sumOfArray(A);
		long expectedSum =(long) (len * (len + 1)) / 2;
		System.out.println(expectedSum);
		return  (int) (expectedSum - currentSum);
	}

	public long sumOfArray(int[] A) {
		long sum = 0;
		for (int i = 0; i < A.length; i++) {
			sum += A[i];
		}
		return sum;
	}
}

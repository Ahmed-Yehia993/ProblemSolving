package CodilityLessons;

public class PassingCars {
	public static void main(String[] args) {
		PassingCars c = new PassingCars();
		int[] A = { 0, 1, 0, 1, 1 };
		System.out.println(c.solution(A));
	}

	public int solution(int[] A) {
		long east = 0;
		long passingCars = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] == 0) {
				east++;
			} else {
				passingCars += east;
			}
			if (passingCars > 1000000000)
				return -1;
		}
		return (int) passingCars;
	}
}

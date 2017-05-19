package CodilityLessons;

public class FrogJmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int solution(int X, int Y, int D) {
		// write your code in Java SE 8
		return (Y - X) % D > 0 ? (Y - X) / D + 1 : (Y - X) / D;
	}
}

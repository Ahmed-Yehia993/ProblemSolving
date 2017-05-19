package CodilityLessons;

public class CountDiv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int solution(int A, int B, int K) {
		// write your code in Java SE 8
		int b = B/K;
	    int a = (A > 0 ? (A - 1)/K: 0);
	    if(A == 0){
	        b++;
	    }
	    return b - a;
	}
}

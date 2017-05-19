package CodilityLessons;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Distinct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] data = {2,3,-2};
	        int curr = 0;
	        int near = data[0]; 
	        Arrays.sort(data);      //  add this
	        System.out.println(Arrays.toString(data));        
	        // find the element nearest to zero
	        for ( int i=0; i < data.length; i++ ){
//	            System.out.println("dist from " + data[i] + " = " + Math.abs(0 -data[i]));
	            curr = data[i] * data[i]; 
	            if ( curr <= (near * near) )  { 
	                near = data[i];
	            } 
	        }
	        System.out.println( near );
	}

	public int solution(int[] A) {
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < A.length; i++) {
			set.add(A[i]);
		}
		return set.size();
	}
}

package CodilityLessons;

import java.util.HashSet;
import java.util.Set;

public class OddOccurrencesInArray {

	public int solution(int[] A){
		Set<Integer>set = new HashSet<>();
		for (int i = 0; i < A.length; i++) {
			int j = A[i];
			if(set.contains(j)){
				set.remove(j);
			}else{
				set.add(j);
			}
		}
		return set.iterator().next();
	}

}

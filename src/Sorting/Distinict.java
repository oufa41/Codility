package Sorting;
import java.util.HashSet;


public class Distinict {
	 public int solution(int[] A) {
	        // write your code in Java SE 8
	        
	        HashSet<Integer> data = new HashSet<>();
			for (int i = 0; i < A.length; i++) {
					data.add(A[i]);
				
			}
			return data.size();
	        
	    }
}

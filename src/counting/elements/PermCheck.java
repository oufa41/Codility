package counting.elements;


public class PermCheck {

	public static int solution(int[] A) {
		// write your code in Java SE 8
	    int  max = 0;
		boolean[] isPermutated = new boolean[A.length+1];
		for (int i = 0; i < A.length; i++) {
			if (A[i] < 1 ) {
				return 0;
			}
			if (A[i] > A.length ) {
				return 0;
			}
			if(!isPermutated[A[i]]){
				isPermutated[A[i]] = true;
			}else{
				return 0;
			}
			if (max < A[i]) {
				max = A[i];
			}
		}
		if (A.length < max) 
			return 0;
	
		
		return 1;
	}
	public static void main(String[] args) {
		int[] A = { 1,2,4,3};
		System.out.println(solution(A));
	}

}

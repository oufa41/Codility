package counting.elements;

public class FrogJump {
	public static int solution(int X, int[] A) {
		// write your code in Java SE 8
	  
		for (int i = 0; i < A.length; i++) {
			if(A[i] == X)
				return i;
		}
	
		
		return 0;
	}
	public static void main(String[] args) {
		int[] A = { 1,3,1,4,2,3,5,4};
		int X = 5;
		System.out.println(solution(X,A));
	}
}

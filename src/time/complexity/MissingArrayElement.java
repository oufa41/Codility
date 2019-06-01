package time.complexity;
import java.util.Arrays;

public class MissingArrayElement {

	public static int solution(int[] A) {
		// write your code in Java SE 8
		if (A.length == 0) {
			return 1;
		}
		Arrays.sort(A);
		if (A[0] != 1) {
			return 1;
		}
		for (int i = 0; i < A.length - 1; i++) {
			if (A[i + 1] - A[i] != 1) {
				return A[i + 1] - 1;
			}
		}

		return A[A.length] + 1;

	}

	public static void main(String[] args) {

		int[] A = { 2, 3, 1, 5 };
		  
	
		solution(A);
	}
}

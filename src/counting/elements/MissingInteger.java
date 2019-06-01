package counting.elements;
import java.util.HashSet;

public class MissingInteger {

	public static int solution(int[] A) {
		if (A.length == 0) {
			return 1;
		}
		HashSet<Integer> data = new HashSet<>();
		for (int i = 0; i < A.length; i++) {
			if (A[i] > 0) {
				data.add(A[i]);
			}
		}

		if (data.isEmpty())
			return 1;
		for (int i = 1; i < A.length; i++) {
			if (!data.contains(i)) {
				return i;
			}
		}
		

		return A.length + 1;
	}

	public static void main(String[] args) {
		int[] A = { -1 };
		System.out.println(solution(A));
		

	}
}

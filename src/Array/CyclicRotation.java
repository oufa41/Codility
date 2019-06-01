package Array;
public class CyclicRotation {

	public static int[] solutionRotateRight(int[] A, int K) {
		// write your code in Java SE 8
		for (int j = 0; j < K; j++) {
			for (int i = A.length-1; i > 0; i--) {
				int temp = A[i];
				A[i] = A[i-1];
				A[i-1] = temp;
			}
		}
		
		for (int j = 0; j < A.length; j++) {
			System.out.print(A[j] + ",");
		}
		return A;
	}
	public static int[] solutionRotateLeft(int[] A, int K) {
		// write your code in Java SE 8
		for (int j = 0; j < K; j++) {
			for (int i = 0; i < A.length-1; i++) {
				int temp = A[i];
				A[i] = A[i+1];
				A[i+1] = temp;
			}
		}
		
	
		return A;
	}

	public static void main(String[] args) {
		int[] A = { 3, 8, 9, 7, 6 };
		int[] a = solutionRotateLeft(A, 2);
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ",");
		}
	}

}

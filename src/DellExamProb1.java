import java.util.LinkedList;

public class DellExamProb1 {
	public static String solution(int U, int L, int[] C) {
		// write your code in Java SE 8
		int[] row1 = new int[C.length];
		int[] row2 = new int[C.length];
		int sumRow1 = 0, sumRow2 = 0;
		for (int i = 0; i < C.length; i++) {
			if (C[i] == 2) {
				row1[i] = 1;
				row2[i] = 1;
				sumRow1++;
				sumRow2++;
			} else if (C[i] == 1) {
				if (sumRow1 < U) {
					sumRow1++;
					row1[i] = 1;
				} else if (sumRow2 < L) {
					sumRow2++;
					row2[i] = 1;
				} else {
					return "IMPOSSIBLE";
				}

			}

		}
		if (sumRow1 != U || sumRow2 != L) {
			return "IMPOSSIBLE";
		}
		String row1Result = "";
		String row2Result = "";
		for (int i = 0; i < row1.length; i++) {
			row1Result += row1[i];
			row2Result += row2[i];
		}
		LinkedList<Integer> sum = new LinkedList<>();
		return row1Result + "," + row2Result;
	}
	public static void main(String[] args) {
		int [] c = {0,0,0,0,0,0,0 };
		System.out.println(solution(2, 0, c));
	}
}

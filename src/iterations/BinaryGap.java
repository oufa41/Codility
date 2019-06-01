package iterations;


public class BinaryGap {
	public static int solution(int N) {
		String binaryString = Integer.toBinaryString(N);

		int getMaxGap = 0;
		int countGap = 0;
		for (int i = 0; i < binaryString.length(); i++) {
			if (binaryString.charAt(i) == '0') {
				countGap++;
			} else {
                 if(countGap>getMaxGap){
                	   getMaxGap =countGap;
                 }
                 countGap =0;
			}
		}

		return getMaxGap;
	}

	public static void main(String[] args) {
		System.out.println(solution(1041));
	}
}

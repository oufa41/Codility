package Array;
import java.util.HashMap;

public class OddOccurance {

	public static int solution(int[] A) {

		int result = 0;
		for (int i = 0; i < A.length; i++) {
			result ^= A[i];
		}

		return result;
	}

	public static int solutionHashMap(int[] A) {
     
		HashMap<Integer, Integer> data = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
			if(data.containsKey(A[i])){
				int val = data.get(A[i]); 
				data.put(A[i], val+1);
			}else{
				data.put(A[i], 1);
			}
		}
        for (Integer a : data.keySet()){
        	if(data.get(a) ==1){
        		return a;
        	}
        }
        
		return -1;
	}

	public static void main(String[] args) {
		int[] A = { 9, 3, 9, 3, 7, 9, 3, 3, 9 };
		System.out.println(solution(A));   
		System.out.println(solutionHashMap(A)); 
	}
}

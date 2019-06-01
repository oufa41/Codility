package time.complexity;
import java.util.ArrayList;


public class TapeEquilibrium {
	
    public static int solution(int[] A) {
        // write your code in Java SE 8
    	
    	ArrayList<Integer> sumPartOne = new ArrayList<>(); 
    	int sumOne =0;
        for (int i = 0; i < A.length-1; i++) {
			sumOne += A[i];
			sumPartOne.add(sumOne);	
		}
  
        ArrayList<Integer> sumPartTwo = new ArrayList<>(); 
     	int sumTwo =0;
        for (int i = A.length-1; i > 0; i--) {
			sumTwo += A[i];
			sumPartTwo.add(sumTwo);		
		}
       
        int minDiff =Math.abs(sumPartOne.get(0)-sumPartTwo.get(sumPartTwo.size()-1));
        for (int i = 1; i < sumPartTwo.size(); i++) {
        	int diff =  Math.abs(sumPartOne.get(i)-sumPartTwo.get(sumPartTwo.size()-(i+1)));
        	if(diff < minDiff){
			    minDiff = diff;
        	}
		}
       
    	return minDiff;
        
    }
	
	public static void main(String[] args) {
		int[] A = {1, 1, 3};
		System.out.println(solution(A));   
	}

}

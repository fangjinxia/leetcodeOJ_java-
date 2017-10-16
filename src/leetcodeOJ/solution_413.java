package leetcodeOJ;

import java.util.*;
import java.lang.String;
import leetcodeOJ.TreeNode;

public class solution_413 {
	 /*
	 * dp
	 * 
	 */
	protected static int numberOfArithmeticSlices(int[] A) {
		if(A.length <= 2)
			return 0;
		int result = 0;
		int cur = 0;
		for(int i = 2; i < A.length; ++i) {
			if(A[i] - A[i-1] == A[i-1] - A[i-2]) {
				cur += 1;
				result += cur;				
			}
			else {
				cur = 0;				
			}
		}
		
		return result;
	}
	
	
	public static void main(String[] args) {
		//String[] strs = {"Hello","Alaska","Dad","Peace"};
		//String[] res = findWords(strs);
		//System.out.println(Arrays.toString(res));
	}
}
 
package leetcodeOJ;

import java.util.*;
import java.lang.String;
import leetcodeOJ.TreeNode;

public class solution_338 {
	/*
	 */
	protected static int[] countBits(int num) {
		int[] result = new int[num+1];
		result[0] = 0;
		for(int i = 1; i <= num; ++i) {
			result[i] = result[i>>1] + (i&1);
		}
		
		return result;
	}
	public static void main(String[] args) {
		//String[] strs = {"Hello","Alaska","Dad","Peace"};
		//String[] res = findWords(strs);
		//System.out.println(Arrays.toString(res));
	}
}
 
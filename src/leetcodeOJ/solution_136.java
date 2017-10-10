package leetcodeOJ;

import java.util.*;
import java.lang.String;

public class solution_136 {
	/*
	 */
	protected static int singleNumber(int[] nums) {
		int result = 0;
		for(int item : nums) {
			result ^= item;
		}
		
		return result;
	}
	public static void main(String[] args) {
		//String[] strs = {"Hello","Alaska","Dad","Peace"};
		//String[] res = findWords(strs);
		//System.out.println(Arrays.toString(res));
	}
}
 
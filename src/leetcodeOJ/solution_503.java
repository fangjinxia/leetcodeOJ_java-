package leetcodeOJ;

import java.util.*;
import java.lang.String;
import leetcodeOJ.TreeNode;

public class solution_503 {
	/*
	 */
	protected static int[] nextGreaterElements(int[] nums) {
		int n = nums.length;
		int[] result = new int[n];
		for(int i = 0; i < n; ++i) {
			int j = i+1;
			for(; i != j; ++j) {
				if(nums[j%n] > nums[i]) {
					result[i] = nums[j%n];
					break;
				}
			}
			if(j == n)
				result[i] = -1;
		}
		
		return result;
	}
	public static void main(String[] args) {
		//String[] strs = {"Hello","Alaska","Dad","Peace"};
		//String[] res = findWords(strs);
		//System.out.println(Arrays.toString(res));
	}
}
 
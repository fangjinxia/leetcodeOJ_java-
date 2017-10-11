package leetcodeOJ;

import java.util.*;
import java.lang.String;
import leetcodeOJ.TreeNode;

public class solution_35 {
	/*
	 */
	protected static int searchInsert(int[] nums, int target) {
		for(int i = 0; i < nums.length; ++i) {
			if(nums[i] >= target)
				return i;
		}
		
		return nums.length;
	}
	public static void main(String[] args) {
		//String[] strs = {"Hello","Alaska","Dad","Peace"};
		//String[] res = findWords(strs);
		//System.out.println(Arrays.toString(res));
	}
}
 
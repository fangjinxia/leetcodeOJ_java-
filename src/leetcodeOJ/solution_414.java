package leetcodeOJ;

import java.util.*;
import java.lang.String;
import leetcodeOJ.TreeNode;

public class solution_414 {
	/*
	 */
	protected static int thirdMax(int[] nums) {
		Arrays.sort(nums);
		int n = nums.length;
		if(n < 3)
			return nums[n-1];
		int tmp = 1;
		for(int i = n-2; i >= 0; --i) {
			if(nums[i+1] == nums[i])
				continue;
			++tmp;
			if(tmp == 3)
				return nums[i];
		}
		
		return nums[n-1];
	}
	public static void main(String[] args) {
		//String[] strs = {"Hello","Alaska","Dad","Peace"};
		//String[] res = findWords(strs);
		//System.out.println(Arrays.toString(res));
	}
}
 
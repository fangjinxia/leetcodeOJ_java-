package leetcodeOJ;

import java.util.*;
import java.lang.String;
import leetcodeOJ.TreeNode;

public class solution_486 {
	 /*
	 * dp
	 */
	protected static boolean PredictTheWinner(int[] nums) {
		return predictWinner(nums, 0, nums.length-1) >= 0;
	}
	
	private static int predictWinner(int[] nums, int low, int high) {
		if(low == high)
			return nums[low];
		return Math.max(nums[low]-predictWinner(nums, low+1, high), nums[high]-predictWinner(nums, low, high-1));
	}
	
	
	public static void main(String[] args) {
//		int i = 9;
//		
//		System.out.println(integerBreak(i));
	}
}
 
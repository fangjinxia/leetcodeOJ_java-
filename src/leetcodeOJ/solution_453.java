package leetcodeOJ;

import java.util.*;

public class solution_453 {
	public static int minMoves(int[] nums) {
		///<a math quetion:
		//sum + res * (n-1) = x * n   ///<x为最终每个元素值， res为我们所求值
		//x = res + minNum;
		//so res = sum - n * minNum
		int result = 0;
		int sum = 0;
		int n = nums.length;
		int minNum = nums[0];
		for(int i = 0; i < n; ++i) {
			sum += nums[i];
			minNum = Math.min(minNum, nums[i]);
		}
		
		result = sum - (n * minNum);
		
		return result;		
	}
	
	public static void main(String[] args){
//		int[] nums = {1, 2, 3, 4, 5, 6, 7};
//		int target = 12;
//		
//		int[] result = new int[2]; 
//		result = twoSum(nums, target);
//		
//		System.out.println(Arrays.toString(result));
	}
}

package leetcodeOJ;

import java.util.*;

public class solution_53 {
	public static int maxSubArray(int[] nums) {
		int n = nums.length;
		int res = nums[0];
		for(int i = 1; i < n; ++i){
			nums[i] = Math.max(nums[i], nums[i]+nums[i-1]);
			res = Math.max(res, nums[i]);
		}
		
		return res;
	}
	
	
	public static void main(String[] args){
//		int[] nums = {1, 2, 3, 4, 5, 6, 7};
//		int target = 12;
//		
//		int[] result = new int[2]; 
//		result = twoSum(nums, target);
//		
//		///<字符串与整型的相互转换
//		String a = String.valueOf(2);   //integer to numeric string
//		int i = Integer.parseInt(a); //numeric string to an int
//		
//		System.out.println(Arrays.toString(result));
	}
}

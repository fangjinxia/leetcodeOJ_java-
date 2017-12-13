package leetcodeOJ;

import java.util.*;
import java.lang.String;
import leetcodeOJ.TreeNode;

public class solution_238 {
	/*
	 * 方法一：时间复杂度O(n^2)
	 */
	int[] result;
	public int[] productExceptSelf(int[] nums) {
		int n = nums.length;
		result = new int[n];		
		if(n == 0)
			return result;
		if(n == 1) {
			result[0] = 1;
			return result;
		}
			
		result[n-2] = nums[n-1];
		result[n-1] = nums[n-2];
		for(int i = n-3; i >= 0; --i) {
			result[i] = result[i+1]*nums[i+1];
			for(int j = i+1; j < n; ++j) {
				result[j] *= nums[i];
			}
		}
		
		return result;
	}
	
	/*
	 * 方法二 ： 时间复杂度O(n)
	 */
	public int[] productExceptSelf2(int[] nums) {
		int n = nums.length;
		int[] res = new int[n];		
		res = new int[n];		
		if(n == 0)
			return res;
		
		res[0] = 1;
		for(int i = 1; i < n; ++i) {
			res[i] = res[i-1]*nums[i-1];
		}
		
		int right = 1;
		for(int i = n-1; i >= 0; --i) {
			res[i] *= right;
			right *= nums[i];			
		}
		
		return res;
	}

}
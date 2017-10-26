package leetcodeOJ;

import java.util.*;

public class solution_41 {
	public static int firstMissingPositive(int[] nums) {
		int n = nums.length;
		int i = 0;
		while(i < n) {
			if(nums[i] < 1 || nums[i] >= n) {
				++i;
				continue;
			}
	            
			if(nums[i] == i+1 || (nums[i] == nums[nums[i]-1]) ) {
				++i;
				continue;
			}
				
			int tmp = nums[i];
			nums[i] = nums[nums[i]-1];
			nums[tmp-1] = tmp;
		}
		
		i = 0;
		for(; i < n; ++i) {
			if(nums[i] != i+1)
				return i+1;
		}
		return n+1;		
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

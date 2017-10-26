package leetcodeOJ;

import java.util.*;

public class solution_442 {
	public static List<Integer> findDuplicates(int[] nums) {
		///<注意数组元素大于等于1，小于等于n
		int n = nums.length;
		List<Integer> result = new LinkedList<>();
		for(int i = 0; i < n; ++i) {
			int idx = Math.abs(nums[i]) - 1;
			if(nums[idx] < 0) {
				result.add(Math.abs(nums[i]));
			}
			else {
				nums[idx] *= -1;
			}
		}
		
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

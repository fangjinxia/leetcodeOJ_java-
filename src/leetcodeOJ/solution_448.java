package leetcodeOJ;

import java.util.*;

public class solution_448 {
	public static List<Integer> findDisappearedNumbers(int[] nums) {
		///<
		int n = nums.length;
		List<Integer> result = new LinkedList<>();
		int i = 0;
		while(i < n) {
			if((nums[i] == nums[nums[i]-1]) || (nums[i] == i+1)) {
				++i;
				continue;
			}
			
			int tmp = nums[i];
			nums[i] = nums[nums[i]-1];
			nums[tmp-1] = tmp; //要注意参数下标
		}
		i = 0;
		for(; i < n; ++i) {
			if(nums[i] != i+1)
				result.add(i+1);
		}
		
		return result;		
	}
	
	public static void main(String[] args){
		int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};

		List<Integer> result = findDisappearedNumbers(nums);
//		
		System.out.println(result);
	}
}

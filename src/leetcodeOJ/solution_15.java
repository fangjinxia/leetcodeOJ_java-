package leetcodeOJ;

import java.util.*;

public class solution_15 {
	public static List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();
		Arrays.sort(nums);
		int n = nums.length;
		for(int i = 0; i < n-2; ++i){
			if(i > 0 && nums[i] == nums[i-1])
				continue;
			int low = i+1;
			int high = n-1;
			int target = -nums[i];
			List<Integer> tmp = new ArrayList<>();
			while(low < high){
				if(nums[low] + nums[high] == target){
					result.add(Arrays.asList(nums[i], nums[low], nums[high]));
					low++;
					high--;
					while(low < high && nums[low] == nums[low-1]){
						low++;
					}
					while(high > low && nums[high] == nums[high+1]){
						high--;
					}
				}
				else if(nums[low] + nums[high] > target){
					high--;
				}
				else
					low++;
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

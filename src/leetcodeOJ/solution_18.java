package leetcodeOJ;

import java.util.*;

public class solution_18 {
	public static List<List<Integer>> fourSum(int[] nums, int target) {
		List<List<Integer>> result = new ArrayList<>();
		Arrays.sort(nums);
		int n = nums.length;
		for(int i = 0; i < n-3; ){
			for(int j = n-1; j > i+2; ){
				int T = target - nums[i] - nums[j];
				int lo = i+1;
				int hi = j-1;
				while(lo < hi){
					if(nums[lo] + nums[hi] == T){
						result.add(Arrays.asList(nums[i], nums[lo], nums[hi], nums[j]));
						++lo;
						while(lo < hi && nums[lo] == nums[lo-1]){
							++lo;
						}
						--hi;
						while(lo < hi && nums[hi] == nums[hi+1]){
							--hi;
						}
					}
					else if(nums[lo] + nums[hi] < T){
						++lo;
					}
					else{
						--hi;
					}
				}
				
				--j;
				while((j > i+2) && nums[j] == nums[j+1]){
					--j;
				}
				
			}
			++i;
			while(i < n-3 && nums[i] == nums[i-1]){
				++i;
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

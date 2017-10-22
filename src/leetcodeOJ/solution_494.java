package leetcodeOJ;

import java.util.Arrays;
import java.util.HashMap;

public class solution_494 {
	public static int findTargetSumWays(int[] nums, int S) {
		int n = nums.length;
        int result = 0;
		result += findTarget(nums, 0, n-1, 0, S);
		
		return result;		
	}
	
	public static int findTarget(int[] nums, int start, int end, int cur, int target) {
		if(start <= end){
            return findTarget(nums, start+1, end, cur+nums[start], target) + findTarget(nums, start+1, end, cur-nums[start], target);            
		}
        else{
            if(cur == target)
			    return 1;
            return 0;
        }
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

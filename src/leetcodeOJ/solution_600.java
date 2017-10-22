package leetcodeOJ;

import java.util.Arrays;
import java.util.HashMap;

public class solution_600 {
	public static int findIntegers(int num) {
		int[] dp = new int[num+1];
		for(int i = 0; i <= num; ++i){
			dp[i] = 0;
		}		
		dp[0] = 1;
		dp[1] = 1;
		for(int i = 0; i <= num; ++i){
			if(dp[i] == 0)
				continue;
			
		}
		
		return dp[num];		
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

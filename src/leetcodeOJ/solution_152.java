package leetcodeOJ;

import java.util.*;

public class solution_152 {
	public int maxProduct(int[] nums) {
        int n = nums.length;
        int[] max_dp = new int[n];
        int[] min_dp = new int[n];
        
        for(int i = 0; i < n; ++i) {
        	max_dp[i] = nums[i];
        	min_dp[i] = nums[i];
        	if(i == 0)
        		continue;        	
        	
        	max_dp[i] = Math.max(max_dp[i], Math.max(nums[i]*max_dp[i-1], nums[i]*min_dp[i-1]));
        	min_dp[i] = Math.min(min_dp[i], Math.min(nums[i]*max_dp[i-1], nums[i]*min_dp[i-1]));
        	
        	
        }
        
        int res = Integer.MIN_VALUE;
        for(int c : max_dp) {
        	res = Math.max(res, c);
        }
        return res;
        
    }
	
	
}


package leetcodeOJ;

import java.util.*;

public class solution_713 {
	public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length;
        int res = 0;
        long product = 1;
        int j = 0;
        for(int i = 0; i < n; ++i) {
        	product *= nums[i];        	
        	while(product >= k && j <= i) {
        		product /= nums[j];
        	}
        	
        	res += i - j + 1;
        }
        
        return res;
    }
	
	
}


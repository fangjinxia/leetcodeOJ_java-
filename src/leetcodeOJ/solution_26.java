package leetcodeOJ;

import java.util.*;

public class solution_26 {
	public static int removeDuplicates(int[] nums) {
		int n = nums.length;
		if(nums == null || n == 0)
			return 0;
		int res = 1;
		for(int i = 1; i < n; ++i) {
			if(nums[i] != nums[i-1]) {
				nums[res++] = nums[i];
			}
		}
		
		return res;
	}
	
}

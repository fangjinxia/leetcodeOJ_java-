package leetcodeOJ;

import java.util.*;

public class solution_80 {
	public static int removeDuplicates(int[] nums) {
		int n = nums.length;
		if(nums == null || n == 0)
			return 0;
		int res = 2;
		for(int i = 2; i < n; ++i) {
			if(nums[i] != nums[res-2] || nums[i] != nums[res-1]) {
				nums[res++] = nums[i];
			}
		}
		
		return res;
	}
	
}

package leetcodeOJ;

import java.util.*;
import java.lang.String;
import leetcodeOJ.TreeNode;

public class solution_142 {
	/*
	 */
	public int findDuplicate(int[] nums) {
		int n = nums.length;
		if(n == 0)
			return -1;
		
		int lo = 1; 
		int hi = n-1;
		while(lo <= hi) {
			int mid = lo + (hi-lo)/2;
			int cnt = 0;
			for(int it : nums) {
				if(it <= mid)
					++cnt;
			}
			if(cnt <= mid)
				lo = mid+1;
			else
				hi = mid-1;
		}
		
		return lo;
	}
}
 
package leetcodeOJ;

import java.util.*;
import java.lang.String;
import leetcodeOJ.TreeNode;

public class solution_75 {
	/*
	 */
	public static void sortColors(int[] nums) {
		int lo = 0;
		int hi = nums.length-1;
		
		while(lo < hi && nums[lo] == 0) {
			++lo;
		}
		while(lo < hi && nums[hi] == 2) {
			--hi;
		}
		for(int i = lo; i <= hi;) {
			if(nums[i] == 0) {
				int tmp = nums[i];
				nums[i] = nums[lo];
				nums[lo] = tmp;
				++lo;
				while(lo < hi && nums[lo] == 0) {
					++lo;
				}
				i = lo;
			}
			else if(nums[i] == 2) {
				int tmp = nums[i];
				nums[i] = nums[hi];
				nums[hi] = tmp;
				--hi;
				while(lo < hi && nums[hi] == 2) {
					--hi;
				}
			}
            else if(nums[i] == 1)
                ++i;
		}
		System.out.println(Arrays.toString(nums));
	}
	
	public static void main(String[] args) {
		int[] nums = {0,2,1,2,1,2,1,0,0,2,1,2,1,2,1,2,1,1,1,0,0,0,2};
		sortColors(nums);
		
	}
}
 
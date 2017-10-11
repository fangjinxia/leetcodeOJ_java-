package leetcodeOJ;

import java.util.*;
import java.lang.String;
import leetcodeOJ.TreeNode;

public class solution_34 {
	/*
	 * 注意时间复杂度要求
	 */
	protected static int[] searchRange(int[] nums, int target) {
		int[] result = {-1, -1};
		int low = 0, high = nums.length-1;
		while(low <= high) {
			int mid = low + (high-low)/2;
			if(nums[mid] > target) {
				high = mid-1;
			}
			else if(nums[mid] < target) {
				low = mid+1;
			}
			else {
				int tmp = mid;
				while(tmp >= 0 && nums[tmp] == target) {
					--tmp;
				}
				result[0] = tmp+1;
				
				while(mid < nums.length && nums[mid] == target) {
					++mid;
				}
				result[1] = mid-1;
				return result;
			}
		}
		
		
		return result;
	}
	public static void main(String[] args) {
		//String[] strs = {"Hello","Alaska","Dad","Peace"};
		//String[] res = findWords(strs);
		//System.out.println(Arrays.toString(res));
	}
}
 
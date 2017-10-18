package leetcodeOJ;

import java.util.*;
import java.lang.String;
import leetcodeOJ.TreeNode;

public class solution_283 {
	/*
	 */
	protected static void moveZeroes(int[] nums) {
		int i = 0;
		while(i < nums.length && nums[i] != 0) {
			++i;
		}
        for(int j = i+1; j < nums.length; ++j) {
        	if(nums[j] != 0) {
        		int tmp = nums[j];
        		nums[j] = nums[i];
        		nums[i] = tmp;
        		++i;
        		while(i < nums.length && nums[i] != 0) {
        			++i;
        		}
        	}
        }
	}
	
	
	public static void main(String[] args) {
		//String[] strs = {"Hello","Alaska","Dad","Peace"};
		//String[] res = findWords(strs);
		//System.out.println(Arrays.toString(res));
	}
}
 
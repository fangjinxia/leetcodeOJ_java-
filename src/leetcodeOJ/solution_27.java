package leetcodeOJ;

import java.util.*;
import java.lang.String;
import leetcodeOJ.TreeNode;

public class solution_27 {
	/*
	 */
	protected static int removeElement(int[] nums, int val) {
        int res = 0;
        for(int i = 0; i < nums.length; ++i){
            if(nums[i] != val){
                nums[res++] = nums[i];
            }
        }
        return res;
	}
	
	
	public static void main(String[] args) {
		//String[] strs = {"Hello","Alaska","Dad","Peace"};
		//String[] res = findWords(strs);
		//System.out.println(Arrays.toString(res));
	}
}
 
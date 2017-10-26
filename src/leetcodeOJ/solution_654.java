package leetcodeOJ;

import java.util.*;
import java.lang.String;
import leetcodeOJ.TreeNode;

public class solution_654 {
	 /*
	 */
	protected static TreeNode constructMaximumBinaryTree(int[] nums) {
		int n = nums.length;
		if(n == 0)
			return null;
		return getTree(nums, 0, n-1);
	}
	
	private static TreeNode getTree(int[] nums, int start, int end) {
		if(start > end)
			return null;
		///<find the index of the maximum number
		int idx = start;
		for(int i = start+1; i <= end; ++i) {
			if(nums[i] > nums[idx]) {
				idx = i;
			}
		}
		
		TreeNode node = new TreeNode(nums[idx]);
		node.left = getTree(nums, start, idx-1);
		node.right = getTree(nums, idx+1, end);
		
		return node;
	}
	
	public static void main(String[] args) {
//		int i = 9;
//		
	}
}
 
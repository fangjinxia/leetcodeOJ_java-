package leetcodeOJ;

import java.util.*;
import leetcodeOJ.TreeNode;

public class solution_108 {
	public TreeNode sortedArrayToBST(int[] nums) {
		int n = nums.length;
		if(n == 0)
			return null;
		
		TreeNode root = new TreeNode(nums[n/2]);
		root.left = getSortedTree(nums, 0, n/2-1);
		root.right = getSortedTree(nums, n/2+1, n-1);
		
		return root;
	}
	
	public TreeNode getSortedTree(int[] nums, int low, int high){
		if(low == high){
			return new TreeNode(nums[low]);
		}
		else if(low < high){
			int tmp = low + (high-low) / 2;
			TreeNode node = new TreeNode(nums[tmp]);
			node.left = getSortedTree(nums, low, tmp-1);
			node.right = getSortedTree(nums, tmp+1, high);
			return node;
		}
		else 
			return null;
	}
	
}

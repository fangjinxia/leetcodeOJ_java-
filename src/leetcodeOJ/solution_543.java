package leetcodeOJ;

import java.util.*;

public class solution_543 {
	private int res = 0;
	public int diameterOfBinaryTree(TreeNode root) {
		if(root == null)
			return 0;
		getHeight(root);
		return res;
	}
	
	public int getHeight(TreeNode node){
		if(node == null)
			return 0;
		
		int left = getHeight(node.left);
		int right = getHeight(node.right);
		
		res = Math.max(res, left+right);
		return 1+Math.max(left, right);
	}
}

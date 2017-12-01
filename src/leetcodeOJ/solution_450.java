package leetcodeOJ;

import java.util.*;
import java.lang.String;
import leetcodeOJ.TreeNode;

public class solution_450 {
	/*
	 */
	public TreeNode deleteNode(TreeNode root, int key) {
		if(root == null)
			return root;
		
		if(root.val > key)
			root.left = deleteNode(root.left, key);
		else if(root.val < key)
			root.right = deleteNode(root.right, key);
		else {
			if(root.left == null)
				return root.right;
			if(root.right == null)
				return root.left;
			root.val = getMin(root.right); //或者左子树的最大值
			root.right = deleteNode(root.right, root.val);			
		}
		
		return root;
	}
	
	public int getMin(TreeNode node) {
		int res = node.val;
		while((node = node.left) != null) {
			res = node.val;
		}
		
		return res;
	}
	
}
 
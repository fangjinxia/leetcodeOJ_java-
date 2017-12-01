package leetcodeOJ;

import java.util.*;
import java.lang.String;
import leetcodeOJ.TreeNode;

public class solution_404 {
	/*
	 */
	public int sumOfLeftLeaves(TreeNode root) {
		if(root == null)
			return 0;
		
		int sum = 0;
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()) {
			TreeNode node = q.poll();
			if(node.left != null) {
				if(node.left.left == null && node.left.right == null)
					sum += node.left.val;
				else {
					q.add(node.left);
				}
			}
			if(node.right != null) {
				q.add(node.right);
			}
		}
		
		return sum;
		
	}
	
}
 
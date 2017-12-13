package leetcodeOJ;

import java.util.*;
import leetcodeOJ.TreeNode;

public class solution_623 {
	public TreeNode addOneRow(TreeNode root, int v, int d) {
		if(d == 1){
			TreeNode node = new TreeNode(v);
			node.left = root;
			return node;
		}
		
		add(root, v, d);
		return root;
	}
	
	public void add(TreeNode root, int v, int d){
		if(root == null)
			return ;
		if(d == 2){
			TreeNode node = root.left;
			root.left = new TreeNode(v);
			root.left.left = node;
			
			node = root.right;
			root.right = new TreeNode(v);
			root.right.right = node;
			
			return ;
		}
		
		add(root.left, v,d-1);
		add(root.right, v, d-1);
	}
	
}

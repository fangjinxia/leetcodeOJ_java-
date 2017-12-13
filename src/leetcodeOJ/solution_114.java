package leetcodeOJ;

import java.util.*;
import leetcodeOJ.TreeNode;

public class solution_114 {
	public void flatten(TreeNode root) {
		if(root == null)
			return ;
		
		if(root.left != null){
			TreeNode tmp = root.right;
			root.right = root.left;	
			
			TreeNode node = root.left;
			while(node.right != null){
				node = node.right;
			}
			node.right = tmp;
			
			root.left = null;
		}
		
		flatten(root.right);
	}
	
}

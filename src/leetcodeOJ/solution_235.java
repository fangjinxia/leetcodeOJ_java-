package leetcodeOJ;

import java.util.*;
import leetcodeOJ.TreeNode;

public class solution_235 {
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if(root == null)
			return null;
		if(p.val > q.val)
			return lowestCommonAncestor(root, q, p);
		
		if(root.val > q.val){
			return lowestCommonAncestor(root.left, p, q);
		}
		else if(root.val < p.val){
			return lowestCommonAncestor(root.right, p, q);
		}
		else{
			return root;
		}
	}
	
}

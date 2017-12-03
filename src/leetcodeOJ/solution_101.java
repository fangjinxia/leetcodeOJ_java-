package leetcodeOJ;

import java.util.*;
import leetcodeOJ.TreeNode;

public class solution_101 {
	public boolean isSymmetric(TreeNode root) {
		if(root == null)
			return true;
		return isSymm(root.left, root.right);
	}
	
	public boolean isSymm(TreeNode p, TreeNode q){
		if(q == null && p == null)
			return true;
		if(q == null || p == null)
			return false;
		
		if(p.val != q.val)
			return false;
		else{
			return isSymm(p.left, q.right) && isSymm(p.right, q.left);
		}
	}
	
}

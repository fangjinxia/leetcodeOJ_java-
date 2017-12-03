package leetcodeOJ;

import java.util.*;
import leetcodeOJ.TreeNode;

public class solution_100 {
	public boolean isSameTree(TreeNode p, TreeNode q) {
		if(p == null && q == null)
			return true;
		if(p == null || q == null)
			return false;
		
		if(q.val == p.val){
			return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);			
		}
		else
			return false;
	}
	
}

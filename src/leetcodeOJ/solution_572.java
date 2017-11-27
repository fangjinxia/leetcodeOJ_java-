package leetcodeOJ;

import java.util.*;
import leetcodeOJ.TreeNode;

public class solution_572 {
	public boolean isSubtree(TreeNode s, TreeNode t) {
		if(s == null && t != null)
			return false;
		if(s != null && t == null)
			return false;		
		if(s == null && t == null)
			return true;
		
		boolean isSub = false;
		if(s.val == t.val){
			isSub = check(s, t);
		}
		if(!isSub){
			isSub = isSubtree(s.left, t);			
		}
		if(!isSub){
			isSub = isSubtree(s.right, t);
		}
		
		return isSub;
	}
	
	private static boolean check(TreeNode s, TreeNode t){
		if(s == null && t != null)
			return false;
		if(s != null && t == null)
			return false;		
		if(s == null && t == null)
			return true;
		
		if(s.val != t.val)
			return false;
		else{
			return check(s.left, t.left) && check(s.right, t.right);
		}
	}
	
}

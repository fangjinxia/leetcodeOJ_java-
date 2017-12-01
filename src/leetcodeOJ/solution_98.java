package leetcodeOJ;

import java.util.*;
import java.lang.String;
import leetcodeOJ.TreeNode;

public class solution_98 {
	/*
	 */
	public boolean isValidBST(TreeNode root) {
        return isBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
	
    public boolean isBST(TreeNode node, long low, long high){
        if(node == null)
        	return true;
        
        if(node.val >= low && node.val <= high)
        	return isBST(node.left, low, (long)node.val-1) && isBST(node.right, (long)node.val+1, high);	
        else 
        	return false;
    }
	
}

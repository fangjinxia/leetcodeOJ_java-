package leetcodeOJ;

import java.util.*;
import leetcodeOJ.TreeNode;

public class solution_687 {
	int res = Integer.MIN_VALUE;
	public int longestUnivaluePath(TreeNode root) {
		if(root == null) 
			return 0;
        
        getLongestPath(root); 
        return res;
    }

    public int getLongestPath(TreeNode root){ 
    	if(root == null) 
        	return 0;
        
        int left = 0, resl = 0;        
        int right = 0, resr = 0;      
        if(root.left != null){
        	left = getLongestPath(root.left);        	
        }
        else
        	left = 0;        
        if(root.left != null && (root.val == root.left.val))
    		resl = left+1;
        
        if(root.right != null){
        	right = getLongestPath(root.right);        	
        }
        else
        	right = 0;
        if(root.right != null && (root.val == root.right.val))
    		resr = right+1;
        
        res = Math.max(resl+resr, res);
        return Math.max(resl, resr);
    }
}

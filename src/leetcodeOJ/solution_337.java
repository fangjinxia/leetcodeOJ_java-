package leetcodeOJ;

import java.util.*;
import java.lang.String;
import leetcodeOJ.TreeNode;

public class solution_337 {
	/*
	 */
	public int rob(TreeNode root) {
		return robDFS(root)[1];
    }
	
    int[] robDFS(TreeNode node){
        int[] res = new int[2];
        if(node==null) return res;
        int[] l = robDFS(node.left);
        int[] r = robDFS(node.right);
        res[0] = l[1] + r[1];
        res[1] = Math.max(res[0], l[0] + r[0] + node.val);
        return res;
    }
	
}

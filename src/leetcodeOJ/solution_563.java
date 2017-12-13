package leetcodeOJ;

import java.util.*;
import leetcodeOJ.TreeNode;

public class solution_563 {
	int res = 0;
	public int findTilt(TreeNode root) {
		postOrder(root);
		
		return res;
	}
	
	public int postOrder(TreeNode node){
		if(node == null)
			return 0;
		
		int left = postOrder(node.left);
		int right = postOrder(node.right);
		res += Math.abs(left - right);
		return left + right + node.val;
	}
	
	public static void main(String[] args){
		
//		System.out.println(Arrays.toString(result));
	}
}

package leetcodeOJ;

import java.util.*;
import java.lang.String;
import java.lang.*;

import leetcodeOJ.TreeNode;

public class solution_111 {
	/*
	 */
	protected static int minDepth(TreeNode root) {
		if(root == null)
			return 0;
		int left = minDepth(root.left);
		int right = minDepth(root.right);
		
		if(left == 0 || right == 0)
			return left + right + 1;		
		return 1 + min(left, right);
	}
	
	private static int min(int a, int b) {
		if(a < b)
			return a;
		return b;
	}
	public static void main(String[] args) {
		//String[] strs = {"Hello","Alaska","Dad","Peace"};
		//String[] res = findWords(strs);
		//System.out.println(Arrays.toString(res));
	}
}
 
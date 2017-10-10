package leetcodeOJ;

import java.util.*;
import java.lang.String;
import java.lang.*;

import leetcodeOJ.TreeNode;

public class solution_104 {
	/*
	 */
	protected static int maxDepth(TreeNode root) {
		if(root == null)
			return 0;
		
		return 1 + max(maxDepth(root.left), maxDepth(root.right));
	}
	
	private static int max(int a, int b) {
		if(a > b)
			return a;
		return b;
	}
	public static void main(String[] args) {
		//String[] strs = {"Hello","Alaska","Dad","Peace"};
		//String[] res = findWords(strs);
		//System.out.println(Arrays.toString(res));
	}
}
 
package leetcodeOJ;

import java.util.*;
import java.lang.String;
import leetcodeOJ.TreeNode;

public class solution_669 {
	/*
	 * ตÝน้
	 */
	protected static TreeNode trimBST(TreeNode root, int L, int R) {
		if(root == null)
			return null;
		
		int v = root.val;
		if(v >= L && v <=R) {
			TreeNode node = new TreeNode(v);
			node.left = trimBST(root.left, L, R);
			node.right = trimBST(root.right, L, R);
			return node;
		}
		else if(v < L) {
			return trimBST(root.right, L, R);
		}
		else {
			return trimBST(root.left, L, R);
		}
		
	}
	public static void main(String[] args) {
		//String[] strs = {"Hello","Alaska","Dad","Peace"};
		//String[] res = findWords(strs);
		//System.out.println(Arrays.toString(res));
	}
}
 
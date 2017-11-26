package leetcodeOJ;

import java.util.*;
import leetcodeOJ.TreeNode;

public class solution_538 {
	private int sum = 0;
	public TreeNode convertBST(TreeNode root) {
		//因为该树是二叉搜索树
		if(root == null)
			return null;
		convertBST(root.right);
		root.val += sum;
		sum = root.val;
		convertBST(root.left);
		return root;
	}
	
	
}

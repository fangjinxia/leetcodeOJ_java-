package leetcodeOJ;

import java.util.*;
import leetcodeOJ.TreeNode;

public class solution_129 {
	int res = 0;
	public int sumNumbers(TreeNode root) {
		if(root == null)
			return 0;
		getSum(root, root.val);
		return res;
	}
	
	public void getSum(TreeNode root, int cur){
		if(root.left == null && root.right == null){
			res += cur;
			return ;
		}
		if(root.left != null)
			getSum(root.left, cur*10 + root.left.val);
		if(root.right != null)
			getSum(root.right, cur*10 + root.right.val);		
	}
}

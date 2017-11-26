package leetcodeOJ;

import java.util.*;

public class solution_94 {
	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> res = new LinkedList<>();
		
		Stack<TreeNode> st = new Stack<>();
		TreeNode cur = root;
		while(cur != null || !st.isEmpty()){
			while(cur != null){
				st.add(cur);
				cur = cur.left;
			}
			cur = st.pop();
			res.add(cur.val);
			cur = cur.right;
		}
		
		return res;
	}
}

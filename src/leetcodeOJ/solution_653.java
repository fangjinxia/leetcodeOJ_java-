package leetcodeOJ;

import java.util.*;
import leetcodeOJ.TreeNode;

public class solution_653 {
	public boolean findTarget(TreeNode root, int k) {
		Set<Integer> st = new HashSet<>();
		if(root == null)
			return false;
		
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()){
			TreeNode node = q.poll();
			if(st.contains(node.val))
				return true;
			st.add(k - node.val);
			if(node.left != null)
				q.add(node.left);
			if(node.right != null)
				q.add(node.right);			
		}
		
		return false;		
	}
	
}

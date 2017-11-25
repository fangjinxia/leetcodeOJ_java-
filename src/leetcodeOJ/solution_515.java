package leetcodeOJ;

import java.util.*;
import leetcodeOJ.TreeNode;

public class solution_515 {
	public List<Integer> largestValues(TreeNode root) {
		List<Integer> res = new LinkedList<>();
		if(root == null)
			return res;
		
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()){
			int tmp = Integer.MIN_VALUE;
			int len = q.size();
			for(int i = 0; i < len; ++i){
				TreeNode node = q.poll();
				if(node.left != null)
					q.add(node.left);
				if(node.right != null)
					q.add(node.right);
				
				tmp = Math.max(tmp, node.val);
			}
			res.add(tmp);
		}
		
		return res;
	}
	
}

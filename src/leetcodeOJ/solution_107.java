package leetcodeOJ;

import java.util.*;
import leetcodeOJ.TreeNode;

public class solution_107 {
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		List<List<Integer>> res = new LinkedList<>();
		if(root == null)
			return res;
		
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()){
			List<Integer> tmp = new ArrayList<>();
			int len = q.size();
			for(int i = 0; i < len; ++i){
				TreeNode node = q.poll();
				if(node.left != null)
					q.add(node.left);
				if(node.right != null)
					q.add(node.right);
				
				tmp.add(node.val);
			}
			res.add(0, tmp);
		}
		
		return res;
	}
	
}

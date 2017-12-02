package leetcodeOJ;

import java.util.*;
import leetcodeOJ.TreeNode;

public class solution_199 {
	public List<Integer> rightSideView(TreeNode root) {
		List<Integer> res = new LinkedList<>();
		if(root == null)
			return res;
		
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()){
			int len = q.size();
			for(int i = 0; i < len; ++i){
				TreeNode tmp = q.poll();
				if(tmp.left != null)
					q.add(tmp.left);
				if(tmp.right != null)
					q.add(tmp.right);
				if(i == len-1)
					res.add(tmp.val);
			}
			
		}
				
		return res;
	}
}

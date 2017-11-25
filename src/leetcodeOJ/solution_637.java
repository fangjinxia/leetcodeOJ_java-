package leetcodeOJ;

import java.util.*;
import leetcodeOJ.TreeNode;

public class solution_637 {
	public List<Double> averageOfLevels(TreeNode root) {
		List<Double> res = new ArrayList<>();
		if(root == null)
			return res;
		
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()){
			double sum = 0.0;
			int len = q.size();
			for(int i = 0; i < len; ++i){
				TreeNode node = q.poll();
				if(node.left != null)
					q.add(node.left);
				if(node.right != null)
					q.add(node.right);
				
				sum += node.val;
			}
			res.add(sum/len);
		}
		
		return res;
	}
	
}

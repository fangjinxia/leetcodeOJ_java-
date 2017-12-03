package leetcodeOJ;

import java.util.*;
import leetcodeOJ.TreeNode;

public class solution_662 {
	public int widthOfBinaryTree(TreeNode root) {
		int res = 0;
		if(root == null)
			return 0;
		
		Queue<TreeNode> q = new LinkedList<>();
		Map<TreeNode, Integer> mp = new HashMap<>();
		q.offer(root);
		mp.put(root, 1);
		while(!q.isEmpty()){
			int len = q.size();
			int start = 0;
			int end = 0;
			for(int  i = 0; i < len; ++i){
				TreeNode node = q.poll();
				if(i == 0) 
					start = mp.get(node);
				if(i == len-1)
					end = mp.get(node);
				
				if(node.left != null){
					q.offer(node.left);
					mp.put(node.left, mp.get(node)*2);
				}
				if(node.right != null){
					q.offer(node.right);
					mp.put(node.right, mp.get(node)*2 + 1);
				}
			}
			
			res = Math.max(res, end-start+1);
		}
		
		return res;
	}
	
}

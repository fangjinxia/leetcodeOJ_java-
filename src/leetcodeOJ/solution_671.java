package leetcodeOJ;

import java.util.*;
import leetcodeOJ.TreeNode;

public class solution_671 {
	public int findSecondMinimumValue(TreeNode root) {
		if(root == null)
			return -1;
		
		int minest = root.val;
		Queue<TreeNode> q = new LinkedList<>();
		q.offer(root);
		boolean flag = false;
		int tmp = Integer.MAX_VALUE;
		while(!q.isEmpty()){
			int len = q.size();			
			for(int i = 0; i < len; ++i){
				TreeNode node = q.poll();				
				if(node.left != null)
					q.offer(node.left);
				if(node.right != null)
					q.offer(node.right);
				
				if(node.val == minest)
					continue;
                if(tmp >= node.val){
                    tmp = node.val;
                    flag = true;
                }				
			}
			
		}
		
		if(tmp > minest && flag)
			return tmp;
		return -1;
	}
}

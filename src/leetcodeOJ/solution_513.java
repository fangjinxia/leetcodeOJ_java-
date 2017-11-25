package leetcodeOJ;

import java.util.*;
import leetcodeOJ.TreeNode;

public class solution_513 {
	public int findBottomLeftValue(TreeNode root) {
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		int res = 0;
		while(!q.isEmpty()){	
			TreeNode tmp = q.peek();
			res = tmp.val;
			int len = q.size();
			for(int i = 0; i < len; ++i){
				TreeNode node = q.poll();
				if(node.left != null)
					q.add(node.left);
				if(node.right != null)
					q.add(node.right);
			}
		}
		
		return res;
	}
	
	public static void main(String[] args){
		
//		System.out.println(Arrays.toString(result));
	}
}

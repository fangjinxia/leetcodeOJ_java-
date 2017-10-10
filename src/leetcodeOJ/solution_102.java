package leetcodeOJ;

import java.util.*;
import java.lang.String;
import leetcodeOJ.TreeNode;

public class solution_102 {
	/*
	 */
	protected static List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> result = new LinkedList<List<Integer>>();
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		if(root == null)
			return result;
		
		q.offer(root);
		while(!q.isEmpty()) {
			int tmp = q.size();
			List<Integer> re = new LinkedList<Integer>();
			for(int i = 0; i < tmp; ++i) {
				if(q.peek().left != null)
					q.offer(q.peek().left);
				if(q.peek().right != null)
					q.offer(q.peek().right);
								
				re.add(new Integer(q.peek().val));
				q.poll();
			}
			
			result.add(re);		
		}
		
		return result;
	}
	public static void main(String[] args) {
		//String[] strs = {"Hello","Alaska","Dad","Peace"};
		//String[] res = findWords(strs);
		//System.out.println(Arrays.toString(res));
	}
}
 
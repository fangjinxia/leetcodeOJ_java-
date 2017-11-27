package leetcodeOJ;

import java.util.*;
import leetcodeOJ.TreeNode;

public class solution_508 {
	static Map<Integer, Integer> mp;
	static int maxFreq;
	
	public int[] findFrequentTreeSum(TreeNode root) {
		mp = new HashMap<>();
		maxFreq = Integer.MIN_VALUE;
		
		postOrder(root);
		
		List<Integer> list = new ArrayList<>();
		for(int key : mp.keySet()){
			if(mp.get(key) == maxFreq)
				list.add(key);
		}
		
		int[] res = new int[list.size()];
		for(int i = 0; i < list.size(); ++i){
			res[i] = list.get(i);
		}
		
		return res;
	}
	
	private static int postOrder(TreeNode root){
		if(root == null)
			return 0;
		int left = postOrder(root.left);
		int right = postOrder(root.right);
		int sum = root.val + left + right;
		int count = mp.getOrDefault(sum, 0)+1;
		mp.put(sum, count);
		maxFreq = Math.max(maxFreq, count);
		
		return sum;
	}
}

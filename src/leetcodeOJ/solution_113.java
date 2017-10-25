package leetcodeOJ;

import java.util.*;
import leetcodeOJ.TreeNode;

public class solution_113 {
	public static List<List<Integer>> pathSum(TreeNode root, int sum) {
		List<List<Integer>> res = new LinkedList<List<Integer>>();		
		List<Integer> st = new LinkedList<Integer>();		
		dfs(root, sum, res, st);		
		return res;
	}
	
	private static void dfs(TreeNode node, int sum, List<List<Integer>> res, List<Integer> st){
		if(node == null){			
			return ;
		}
		st.add(node.val);
		if((node.left == null) && (node.right == null) && (sum == node.val)){
			res.add(new LinkedList(st));
			st.remove(st.size()-1);			
			return ;
		}
		else {
			dfs(node.left, sum-node.val, res, st);		
			dfs(node.right, sum-node.val, res, st);
		}
		st.remove(st.size()-1);
	}
	
	public static void main(String[] args){
//		int[] nums = {1, 2, 3, 4, 5, 6, 7};
//		int target = 12;
//		
//		int[] result = new int[2]; 
//		result = twoSum(nums, target);
//		
//		///<字符串与整型的相互转换
//		String a = String.valueOf(2);   //integer to numeric string
//		int i = Integer.parseInt(a); //numeric string to an int
//		
//		System.out.println(Arrays.toString(result));
	}
}

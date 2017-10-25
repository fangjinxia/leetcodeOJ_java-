package leetcodeOJ;

import java.util.*;
import leetcodeOJ.TreeNode;

public class solution_257 {
	public static List<String> binaryTreePaths(TreeNode root) {
		List<String> res = new LinkedList<>();
		if(root == null)
			return res;
		
		String s = String.valueOf(root.val);
        if(root.left == null && root.right == null){
            res.add(s);
            return res;
        }
            
		if(root.left != null)
            dfs(root.left, s, res);
		if(root.right != null)
            dfs(root.right, s, res);
		return res;		
	}
	
	private static void dfs(TreeNode node, String s, List<String> res){	
		if(node != null){
			s += "->";
			s += String.valueOf(node.val);
		}
        if(node.left == null && node.right == null){
			res.add(s);
			return ;
		}
		
		if(node.left != null){
			dfs(node.left, s, res);			
		}
		if(node.right != null){
			dfs(node.right, s, res);	
		}
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

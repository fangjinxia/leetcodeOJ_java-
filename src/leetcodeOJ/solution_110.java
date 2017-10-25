package leetcodeOJ;

import java.util.*;
import leetcodeOJ.TreeNode;

public class solution_110 {
	public static boolean isBalanced(TreeNode root) {
		if(root == null){
			return true;		
		}
		
		int left = getHeight(root.left);
		int right = getHeight(root.right);
		if(Math.abs(left - right) <= 1 && isBalanced(root.left) && isBalanced(root.right))
			return true;
		
		return false;
	} 
	
	private static int getHeight(TreeNode node){
		if(node == null)
			return 0;
		int left = getHeight(node.left);
		int right = getHeight(node.right);
				
		return Math.max(left, right)+1;
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

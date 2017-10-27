package leetcodeOJ;

import java.util.*;

public class solution_437 {
	public static int pathSum(TreeNode root, int sum) {
		if(root == null) {
			return 0;
		}
		return getPath(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
	}

	public static int getPath(TreeNode root, int sum) {		
        if(root == null)
            return 0;
		int tmp = sum - root.val;
		return (root.val == sum ? 1 : 0) + getPath(root.left, tmp) + getPath(root.right, tmp);
	}
		
	public static void main(String[] args){
//		int[] nums = {1, 2, 3, 4, 5, 6, 7};
//		int target = 12;
//		
//		int[] result = new int[2]; 
//		result = twoSum(nums, target);
//		
//		System.out.println(Arrays.toString(result));
	}
}

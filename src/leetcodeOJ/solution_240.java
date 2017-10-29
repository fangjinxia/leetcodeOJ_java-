package leetcodeOJ;

import java.util.*;

public class solution_240 {
	public static boolean searchMatrix(int[][] matrix, int target) {
		int n = matrix.length;
		if(n == 0)
			return false;
		int m = matrix[0].length;
		
		int i = 0, j = m-1;
		while(true){
			if(i >= n || j < 0)
				break;
			if(matrix[i][j] == target){
				return true;
			}
			else if(matrix[i][j] > target){
				--j;
			}
			else{
				++i;
			}
		}
		
		return false;
	}
	
	
	public static void main(String[] args){
//		int[] nums = {1, 2, 3, 4, 5, 6, 7};
//		int target = 12;
//		
//		int[] result = new int[2]; 
//		result = twoSum(nums, target);
//		
//		String a = String.valueOf(2);   //integer to numeric string
//		int i = Integer.parseInt(a); //numeric string to an int
//		
//		System.out.println(Arrays.toString(result));
	}
}

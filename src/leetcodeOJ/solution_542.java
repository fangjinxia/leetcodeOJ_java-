package leetcodeOJ;

import java.util.*;

public class solution_542 {
	public static int[][] updateMatrix(int[][] matrix) {
		int n = matrix.length;
		if(n == 0)
			return matrix;
		int m = matrix[0].length;
		
		for(int i = 0; i < n; ++i){
			for(int j = 0; j < m; ++j){
				if(matrix[i][j] == 0)
					continue;
				else{
					int up = (i == 0) ? Integer.MAX_VALUE-1 : matrix[i-1][j];
					int left = (j == 0) ? Integer.MAX_VALUE-1 : matrix[i][j-1];
					matrix[i][j] = Math.min(Integer.MAX_VALUE-1, Math.min(up, left) + 1);
				}
			}
		}
		
		for(int i = n-1; i >= 0; --i){
			for(int j = m-1; j >= 0; --j){
                if(matrix[i][j] != 0 || matrix[i][j] != 1){
                    int down = (i == n-1) ? Integer.MAX_VALUE-1 : matrix[i+1][j];
                    int right = (j == m-1) ? Integer.MAX_VALUE-1 : matrix[i][j+1];
                    matrix[i][j] = Math.min(matrix[i][j], Math.min(down, right) + 1);
                }
			}
		}
		
		return matrix;		
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

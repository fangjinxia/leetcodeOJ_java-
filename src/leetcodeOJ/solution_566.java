package leetcodeOJ;

import java.util.*;
import java.lang.String;

public class solution_566 {
	/*
	 *
	 */
	protected static int[][] matrixReshape(int[][] nums, int r, int c) {
		int[][] result = new int[r][c];
		int n = nums.length;
		int m = nums[0].length;
		if(m*n != r*c)
			return nums;
		
     //   System.out.println(n + " " + m);
        
		int a = 0, b = 0;
		for(int i = 0; i < r; ++i) {
			for(int j = 0; j < c; ++j) {
				result[i][j] = nums[a][b];
                ++b;
				if(b == m) {
					b = 0;
					a += 1;
				}
			}
		}
		
		return result;
	}
	public static void main(String[] args) {
		//String[] strs = {"Hello","Alaska","Dad","Peace"};
		//String[] res = findWords(strs);
		//System.out.println(Arrays.toString(res));
	}
}
 
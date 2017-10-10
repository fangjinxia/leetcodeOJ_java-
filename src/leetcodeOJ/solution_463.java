package leetcodeOJ;

import java.util.*;
import java.lang.String;

public class solution_463 {
	/*
	 */
	protected static int islandPerimeter(int[][] grid) {
		int sum = 0, repeat = 0;
		if(grid == null)
			return 0;
		
		int n = grid.length;
		int m = grid[0].length;
		for(int i = 0; i < n; ++i) {
			for(int j = 0; j < m; ++j) {
				if(grid[i][j] == 1) {
					++sum;
					
					if(i != 0 && grid[i-1][j] == 1)
						++repeat;
					if(j != 0 && grid[i][j-1] == 1)
						++repeat;
				}
			}
		}
		
		int result = 4*sum - 2*repeat;
		return result;
	}
	public static void main(String[] args) {
		//String[] strs = {"Hello","Alaska","Dad","Peace"};
		//String[] res = findWords(strs);
		//System.out.println(Arrays.toString(res));
	}
}
 
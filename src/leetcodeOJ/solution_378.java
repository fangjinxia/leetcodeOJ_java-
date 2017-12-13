package leetcodeOJ;

import java.util.*;
import java.lang.String;
import leetcodeOJ.TreeNode;

public class solution_378 {
	/*
	 */
	public int kthSmallest(int[][] matrix, int k) {
		int n = matrix.length;
		int m = matrix[0].length;
		int lo = matrix[0][0], hi = matrix[n-1][m-1]+1;
		while(lo < hi) {
			int mid = lo + (hi-lo)/2;
			int cnt = 0;
			int j = m-1;
			for(int i = 0; i < n; ++i) {
				while(j >= 0 && matrix[i][j] > mid)
					--j;
				cnt += (j+1);
			}
			
			if(cnt < k)
				lo = mid+1;
			else
				hi = mid;
		}
		return lo;
	}
}
 
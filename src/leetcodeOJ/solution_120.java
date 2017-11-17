package leetcodeOJ;

import java.util.*;

public class solution_120 {
	public int minimumTotal(List<List<Integer>> triangle) {
		int n = triangle.size();
		int[] dp = new int[n];
		for(int i = 0; i < n; ++i) {
			dp[i] = triangle.get(n-1).get(i);
		}
		
		for(int i = n-2; i >= 0; --i) {
			for(int j = 0; j <= i; ++j)
				dp[j] = triangle.get(i).get(j) + Math.max(dp[j], dp[j+1]);
		}
		
		return dp[0];
	}

}

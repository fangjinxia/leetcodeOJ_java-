package leetcodeOJ;

import java.util.*;
import java.lang.String;
import leetcodeOJ.TreeNode;

public class solution_343 {
	 /*
	 * dp
	 * 2 <= n <= 58
	 */
	protected static int integerBreak(int n) {
		int[] dp = new int[n+1]; 
		for(int i = 0; i <= n; ++i) {
			dp[i] = 1;
		}
		dp[2] = 1;
		for(int i = 3; i <= n; ++i) {
			for(int j = 1; j <= (i>>1); ++j) {
				if(dp[i] < Math.max(j, dp[j]) * Math.max(dp[i-j], i-j)) {
					dp[i] = Math.max(j, dp[j]) * Math.max(dp[i-j], i-j);
				}
			}
		}
		return dp[n];
	}
	
	
	public static void main(String[] args) {
		int i = 9;
		
		System.out.println(integerBreak(i));
	}
}
 
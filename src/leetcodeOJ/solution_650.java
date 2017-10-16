package leetcodeOJ;

import java.util.*;
import java.lang.String;
import leetcodeOJ.TreeNode;

public class solution_650 {
	 /*
	 * dp
	 */
	protected static int minSteps(int n) {
		//using two pointer
		int[] dp = new int[n+1];
		for(int i = 0; i <= n; ++i) {
			dp[i] = i;
		}
		for(int i = 2; i <= (n>>1); ++i) {
			int k = 2;
			for(int j = 2*i; j <= n; j += i) {
				dp[j] = Math.min(dp[j], dp[i]+k);
				k++;
			}
		}
		
		return dp[n];
	}
	
	
	public static void main(String[] args) {
		int i = 9;
		
		System.out.println(minSteps(i));
	}
}
 
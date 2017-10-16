package leetcodeOJ;

import java.util.*;
import java.lang.String;
import leetcodeOJ.TreeNode;

public class solution_357 {
	 /*
	 * dp
	 * n = 1, dp[1] = 10
	 * n = 2, dp[2] = 9 * 9 = 81
	 * n = 3, dp[3] = 9 * 9 * 8 = 648
	 * ...
	 */
	protected static int countNumbersWithUniqueDigits(int n) {
		int result = 0;
		int[] dp = new int[11];
		dp[0] = 1;
		dp[1] = 9;
		dp[2] = 81;
		for(int i = 3, k = 8; i < 11; ++i, --k) {
			dp[i] = dp[i-1] * k;
		}
		
		for(int i = 0; i <= n; ++i) {
			result += dp[i];
		}
		return result;
	}
	
	
	public static void main(String[] args) {
		//String[] strs = {"Hello","Alaska","Dad","Peace"};
		//String[] res = findWords(strs);
		//System.out.println(Arrays.toString(res));
	}
}
 
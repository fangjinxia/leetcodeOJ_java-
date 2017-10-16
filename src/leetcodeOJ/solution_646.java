package leetcodeOJ;

import java.util.*;
import java.lang.String;
import leetcodeOJ.TreeNode;

public class solution_646 {
	 /*
	 * dp
	 * 
	 */
	protected static int findLongestChain(int[][] pairs) {
		if(pairs.length <= 1)
			return 0;
		
		Arrays.sort(pairs, (a, b)->(a[0]-b[0]));
		int[] dp = new int[pairs.length];
		for(int i = 0; i < pairs.length; ++i) {
			dp[i] = 1;
		}
		
		for(int i = 1; i < pairs.length; ++i) {
			for(int j = 0; j < i; ++j) {
				if(pairs[i][0] > pairs[j][1]) {
					if(dp[i] < dp[j]+1) {
						dp[i] = dp[j]+1;
					}
				}
			}
		}
		
		int result = 0;
		for(int i = 0; i < pairs.length; ++i) {
			if(dp[i] > result)
				result = dp[i];
		}
		return result;
	}
	
	
	public static void main(String[] args) {
		//String[] strs = {"Hello","Alaska","Dad","Peace"};
		//String[] res = findWords(strs);
		//System.out.println(Arrays.toString(res));
	}
}
 
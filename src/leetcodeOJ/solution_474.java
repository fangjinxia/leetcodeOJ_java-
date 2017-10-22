package leetcodeOJ;

import java.util.Arrays;
import java.util.HashMap;

public class solution_474 {
	public static int findMaxForm(String[] strs, int m, int n) {
		int[][] dp = new int[m+1][n+1];
		for(String s : strs){
			int[] cnt = count(s);
			for(int i = m; i >= cnt[0]; --i){
				for(int j = n; j >= cnt[1]; --j){
					dp[i][j] = Math.max(dp[i][j], 1+dp[i-cnt[0]][j-cnt[1]]);
				}
			}
		}
		return dp[m][n];		
	}
	
	private static int[] count(String s){
		int[] cnt = new int[2];
		for(char c : s.toCharArray()){
			++cnt[c - '0'];
		}
		return cnt;
	}
	
	public static void main(String[] args){
//		int[] nums = {1, 2, 3, 4, 5, 6, 7};
//		int target = 12;
//		
//		int[] result = new int[2]; 
//		result = twoSum(nums, target);
//		
//		System.out.println(Arrays.toString(result));
	}
}

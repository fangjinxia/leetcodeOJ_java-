package leetcodeOJ;

import java.util.Arrays;
import java.util.HashMap;

public class solution_516 {
	public static int longestPalindromeSubseq(String s) {
		if(s.length() == 0)
			return 0;
		int result = longestSubseq(s, 0, s.length()-1);
		return result;		
	}
	
	private static int longestSubseq(String s, int start, int end) {
		if(start == end)
			return 1;
		else if(start > end)
			return 0;
		else{
			if(s.charAt(start) == s.charAt(end)){
				return 2+longestSubseq(s, start+1, end-1);
			}
			else{
				return Math.max(longestSubseq(s, start+1, end), longestSubseq(s, start, end-1));
			}
		}
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

package leetcodeOJ;

import java.util.*;
import java.lang.String;
import leetcodeOJ.TreeNode;

public class solution_392 {
	 /*
	 * dp
	 * check if s is subsequence of t
	 */
	protected static boolean isSubsequence(String s, String t) {
		//using two pointer
		int i = 0, j = 0;
		for(; i < s.length() && j < t.length(); ) {
			if(s.charAt(i) == t.charAt(j)) 
				++i;		
			++j;
		}
		
		return i == s.length();
	}
	
	
	public static void main(String[] args) {
//		int i = 9;
//		
//		System.out.println(integerBreak(i));
	}
}
 
package leetcodeOJ;

import java.util.*;
import java.lang.String;
import leetcodeOJ.TreeNode;

public class solution_696 {
	/*
	 */
	protected static int countBinarySubstrings(String s) {
		int result = 0;
		if(s.length() < 2)
			return 0;
		for(int i = 0; i < s.length()-1; ++i) {
			result += count(s, i, i+1);
			
		}		
		
		return result;
	}
	
	private static int count(String s, int start, int end) {
		int k = 0;
		if(s.charAt(start) != s.charAt(end)) {
			++k;
			while(start > 0 && end < s.length()-1) {
				--start;
				++end;
				if((s.charAt(start) == s.charAt(start+1)) && (s.charAt(end) == s.charAt(end-1))) {
					++k;
				}
				else
					break;
			}
		}
		return k;
	}
	public static void main(String[] args) {
		String strs = new String("11110011");
		int res = countBinarySubstrings(strs);
		System.out.println(res);
	}
}
 
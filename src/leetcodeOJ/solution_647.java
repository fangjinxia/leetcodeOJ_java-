package leetcodeOJ;

import java.util.*;
import java.lang.String;
import leetcodeOJ.TreeNode;

public class solution_647 {
	 /*
	 * dp
	 */
	protected static int countSubstrings(String s) {
		if(s.length() <= 1)
			return s.length();
		int result = 0;
		for(int i = 0; i < s.length(); ++i) {
			result += extendSubstr(s, i, i);//odd
			result += extendSubstr(s, i, i+1);//even			
		}
		
		return result;
	}
	
	private static int extendSubstr(String s, int start, int end) {
		int k = 0;
		while(start >= 0 && end < s.length()) {
			if(s.charAt(start) == s.charAt(end)) {
				++k;
				--start;
				++end;
			}
			else
				break;
		}
		return k;
	}
	
	public static void main(String[] args) {
		//String[] strs = {"Hello","Alaska","Dad","Peace"};
		//String[] res = findWords(strs);
		//System.out.println(Arrays.toString(res));
	}
}
 
package leetcodeOJ;

import java.util.*;
import java.lang.String;
import leetcodeOJ.TreeNode;

public class solution_171 {
	/*
	 */
	protected static int titleToNumber(String s) {
		int result = 0;
		for(int i = 0; i < s.length(); ++i) {
			result *= 26;
			result += s.charAt(i) - 'A' + 1;
		}
		return result;
	}
	
	
	public static void main(String[] args) {
		//String[] strs = {"Hello","Alaska","Dad","Peace"};
		//String[] res = findWords(strs);
		//System.out.println(Arrays.toString(res));
	}
}
 
package leetcodeOJ;

import java.util.*;
import java.lang.String;
import leetcodeOJ.TreeNode;

public class solution_389 {
	/*
	 */
	protected static char findTheDifference(String s, String t) {
		char[] char_s = s.toCharArray();
		char[] char_t = t.toCharArray();
		Arrays.sort(char_s);
		Arrays.sort(char_t);
		
		for(int i = 0; i < char_s.length; ++i) {
			if(char_s[i] != char_t[i])
				return char_t[i]; //PS：返回的应是数组char_t里的元素
		}
		
		return char_t[t.length()-1];
	}
	public static void main(String[] args) {
		//String[] strs = {"Hello","Alaska","Dad","Peace"};
		//String[] res = findWords(strs);
		//System.out.println(Arrays.toString(res));
	}
}
 
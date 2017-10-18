package leetcodeOJ;

import java.util.*;
import java.lang.String;
import leetcodeOJ.TreeNode;

public class solution_520 {
	/*
	 */
	protected static boolean detectCapitalUse(String word) {
		if(word.length() < 2)
			return true;
		
		boolean mark = false;
		if(Character.isLowerCase(word.charAt(0)))
			mark = true;//第一个字符为小写
		
		if(mark) {
			if(word.equals(word.toLowerCase()))
				return true;
		}
		else {
			String str = word.substring(1);
			String newstr1 = str.toLowerCase();
			String newstr2 = str.toUpperCase();
			
			if(str.equals(newstr1) || str.equals(newstr2))
				return true;
 		}
		
		return false;
	}
	
	
	public static void main(String[] args) {
		//String[] strs = {"Hello","Alaska","Dad","Peace"};
		//String[] res = findWords(strs);
		//System.out.println(Arrays.toString(res));
	}
}
 
package leetcodeOJ;

import java.util.*;
import java.lang.String;
import leetcodeOJ.TreeNode;

public class solution_383 {
	/*
	 */
	protected static boolean canConstruct(String ransomNote, String magazine) {
		if(ransomNote.length() > magazine.length())
			return false;
		
		String rstr = ssort(ransomNote);
		String mstr = ssort(magazine);
		
		int i = 0;
		for(int j = 0; i < rstr.length() && j < mstr.length(); ) {
			if(rstr.charAt(i) == mstr.charAt(j)) {
				++i;	
			}
			++j;
		}
		return i==rstr.length();
	}
	
	private static String ssort(String s) {
		char[] arrch = s.toCharArray();
		Arrays.sort(arrch);
		String str = new String(arrch);
		return str;
	}
	
	
	public static void main(String[] args) {
		//String[] strs = {"Hello","Alaska","Dad","Peace"};
		//String[] res = findWords(strs);
		//System.out.println(Arrays.toString(res));
	}
}
 
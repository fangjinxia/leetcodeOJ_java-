package leetcodeOJ;

import java.util.*;
import java.lang.String;

public class solution_541 {
	/*
	 * 
	 */
	protected static String reverseStr(String s, int k) {
		String result = "";
		int n = s.length();
		
		int endIdx = 0;
		for(int i = 0; i < n; i += 2*k) {
			if(i+2*k <= n) {
				endIdx = i+2*k;
			}
			else {
				endIdx = n;
			}
			
			String str = s.substring(i, endIdx);
			String str_left = "";
			String str_right = "";
			if(endIdx - i >= k) {
				str_left = str.substring(0, k);
				str_right = str.substring(k);
			}
			else {
				str_left = str;
			}
			String rev = new StringBuffer(str_left).reverse().toString();
			result += rev;
			result += str_right;
		}
		
		return result;
	}
	public static void main(String[] args) {
		//String[] strs = {"Hello","Alaska","Dad","Peace"};
		//String[] res = findWords(strs);
		//System.out.println(Arrays.toString(res));
	}
}
 
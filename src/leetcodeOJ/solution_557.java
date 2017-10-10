package leetcodeOJ;

import java.util.*;
import java.lang.String;

public class solution_557 {
	/*
	 * reverse the order of characters in each word within a sentence 
	 * while still preserving whitespace and initial word order.
	 * 
	 * Input: "Let's take LeetCode contest"
	 * Output: "s'teL ekat edoCteeL tsetnoc"
	 */
	protected static String reverseWords(String s) {
		String[] words = s.split(" ");
		String result = "";
		for(String w : words) {
			String rev = new StringBuffer(w).reverse().toString();
			if(result != ""){
				result += " ";
			}
			result += rev;
		}
		
		return result;
	}
	public static void main(String[] args) {
		//String[] strs = {"Hello","Alaska","Dad","Peace"};
		//String[] res = findWords(strs);
		//System.out.println(Arrays.toString(res));
	}
}
 
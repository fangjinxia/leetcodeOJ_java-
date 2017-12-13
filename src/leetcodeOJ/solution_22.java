package leetcodeOJ;

import java.util.*;
import java.lang.String;
import leetcodeOJ.TreeNode;

import leetcodeOJ.ListNode;

public class solution_22 {
	/*
	 */
	public List<String> generateParenthesis(int n) {
		List<String> res = new ArrayList<>();
		genPare(res, "", 0, 0, n);		
		return res;		
	}
	
	public void genPare(List<String> res, String str, int open, int close, int n) {
		if(str.length() == 2*n) {
			res.add(str);
			return ;
		}
		if(open < n) {			
			genPare(res, str+"(", open+1, close, n);
		}		
		
		if(open > close) {
			genPare(res, str+")", open, close+1, n);
		}
		
	}
}
 
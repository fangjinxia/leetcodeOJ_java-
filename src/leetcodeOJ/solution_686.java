package leetcodeOJ;

import java.util.*;
import java.lang.String;
import leetcodeOJ.TreeNode;

public class solution_686 {
	/*
	 */
	protected static int repeatedStringMatch(String A, String B) {
		 if(A.length() == 0)
	            return -1;
	        if(B.length() == 0)
	            return 1;
	        String s = A;
	        for(int i = 1; i <= B.length() / A.length() + 2; ++i){
	            if(s.indexOf(B) != -1)
	                return i;
	            s += A;
	        }
			
			return -1;
	}
	
	
	public static void main(String[] args) {
//		String strs = new String("11110011");
//		int res = countBinarySubstrings(strs);
//		System.out.println(res);
	}
}
 
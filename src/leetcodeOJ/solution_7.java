package leetcodeOJ;

import java.util.*;
import java.lang.String;
import leetcodeOJ.ListNode;

public class solution_7 {
	/*
	 */
	protected static int reverse(int x) {
		long flag = (x < 0) ? -1 : 1;
		x = Math.abs(x);
		long res = 0;
		while(x != 0) {
			long k = x % 10;
            res *= 10;
            res += k;
			x /= 10;
		}
		res *= flag;
		if(res > Integer.MAX_VALUE || res < Integer.MIN_VALUE)
			return 0;
		return (int)res;
	}
	
	
	public static void main(String[] args) {
		//String[] strs = {"Hello","Alaska","Dad","Peace"};
		//String[] res = findWords(strs);
		//System.out.println(Arrays.toString(res));
	}
}
 
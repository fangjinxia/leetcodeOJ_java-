package leetcodeOJ;

import java.util.*;
import leetcodeOJ.TreeNode;

public class solution_29 {
	public int divide(int dividend, int divisor) {
		if(divisor == 0 || (dividend == Integer.MIN_VALUE && divisor == -1))
			return Integer.MAX_VALUE;
		long n = Math.abs((long)dividend);
		long m = Math.abs((long)divisor);
        
		int res = 0;
		while(n >= m){
			long tmp = 1;
			long mul = m;
			while(n >= (mul<<1)){
				mul <<= 1;
				tmp <<= 1;
			}
			res += tmp;
           // System.out.println(res);
			n -= mul;
		}
		
		if(((dividend < 0) && (divisor < 0)) || ((dividend > 0) && (divisor > 0)))
			return res;
		else
			return -res;
	}
	
}

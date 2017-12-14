package leetcodeOJ;

import java.util.*;
import java.lang.String;
import leetcodeOJ.TreeNode;

public class solution_50 {
	/*
	 */
	public double myPow(double x, int n) {
		if(n == 0)
			return 1.0;
		if(x == 0.0 || x == 1.0)
			return x;
		
		double num = pow(x, Math.abs(n));
		if(n > 0) {
			return num;
		}
		else {
			return (double)1/num;
		}
    }
	
	public double pow(double x, int n) {
		if(n == 0)
			return 1;
		if(n == 1)
			return x;
		if((n&1) == 1)
			return pow(x*x, n/2) * x;
		else
			return pow(x*x, n/2);
	}
}
 
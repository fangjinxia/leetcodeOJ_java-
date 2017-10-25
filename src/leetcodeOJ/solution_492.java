package leetcodeOJ;

import java.util.*;
import java.lang.String;
import leetcodeOJ.TreeNode;

public class solution_492 {
	 /*
	 */
	protected static int[] constructRectangle(int area) {
		int L = (int)Math.sqrt((double)area);
		int R = L;
		while(L*R != area) {
			++L;
			R = area / L;
		}
		int[] res = new int[2];
		res[0] = L;
		res[1] = R;
		return res;
	}
	
	public static void main(String[] args) {
//		int i = 9;
//		
//		System.out.println(integerBreak(i));
	}
}
 
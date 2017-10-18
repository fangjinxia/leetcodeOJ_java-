package leetcodeOJ;

import java.util.*;
import java.lang.String;
import leetcodeOJ.TreeNode;

public class solution_371 {
	/*
	 */
	protected static int getSum(int a, int b) {
		return bitAdd(a, b);
	}
	
	private static int bitAdd(int a, int b) {
		int c = a & b;
		int num = a ^ b;
		if(c == 0) {
			return num;
		}
		else {
			return bitAdd(c<<1, num);
		}
	}
	
	public static void main(String[] args) {
		//String[] strs = {"Hello","Alaska","Dad","Peace"};
		//String[] res = findWords(strs);
		//System.out.println(Arrays.toString(res));
	}
}
 
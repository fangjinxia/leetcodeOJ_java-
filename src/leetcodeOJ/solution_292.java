package leetcodeOJ;

import java.util.*;
import java.lang.String;
import leetcodeOJ.TreeNode;

public class solution_292 {
	/*
	 */
	protected static boolean canWinNim(int n) {
        ///<谁先到4，谁就赢
        return !(n % 4 == 0);
		
	}
	public static void main(String[] args) {
		//String[] strs = {"Hello","Alaska","Dad","Peace"};
		//String[] res = findWords(strs);
		//System.out.println(Arrays.toString(res));
	}
}
 
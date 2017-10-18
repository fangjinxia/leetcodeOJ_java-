package leetcodeOJ;

import java.util.*;
import java.lang.String;
import leetcodeOJ.TreeNode;

public class solution_598 {
	/*
	 */
	protected static int maxCount(int m, int n, int[][] ops) {
        int minRow = m;
        int minCol = n;
        for(int[] item : ops){
            minRow = Math.min(minRow, item[0]);
            minCol = Math.min(minCol, item[1]);
        }
        
        return minRow * minCol;
	}
	
	
	public static void main(String[] args) {
		//String[] strs = {"Hello","Alaska","Dad","Peace"};
		//String[] res = findWords(strs);
		//System.out.println(Arrays.toString(res));
	}
}
 
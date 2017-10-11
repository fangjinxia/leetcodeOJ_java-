package leetcodeOJ;

import java.util.*;
import java.lang.String;
import leetcodeOJ.TreeNode;

public class solution_278 {
	/*
	 */
	boolean isBadVersion(int version);
	
	protected static int firstBadVersion(int n) {
        int low = 1, high = n;
        while(low <= high){
            if(low == high)
                break;
            int mid = low + (high-low)/2;            
            if(isBadVersion(mid)){
                high = mid;
            }
            else{
                low = mid+1;
            }
        }
        return low;
	}
	
	public static void main(String[] args) {
		//String[] strs = {"Hello","Alaska","Dad","Peace"};
		//String[] res = findWords(strs);
		//System.out.println(Arrays.toString(res));
	}
}
 
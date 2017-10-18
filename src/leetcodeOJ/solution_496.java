package leetcodeOJ;

import java.util.*;
import java.lang.String;
import leetcodeOJ.TreeNode;

public class solution_496 {
	/*
	 */
	protected static int[] nextGreaterElement(int[] nums1, int[] nums2) {
		int n = nums1.length;
		int m = nums2.length;
		int[] result = new int[n];
		for(int i = 0; i < n; ++i) {
			int j = 0;
			while(nums2[j] != nums1[i]) {
				++j;
			}
			for(++j; j < m; ++j) {
				if(nums2[j] > nums1[i]) {
					result[i] = nums2[j];
					break;
				}
			}
			if(j == m)
				result[i] = -1;
		}
		
		return result;
	}
	public static void main(String[] args) {
		//String[] strs = {"Hello","Alaska","Dad","Peace"};
		//String[] res = findWords(strs);
		//System.out.println(Arrays.toString(res));
	}
}
 
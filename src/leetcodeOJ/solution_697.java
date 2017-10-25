package leetcodeOJ;

import java.util.*;
import java.lang.String;
import leetcodeOJ.TreeNode;

public class solution_697 {
	/*
	 */
	protected static int findShortestSubArray(int[] nums) {
		//注意：可能存在多个值的频率一样
		Map<Integer, Integer> mp = new HashMap<>();
		int degree = 0;
		for(int c : nums) {
			mp.put(c, mp.getOrDefault(c, 0)+1);
			degree = Math.max(degree, mp.get(c));
		}
		
		List<Integer> st = new LinkedList<>();
		for(int key : mp.keySet()) {
			if(mp.get(key) == degree) {
				st.add(key);
			}			
		}
		
		int res = Integer.MAX_VALUE;
		for(int k :st) {
			int tmp = helper(nums, k);
			res = Math.min(res, tmp);
		}
		
		
		return res;
	}
	
	private static int helper(int[] nums, int k) {
		int start = 0, end = 0;
		for(int i = 0; i < nums.length; ++i) {
			if(nums[i] == k) {
				start = i;
				break;
			}
		}
		for(int j = nums.length-1; j >= start ; --j) {
			if(nums[j] == k) {
				end = j;
				break;
			}
		}
		
		return end-start+1;
	}
	
	
	public static void main(String[] args) {
//		String strs = new String("11110011");
//		int res = countBinarySubstrings(strs);
//		System.out.println(res);
	}
}
 
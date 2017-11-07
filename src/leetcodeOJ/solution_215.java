package leetcodeOJ;

import java.util.*;
import java.lang.String;
import leetcodeOJ.TreeNode;

public class solution_215 {
	/*
	 */
	protected static int findKthLargest(int[] nums, int k) {
		Arrays.sort(nums);
		return nums[nums.length - k];
	}
	
	///<another method
	private static int findkth(int[] nums, int k) {
		int n = nums.length;
		if(nums == null || n == 0)
			return -1;
		
		return kth(nums, 0, n-1, k);
	}
	
	private static int kth(int[] nums, int left, int right, int k) {
		if(left >= right) {
			return nums[right];
		}
		
		int m = left;
		for(int i = left+1; i <= right; ++i) {
			if(nums[i] > nums[left]) {
				++m;
				swap(nums, i, m);
			}
		}
		
		swap(nums, m, left);
		if(k == m+1)
			return nums[m];
		else if(k > m+1)
			return kth(nums, m+1, right, k);
		else
			return kth(nums, left, m-1, k);
	}
	
	public static void swap(int[] nums, int i, int j) {
    	int tmp = nums[i];
    	nums[i] = nums[j];
    	nums[j] = tmp;
    }
	
	public static void main(String[] args) {
		//String[] strs = {"Hello","Alaska","Dad","Peace"};
		//String[] res = findWords(strs);
		//System.out.println(Arrays.toString(res));
	}
}
 
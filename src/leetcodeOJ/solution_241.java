package leetcodeOJ;

import java.util.*;

public class solution_241 {
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int n = nums1.length;
		int m = nums2.length;
		int l = (m+n+1)/2;
		int r = (m+n+2)/2;
		return (getMedian(nums1, 0, nums2, 0, l) + getMedian(nums1, 0, nums2, 0, r)) / 2.0;		
	}
	
	private static double getMedian(int[] nums1, int s1, int[] nums2, int s2, int k){
		if(s1 >= nums1.length){
			return nums2[s2+k-1];
		}
		else if(s2 >= nums2.length){
			return nums1[s1+k-1];
		}
		
		if(k == 1){
			return Math.min(nums1[s1], nums2[s2]);
		}
		int aMid = Integer.MAX_VALUE, bMid = Integer.MAX_VALUE;
		if(s1+k/2-1 < nums1.length)
			aMid = nums1[s1 + k/2 - 1];
		if(s2+k/2-1 < nums2.length)
			bMid = nums2[s2 + k/2 - 1];
		
		if(aMid > bMid){
			return getMedian(nums1, s1, nums2, s2+k/2, k - k/2);
		}
		else{
			return getMedian(nums1, s1+k/2, nums2, s2, k - k/2);
		}
	}
	
	public static void main(String[] args){
		
//		System.out.println(Arrays.toString(result));
	}
}

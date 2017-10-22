package leetcodeOJ;

import java.util.*;

public class solution_454 {
	public static int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
		int result = 0;
		Map<Integer, Integer> mp = new HashMap<>();
		for(int i = 0; i < A.length; ++i){
			for(int j = 0; j < B.length; ++j){
				int sum = A[i] + B[j];
				mp.put(sum, mp.getOrDefault(sum, 0)+1);
			}
		}
		
		for(int i = 0; i < C.length; ++i){
			for(int j = 0; j < D.length; ++j){
				result += mp.getOrDefault(-1 * (C[i]+D[j]), 0);
			}
		}
		return result;		
	}
	
	public static void main(String[] args){
//		int[] nums = {1, 2, 3, 4, 5, 6, 7};
//		int target = 12;
//		
//		int[] result = new int[2]; 
//		result = twoSum(nums, target);
//		
//		System.out.println(Arrays.toString(result));
	}
}

package leetcodeOJ;

import java.util.*;

public class solution_594 {
	public static int findLHS(int[] nums) {
		Map<Integer, Integer> mp = new HashMap<>();
		for(int c : nums){
			mp.put(c, mp.getOrDefault(c, 0)+1);
		}
		
		int result = 0;
		for(int c : mp.keySet()){
			if(c < Integer.MAX_VALUE && mp.containsKey(c+1)){
				result = Math.max(result, mp.get(c)+mp.get(c+1));
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

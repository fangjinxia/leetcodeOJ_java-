package leetcodeOJ;

import java.util.*;

public class solution_9 {
	public static int[] twoSum(int[] nums, int target){
		int n = nums.length;
		int[] result = new int[2];
		
		HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();
		for(int i = 0; i < n; ++i){
			if(mp.containsKey(nums[i])){
				result[0] = mp.get(nums[i]);
				result[1] = i;
				break;
			}
			else{
				mp.put(target - nums[i], i);
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
//		///<字符串与整型的相互转换
//		String a = String.valueOf(2);   //integer to numeric string
//		int i = Integer.parseInt(a); //numeric string to an int
//		
//		System.out.println(Arrays.toString(result));
	}
}

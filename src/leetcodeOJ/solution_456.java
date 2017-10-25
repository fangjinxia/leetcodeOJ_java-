package leetcodeOJ;

import java.util.*;

public class solution_456 {
	public static boolean find132pattern(int[] nums) {
		int n = nums.length;
		if(n < 3)
			return false;
		
		return find132(nums, 0, n);
	}
	
	private static boolean find132(int[] nums, int i, int n) {
		++i;
		while(i < n && nums[i] <= nums[i-1]){
			++i;
		}
		if(i == n)
			return false;
		
        int min = nums[i-1];
        while(i+1 < n && nums[i] <= nums[i+1]){
            ++i;
        }
        if(i == n)
            return false;
        int max = nums[i];
        
		int k = i+1;
		while(k < n){
			if(nums[k] > min && nums[k] < max){
				return true;
			}
            ++k;
		}
		
		return find132(nums, i, n);
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

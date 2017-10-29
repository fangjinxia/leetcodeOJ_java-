package leetcodeOJ;

import java.util.*;

public class solution_240 {
	public static List<Integer> majorityElement(int[] nums) {
		int n = nums.length;
		List<Integer> res = new ArrayList<>(); 
		if(n < 1)
			return res;
		
		int cnt1 = 0, cnt2 = 0;
		int num1 = nums[0];
		int num2 = nums[0];
		for(int i = 0; i < n; ++i){
			if(nums[i] == num1){
				++cnt1;
			}
			else if(nums[i] == num2){
				++cnt2;
			}			
			else if(cnt1 == 0){
				cnt1 = 1;
				num1 = nums[i];
			}
			else if(cnt2 == 0){
				cnt2 = 1;
				num2 = nums[i];
			}
			else{
				--cnt1;
				--cnt2;
			}
		}
		
		cnt1 = 0;
		cnt2 = 0;
		for(int c : nums){
			if(c == num1)
				++cnt1;
			else if(c == num2){
				++cnt2;
			}			
		}
		
		if(cnt1 > n/3)
			res.add(num1);
		if(cnt2 > n/3)
			res.add(num2);
		
		return res;
	}
	
	
	public static void main(String[] args){
//		int[] nums = {1, 2, 3, 4, 5, 6, 7};
//		int target = 12;
//		
//		int[] result = new int[2]; 
//		result = twoSum(nums, target);
//		
//		String a = String.valueOf(2);   //integer to numeric string
//		int i = Integer.parseInt(a); //numeric string to an int
//		
//		System.out.println(Arrays.toString(result));
	}
}

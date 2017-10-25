package leetcodeOJ;

import java.util.*;

public class solution_66 {
	public static int[] plusOne(int[] digits) {
		int n = digits.length;
		for(int i = n-1; i >= 0; --i){
			if(digits[i] < 9){
				++digits[i];
				return digits;
			}
			digits[i] = 0;
		}
		
		int[] newNum = new int[n+1];
		newNum[0] = 1;
		return newNum;
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

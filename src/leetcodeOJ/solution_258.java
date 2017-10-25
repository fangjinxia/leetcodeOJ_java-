package leetcodeOJ;

import java.util.*;

public class solution_258 {
	public static int addDigits(int num) {
		while(num / 10 != 0){
			int tmp = 0;
			int n = num;
			while(n != 0){
				tmp += (n % 10);
				n /= 10;
			}
			num = tmp;
		}
		
		return num;
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

package leetcodeOJ;

import java.util.*;

public class solution_67 {
	public static String addBinary(String a, String b) {
		StringBuilder res = new StringBuilder();
		int c = 0;
		for(int i = a.length()-1, j = b.length()-1; i >= 0 || j >= 0; --i, --j){
			int num1 = (i >= 0) ? (a.charAt(i)-'0') : 0;
			int num2 = (j >= 0) ? (b.charAt(j)-'0') : 0;
			int tmp = num1+num2+c;
			res.append(tmp%2);
			c = tmp / 2;			
		}
		if(c != 0)
			res.append(c);
		res.reverse();
		return res.toString();

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

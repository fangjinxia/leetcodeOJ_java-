package leetcodeOJ;

import java.util.*;
import leetcodeOJ.TreeNode;

public class solution_202 {
	public static boolean isHappy(int n) {
		///<利用set
		Set<Integer> st = new HashSet<>();
		int tmp = 0;
		while(st.add(tmp)){
			int num = n;
			tmp = 0;
			while(num > 0){
				tmp += (num%10)*(num%10);
				num /= 10;
			}
			if(tmp == 1)
				return true;
			n = tmp;
		}
		return false;
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

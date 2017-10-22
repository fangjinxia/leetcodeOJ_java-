package leetcodeOJ;

import java.util.*;
import java.lang.Math;

public class solution_679 {
	public static boolean judgePoint24(int[] nums) {
		Arrays.sort(nums);
		//保存所有的排列
		LinkedList<int[]> listArr = new LinkedList<>();
		allPermutation(nums, listArr, 0);
		for(int[] item : listArr){
			if(judge_4(item))
				return true;
		}
		
		return false;
	}
	
	private static void allPermutation(int[] c, LinkedList<int[]> listArr, int start){
        if(start == c.length-1)
            listArr.add(c);
        else{
            for(int i = start; i <= c.length-1; i++)
            {
                swap(c, i, start);//相当于: 固定第 i 个字符
                allPermutation(c, listArr, start+1);//求出这种情形下的所有排列
                swap(c, start, i);//复位
            }
        }
    }
	
	private static void swap(int[] c, int i, int j){
	        int tmp;
	        tmp = c[i];
	        c[i] = c[j];
	        c[j] = tmp;
	}
	
	public static boolean judge_4(int[] nums){
		double a = nums[0], b = nums[1], c = nums[2], d = nums[3];
		if(judge_3(a+b, c, d) || judge_3(a, b+c, d) || judge_3(a, b, c+d))
			return true;
		if(judge_3(a-b, c, d) || judge_3(a, b-c, d) || judge_3(a, b, c-d))
			return true;
		if(judge_3(a*b, c, d) || judge_3(a, b*c, d) || judge_3(a, b, c*d))
			return true;
		if((b!=0 && judge_3(a/b, c, d)) || (c != 0 && judge_3(a, b/c, d)) || (d != 0 && judge_3(a, b, c-d)))
			return true;
		
		return false;
	}
	
	
	public static boolean judge_3(double a, double b, double c) {
		if(judge_2(a+b, c) || judge_2(a, b+c))
			return true;
		if(judge_2(a-b, c) || judge_2(a, b-c))
			return true;
		if(judge_2(a*b, c) || judge_2(a, b*c))
			return true;
		if((b != 0 && judge_2(a/b, c)) || (c != 0 && judge_2(a, b/c)))
			return true;
		
		return false;
	}
	
	public static boolean judge_2(double a, double b){
		if(judge(a+b))
			return true;
		if(judge(a-b))
			return true;
		if(judge(a*b))
			return true;
		if(b != 0 && judge(a/b))
			return true;
		return false;
	}
	
	public static boolean judge(double num){
		final double eps = 1e-8;
		if(Math.abs(num-24.0) < eps )
			return true;
		return false;
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

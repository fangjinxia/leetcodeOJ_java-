package leetcodeOJ;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

//LeetCodeOJ 561
public class solution_561 {
	//My AC code
	public static int arrayPairSum(int[] nums) {
		//sort the input array and then the sum of 1st, 3rd, 5th..., is the answer.
		Arrays.sort(nums);
		int result = 0;
		for(int i = 0; i < nums.length; i +=2){
			result += nums[i];
		}
		
		return result;
	}
	
	public static void main(String[] args){
		//���ܴӼ����������ֵ
		Scanner s = new Scanner(System.in);
		
		//����һ��int����������
		Integer x = s.nextInt();
		Integer y = s.nextInt();
		//����һ��double����������
		//Double d = s.nextDouble(); 
		
		//����һ��string����������
		//String str = s.next();
		
		//int res = arrayPairSum();
	//	System.out.println(res);
	}
}

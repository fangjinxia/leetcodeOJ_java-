package leetcodeOJ;

import java.util.Arrays;
import java.util.HashMap;

public class solution_121 {
	public static int maxProfit(int[] prices) {
		if(prices.length < 2)
			return 0;
		int result = 0;
		int minElem = prices[0];
		for(int i = 1; i < prices.length; ++i){
			result = Math.max(result, prices[i] - minElem);
			minElem = Math.min(minElem, prices[i]);			
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

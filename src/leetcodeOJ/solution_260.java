package leetcodeOJ;

import java.util.*;

public class solution_260 {
	public static int[] singleNumber(int[] nums) {
		int[] res = new int[2];
		int xorSum = 0;
		for(int item : nums) {
			xorSum ^= item;
		}
		
		int diff = 0;
		while(true) {
			if((xorSum & 1) == 1) {
				break;
			}
			else {
				xorSum >>= 1;
				++diff;
			}
		}
		
		List<Integer> A = new ArrayList<>();
		List<Integer> B = new ArrayList<>();
		for(int item : nums) {
			if(((item >> diff) & 1) == 1)
				A.add(item);
			else
				B.add(item);
		}
		
		int num1 = 0;
		for(int c : A) {
			num1 ^= c;
		}
		
		int num2 = 0;
		for(int c : B) {
			num2 ^= c;
		}
		
		res[0] = num1;
		res[1] = num2;
		return res;
		
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

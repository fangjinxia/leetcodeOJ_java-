package leetcodeOJ;

import java.util.*;

public class solution_16 {
	public static int threeSumClosest(int[] nums, int target) {
		int n = nums.length;
		if(n < 3)
			return 0;
		int ans = nums[0] + nums[1] + nums[2];
		Arrays.sort(nums);		
		for(int i = 0; i < n-2; ++i){
			int low = i+1;
			int high = n-1;
			int res = nums[i] + nums[low] + nums[high];
			while(low < high){
				int tmp = nums[low] + nums[high] + nums[i]; 
				if(tmp == target){
					return target;
				}
				else if(tmp > target){
					--high;
					if(Math.abs(tmp-target) < Math.abs(res-target))
						res = tmp;
				}
				else{
					++low;
					if(Math.abs(tmp-target) < Math.abs(res-target))
						res = tmp;
				}
			}
			ans = (Math.abs(ans-target) < Math.abs(res-target)) ? ans : res;
		}
		return ans;

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

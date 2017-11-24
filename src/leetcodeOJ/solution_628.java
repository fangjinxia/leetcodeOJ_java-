package leetcodeOJ;

import java.util.*;

public class solution_628 {
	public int maximumProduct(int[] nums) {
        int n = nums.length;
        int res = 0;
        Arrays.sort(nums);
        //全为负数  or 全为正数
		if(nums[n-1] <= 0 || nums[0] >= 0) {
			res = nums[n-3]*nums[n-2]*nums[n-1];
		}
		//有正数有负数
		else {
			int num1 = nums[0] * nums[1] * nums[n-1];
			int num2 = nums[n-3]*nums[n-2]*nums[n-1];
			res = Math.max(res, Math.max(num1, num2));
		}
		return res;
    }
}


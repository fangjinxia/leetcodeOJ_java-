package leetcodeOJ;

import java.util.*;

public class solution_462 {
	//参考https://discuss.leetcode.com/topic/69236/o-n-solution-with-detailed-explanation	
	public static int minMoves2(int[] nums) {
		///<找到数组的中值，即第n/2大的值
		int n = nums.length;
		Arrays.sort(nums);
		int median  = nums[n/2];
		int res = 0;
		for(int i = 0; i < n; ++i) {
			res += Math.abs(median - nums[i]);
		}
		return res;
	}
	
	public static void main(String[] args){
//		//���ܴӼ����������ֵ
//		Scanner s = new Scanner(System.in);
//		
//		//����һ��int����������
//		Integer x = s.nextInt();
//		Integer y = s.nextInt();
//		//����һ��double����������
//		//Double d = s.nextDouble(); 
//		
//		//����һ��string����������
//		//String str = s.next();
//		
//		int res = hammingDistance(x, y);
//		System.out.println(res);
	}
}

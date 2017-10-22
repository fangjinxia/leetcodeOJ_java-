package leetcodeOJ;

import java.util.*;

public class solution_350 {
	public static int[] intersect(int[] nums1, int[] nums2) {
		int n = nums1.length;
		int m = nums2.length;
		List<Integer> res = new LinkedList<>();
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		
		for(int i = 0, j = 0; i < n && j < m; ){
			if(nums1[i] == nums2[j]){
				res.add(nums1[i]);
				++i;
				++j;
			}
			else if(nums1[i] > nums2[j]){
				++j;			
			}
			else{
				++i;
			}					
		}
		
		int k = res.size();
		int[] ans = new int[k];
		for(int i = 0; i < k; ++i){
			ans[i] = res.get(i);
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
//		System.out.println(Arrays.toString(result));
	}
}

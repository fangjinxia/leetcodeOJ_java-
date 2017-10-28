package leetcodeOJ;

import java.util.*;

public class solution_78 {
	public static List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> res = new ArrayList<>();
		Arrays.sort(nums);					
		getPerm(nums, res, new ArrayList<>(), 0);
		return res;
	}
	
	private static void getPerm(int[] nums, List<List<Integer>> res, List<Integer> cur, int start){		
		res.add(new ArrayList<>(cur));
		
		for(int i = start; i < nums.length; ++i){
			cur.add(nums[i]);			
			getPerm(nums, res, cur, i+1);
			cur.remove(cur.size()-1);			
		}
	
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

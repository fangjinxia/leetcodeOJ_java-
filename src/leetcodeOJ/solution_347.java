package leetcodeOJ;

import java.util.*;
import java.lang.String;
import leetcodeOJ.TreeNode;

public class solution_347 {
	/*
	 */
	protected static List<Integer> topKFrequent(int[] nums, int k) {
		List<Integer> result = new LinkedList<Integer>();
		Map<Integer, Integer> mp = new HashMap<>();
		for(int item : nums) {
			mp.put(item, mp.getOrDefault(item, 0)+1);
		}
		
		List<Integer>[] bucket = new List[nums.length + 1];
		for(int key : mp.keySet()){
			int freq = mp.get(key);
			if(bucket[freq] == null)
				bucket[freq] = new ArrayList<>();
			bucket[freq].add(key);
		}
		
		for(int i = bucket.length-1; i >= 0 && result.size() < k; --i) {
			while(bucket[i] == null) {
				--i;
			}
			result.addAll(bucket[i]);
		}
		
		return result.subList(0, k);
	}
	
	public static void main(String[] args) {
		
	}
}
 
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
		
		TreeMap<Integer, In>
		return result;
	}
	
	public static void main(String[] args) {
		//String[] strs = {"Hello","Alaska","Dad","Peace"};
		//String[] res = findWords(strs);
		//System.out.println(Arrays.toString(res));
	}
}
 
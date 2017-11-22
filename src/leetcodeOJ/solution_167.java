package leetcodeOJ;

import java.util.Arrays;
import java.util.HashMap;

public class solution_167 {
	public static int[] twoSum(int[] numbers, int target){
		int n = numbers.length;
		int[] result = new int[2];
		
		HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();
		for(int i = 0; i < n; ++i){
			if(mp.containsKey(numbers[i])){
				result[0] = mp.get(numbers[i])+1;
				result[1] = i+1;
				break;
			}
			else{
				mp.put(target - numbers[i], i);
			}
		}
		return result;		
	}
	
	
}

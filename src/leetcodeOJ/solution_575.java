package leetcodeOJ;

import java.util.*;
import java.lang.String;

public class solution_575 {
	/*
	 * 
	 */
	protected static int distributeCandies(int[] candies) {		
		int cnt = 0;
		Arrays.sort(candies);
		if(candies.length != 0)
			cnt = 1;
		for(int i = 1; i < candies.length; ++i) {
			if(candies[i] != candies[i-1])
				++cnt;
		}
		
		int result = (cnt < candies.length/2) ? cnt : candies.length/2;
		return result;
	}
	public static void main(String[] args) {
		//String[] strs = {"Hello","Alaska","Dad","Peace"};
		//String[] res = findWords(strs);
		//System.out.println(Arrays.toString(res));
	}
}
 
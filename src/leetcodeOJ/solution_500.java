package leetcodeOJ;

import java.util.*;
import java.lang.String;

public class solution_500 {
	/*
	 * mapµÄÊ¹ÓÃ
	 */
	protected static String[] findWords(String[] words) {
		String[] str = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
		Map<Character, Integer> mp = new HashMap<>();
		for(int i = 0; i < str.length; ++i) {
			for(char c : str[i].toCharArray()) {
				mp.put(c, i);
			}
		}
		
		List<String> result = new LinkedList<String>();
		for(String s : words) {
			if(s.equals(""))
				continue;
			
			int idx = mp.get(s.toLowerCase().charAt(0));
			for(char c : s.toLowerCase().toCharArray()) {
				if(mp.get(c) != idx) {
					idx = -1;
					break;
				}
			}
			
			if(idx != -1) {
				result.add(s);
			}
		}
		
		return result.toArray(new String[0]);
	}
	public static void main(String[] args) {
		String[] strs = {"Hello","Alaska","Dad","Peace"};
		String[] res = findWords(strs);
		System.out.println(Arrays.toString(res));
	}
}
 
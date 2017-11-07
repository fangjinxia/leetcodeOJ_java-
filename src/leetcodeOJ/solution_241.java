package leetcodeOJ;

import java.util.*;

public class solution_241 {
	public static List<Integer> diffWaysToCompute(String input) {
		List<Integer> res = new LinkedList<>();
		for(int i = 0; i < input.length(); ++i){
			if(input.charAt(i) == '+' || input.charAt(i) == '-' || input.charAt(i) == '*'){
				String left = input.substring(0, i);
				String right = input.substring(i+1);
				List<Integer> list_left = diffWaysToCompute(left);
				List<Integer> list_right = diffWaysToCompute(right);
				for(Integer lt : list_left){
					for(Integer rt : list_right){
						int c = 0;
						switch(input.charAt(i)){
						case '+' : c = lt+rt;
							break;
						case '-' : c = lt-rt;
							break;
						case '*' : c = lt*rt;
							break;
						}
						
						res.add(c);
					}
				}
			}
		}
		if(res.size() == 0)
			res.add(Integer.valueOf(input));
		return res;
	}
	
	public static void main(String[] args){
		
//		System.out.println(Arrays.toString(result));
	}
}

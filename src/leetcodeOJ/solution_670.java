package leetcodeOJ;

import java.util.*;
import java.lang.String;
import leetcodeOJ.TreeNode;

public class solution_670 {
	/*
	 */
	protected static int maximumSwap(int num) {
		String s = String.valueOf(num);
        int n = s.length();
		char[] nums = s.toCharArray();
		char[] arr = s.toCharArray();
        //从大到小排序
		Arrays.sort(arr);
		for(int i = 0; i < n; ++i) {
			if(nums[i] == arr[n-i-1])
				continue;
			else {
				int j = n-1;
				for(; j > i; --j) {
					if(nums[j] == arr[n-i-1])
						break;
				}
				
               
				char tmp = nums[j];
				nums[j] = nums[i];
				nums[i] = tmp;
				break;
			}
		}
		
		String a = new String(nums);
		int res = Integer.parseInt(a);
		return res;
	}
	
	
	
	public static void main(String[] args) {
//		String strs = new String("11110011");
//		int res = countBinarySubstrings(strs);
//		System.out.println(res);
	}
}

//Comparator是一个接口，所以这里我们自己定义的类MyComparator要implements该接口
//而不是extends Comparator
class MyComparator<T> implements Comparator<T>{
  @Override
  public int compare(T o1, T o2) {
	  return ((Integer)o1).compareTo( (Integer)o2 );
  }
  
}
 
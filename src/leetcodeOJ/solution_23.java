package leetcodeOJ;

import java.util.*;
import java.lang.String;
import leetcodeOJ.ListNode;

public class solution_23 {
	/*
	 */
	protected static ListNode mergeKLists(ListNode[] lists) {
		int n = lists.length;
		if(n == 0)
            return null;
		if(n == 1)
			return lists[0];
	        
	    return partion(lists, 0, n-1);	    
	}
	
	public static ListNode partion(ListNode[] lists, int low, int high) {
		if(low == high)
			return lists[low];
		
		if(low < high) {
			int mid = low + (high-low)/2;
			ListNode left = partion(lists, low, mid);
			ListNode right = partion(lists, mid+1, high);
			return mergeTwoLists(left, right);
		}
		else {
			return null;
		}
	}
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null)
			return l2;
		if(l2 == null)
			return l1;
		
		ListNode result;
		if(l1.val < l2.val) {
			result = l1;
			result.next = mergeTwoLists(l1.next, l2);
		}
		else {
			result = l2;
			result.next = mergeTwoLists(l1, l2.next);
		}		
		
		return result;
    }	    

	
	
	public static void main(String[] args) {
		//String[] strs = {"Hello","Alaska","Dad","Peace"};
		//String[] res = findWords(strs);
		//System.out.println(Arrays.toString(res));
	}
}
 
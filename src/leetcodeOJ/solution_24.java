package leetcodeOJ;

import java.util.*;
import java.lang.String;
import leetcodeOJ.ListNode;

public class solution_24 {
	/*
	 */
	protected static ListNode swapPairs(ListNode head) {
		///<using recursion
		if(head == null || head.next == null)
			return head;
		
		ListNode res = head.next;
		head.next = swapPairs(head.next.next);
		res.next = head;
		return res;
	}
	
	
	public static void main(String[] args) {
		//String[] strs = {"Hello","Alaska","Dad","Peace"};
		//String[] res = findWords(strs);
		//System.out.println(Arrays.toString(res));
	}
}
 
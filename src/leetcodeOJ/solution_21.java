package leetcodeOJ;

import java.util.*;
import java.lang.String;
import leetcodeOJ.TreeNode;

import leetcodeOJ.ListNode;

public class solution_21 {
	/*
	 */
	protected static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
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
 
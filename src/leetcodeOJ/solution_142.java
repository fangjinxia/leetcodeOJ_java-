package leetcodeOJ;

import java.util.*;
import java.lang.String;
import leetcodeOJ.TreeNode;

public class solution_142 {
	/*
	 */
	public ListNode detectCycle(ListNode head) {
		ListNode fast = head;
		ListNode slow = head;
		while(fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
			if(fast == slow) {
				slow = head;
				while(true) {
					if(slow == fast)
						return slow;
					slow = slow.next;
					fast = fast.next;					
				}
			}
		}
		
		return null;
	}
}
 
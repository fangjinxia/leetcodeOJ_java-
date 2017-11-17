package leetcodeOJ;

import java.util.*;
import leetcodeOJ.ListNode;

public class solution_19 {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode tail = head;
		while(--n > 0) {
			tail = tail.next;
			//--n;
		}
		ListNode cur = head;
		ListNode new_head = new ListNode(0);
		new_head.next = head;
		ListNode bef = new_head;
		
		while(tail != null && tail.next != null) {
			tail = tail.next;
			cur = cur.next;
			bef = bef.next;
		}
		bef.next = cur.next;
		
		return new_head.next;
	}

}

package leetcodeOJ;

import java.util.*;
import leetcodeOJ.ListNode;

public class solution_328 {
	public ListNode oddEvenList(ListNode head) {
		if(head == null || head.next == null || head.next.next == null)
			return head;
		
		ListNode cur = head.next;
		ListNode pre = head;
		ListNode tail = head.next;
		while(tail != null && tail.next != null) {
            ListNode aft = tail;
			tail = tail.next;
			
            //System.out.println(tail.val);
			pre.next = tail;
			aft.next = tail.next;
			tail.next = cur;
			tail = aft.next;
            
            pre = pre.next;
		}
		
		return head;
	}
}

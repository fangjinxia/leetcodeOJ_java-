package leetcodeOJ;

import java.util.*;
import java.lang.String;
import leetcodeOJ.ListNode;

public class solution_25 {
	/*
	 */
	protected static ListNode reverseKGroup(ListNode head, int k) {
		///<using recursion
		ListNode cur = head;
		int cnt = 0;
		while(cur != null && cnt != k) {
			cur = cur.next;
			++cnt;
		}
		
		if(cnt == k) {
			cur = reverseKGroup(cur, k);
			while(k-- > 0) {
				ListNode tmp = head.next;
				head.next = cur;
				cur = head;
				head = tmp;
			}
			head = cur;
		}
		
		return head;
	}
	
	
	public static void main(String[] args) {
		//String[] strs = {"Hello","Alaska","Dad","Peace"};
		//String[] res = findWords(strs);
		//System.out.println(Arrays.toString(res));
	}
}
 
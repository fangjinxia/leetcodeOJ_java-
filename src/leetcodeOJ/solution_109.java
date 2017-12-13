package leetcodeOJ;

import java.util.*;
import leetcodeOJ.TreeNode;
import leetcodeOJ.ListNode;

public class solution_109 {
	public TreeNode sortedListToBST(ListNode head) {
		return getSortedTree(head, null);
	}
	
	public TreeNode getSortedTree(ListNode head, ListNode tail){
		if(head == tail)
			return null;
		
		ListNode cur = head, fast = head;
		//取中间值
		while(fast != tail && fast.next != tail){
			fast = fast.next.next;
			cur = cur.next;
		}
		TreeNode node = new TreeNode(cur.val);
		node.left = getSortedTree(head, cur);
		node.right = getSortedTree(cur.next, tail);
		
		return node;
	}
	
}

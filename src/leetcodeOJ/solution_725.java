package leetcodeOJ;

import java.util.*;

public class solution_725 {
	public ListNode[] splitListToParts(ListNode root, int k) {
		ListNode[] res = new ListNode[k];
        if(root == null)
            return res;
		int n = 0;
		ListNode cur = root;
		while(cur != null) {
			++n;
			cur = cur.next;
		}
		
		int c = n/k;
		int numOfLarger = n - k*c;
		cur = root;
		int i = 0;
		while(i < k-1 && cur != null) {			
			res[i] = cur;
			int num = 0;
			if(numOfLarger > 0) {
				num = c+1;
				numOfLarger--;
			}
			else {
				num = c;
			}
			
			while(--num > 0) {
				cur = cur.next;
			}
			ListNode tmp = cur.next;
			cur.next = null;
			cur = tmp;
			++i;
		}
        res[k-1] = cur;
		
		return res;
	}

}

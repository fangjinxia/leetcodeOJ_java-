package leetcodeOJ;

import java.util.*;
import leetcodeOJ.TreeNode;

public class solution_230 {
	public int kthSmallest(TreeNode root, int k) {
        //中序遍历取第k位
        List<Integer> list = new ArrayList<>();
        inOrder(root, list);
        return list.get(k-1);
    }
    
    public void inOrder(TreeNode root, List<Integer> list) {
        Stack<TreeNode> st = new Stack<>();
        TreeNode cur = root;
        while(cur != null || !st.isEmpty()) {
        	while(cur != null) {
        		st.push(cur);
        		cur = cur.left;
        	}
        	if(!st.isEmpty()) {
        		cur = st.pop();
        		list.add(cur.val);
        		cur = cur.right;
        	}
        }
    }
	
}

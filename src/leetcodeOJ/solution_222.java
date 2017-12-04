package leetcodeOJ;

import java.util.*;
import leetcodeOJ.TreeNode;

public class solution_222 {
	public int countNodes(TreeNode root) {
		if(root == null) return 0;
        int lh = height(root.left);
        int rh = height(root.right);     
        if(lh == rh) 
           return (1 << lh) + countNodes(root.right);  /*1(���ڵ�) + (1<<lh)-1(��ȫ������) + # of rightNode */               
        else 
           return (1 << rh) + countNodes(root.left);  /*1(���ڵ�) + (1<<rh)-1(��ȫ������) + # of leftNode*/
    }

    public int height(TreeNode root){ //get the height of a complete binary tree.
        if(root == null) return 0;
        return 1 + height(root.left);
    }
}

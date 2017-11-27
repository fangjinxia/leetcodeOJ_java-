package leetcodeOJ;

import java.util.*;
import leetcodeOJ.TreeNode;

public class solution_606 {
	public String tree2str(TreeNode t) {
		String res = "";
		if(t == null)
			return res;
		
		res += Integer.toString(t.val);
		if(t.left == null && t.right == null)
			return res;		
		else if(t.left != null && t.right == null){
			res += "(";
			res += tree2str(t.left);
			res += ")";
		}
		else{
			res += "(";
			res += tree2str(t.left);
			res += ")";
			res += "(";
			res += tree2str(t.right);
			res += ")";					
		}
		return res;
	}
	
}

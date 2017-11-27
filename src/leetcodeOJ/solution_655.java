package leetcodeOJ;

import java.util.*;
import leetcodeOJ.TreeNode;

public class solution_655 {
	public List<List<String>> printTree(TreeNode root) {
		List<List<String>> res = new LinkedList<>();
		int height = (root==null) ? 1 : getHeight(root); 
		
		int row = height;
		int col = (int)Math.pow(2, height) - 1;
		List<String> list = new ArrayList<>();
		for(int i = 0; i < col; ++i)
			list.add("");		
		for(int i = 0; i < row; ++i)
			res.add(new ArrayList<>(list));
		
		print(root, res, 0, row, 0, col-1);
		return res;	
	}
	
	private static void print(TreeNode root, List<List<String>> res, int curRow, int totalRow, int i, int j){
		if(root == null || curRow == totalRow)
			return ;
		res.get(curRow).set((i+j)/2, Integer.toString(root.val));
		print(root.left, res, curRow+1, totalRow, i, (i+j)/2-1);
		print(root.right, res, curRow+1, totalRow, (i+j)/2+1, j);
	}
	
	private static int getHeight(TreeNode root){
		if(root == null)
			return 0;
		return 1+Math.max(getHeight(root.left), getHeight(root.right));
	}
}

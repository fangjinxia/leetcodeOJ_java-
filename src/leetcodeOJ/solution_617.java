package leetcodeOJ;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

import leetcodeOJ.TreeNode;

//LeetCodeOJ 617
public class solution_617 {
	//My AC code
	public static TreeNode mergeTrees(TreeNode t1, TreeNode t2) {	    
		if(t1 == null)
			return t2;
		if(t2 == null)
			return t1;
		
		TreeNode root = new TreeNode(t1.val + t2.val);
		root.left = mergeTrees(t1.left, t2.left);
		root.right = mergeTrees(t1.right, t2.right);
		
		return root;		
	}
	
	public static void main(String[] args){
		//接受从键盘输入的数值
		Scanner s = new Scanner(System.in);
		
		//接受一个int型整数参数
		Integer x = s.nextInt();
		Integer y = s.nextInt();
		//接受一个double型整数参数
		//Double d = s.nextDouble(); 
		
		//接受一个string型整数参数
		//String str = s.next();
		
		//int res = hammingDistance(x, y);
		//System.out.println(res);
	}
}

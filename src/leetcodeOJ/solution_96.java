package leetcodeOJ;

import java.util.*;
import leetcodeOJ.TreeNode;

public class solution_96 {
	public int numTrees(int n) {
        long res = 1;
        for(int i = n+1; i <= 2*n; i++){
        	res = res * i / (i-n);
        }
        return (int) (res/(n+1));
    }
	
}

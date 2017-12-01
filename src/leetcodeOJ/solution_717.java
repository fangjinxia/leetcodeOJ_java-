package leetcodeOJ;

import java.util.*;
import java.lang.String;
import leetcodeOJ.TreeNode;

public class solution_717 {
	/*
	 */
	public boolean isOneBitCharacter(int[] bits) {
		int n = bits.length;
        if(n == 1)
            return true;
		if(n == 2 && bits[0] == 1)
            return false;
        
		if(n >= 3 && bits[n-1] == 0 && bits[n-2] == 1 && bits[n-3] == 0)
			return false;
        
		if(bits[n-2] == 1) {
			int tmp = 0;
			int i = n-2;
			while(i >= 0 && bits[i] == 1) {
				++tmp;
                --i;
			}
			if((tmp & 1) == 0)
				return true;
			else
				return false;
		}
		
		return true;
	}
	
}
 
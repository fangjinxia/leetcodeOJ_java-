package leetcodeOJ;

import java.util.*;
import java.lang.String;
import leetcodeOJ.TreeNode;

public class solution_384 {
	/*
	 * 
	 */
	private int[] res;
	private Random random;
	public solution_384(int[] nums) {
        this.res = nums;
        random = new Random();
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return res;
    }
    
    /** Returns a random shuffling of the array. */
    //洗牌算法
    public int[] shuffle() {
        if(res == null)
        	return null;
        
        int[] tmp = res.clone();
        for(int i = 1; i < tmp.length; ++i) {
        	int k = random.nextInt(i+1);
        	int p = tmp[k];
        	tmp[k] = tmp[i];
        	tmp[i] = p;
        }
        
        return tmp;
    }
}
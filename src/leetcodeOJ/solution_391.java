package leetcodeOJ;

import java.util.*;

public class solution_391 {
	public boolean isRectangleCover(int[][] rectangles) {
//		核心思想是:能够正好围成一个矩形的情况就是: 
//		有且只有: 
//		- 最左下 最左上 最右下 最右上 的四个点只出现过一次,其他肯定是成对出现的(保证完全覆盖) 
//		- 上面四个点围成的面积,正好等于所有子矩形的面积之和(保证不重复)
		int down = Integer.MAX_VALUE;
		int left = Integer.MAX_VALUE;
		int up = Integer.MIN_VALUE;
		int right = Integer.MIN_VALUE;
		int sum = 0; // 面积
		
		Set<String> set = new HashSet<>();
		for(int[] item : rectangles) {
			//四个顶点坐标
			String s1 = item[0] + " " + item[1];
			String s2 = item[2] + " " + item[3];
			String s3 = item[0] + " " + item[3];
			String s4 = item[2] + " " + item[1];
			if(set.contains(s1)) 
				set.remove(s1);			
			else
				set.add(s1);
			
			if(set.contains(s2)) 
				set.remove(s2);			
			else
				set.add(s2);
			
			if(set.contains(s3)) 
				set.remove(s3);			
			else
				set.add(s3);
			
			if(set.contains(s4)) 
				set.remove(s4);			
			else
				set.add(s4);
			
			down = Math.min(down, item[1]);
			left = Math.min(left, item[0]);
			up = Math.max(up, item[3]);
			right = Math.max(right, item[2]);
			sum += (item[3]-item[1]) * (item[2]-item[0]);
			
		}
		
		
		int area = (up-down) * (right-left);
		if(area != sum || set.size() != 4 || !set.contains(left+" "+down) || !set.contains(left+" "+up) || !set.contains(right+" "+down) || !set.contains(right+" "+up))
			return false;
		
		return true;
		
		
		//以下解法会超时
        //int n = rectangles.length;
		/*
		int down = Integer.MAX_VALUE;
		int left = Integer.MAX_VALUE;
		int up = Integer.MIN_VALUE;
		int right = Integer.MIN_VALUE;
		for(int[] item : rectangles) {
			left = Math.min(left, item[0]);
			down = Math.min(down, item[1]);
			right = Math.max(right, item[2]);
			up = Math.max(up, item[3]);
		}
		
		int MAX = Math.max(up, right);
		int MIN = Math.min(down, left);
		int[][] board = new int[MAX+1-MIN][MAX+1-MIN];
		for(int[] item : rectangles) {
			for(int i = item[0]-MIN; i < item[2]-MIN; ++i) {
				for(int j = item[1]-MIN; j < item[3]-MIN; ++j) {
					if(board[i][j] == 1)
						return false;
					board[i][j] = 1;
				}
			}
		}
		
		for(int i = left-MIN; i < right-MIN; ++i) {
			for(int j = down-MIN; j < up-MIN; ++j) {
				if(board[i][j] != 1)
					return false;
			}
		}
		
		return true;
		*/
		
	}
	
}

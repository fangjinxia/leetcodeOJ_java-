package leetcodeOJ;

import java.util.*;

public class solution_52 {
	public static int totalNQueens(int n) {
		int[] res = new int[1];
        res[0] = 0;
		if(n <= 0)
			return res[0];
		List<Integer> cur = new LinkedList<>();
		
		backtracing(res, cur, n, 0);
		
		return res[0];
	}
	
	private static void backtracing(int[] res, List<Integer> cur, int n, int item) {
		if(item == n) {
			++res[0];
			return ;
		}
		
		for(int j = 0; j < n; ++j) {
			//当前位置可以放Queue
			if(isValid(cur, j)) {
				 cur.add(j);
				 backtracing(res, cur, n, item+1);
				 cur.remove(cur.size()-1);
			}
		}
		
		
	}
	
	
	private static Boolean isValid(List<Integer> list, int curCol) {
		//int[][] dir = {{1,0}, {-1,0}, {0,1}, {0,-1}, {1,-1}, {1,1}, {-1,1}, {-1,-1}};
		int curRow = list.size();
		int curSum = curRow + curCol;
		int curDiff = curRow - curCol;
		for(int r = 0; r < curRow; ++r) {
			int c = list.get(r);
			int sum = r+c;
			int diff = r-c;
			if(curCol == c || sum == curSum || diff == curDiff)
				return false;
		}
		
		
		return true;
	}
	
	private static List<String> drawBoard(List<Integer> list){
		List<String> res = new ArrayList<String>();
		int n = list.size();
		for(int i = 0; i < n; ++i) {
			StringBuilder str = new StringBuilder();
			for(int j = 0; j < n; ++j) {
				str.append((j == list.get(i)) ? 'Q' : '.');
			}
			res.add(str.toString());
		}
		
		return res;
	}
	
	
}

package leetcodeOJ;

import java.util.*;

public class solution_447 {
	public int numberOfBoomerangs(int[][] points) {
		Map<Integer, Integer> mp = new HashMap<>();
		int res = 0;
		for(int i = 0; i < points.length; ++i) {
			for(int j = 0; j < points.length; ++j) {
				if(i == j)
					continue;
				int dist = (points[i][0]-points[j][0]) * (points[i][0]-points[j][0]) + (points[i][1]-points[j][1]) * (points[i][1]-points[j][1]);
				mp.put(dist, mp.getOrDefault(dist, 0)+1);
			}
			
			for(int val : mp.values()) {
				res += val*(val-1);
			}
			mp.clear();
		}
		
		return res;
	}
	
	
}


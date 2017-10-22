package leetcodeOJ;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

//LeetCodeOJ 461
public class solution_461 {
	//My AC code
	public static int hammingDistance(int x, int y) {	    
		int result = 0;
		while(x != 0 || y != 0){
			int tmp1 = x & 1;
			int tmp2 = y & 1;
			if(tmp1 != tmp2)
				++result;
			x >>= 1;
			y >>= 1;
		}
		
		return result;
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
		
		int res = hammingDistance(x, y);
		System.out.println(res);
	}
}

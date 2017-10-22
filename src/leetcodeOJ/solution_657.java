package leetcodeOJ;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class solution_657 {
	//My AC code
	public static boolean judgeCircle(String moves) {
		int numOfLR = 0;
		int numOfUD = 0;
		
		for(int i = 0; i < moves.length(); ++i){
			char c = moves.charAt(i);
			
			if(c == 'L'){
				++numOfLR;
			}
			else if(c == 'R'){
				--numOfLR;
			}
			else if(c == 'U'){
				++numOfUD;
			}
			else{
				--numOfUD;
			}
		}
		
		return (numOfLR == numOfUD) && (numOfLR == 0);
	}
	
	public static void main(String[] args){
		//接受从键盘输入的数值
		Scanner s = new Scanner(System.in);
		
		//接受一个int型整数参数
//		Integer x = s.nextInt();
//		Integer y = s.nextInt();
		//接受一个double型整数参数
		//Double d = s.nextDouble(); 
		
		//接受一个string型整数参数
		String str = s.next();
		
		boolean res = judgeCircle(str);
		System.out.println(res);
	}
}

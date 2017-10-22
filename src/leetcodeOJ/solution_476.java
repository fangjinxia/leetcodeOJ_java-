package leetcodeOJ;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class solution_476 {
	//My AC code
	public static int findComplement(int num) {
		//计算补码
		int result = 0;
		int tmp = 1;
		while(num != 0){
			if((num & 1) == 0){
				result += tmp;
			}
			tmp *= 2;
			num >>= 1;
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
		
		//int res = arrayPairSum();
	//	System.out.println(res);
	}
}

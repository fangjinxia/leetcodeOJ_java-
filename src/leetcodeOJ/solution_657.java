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
		//���ܴӼ����������ֵ
		Scanner s = new Scanner(System.in);
		
		//����һ��int����������
//		Integer x = s.nextInt();
//		Integer y = s.nextInt();
		//����һ��double����������
		//Double d = s.nextDouble(); 
		
		//����һ��string����������
		String str = s.next();
		
		boolean res = judgeCircle(str);
		System.out.println(res);
	}
}

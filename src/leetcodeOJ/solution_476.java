package leetcodeOJ;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class solution_476 {
	//My AC code
	public static int findComplement(int num) {
		//���㲹��
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
		//���ܴӼ����������ֵ
		Scanner s = new Scanner(System.in);
		
		//����һ��int����������
		Integer x = s.nextInt();
		Integer y = s.nextInt();
		//����һ��double����������
		//Double d = s.nextDouble(); 
		
		//����һ��string����������
		//String str = s.next();
		
		//int res = arrayPairSum();
	//	System.out.println(res);
	}
}

package leetcodeOJ;

import java.util.Arrays;

public class usingArrays {
	public static void main(String[] args) {
		String[] array = new String[] { "First", "Second", "Third", "Fourth" };  
		
		///<������������
		//������������
        System.out.println(array.toString());  
        //������������
        System.out.println(Arrays.toString(array));
        
        //�������к�����Ƕ����ʱ����Ҫ��deepToString
        String[] arr1 = new String[] { "Fifth", "Sixth" };  
        String[] arr2 = new String[] { "Seventh", "Eigth" };  
        String[][] arrayOfArray = new String[][] { arr1, arr2 }; 
        System.out.println(Arrays.deepToString(arrayOfArray));
	}
}

package leetcodeOJ;

import java.util.Arrays;

public class usingArrays {
	public static void main(String[] args) {
		String[] array = new String[] { "First", "Second", "Third", "Fourth" };  
		
		///<输出数组的内容
		//输出数组的名字
        System.out.println(array.toString());  
        //输出数组的内容
        System.out.println(Arrays.toString(array));
        
        //当数组中含有内嵌数组时，需要用deepToString
        String[] arr1 = new String[] { "Fifth", "Sixth" };  
        String[] arr2 = new String[] { "Seventh", "Eigth" };  
        String[][] arrayOfArray = new String[][] { arr1, arr2 }; 
        System.out.println(Arrays.deepToString(arrayOfArray));
	}
}

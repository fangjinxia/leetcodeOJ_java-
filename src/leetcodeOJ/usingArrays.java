package leetcodeOJ;

import java.util.*;

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
        
        
        
        ///<List与Arrays相互转化
        /*
         * List转Arrays
         */
        List<String> list = new ArrayList<String>();
        String[] s = list.toArray(new String[list.size()]);
        
        /*
         * Arrays转List
         */
//        String[] str = {"java", "c"};
//        List<String> lst = Arrays.asList(array);
//        //但该方法存在一定的弊端，返回的list是Arrays里面的一个静态内部类，该类并未实现add,remove方法，因此在使用时存在局限性
//        ///<解决办法
//        //1、运用ArrayList的构造方法是目前来说最完美的作法，代码简洁，效率高
//        List<String> list = new ArrayList<String>(Arrays.asList(array));
//        //2、运用Collections的addAll方法也也是不错的解决办法
//        List<String> list = new ArrayList<String>(array.length);
//        Collections.addAll(list, array);
	}
}

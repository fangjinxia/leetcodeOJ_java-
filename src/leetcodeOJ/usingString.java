package leetcodeOJ;

import java.util.Arrays;

public class usingString {
	public static void main(String[] args) {
		String s = "aqs dfg hjx cvb";
		
		///<split分割字符串
		String[] words = s.split(" ");
		for(String w : words) {
			//TODO:
		}
		
		/*
		 * 1、如果用“.”作为分隔的话,必须是如下写法,String.split("\\."),这样才能正确的分隔开,不能用String.split(".");
		 * 2、如果用“|”作为分隔的话,必须是如下写法,String.split("\\|"),这样才能正确的分隔开,不能用String.split("|");
		 * “.”和“|”都是转义字符,必须得加"\\";
		 * 3、如果在一个字符串中有多个分隔符,可以用“|”作为连字符,比如,“acount=? and uu =? or n=?”,把三个都分隔出来,可以用String.split("and|or");
		 */
		
		///<逆转字符串
		String string="whatever";
		String reverse = new StringBuffer(string).reverse().toString();
		System.out.println(reverse);
		
		
		///<字符串排序
		String sortStr = "ACDFE"; 
	    char[] arrayCh = sortStr .toCharArray(); //1，把sortStr转换为字符数组
	    Arrays.sort(arrayCh);//2，利用数组帮助类自动排序
	    System.out.println(Arrays.toString(arrayCh));//3，输出
	    //注：这样的话输出结果为：[A, C, D, E, F]
	    
	    String sortedStr=new String(arrayCh);  //加上这句
	    System.out.println(sortedStr);
	    //输出结果为：ACDEF
		
	    
	    ///<String与Integer 互相转换
	    int num = 0;
	    String a = String.valueOf(num);
	    num = Integer.parseInt(a);
	    
	    
	    /*
	     * StringBuilder
	     * 
	     * 方法有：
	     * insert、replace、substring、reverse、delete等
	     * 最常用append、toString
	     */
	    StringBuilder str1 = new StringBuilder();
	    String[] strArrs = {"ASDF", "sfaaf", "aerht", "arh"};
	    for(String ss : strArrs)
	    	str1.append(ss);//若存在循环,拼接字符串,这种方法更好
	    
	    ///<查找子串str在字符串s中出现的次数
	    String str = new String();
	  		int sum = 0;
	  		while(true) {
	  			int tmp = s.indexOf(str);
	  			if(tmp != -1) {
	  				++sum;
	  				s = s.substring(tmp + str.length());
	  			}
	  			else
	  				break;
	  		}
	  		
	  		System.out.println(sum);
		
	}
}

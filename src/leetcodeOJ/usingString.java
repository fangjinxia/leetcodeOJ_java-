package leetcodeOJ;

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
		
		
	}
}

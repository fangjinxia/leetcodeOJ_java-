package leetcodeOJ;

public class usingString {
	public static void main(String[] args) {
		String s = "aqs dfg hjx cvb";
		
		///<split�ָ��ַ���
		String[] words = s.split(" ");
		for(String w : words) {
			//TODO:
		}
		
		/*
		 * 1������á�.����Ϊ�ָ��Ļ�,����������д��,String.split("\\."),����������ȷ�ķָ���,������String.split(".");
		 * 2������á�|����Ϊ�ָ��Ļ�,����������д��,String.split("\\|"),����������ȷ�ķָ���,������String.split("|");
		 * ��.���͡�|������ת���ַ�,����ü�"\\";
		 * 3�������һ���ַ������ж���ָ���,�����á�|����Ϊ���ַ�,����,��acount=? and uu =? or n=?��,���������ָ�����,������String.split("and|or");
		 */
		
		///<��ת�ַ���
		String string="whatever";
		String reverse = new StringBuffer(string).reverse().toString();
		System.out.println(reverse);
		
		
	}
}

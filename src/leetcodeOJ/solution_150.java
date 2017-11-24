package leetcodeOJ;

import java.util.*;

public class solution_150 {
	public int evalRPN(String[] tokens) {
        //利用栈
        //每次遇到运算符，从栈中弹出两个数字进行运算，再将结果放入栈中
        Stack<Integer> st = new Stack<>();
        for(String c : tokens) {
        	if(c.equals("+")) {
        		int num1 = st.pop();
        		int num2 = st.pop();
        		st.push(num1+num2);
        	}
        	else if(c.equals("-")) {
        		int num1 = st.pop();
        		int num2 = st.pop();
        		st.push(num2-num1);
        	}
        	else if(c.equals("*")) {
        		int num1 = st.pop();
        		int num2 = st.pop();
        		st.push(num1*num2);
        	}
        	else if(c.equals("/")) {
        		int num1 = st.pop();
        		int num2 = st.pop();
        		st.push(num2/num1);
        	}
        	else { // 数字
        		int num = Integer.parseInt(c);
        		st.push(num);
        	}
        }
        
        return st.peek();
    }
	
	
}


package leetcodeOJ;

import java.util.*;
import java.lang.String;

public class solution_682 {
	/*
	 * 
	 */
	protected static int calPoints(String[] ops) {
		int sum = 0;
        LinkedList<Integer> list = new LinkedList<>();
        for (String op : ops) {
            if (op.equals("C")) {
                sum -= list.removeLast();
            }
            else if (op.equals("D")) {
                list.add(list.peekLast() * 2);
                sum += list.peekLast();
            }
            else if (op.equals("+")) {
                list.add(list.peekLast() + list.get(list.size() - 2));
                sum += list.peekLast();
            }
            else {
                list.add(Integer.parseInt(op));
                sum += list.peekLast();
            }
        }
        return sum;
	}
	public static void main(String[] args) {
		String[] strs = {"5","2","C","D","+"};
		int res = calPoints(strs);
		System.out.println(res);
	}
}
 
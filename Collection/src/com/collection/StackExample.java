package com.collection;

import java.util.Stack;

public class StackExample {
public static void main(String[] args) {
	Stack<Character> st=new Stack<Character>();
	st.push('A');
	st.push('B');
	st.push('C');
	st.push('D');
	System.out.println(st);
	char ch1=st.pop();
	System.out.println(ch1);
}
}

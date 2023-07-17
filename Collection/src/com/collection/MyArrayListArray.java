package com.collection;

import java.util.ArrayList;

public class MyArrayListArray {
public static void main(String[] args) {
	ArrayList<String> arr=new ArrayList<String>();
	arr.add("First");
	arr.add("Second");
	arr.add("Third");
	arr.add("Random");
	System.out.println("Actual ArrayList:  "+arr);
	String[] str= new String[arr.size()];
	arr.toArray(str);
	//for(String str1:str)
	//{
	//	System.out.println(str1);
	//}
	
	
	for(int i=0; i<str.length;i++) {
		System.out.print(str[i]+" ");
	}
}
}

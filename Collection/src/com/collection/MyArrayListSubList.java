package com.collection;


import java.util.ArrayList;
import java.util.List;

public class MyArrayListSubList {
public static void main(String[] args) {
	ArrayList<String> arr=new ArrayList<String>();
	arr.add("Lavanya");
	arr.add("Srushti");
	arr.add("Sejal");
	arr.add("Prem");
	arr.add("Aniket");
	System.out.println("Actual ArrayList "+arr);
	List<String> list = arr.subList(1, 3);
	System.out.println("SubList: "+list);
}
}

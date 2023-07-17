package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class UsingIterator {
public static void main(String[] args) {
	ArrayList<Integer> arr=new ArrayList<Integer>();
	//Scanner sc=new Scanner(System.in);
	//System.out.println("Enter size");
	//int size=sc.nextInt();
	for(int i=1; i<=10;i++) {
		arr.add(i);
	}
	Iterator<Integer> arr1=arr.iterator();
	while(arr1.hasNext()) {
		System.out.println(arr1.next());
	}
}
}

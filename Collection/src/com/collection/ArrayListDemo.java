package com.collection;

import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList l1=new ArrayList();
		l1.add("edubridge");
		l1.add("india");
		l1.add("pvt");
		l1.add("ltd");
		
		System.out.println("Size: "+l1.size());
		for(int i=0;i<l1.size();i++) {
			System.out.println("List Members: "+l1.get(i));
		}

	}

}

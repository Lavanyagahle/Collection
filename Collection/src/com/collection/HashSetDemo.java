package com.collection;

import java.util.*;

public class HashSetDemo {
public static void main(String[] args) {
	HashSet hs=new HashSet();
	hs.add("java");
	hs.add("full");
	hs.add("stack");
	System.out.println("HashSet Mambers: "+hs);
	Iterator it=hs.iterator();
	while(it.hasNext()) {
		String local=(String) it.next();
		System.out.println(local);
	}
}
}

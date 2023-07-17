package com.collection;

import java.util.HashSet;

public class HashSetEx {
public static void main(String[] args) {
	HashSet<Integer> obj=new HashSet<Integer>();
	obj.add(97);
	obj.add(67);
	obj.add(90);
	obj.add(67);
	obj.add(null);
	obj.add(null);
	System.out.println(obj);
}
}

package com.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetEx {
public static void main(String[] args) {
	LinkedHashSet<Integer> obj=new LinkedHashSet<Integer>();
	obj.add(97);
	obj.add(67);
	obj.add(90);
	obj.add(67);
	obj.add(null);
	obj.add(null);
	System.out.println(obj);

}
}

package com.collection;

import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetEx {
public static void main(String[] args) {
	//TreeSet<Integer> obj=new TreeSet<Integer>();
	TreeSet<Integer> obj=new TreeSet<Integer>(Comparator.reverseOrder());//For Descending order
	obj.add(97);
	obj.add(67);
	obj.add(90);
	obj.add(67);
	obj.add(100);
	System.out.println(obj);

}
}

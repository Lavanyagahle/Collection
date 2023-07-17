package com.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx {
public static void main(String[] args) {
	//TreeMap<Integer, String> sobj=new 	TreeMap<Integer, String>();
	//sobj.put(1, "Lavanya");
	//sobj.put(3, "Jhansi");
	//sobj.put(2, "Monica");
	//sobj.put(4, "Sirisha");
	//sobj.put(5, "Yamini");
	//System.out.println(sobj);// 
	
//	for(Map.Entry<Integer,String> m:sobj.entrySet()) {
	//	System.out.println(m.getKey()+" "+m.getValue());
	//}
	
	//for phone no and name
	TreeMap<Long, String> sobj=new 	TreeMap<Long, String>();
	//TreeMap<String, String> sobj=new 	TreeMap<String>, String>();//We can also use string for phone number
	sobj.put(9054682456L, "Lavanya");
	sobj.put(9975177071L, "Jhansi");
	sobj.put(9881484232L, "Monica");
	sobj.put(8600933758L, "Sirisha");
	sobj.put(9975701471L, "Yamini");
	System.out.println(sobj);// 
	
	//for iterator
	for(Map.Entry<Long,String> m:sobj.entrySet()) {
		System.out.println(m.getKey()+" "+m.getValue());
	}
}
}

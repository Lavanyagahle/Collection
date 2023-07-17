package com.collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListFunctions {
public static void main(String[] args) {
	ArrayList<String> al = new ArrayList<String>();
    //add elements to the ArrayList
    al.add("JAVA");
    al.add("C++");
    al.add("PERL");
    al.add("PHP");
    System.out.println(al); //displaying []
    //get elements by index
    System.out.println("Element at index 1: "+al.get(1));
    System.out.println("Does list contains JAVA? "+al.contains("JAVA"));
    //add elements at a specific index
    al.add(2,"PLAY");
    System.out.println(al);
    System.out.println("Is arraylist empty? "+al.isEmpty());
    System.out.println("Index of PERL is "+al.indexOf("PERL"));
    System.out.println("Size of the arraylist is: "+al.size());
    
    //copying another collection instance objects to existing ArrayList
    List<String> list=new ArrayList<String>();
    list.add("C");
    list.add("react js");
    //list.addAll(al);
   // System.out.println(list);
    al.addAll(list);
    System.out.println(al);
    //Iteration
    Iterator<String> itob=al.iterator();
    while(itob.hasNext()) {
    	System.out.println(itob.next());
    }
    
    
    //Copy Array
    ArrayList<String> copy=(ArrayList<String >)al.clone();
    System.out.println(copy);
    //Sort Array
    Collections.sort(al);
    System.out.println(al);
    
    //Swap Array
    Collections.swap(al, 2, 4);
    System.out.println("After swap: "+al);
    //for deleting all object in arraylist
    System.out.println("Before cleaning "+al);
    al.clear();
    System.out.println("After cleaning "+al);
    
}
}

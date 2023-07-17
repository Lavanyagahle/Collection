package com.collection;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

class Student2{
	int id;
	String name;
	int age;
	public Student2(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student2 [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	
}
class SortAge implements Comparator<Student2>{

	@Override
	public int compare(Student2 s1, Student2 s2) {
		// TODO Auto-generated method stub
		if(s1.age>s2.age) {
			return 1;
		}else if(s1.age<s2.age) {
			return -1;
		}else {
		return 0;
	}
	}
}
public class TreeSetUserDefinedMain {
	public static void main(String[] args) {
		
//	    LinkedHashSet<Student2> slst=new LinkedHashSet<Student2>();
		TreeSet<Student2> slst=new TreeSet<Student2>(new SortAge().reversed());
		//TreeSet<Student2> slst=new TreeSet<Student2>(new SortAge().reversed()); //For reversing Age in descending order
	    Student2 e1= new Student2(1,"Priya",25);
	    Student2 e2= new Student2(5,"Sejal",23);
	    Student2 e3= new Student2(3,"Srushti",21);
	 	Student2 e4= new Student2(2,"Khushi",22);
	 	Student2 e5= new Student2(4,"Apurva",26);
	 	slst.add(e1);
	 	slst.add(e2);
	 	slst.add(e3);
	 	slst.add(e4);
	 	slst.add(e5);
	 	System.out.println(slst);
	 	System.out.println();
	 	//System.out.println("Id\tName\tAge");
	 	//Iterator<Student1> tit=slst.iterator();
	 	//while(tit.hasNext()) {
	 	//	Student1 s=tit.next();
	 		//System.out.println(s.id+"\t"+s.name+"\t"+s.age);
	 	//}
	}
}

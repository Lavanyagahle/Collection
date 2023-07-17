package com.collection;

import java.util.HashSet;
import java.util.Iterator;

class Student1{
	int id;
	String name;
	int age;
	public Student1(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student1 [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
}
public class HashSetUserDefinedMain {
	public static void main(String[] args) {
		
     HashSet<Student1> slst=new HashSet<Student1>();
    Student1 e1= new Student1(1,"Priya",25);
    Student1 e2= new Student1(2,"Sejal",23);
    Student1 e3= new Student1(5,"Srushti",21);
 	Student1 e4= new Student1(4,"Khushi",22);
 	Student1 e5= new Student1(3,"Apurva",26);
 	slst.add(e1);
 	slst.add(e2);
 	slst.add(e3);
 	slst.add(e4);
 	slst.add(e5);
 	System.out.println(slst);
 	System.out.println();
 	System.out.println("Id\tName\tAge");
 	Iterator<Student1> tit=slst.iterator();
 	while(tit.hasNext()) {
 		Student1 s=tit.next();
 		System.out.println(s.id+"\t"+s.name+"\t"+s.age);
 	}
}
}
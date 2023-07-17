package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Student{
	int id;
	String name;
	int age;
	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
}
class StudentIdSort implements Comparator<Student>{


	@Override
	public int compare(Student s1, Student s2) {
		if(s1.id>s2.id) {
			return 1;
		}else if(s1.id<s2.id) {
			return -1;
		}else {
		return 0;
	}
	}
}
class StudentName implements Comparator<Student>{

	@Override
	public int compare(Student s3, Student s4) {
	   
		return s3.name.compareTo(s4.name);
	}
	
}
class StudentAge implements Comparator<Student>{

	@Override
	public int compare(Student s5, Student s6) {
		if(s5.age>s6.age) {
			return 1;
		}else if(s5.age<s6.age) {
			return -1;
		}else {
		return 0;
	}
	}
}
public class ArrayListUserDefinedMain2 {
public static void main(String[] args) {
	ArrayList<Student> sobj=new ArrayList<Student>();
	Student stob=new Student(1,"Prem",22);
	Student stob1=new Student(3,"Kiran",24);
	Student stob2=new Student(2,"Sejal",20);
	Student stob3=new Student(4,"Aniket",27);
	Student stob4=new Student(6,"Priya",28);
	Student stob5=new Student(5,"Manasi",19);
	sobj.add(stob);
	sobj.add(stob1);
	sobj.add(stob2);
	sobj.add(stob3);
	sobj.add(stob4);
	sobj.add(stob5);
	System.out.println(sobj);
	
	Iterator<Student> st=sobj.iterator();
	System.out.println("Id\tName\tAge");
	while(st.hasNext()) {
		Student st1=st.next();
		System.out.println(st1.id+"\t"+st1.name+"\t"+st1.age);
		
	}
    System.out.println();
	
	//Student id sort
	System.out.println("After Id Sorting");
	StudentIdSort stobj=new StudentIdSort();
	Collections.sort(sobj, stobj);
	Iterator<Student> sti=sobj.iterator();
	System.out.println("Id\tName\tAge");
	while(sti.hasNext()) {
		Student ss=sti.next();
		System.out.println(ss.id+"\t"+ss.name+"\t"+ss.age);
		
	}
	System.out.println();
	//Student name sort
	System.out.println("After Name Sorting");
	StudentName nam=new StudentName();
	Collections.sort(sobj,nam);
	Iterator<Student> stud=sobj.iterator();
	
	System.out.println("Id\tName\tAge");
	while(stud.hasNext()) {
		Student ss1=stud.next();
		System.out.println(ss1.id+"\t"+ss1.name+"\t"+ss1.age);
	}
	System.out.println();
	
	//Student Age sort
	System.out.println("After Age Sorting");
	StudentAge ag=new StudentAge();
	Collections.sort(sobj,ag);
	Iterator<Student> sg1=sobj.iterator();
	System.out.println("Id\tName\tAge");
	while(sg1.hasNext()) {
		Student s=sg1.next();
		System.out.println(s.id+"\t"+s.name+"\t"+s.age);
	}
	
}
}

package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Employee{
	int eid;
	String ename;
	int esalary;
	public Employee(int eid, String ename, int esalary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + "]";
	}
	
}
class EmployeeIdSort implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		if(e1.eid>e2.eid) {
			return 1;
		}else if(e1.eid<e2.eid) {
			return -1;
		}else {
		
		return 0;
	}
	}
}
class EmployeeSalarySort implements Comparator<Employee> {

	@Override
	public int compare(Employee e3, Employee e4) {
		// TODO Auto-generated method stub
		if(e3.esalary>e4.esalary) {
			return 1;
		}else if(e3.esalary<e4.esalary) {
			return -1;
		}else {
		return 0;
	}
	}
}
public class ArrayListUserDefinedMain {
public static void main(String[] args) {
	ArrayList<Employee> emplst=new ArrayList<Employee>();
	Employee e1= new Employee(1,"Priya",30000);
	Employee e2= new Employee(2,"Sejal",35000);
	Employee e3= new Employee(5,"Srushti",45000);
	Employee e4= new Employee(4,"Khushi",50000);
	Employee e5= new Employee(3,"Apurva",25000);
	emplst.add(e1);
	emplst.add(e2);
	emplst.add(e3);
	emplst.add(e4);
	emplst.add(e5);
	System.out.println(emplst);
	
	Iterator<Employee> eit=emplst.iterator();
	System.out.println("EID\tENAME\tESALARY");
	while(eit.hasNext()) {
		Employee eob=eit.next();
		System.out.println(eob.eid+"\t"+eob.ename+"\t"+eob.esalary);
	}
	
	//Sorting  for id
    EmployeeIdSort esort=new EmployeeIdSort();
    
    Collections.sort(emplst,esort);
    System.out.println("After sorting based eid");
    //System.out.println(emplst);
    Iterator<Employee>eit1=emplst.iterator();
    System.out.println("EID\tENAME\tESALARY");
	System.out.println("---------------------------------------");
      while(eit1.hasNext()) { //boolean
     Employee eob=eit1.next();
         // System.out.println(eit.next());
    	System.out.println(eob.eid+"\t"+eob.ename+"\t"+eob.esalary);
      }
	
      // Sorting for salary
      EmployeeSalarySort esort1=new EmployeeSalarySort();
      
      Collections.sort(emplst,esort1);
      System.out.println("After sorting based eid");
      //System.out.println(emplst);
      Iterator<Employee>eit2=emplst.iterator();
      System.out.println("EID\tENAME\tESALARY");
  	System.out.println("---------------------------------------");
        while(eit2.hasNext()) { //boolean
       Employee eob=eit2.next();
           // System.out.println(eit.next());
      	System.out.println(eob.eid+"\t"+eob.ename+"\t"+eob.esalary);
        }
  	
	}
}

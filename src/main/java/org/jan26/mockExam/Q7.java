package org.jan26.mockExam;

import java.util.*;
class Employee{
	private int id;
	private String name;
	private Double salary;
	
	public Employee(int id, String name, double salary){
		this.id = id;
		this.name = name;
		this.salary =salary;
	}
	public void setId(int id){this.id = id;}
	public int getId(){return id;}
	
	public void setName(String name){this.name = name;}
	public String getName(){return name;}
	
	public void setSalary(double salary){this.salary = salary;}
	public double getSalary(){return salary;}
}

class EmpCompare implements Comparator<Employee>{
	
	public int compare(Employee e1, Employee e2){
		
		int accSalary = Double.compare(e1.getSalary(), e2.getSalary());
		if(accSalary != 0){
			return accSalary;
		}
		
		int accName = e1.getName().compareTo(e2.getName());
		if(accName != 0){
			return accName;
		}
		
		return Integer.compare(e1.getId(), e2.getId());
	}
}

public class Q7{
	public static void main(String[] args){
		
		Set<Employee> empSet = new TreeSet<Employee>(new EmpCompare());
		empSet.add(new Employee(5,"Akash1",95000));
		empSet.add(new Employee(4,"Akash6",80000));
		empSet.add(new Employee(3,"Akash3",95000));
		empSet.add(new Employee(1,"Akash2",85000));
		empSet.add(new Employee(2,"Akash8",970000));
		
		//Collections.sort(empSet, new EmpCompare());
		
		
		for(Employee e: empSet)	System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSalary());
		
	}
	
}
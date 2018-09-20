package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Assign2 {
	public static void main(String[] args) {
		
	
//	List<Employee> list= new ArrayList<>();
//		Employee emp1 = new Employee(1,"abc");
//		Employee emp2 = new Employee(2,"def");
//		Employee emp3 = new Employee(3,"xyz");
//		list.add(emp1);
//		list.add(emp2);
//		list.add(emp3);
	
	}
	
}
final class EmpList{
	private final List<Employee> empList;

	public EmpList(List<Employee> empList) {
		super();
		this.empList = new ArrayList<>();
		Iterator<Employee> it = empList.iterator();
		while(it.hasNext()) {
			this.empList.add(it.next());
		}
	}

	public List<Employee> getEmpList() {
		return new ArrayList<>(empList);
	}
	
	
	
	
}
final class Employee{
	private final int id;
	private final String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
				
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
	
	
}

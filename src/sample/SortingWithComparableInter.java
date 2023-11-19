package sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Comparable provides a single sorting sequence. 
//In other words, sort the collection on the basis of a single element such as empid or salary
//Comparable is present in java.lang package.
//sort the list elements of Comparable type by Collections.sort(List) method.
class Employee implements Comparable<Employee> {

	int empid;
	int salary;

	Employee(int empid, int salary) {
		this.empid = empid;
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee o) {
		if (this.salary > o.salary) {
			return 1;
		} else if (this.salary < o.salary) {
			return -1;
		}
		return 0;
	}

}

public class SortingWithComparableInter {

	public static void main(String[] args) {
		Employee emp1 = new Employee(106, 89);
		Employee emp2 = new Employee(101, 67);
		Employee emp3 = new Employee(104, 48);
		Employee emp4 = new Employee(105, 78);
		Employee emp5 = new Employee(109, 65);
		List<Employee> list = new ArrayList<Employee>() {
			{
				add(emp1);
				add(emp2);
				add(emp3);
				add(emp4);
				add(emp5);
			}
		};
		System.out.println("Before sorting");
		for (Employee emp : list) {
			System.out.println(emp.empid + " " + emp.salary);
		}
		Collections.sort(list);
		System.out.println("After sorting");
		for (Employee emp : list) {
			System.out.println(emp.empid + " " + emp.salary);
		}
	}

}

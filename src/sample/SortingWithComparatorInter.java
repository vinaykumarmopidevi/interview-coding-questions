package sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
//The Comparator provides multiple sorting sequences. 
//In other words, sort the collection on the basis of multiple elements such as stdno, marks.
//A Comparator is present in the java.util package.
//sort the list elements of Comparator type by Collections.sort(List, Comparator) method.
class Student {
	int stdno;
	int marks;

	Student(int stdno, int marks) {
		this.stdno = stdno;
		this.marks = marks;
	}
}

class ObjectsCompare implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		if (o1.marks > o2.marks) {
			return 1;
		} else if (o1.marks < o2.marks) {
			return -1;
		}
		return 0;
	}

}

public class SortingWithComparatorInter {

	public static void main(String[] args) {
		Student s1 = new Student(102, 95);
		Student s2 = new Student(105, 56);
		Student s3 = new Student(108, 71);
		Student s4 = new Student(101, 28);
		Student s5 = new Student(104, 67);

		ArrayList<Student> list = new ArrayList<Student>() {
			{
				add(s1);
				add(s2);
				add(s3);
				add(s4);
				add(s5);
			}
		};
		System.out.println("Before sorting");
		for (Student std : list) {
			System.out.println(std.stdno + " " + std.marks);
		}
		
		ObjectsCompare obj = new ObjectsCompare();
		Collections.sort(list, obj);
		System.out.println("After sorting");
		for (Student std : list) {
			System.out.println(std.stdno + " " + std.marks);
		}
	}

}

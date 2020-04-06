package com.claim.servletdemo.mvctwo;

import java.util.ArrayList;
import java.util.List;

public class Studentdatautil {
	public static List<Student> getStudents(){
		//create an empty list
		List<Student> students = new ArrayList<>();
		
		// add sample data
		students.add(new Student("Mary", "Jones", "maryj@gmail.com"));
		students.add(new Student("Mike", "Kettemann", "mike@gmail.com"));
		students.add(new Student("Saqib", "Khan", "saqib@gmail.com"));
		
		//return the list
		return students;
	}

}

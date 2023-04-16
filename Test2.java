package com.dac.test;
import com.dac.Faculty;
import com.dac.Person;
import com.dac.Student;
public class Test2 {

	public static void main(String[] args) {
		Faculty f1=new Faculty("Rafe", "shaikh",1252 , 8500.85f, 3, 26);
		System.out.println(f1);
		//System.out.println(f1.getSalary());
		Person p;
		p=new Faculty("SAlman", "Khan", 1253, 90876, 5, 29);
		System.out.println(p);
		p=null;
		System.out.println(p);
		Student pi=new Student("Hasan", "Mushrif", "8th", 17000, 71, 2022, 24);
		System.out.println(pi);
		System.out.println(pi.getStudentFees());
		System.out.println(pi.getName());
	}

}

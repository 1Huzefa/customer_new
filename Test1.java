package com.dac.test;
import com.dac.Student;
public class Test1{

	public static void main(String[] args) {
		
		Student s1=new Student("Aftab","Bagwan","Ninth",12050,90,3,17);
		Student s2=s1;
		System.out.println(s2);
		s2=null;
		System.out.println(s1);
		System.out.println(s2);
	}

}

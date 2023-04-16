package com.dac;

public class Student extends Person {
	private String std;
	private int fees;
	private int marks;
	private int gradYear;
	private int age;

	public Student(String fn,String ln,String std,int fees,int mark,int gradYear,int age) {
		super(fn,ln,age);
		this.std=std;
		this.fees=fees;
		marks=mark;
		this.gradYear=gradYear;
	}
	
	@Override
	public String toString()
	{
		return "Student: "+super.toString()+"Marks :"+this.marks+"graduated in year "+this.gradYear+" College Fees: "+this.fees;
	}
	
	public int getStudentFees()
	{
		return this.fees;
	}
	
	public String getName()
	{
		System.out.println("From Student getName()");
		return super.getName();
	}

}

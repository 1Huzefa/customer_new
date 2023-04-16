package com.dac;

public class Faculty extends Person{
	int empno;
	float salary;
	int sme;
	int age;

	public Faculty(String fn,String ln,int empno,float salary,int sme,int age) {
		super(fn,ln,age);
		this.empno=empno;
		this.salary=salary;
		this.sme=sme;
	}
	
	public String getName()
	{
		System.out.println("From Faculty getName()");
		return super.getName();
	}
	
	public float getSalary()
	{
		System.out.println("From Faculty getSalary()");
		return this.salary;
	}
	
	public String toString()
	{
		
		return "Faculty : \n"+super.toString()+"\nEmpno : "+this.empno;
	}

}

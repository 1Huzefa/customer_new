package com.dac;

public class Person {

	private String firstName;
	private String lastName;
	private int age;
	
		
	public Person(String firstName,String lastName,int age) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.age=age;
	}
	
	@Override
	public String toString()
	{
		
		return "Person: "+this.firstName+" "+this.lastName+"   Age :"+this.age;
	}
	
	public String getName()
	{
		return this.firstName+" "+this.lastName;
	}
	
}

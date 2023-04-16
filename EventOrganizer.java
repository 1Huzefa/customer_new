package com.dac.test;

import java.util.Scanner;
import com.dac.*;

public class EventOrganizer {
		public static void main(String []args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter no of participents in event to come");
			Person p[]=new Person[sc.nextInt()];
			int counter=0;
			//String fn,String ln,String std,int fees,int mark,int age
			p[counter++]=new Student("Sam","Kuran","9th",20000,97,15,14);
				
			
		}
}

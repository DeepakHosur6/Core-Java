package com.xworkz.inheritanceApp.Inheritance;

public class ProgramingSubject {
	
	public String name;
	public String type;
	public String College;
	

	public String subjectName(String name) // method
	{
		System.out.println(" Subject Name  : " + name);
		this.name = name;
		return this.name;

	}

}

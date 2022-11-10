package com.xworkz.inheritanceApp;

import com.xworkz.inheritanceApp.Inheritance.ProgramingSubject;
import com.xworkz.inheritanceApp.extendsFiles.Python;

public class ProgramingSubjectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("ProgramingSubject");
		ProgramingSubject ps =new ProgramingSubject();
		ps.subjectName("Java");
		
		Python py =new Python();
		py.subjectName("Python");
		
	}

}

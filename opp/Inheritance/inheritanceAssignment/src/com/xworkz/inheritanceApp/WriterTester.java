package com.xworkz.inheritanceApp;

import com.xworkz.inheritanceApp.Inheritance.Writer;
import com.xworkz.inheritanceApp.extendsFiles.Akash;

public class WriterTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("The Story Books Are");
		Writer wr = new Writer();
		wr.storyBookName("Harry Potter");
		wr.place("Loss Angles");
		
		Akash ak = new Akash();
		ak.storyBookName("Little Prince by Akash");
		ak.place("India");
	}

}

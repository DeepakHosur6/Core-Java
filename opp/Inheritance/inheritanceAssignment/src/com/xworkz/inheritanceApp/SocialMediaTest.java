package com.xworkz.inheritanceApp;

import com.xworkz.inheritanceApp.Inheritance.SocialMedia;
import com.xworkz.inheritanceApp.extendsFiles.Instagram;

public class SocialMediaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Wel come to the Social Media");
		
		SocialMedia sm = new SocialMedia();
		sm.toGetInfo("Facebook");
		
		Instagram ig = new Instagram();
		ig.toGetInfo("Instagram");
	}

}

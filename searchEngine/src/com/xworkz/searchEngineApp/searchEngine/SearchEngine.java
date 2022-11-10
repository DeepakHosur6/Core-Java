package com.xworkz.searchEngineApp.searchEngine;

public class SearchEngine {
	public String name;
	public String website;
	
	public String toSearch( String name)
	{
		System.out.println("The Name of Search Engine is : "+name);
		this.name=name;
		return this.name;
	}
	public String toGetWebPage( String website)
	{
		System.out.println("The Web Page link is : "+website);
		this.website=website;
		return this.website;
	}

}

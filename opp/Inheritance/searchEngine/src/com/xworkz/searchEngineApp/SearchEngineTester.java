package com.xworkz.searchEngineApp;

import com.xworkz.searchEngineApp.google.Google;
import com.xworkz.searchEngineApp.searchEngine.SearchEngine;
import com.xworkz.searchEngineApp.yahoo.Yahoo;

public class SearchEngineTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Wel-Come to Search Engine : ");
		 SearchEngine search = new  SearchEngine();
		 search.toSearch("Bing");
		 search.toGetWebPage("WWW.Bing.com");
		 
		 
		 Google go = new Google();
		 go.toSearch("Google");
		 go.toGetWebPage("WWW.Google.com");
		 
		 
		 Yahoo yo = new Yahoo();
		 yo.toSearch("Yahoo");
		 yo.toGetWebPage("WWW.Yahoo.com");
	}

}

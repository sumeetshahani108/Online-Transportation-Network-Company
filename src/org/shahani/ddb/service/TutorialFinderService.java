package org.shahani.ddb.service;

public class TutorialFinderService {
	
	public String getBestTutorialSite(String language){
		if(language.equals("java")){
			return "java brains" ;
		}else {
			return "no issues" ;
		}
	}

}

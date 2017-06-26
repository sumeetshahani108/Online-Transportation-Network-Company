package org.shahani.ddb.action;
import org.shahani.ddb.service.*;

public class TutorialAction {
	
	private String bestSite ;
	private String language ;
	
	public String getBestSite() {
		return bestSite;
	}
	
	public void setBestSite(String bestSite) {
		this.bestSite = bestSite;
	}
	
	public String execute(){
		TutorialFinderService tutorialFinderService = new TutorialFinderService();
		setBestSite(tutorialFinderService.getBestTutorialSite(getLanguage()));
		//System.out.println(getLanguage());
		System.out.println(bestSite);
		return "success" ;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
}

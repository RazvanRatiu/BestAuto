package com;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.pages.HomePage;
import com.pages.MenuPage;
import com.pages.SearchResultsPage;
import com.steps.MenuSteps;
import com.steps.SearchResultsSteps;

public class QuickSearchTest {
	  @Managed(uniqueSession = true)
	  public WebDriver webdriver;

	  @ManagedPages(defaultUrl = "http://www.bestauto.ro/")
	  public Pages pages; 

	  @Steps 
	  public MenuSteps menuSteps; 
	  
	  @Steps
	  public SearchResultsSteps searchResultSteps;
	  
	  @Test
	  public void findIfSearchResultContainsKeyword(){
		  menuSteps.insertSearchCriteria("Ford");
		  menuSteps.selectDropDownMenu("Auto");
		  menuSteps.clickOnHomeSearchButton();
		  searchResultSteps.checkIfSearchCriteriaAppearsInResultsPage();
	  }
	  
	    
}

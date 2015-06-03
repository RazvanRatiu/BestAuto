package com;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.pages.MenuPage;
import com.pages.SearchResultsPage;
import com.steps.MenuSteps;
import com.steps.SearchResultsSteps;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom("resources/criterias.csv")
public class QuickSearchTest {
	
	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@ManagedPages(defaultUrl = "http://www.bestauto.ro/")
	public Pages pages;

	@Steps
	public MenuSteps menuSteps;

	@Steps
	public SearchResultsSteps searchResultSteps;

	String searchCriteria, auto;
	
	@Test
	public void findIfSearchResultContainsKeyword() {
		menuSteps.openHomePage();
		menuSteps.insertSearchCriteria(searchCriteria);
		menuSteps.selectDropDownMenu(auto);
		menuSteps.clickOnHomeSearchButton();
		searchResultSteps.checkIfSearchCriteriaAppearsInResultsPage(searchCriteria);
	}

}

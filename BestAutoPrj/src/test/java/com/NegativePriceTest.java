package com;


import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.runners.ThucydidesRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.pages.HomePage;
import com.pages.MenuPage;
import com.pages.SearchResultsPage;
import com.steps.MenuSteps;
import com.steps.NegativePriceSteps;
import com.steps.SearchResultsSteps;

@RunWith(ThucydidesRunner.class)
public class NegativePriceTest {
	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@ManagedPages(defaultUrl = "http://www.bestauto.ro/")
	public Pages pages;

	@Steps
	public NegativePriceSteps negativePriceSteps;
	
	@Steps
	public MenuSteps menuSteps;

	@Steps
	public SearchResultsSteps searchResultSteps;

	@Test
	public void findIfSearchResultContainsKeyword() {
		menuSteps.openHomePage();
		menuSteps.selectDropDownMenu("Diverse");
		menuSteps.clickOnHomeSearchButton();
		negativePriceSteps.negativePrice();
	}

	
}
package com;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.runners.ThucydidesRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.steps.CheckIfAllPricesAreInEuroSteps;
import com.steps.MenuSteps;
import com.steps.SearchResultsSteps;

@RunWith(ThucydidesRunner.class)
public class CheckIfPricesAreInEuroTest {
	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@ManagedPages(defaultUrl = "http://www.bestauto.ro/")
	public Pages pages;

	@Steps
	public MenuSteps menuSteps;

	@Steps
	public SearchResultsSteps searchResultSteps;

	@Steps 
	public CheckIfAllPricesAreInEuroSteps checkIfAllPricesAreInEuroSteps;
	
	@Test 
	public void seeIfPricesAreInEuroTest(){
		menuSteps.openHomePage();
		menuSteps.selectDropDownMenu("Moto");
		menuSteps.clickOnHomeSearchButton(); 
		checkIfAllPricesAreInEuroSteps.checkIfPricesAreInEuro();
	}
	



}

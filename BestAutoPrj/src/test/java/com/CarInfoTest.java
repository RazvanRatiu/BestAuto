package com;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.runners.ThucydidesRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.steps.MenuSteps;
import com.steps.NegativePriceSteps;
import com.steps.SearchCarsSteps;
import com.steps.SearchResultsSteps;

@RunWith(ThucydidesRunner.class)
public class CarInfoTest {
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
	
	@Steps 
	public SearchCarsSteps searchCarsSteps;

	@Test 
	public void getCarInfo(){
	menuSteps.openHomePage(); 
	menuSteps.clickOnMobileButton(); 
	menuSteps.clickOnMasiniButton(); 
	searchCarsSteps.searchCars();
	
	
	}

}

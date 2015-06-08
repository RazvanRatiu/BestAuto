package com.steps;

import com.pages.MenuPage;
import com.pages.SearchResultsPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class MenuSteps extends ScenarioSteps {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	MenuPage menuPage;
	
	@Step 
	public void clickOnMasiniButton(){
		menuPage.clickOnMasiniButton();
	}
	
	
	@Step 
	public void clickOnMobileButton(){
		menuPage.clickOnMobileButton();
	}
	
	
	@Step
    public void openHomePage() {
        menuPage.open();
    }

	@Step
	public void clickSearchButton() {
		menuPage.clickCautareButton();
	}

	@Step
	public void clickAddOnAd() {
		menuPage.clickAdaugaAnuntButton();
	}

	@Step
	public void clickMyAccount() {
		menuPage.clickContulMenuButton();
	}

	@Step
	public void clickDealerButton() {
		menuPage.clickDealerButton();
	}

	@Step
	public void selectDropDownMenu(String option) {
		menuPage.selectDropDownMenu(option);
	}

	@Step
	public void clickOnHomeSearchButton() {
		menuPage.clickOnHomeSearchButton();
	}

	@Step
	public void insertSearchCriteria(String value) {
		menuPage.insertSearchCriteria(value);
	}
}

package com.steps;

import com.pages.MenuPage;
import com.pages.SearchResultsPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class MenuSteps extends ScenarioSteps {
	MenuPage menupage;
	SearchResultsPage searchpage;

	@Step
	public void clickSearchButton() {
		menupage.clickCautareButton();
	}

	@Step
	public void clickAddOnAd() {
		menupage.clickAdaugaAnuntButton();
	}

	@Step
	public void clickMyAccount() {
		menupage.clickContulMenuButton();
	}

	@Step
	public void clickDealerButton() {
		menupage.clickDealerButton();
	}

	@Step
	public void selectDropDownMenu(String option) {
		menupage.selectDropDownMenu(option);
	}

	@Step
	public void clickOnHomeSearchButton() {
		menupage.clickOnHomeSearchButton();
	}

	@Step
	public void insertSearchCriteria(String value) {
		menupage.insertSearchCriteria(value);
	}
}

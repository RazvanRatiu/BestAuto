package com.steps;

import net.thucydides.core.steps.ScenarioSteps;

import java.util.List;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.pages.HomePage;

public class HomePageSteps {

	HomePage homePage;

	@Step
	public void selectBrand(String option) {
		homePage.selectBrandOption(option);
	}

	@Step
	public void selectModel(String option) {
		homePage.selectModelOption(option);
		;
	}

	@Step
	public void selectPrice(String option) {
		homePage.selectPriceOption(option);
	}

	@Step
	public void selectVehiclege(String option) {
		homePage.selectVehiclegeOption(option);
	}

	@Step
	public void selectKilometers(String option) {
		homePage.selectKilometersOption(option);
	}

	@Step
	public void selectFuel(String option) {
		homePage.selectFuelOption(option);
	}

	@Step
	public void clickSearchButton() {
		homePage.clickSearchButton();
	}
}

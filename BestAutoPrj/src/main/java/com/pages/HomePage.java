package com.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

import org.openqa.selenium.WebElement;

public class HomePage extends PageObject {

	@FindBy(id = "logoPowerd")
	private WebElement homeButton;

	@FindBy(id = "tab_search_new")
	private WebElement searchTab;

	@FindBy(id = "tab_placead_new")
	private WebElement newAdTab;

	@FindBy(id = "ctl00_ctl00_ctl01_ddlMarca")
	private WebElementFacade brandDropdown;

	@FindBy(id = "ctl00_ctl00_ctl01_txtModel")
	private WebElementFacade modelDropdown;

	@FindBy(id = "ctl00_ctl00_ctl01_ddlPrice")
	private WebElementFacade priceDropdown;

	@FindBy(id = "ctl00_ctl00_ctl01_ddlVehicleage")
	private WebElementFacade buildDate;

	@FindBy(id = "ctl00_ctl00_ctl01_ddlMileage")
	private WebElementFacade kilometersDropdown;

	@FindBy(id = "ctl00_ctl00_ctl01_ddlFuel")
	private WebElementFacade fuelDropdown;

	@FindBy(id = "ctl00_ctl00_ctl01_search_2")
	private WebElementFacade searchButton;

	public void homeButton() {
		homeButton.click();
	}

	public void clickSearchTab() {
		searchTab.click();
	}

	public void clickNewAdTab() {
		newAdTab.click();
	}

	public void selectBrandOption(String option) {
		(brandDropdown).selectByVisibleText(option);
	}

	public void selectModelOption(String option) {
		(modelDropdown).selectByVisibleText(option);
	}

	public void selectPriceOption(String option) {
		(priceDropdown).selectByVisibleText(option);
	}

	public void selectVehiclegeOption(String option) {
		(buildDate).selectByVisibleText(option);
	}

	public void selectKilometersOption(String option) {
		(kilometersDropdown).selectByVisibleText(option);
	}

	public void selectFuelOption(String option) {
		(fuelDropdown).selectByVisibleText(option);
	}

	public void clickSearchButton() {
		searchButton.click();
	}

	}

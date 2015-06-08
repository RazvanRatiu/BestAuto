package com.pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
@DefaultUrl("http://bestauto.ro")
public class MenuPage extends PageObject {
	
	@FindBy(css="a[href='http://www.bestauto.ro/vanzari-auto-piata-auto-cautari.htm']")
    private WebElement cautareButton;
	
	@FindBy(css="a[href='http://www.bestauto.ro/plasare-oferte-auto.htm']")
    private WebElementFacade adaugaAnuntButton;
    
	@FindBy(css="a[href='http://www.bestauto.ro/Default.aspx?Action=MyAds']")
    private WebElementFacade contulMenuButton;
    
	@FindBy(css="a[href='http://www.bestauto.ro/parcuri-auto']")
    private WebElementFacade dealerButton;
	
	@FindBy(id="homeSearchCategory")
	private WebElementFacade dropDownMenu;
	
	@FindBy(id="homeSearchButton")
	private WebElementFacade homeSearchButton;
	
	@FindBy(id ="homeSearch")
	private WebElementFacade quickSearchInput;
	
	@FindBy(css="div ul[id='topmenu_jsdm'] li :first-child")
	private WebElementFacade mobile;
	
	@FindBy(css="ul li a[href='auto']")
	private WebElementFacade masini;
	
	
	public void clickOnMasiniButton(){
		masini.click();
	}
	
	public void clickOnMobileButton(){
		mobile.click();
	}
	
	public void clickCautareButton() {
        cautareButton.click();
    }  
	
	public void clickAdaugaAnuntButton() {
        adaugaAnuntButton.click();
    }  
	
	public void clickContulMenuButton() {
       contulMenuButton.click();
    }  
	
	public void clickDealerButton() {
        dealerButton.click();
    }  
	
	public void selectDropDownMenu(String option) {
		(dropDownMenu).selectByVisibleText(option);
    }   

	public void clickOnHomeSearchButton(){
		homeSearchButton.click();
	}
	
	public void insertSearchCriteria(String value){
		quickSearchInput.type(value);
	}


}

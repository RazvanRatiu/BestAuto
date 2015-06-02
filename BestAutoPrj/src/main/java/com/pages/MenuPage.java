package com.pages;

import org.openqa.selenium.WebElement;

import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;

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




}

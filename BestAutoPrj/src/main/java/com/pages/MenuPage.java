package com.pages;

import org.openqa.selenium.WebElement;

import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;

public class MenuPage extends PageObject {
	
	@FindBy(css="a[href='http://www.bestauto.ro/vanzari-auto-piata-auto-cautari.htm']")
    private WebElement clickCautareButton;
	
	@FindBy(css="a[href='http://www.bestauto.ro/plasare-oferte-auto.htm']")
    private WebElementFacade clickAdaugaAnuntButton;
    
	@FindBy(css="a[href='http://www.bestauto.ro/Default.aspx?Action=MyAds']")
    private WebElementFacade clickContulMeuButton;
    
	@FindBy(css="a[href='http://www.bestauto.ro/parcuri-auto']")
    private WebElementFacade clickDealerButton;
	
	@FindBy(id="homeSearchCategory")
	private WebElementFacade clickDropDownMenu;
	
	public void clickCautareButton() {
        clickCautareButton.click();
    }  
	
	public void clickAdaugaAnuntButton() {
        clickAdaugaAnuntButton.click();
    }  
	
	public void clickContulMeuButton() {
        clickContulMeuButton.click();
    }  
	
	public void clickDealerButton() {
        clickDealerButton.click();
    }  
	
	public void clickDropDownMenu() {
        clickDropDownMenu.click();
    }   
}

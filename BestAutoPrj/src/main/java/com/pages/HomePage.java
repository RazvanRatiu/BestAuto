package com.pages;

import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;

public class HomePage extends PageObject {

	@FindBy(id="logoPowerd")
    private WebElementFacade homeButton;

    @FindBy(id="tab_search_new")
    private WebElementFacade newsearchButton;
    
    @FindBy(id="tab_placead_new")
    private WebElementFacade newaddButton;
    
    @FindBy(css="a[href='./auto/alba/']")
    private WebElementFacade judetAlbaButton;
    
    @FindBy(css="a[href='./auto/arad/']")
    private WebElementFacade judetAradButton;
    
    public void homeButton() {
        homeButton.click();
    } 
    
    public void newsearchButton() {
        newsearchButton.click();
    } 
    
    public void newaddButton() {
        newaddButton.click();
    } 
    
    public void judetAlbaButton() {
    	judetAlbaButton.click();
    }
  
    public void judetAradButton() {
    	judetAradButton.click();
    }
}

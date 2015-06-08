package com.pages;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.CSS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Tools.SearchResultModel;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class CarsResultsPage extends PageObject{
	
	@FindBy(id="results")
	private WebElementFacade resultsContainer; 
	
	public void getCarsInfo(){
		List<SearchResultModel> carsList = new ArrayList<SearchResultModel>(); 
		element(resultsContainer).waitUntilVisible(); 
		List<WebElement> titleList = resultsContainer.findElements(By.cssSelector(".highlighted")); 
		
		for (WebElement element : titleList) {
			System.out.println("Name :"
					+ element.findElement(By.cssSelector(".highlighted h2")).getText());
			SearchResultModel itemNow = new SearchResultModel();
			carsList.add(itemNow);
		}
		
		
		
	}
}

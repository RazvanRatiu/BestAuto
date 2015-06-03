package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Constants.com.SearchResultModel;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
@DefaultUrl("http://bestauto.ro")
public class CheckIfAllPricesAreInEuro extends PageObject{
	
	@FindBy(id = "results_list")
	private WebElement searchPageContainer; 
	
	public List<SearchResultModel> checkIfPriceIsInEuro(){
		
		List<SearchResultModel> priceList = new ArrayList<SearchResultModel>();
		element(searchPageContainer).waitUntilVisible();
		List<WebElement> resultListItems = searchPageContainer.findElements(By
				.cssSelector("div[itemprop='itemListElement']"));

		
		boolean check = false;
		
		for(WebElement element : resultListItems){
			System.out.println("Pret: " + element.findElement(By.cssSelector("h3")).getText());
			System.out.println("Name: " + element.findElement(By.cssSelector("h2 a")).getText());
			SearchResultModel itemNow = new SearchResultModel();
			String price = element.findElement(By.cssSelector("h3 span:first-child")).getText(); 
			priceList.add(itemNow); 
			
			if(price.contains("EUR")){
				check = true;
			}else{
				check = false;
			}
		Assert.assertTrue("The price is in euro", check);
		}
		return priceList; 
	}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}	

	